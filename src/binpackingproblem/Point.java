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
    Point(float x , float y )
    {
        setPoint(x , y );
    }
    private void  setPoint(float x , float y )
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
    public void shift_left_point(float a)
    {
        this.x -=a;

    }
     public void shift_right_point(float a)
    {
        this.x +=a;

    }
     public void shift_up_point(float a )
     {
         this.y += a ;
     }
     public void shift_down_point(float a )
     {
         this.y -= a ;
     }
}
