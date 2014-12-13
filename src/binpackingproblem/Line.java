/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binpackingproblem;

/**
 *
 * @author JALAL-PC
 */


public class Line {
    
   private  Point start ;
   private  Point end ; 
    Line()
    {
        
    }
    Line(Point start , Point end )
    {
       Setstart(start);
       Setend(end);
    }
    private void Setstart(Point start)
    {
       this.start=start; 
    }
    private void Setend(Point end)
    {
        this.end=end;
    }
    public Point getStart()
    {
        return start;
    }
    public Point getEnd()
    {
        return end;
    }
    public void shift_left_line(float a)
    {
        
       start.shift_left_point(a);
       end.shift_left_point(a);
        
    }
     public void shift_right_line(float a)
    {
        
       start.shift_right_point(a);
       end.shift_right_point(a);
        
    }
     public void shift_up_line(float a)
    {
        
       start.shift_up_point(a);
       end.shift_up_point(a);
        
    }
     public void shift_down_line(float a)
    {
        
       start.shift_down_point(a);
       end.shift_down_point(a);
        
    }
     public double calculate_angle (Line l )
     {
         double theta ;
         theta = Math.atan((l.getEnd().getYPoint()-l.getStart().getYPoint())/(l.getEnd().getXPoint()-l.getStart().getYPoint()));
         return theta; 
     }
    
}
