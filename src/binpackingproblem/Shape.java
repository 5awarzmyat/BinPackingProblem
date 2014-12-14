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
    double [] angles;
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
    double [] get_angles(){
        
        angles = new double[points.length];
        for(int i = 0 ; i < lines.length ; i++){
            angles[i] = 180.0 - lines[(i+1)%lines.length].calculate_angle() + lines[i%lines.length].calculate_angle();
        }
        return angles;
    }
    Line get_right_end(){
        double max1 = 0 ; 
        double max2 = 0 ; 
        Point First = new Point();
        Point Second = new Point();
        for(Line l : lines ){
            if(l.getStart().getXPoint() >= max1){
                max1 = l.getStart().getXPoint();
                First = l.getStart();
            }
        }
         for(Line l : lines ){
             if(l.getStart().equals(First))
                 continue;
             else if((l.getStart().getXPoint() >= max2)){
                max2 = l.getStart().getXPoint();
                Second = l.getStart();
            }   
           
        }
         Line rightEnd = new Line(First, Second);
         return rightEnd;
    }
    Line get_left_end(){
        double min1 = 0 ; 
        double min2 = 0 ; 
        Point First = new Point();
        Point Second = new Point();
        for(Line l : lines ){
            if(l.getStart().getXPoint() <= min1){
                min1 = l.getStart().getXPoint();
                First = l.getStart();
            }
        }
          for(Line l : lines ){
             if(l.getStart().equals(First))
                 continue;
             else if((l.getStart().getXPoint() <= min2)){
                min1 = l.getStart().getXPoint();
                Second = l.getStart();
            }   
           
        }
         Line leftEnd = new Line(First, Second);
         return leftEnd;
    }
    Line get_bottom_end(){
        double min1 = 0 ; 
        double min2 = 0 ; 
        Point First = new Point();
        Point Second = new Point();
        for(Line l : lines ){
            if(l.getStart().getYPoint() <= min1){
                min1 = l.getStart().getYPoint();
                First = l.getStart();
            }
        }
         for(Line l : lines ){
             if(l.getStart().equals(First))
                 continue;
             else if((l.getStart().getYPoint() <= min2)){
                min1 = l.getStart().getYPoint();
                Second = l.getStart();
            }   
           
        }
         Line bottomEnd = new Line(First, Second);
         return bottomEnd;
    }
    Line get_upper_end(){
        double max1 = 0 ; 
        double max2 = 0 ; 
        Point First = new Point();
        Point Second = new Point();
        for(Line l : lines ){
            if(l.getStart().getYPoint() >= max1){
                max1 = l.getStart().getYPoint();
                First = l.getStart();
            }
        }
         for(Line l : lines ){
             if(l.getStart().equals(First))
                 continue;
             else if((l.getStart().getYPoint() >= max2)){
                max2 = l.getStart().getYPoint();
                Second = l.getStart();
            }   
           
        }
         Line upperEnd = new Line(First, Second);
         return upperEnd;
    }
}