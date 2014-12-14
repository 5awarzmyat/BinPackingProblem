/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binpackingproblem;

import java.util.Arrays;

/**
 *
 * @author Ali-Wassouf
 */
public class Shape {
    Line[] lines;
    float area ;
    Point [] points;
    public Shape(Point [] points) {
        lines = new Line[points.length];
        for(int i = 0 ; i < points.length ; i++){
            lines[i] = new Line(points[i%points.length],points[(i+1)%points.length]);
        }
    }

   
    void shift_shape_left(double amount){
        for(Line l : lines)
            l.shift_left_line(amount);
        
    }
    void shift_shape_right(double amount){
        for(Line l : lines)
            l.shift_right_line(amount);
    }
    void shift_shape_up(double amount){
        for(Line l : lines )
            l.shift_up_line(amount);
    }
    void shift_shape_down(double amount){
        for(Line l : lines )
            l.shift_down_line(amount);
    }
    
    double get_area(){
        double sum=0;
        for(int i = 0 ; i < points.length-1 ; i++){
            sum+=(points[i].getXPoint()*points[i+1].getYPoint())-(points[i+1].getXPoint()*points[i].getYPoint());
        }
        return (Math.abs(sum)/2);
    }
}