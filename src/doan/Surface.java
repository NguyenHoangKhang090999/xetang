/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doan;

/**
 *
 * @author LAPTOP ASUS
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.abs;
import static java.lang.Thread.sleep;
import javax.swing.JPanel;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author thanhliem
 */
public class Surface extends JPanel{
    int a = 10 * 5;
    int b = 103* 5;
    int c = 15 * 5;
    int d = 100 * 5;
    int e = 22 *5;
    
    
    Point viendan =new Point(175,500);
        Point nongsung1 = new Point(15*5,100*5);
        Point nongsung2 = new Point(15*5,101*5);
        Point nongsung3 = new Point(35*5,90*5);
        Point nongsung4 = new Point(35*5,91*5);
    
    
    public int index;
    @Override
    
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        this.setBounds(300, 0, 750, 750);
        Graphics2D g2d = (Graphics2D) g;
        Axis(g2d);
        doDrawing(g2d);
    }

    // ham ve thi ta ve vao day
    
    public Surface(){
        this.index = -1;
    }
    
    
    public void doDrawing(Graphics2D g2d)
    {
        // ham ke o
        Axis(g2d);
        if(index==1)
        {
            int f = 7*5;
             XeTang(g2d);
            Banhrang(g2d,a+3*5,d+10*5,8*5,2*5);
            ve4banh(g2d,a-f,b+7*5,2*5);
            ve4banh(g2d,a-f,b+7*5,1*5);
            duongbang(g2d);
//            
            hangrao(g2d,50*5,d+11*5,52*5,d+5*5);
            co(g2d);

            

                
        }
    }
    

    public void Axis(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i =0; i <= 160; i++) {
			g2d.drawLine(5 * i, 0, 5 * i, 750);
			g2d.drawLine(0, 5 * i, 750, 5 * i);
		}
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(Color.BLACK);
		
        }
 
  public void XeTang(Graphics2D g2d){
            //ve than xe tang
            int x = 2*5;
            
            g2d.setColor(Color.blue);
            duongthang((Graphics2D) g2d,a,b,c,b);
            duongthang((Graphics2D) g2d,a,b,a,d);
            duongthang((Graphics2D) g2d,c,d,a,d);
            duongthang((Graphics2D) g2d,c,d,c,b);
            duongthang((Graphics2D) g2d,a-x,b,a,b);
            duongthang((Graphics2D) g2d,a,d,a-x,b);
            duongthang((Graphics2D) g2d,c,b,c+x,b);
            duongthang((Graphics2D) g2d,c,d,c+x,b);
            duongthang((Graphics2D) g2d,a,b,c,d);
            duongthang((Graphics2D) g2d,a,d,c,b);
            
            duongthang((Graphics2D) g2d,a-5*5,b,c+6*5,b);
            duongthang((Graphics2D) g2d,a-5*5,b,a-5*5,b+5*5);
            duongthang((Graphics2D) g2d,c+6*5,b,c+6*5,b+5*5);
            duongthang((Graphics2D) g2d,a-10*5,b+5*5,c+10*5,b+5*5);
            duongthang((Graphics2D) g2d,a-5*5,b,a-10*5,b+5*5);
            duongthang((Graphics2D) g2d,c+6*5,b,c+10*5,b+5*5);
            duongthang((Graphics2D) g2d,a-5*5,b+5*5,a-5*5,b+9*5);
            duongthang((Graphics2D) g2d,a-10*5,b+5*5,a-5*5,b+9*5);
            duongthang((Graphics2D) g2d,c+6*5,b+9*5,c+10*5,b+5*5);
            duongthang((Graphics2D) g2d,c+6*5,b+5*5,c+6*5,b+9*5);
            duongthang((Graphics2D) g2d,a-5*5,b+9*5,c+6*5,b+9*5);
            
            
            //ve nong sung cua tank
            
           g2d.drawLine(nongsung1.x,nongsung1.y,nongsung3.x,nongsung3.y);
           g2d.drawLine(nongsung2.x,nongsung2.y,nongsung4.x,nongsung4.y);
           g2d.drawLine(nongsung3.x,nongsung3.y,nongsung4.x,nongsung4.y);
  }
    
    public void duongbang(Graphics2D g2d){
        
        duongthang((Graphics2D) g2d,22*5,d+11*5,200*5,d+11*5);
        duongthang((Graphics2D) g2d,0,d+25*5,200*5,d+25*5);
        duongthang((Graphics2D) g2d,0*5,d+11*5,3*5,d+11*5);
       
        
        tomau(g2d,6*5,d+17*5,15*5,d+18*5);
        int a1 = 6;
        int b1 = 15;
        int f = 14;
        for(int i=0;i<10;i++){
            a1 = a1 + f;
            b1 = b1 + f;
            
            g2d.setColor(Color.white);
           tomau(g2d,a1*5,d+17*5,b1*5,d+18*5);
           
        }
 }
    
    
    public void hangrao(Graphics2D g2d,int x0,int y0,int x1,int y1){
        
        duongthang((Graphics2D) g2d,x0,y0,x1,y1);
        duongthang((Graphics2D) g2d,x1,y0,x0,y1);
        int kc = 2*5;
        int a = x0;
        int b = x1;
        int c = x0 + 30*5;
        int d = x1 + 30*5;
       
        for(int i=0;i<10;i++){
          a = a+kc;
          b = b+kc;
            
        duongthang((Graphics2D) g2d,a,y0,b,y1);
        duongthang((Graphics2D) g2d,b,y0,a,y1);
        }
        
       for(int i=0;i<10;i++){
          c = c+kc;
          d = d+kc;
            
        duongthang((Graphics2D) g2d,c,y0,d,y1);
        duongthang((Graphics2D) g2d,d,y0,c,y1);
        }
    }
    
    public void co(Graphics2D g2d){
        g2d.setColor(Color.green);
        tomau(g2d,0,d+26*5,200*5,d+50*5);
        
    }
    
    public void tomau(Graphics2D g2d,int x0,int y0,int x1,int y1){
        //to mau 
        
           int dy=Math.abs(y1-y0);
            int dx= Math.abs(x1-x0);
            int x,y;
            if(x0>=x1) x=x1;
            else x=x0;
            
            if(y0>=y1) y =y1;
            else y =y0;
            
           g2d.fillRect(x, y, dx, dy);
    }
    
    
    

    
    
    void put8pixel(Graphics2D g2d,int xc, int yc, int x, int y)
{
    g2d.setColor(Color.WHITE);
    g2d.fillOval(x + xc, y + yc, 3,3);
    g2d.fillOval(-x + xc, y + yc, 3,3);
    g2d.fillOval(x + xc, -y + yc, 3,3);
    g2d.fillOval(-x + xc, -y + yc, 3,3);
    g2d.fillOval( y + xc, x + yc, 3,3);
    g2d.fillOval(-y + xc, x + yc, 3,3);
    g2d.fillOval(y + xc, -x + yc, 3,3);
    g2d.fillOval(-y + xc, -x + yc,3,3);
}
    
    void banhxe(Graphics2D g2d,int xc, int yc, int r)
{
    
    int x = 0; int y = r;
    int f = 1 - r;
    put8pixel(g2d, xc, yc, x, y);
    while (x < y)
    {
        if (f < 0) f += (x << 1) + 3;
        else
        {
            y--;
            f += ((x - y) << 1) + 5;
        }
        x++;
       put8pixel(g2d, xc, yc, x, y);
    }
}
    
     void ve4banh(Graphics2D g2d,int xc,int yc,int r){

         int kc = 0;
         for(int i=0;i<4;i++){
             
             kc +=4*5;
             banhxe(g2d,(xc+kc),yc,r);
            
             
     }
    
}
     
      public void Banhrang(Graphics2D g2d,int x_center,int y_center,int a,int b){
                  float p,a2,b2;
                  int x,y;
                  int check1=1;
                  int check2=1;
                  a2=a*a;
                  b2=b*b;
                  x=0;
                  y=b;
                  p=2*((float)b2/a2)-(2*b)+1;
                  
                  //Ve net dut
                  //ve nhanh thu 1(tren trai)
                  while(((float)b2/a2)*x<=y)
                  {
                      if(check1 %2 != 0){
                          for(int i=0;i<5;i++){
                                putnetdut(g2d,x_center,y_center,x,y);
                            if(p<0)
                            {
                                p=p+2*((float)b2/a2)*(2*x+3);
                            }
                            else{
                                p= p- 4*y + 2*((float)b2/a2)*(2*x+3);
                                y--;
                            }
                            x++;  
                           }                                               
                      }else{
                       for(int i=0;i<5;i++){
                             if(p<0)
                             {
                                 p=p+2*((float)b2/a2)*(2*x+3);
                             }
                             else{
                                 p= p- 4*y + 2*((float)b2/a2)*(2*x+3);
                                 y--;
                             }
                             x++;                      
                       }                        
                     }
                      check1 ++;
                  }
                     
                  //ve nhanh thu 2(phia tren ben phai)
                  y=0;
                  x=a;
                  p=2*((float)a2/b2)-2*a+1;
                  while(((float)a2/b2)*y<=x)
                  {
                      if(check2 %2 !=0){
                        for(int i=0;i<5;i++){
                             putnetdut(g2d,x_center,y_center,x,y);
                          if(p<0)
                         {
                           p=p +2*((float)a2/b2)*(2*y+3);
                         }else
                         {
                          p=p- 4*x + 2*((float)a2/b2)*(2*y+3);
                          x--;
                         }
                          y++;
                        } 
                      }else{
                        for(int i=0;i<5;i++){
                            if(p<0)
                         {
                           p=p +2*((float)a2/b2)*(2*y+3);
                         }else
                         {
                          p=p- 4*x + 2*((float)a2/b2)*(2*y+3);
                          x--;
                         }
                          y++;
                      
                       } 
                      }
                     check2++;
                  }    
                  
                  // ve net lien
                   x=0;
                   y=b;
                   p=2*((float)b2/a2)-(2*b)+1;
                  //ve nhanh thu 3(phia duoi ben phai)
                    while(((float)b2/a2)*x<=y)
                    {
                        putnetdut(g2d,x_center,y_center,x,y);
                        if(p<0)
                        {
                            p=p+2*((float)b2/a2)*(2*x+3);
                        }
                        else{
                            p= p- 4*y + 2*((float)b2/a2)*(2*x+3);
                            y--;
                        }
                        x++;
                    }
                              
                  //ve nhanh thu 4(phia duoi ben trai)
                    y=0;
                    x=a;
                    p=2*((float)a2/b2)-2*a+1;
                    while(((float)a2/b2)*y<=x)
                    {
                        putnetdut(g2d,x_center,y_center,x,y);
                        if(p<0)
                        {
                            p=p +2*((float)a2/b2)*(2*y+3);
                        }
                        else
                        {
                            p=p- 4*x + 2*((float)a2/b2)*(2*y+3);
                            x--;
                        }
                        y++;
                    } 
      }
          
          void putnetdut(Graphics g2d,int xc,int yc,int x,int y){
             g2d.setColor(Color.red);  
             g2d.fillOval(xc-x, yc-y,3,3);//trên trái
             g2d.fillOval(xc+x, yc-y,3,3);//trên phải
             g2d.fillOval(xc+x, yc+y,3,3);
             g2d.fillOval(xc-x, yc+y,3,3);
            
       }
          void putnetlien(Graphics g2d,int xc,int yc,int x,int y){
             g2d.setColor(Color.red);  
             g2d.fillOval(xc+x, yc+y,5,5); //dưới phải
             g2d.fillOval(xc-x, yc+y,5,5); //dưới trái
            
       }    
    
          
  
    public void duongthang(Graphics2D g2d,int x1,int y1,int x2,int y2){
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int tamx,tamy;
            //MidpointLine(g2d,c,d,c-45,d+30);
           
            if(x1>x2||y1>y2){
            tamx=x1;
            x1=x2;
            x2=tamx;       
            tamy=y1;
            y1=y2;
            y2=tamy;          
            }         
            
            
            dy=y2-y1;
            dx=x2-x1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=x1;
            y=y1;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<5;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.WHITE);
                    g2d.fillOval(Math.round(x), Math.round(y), 3, 3);
                    }   
                }
                xet++;
            }
            
        
        }

 

            
        
        
   

        
        }

