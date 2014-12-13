/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binpackingproblem;

public class Point {
    private double x , y ;
    Point()
    {
        this.x=0;
        this.y=0;
    }
    Point(double x , double y )
    {
        setPoint(x , y );
    }
    private void  setPoint(double x , double y )
    {
        this.x=x ;
        this.y=y;
    }
    public double getXPoint()
    {
        return x;
    }
    public double getYPoint()
    {
        return y ;
    }
    public void shift_left_point(double a)
    {
        this.x -=a;

    }
     public void shift_right_point(double a)
    {
        this.x +=a;

    }
     public void shift_up_point(double a )
     {
         this.y += a ;
     }
     public void shift_down_point(double a )
     {
         this.y -= a ;
     }
}
