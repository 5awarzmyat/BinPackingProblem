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

    public Shape() {
        area = 0 ; 
        lines = null;
    }

    public Shape(Line[] lines , int number) {
        this.lines = new Line[number];
        this.lines = Arrays.copyOf(lines, number);
    }
    void shift_shape_left(float amount){
        for(Line l : lines)
            l.shift_left_line(amount);
        
    }
    void shift_shape_right(float amount){
        for(Line l : lines)
            l.shift_right_line(amount);
    }
    void shift_shape_up(float amount){
        for(Line l : lines )
            l.shift_up_line(amount);
    }
    void shift_shape_down(float amount){
        for(Line l : lines )
            l.shift_down_line(amount);
    }
    
    
}