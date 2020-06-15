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
import static java.lang.Math.abs;
import javax.swing.JPanel;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanhliem
 */
public class Surface extends JPanel{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int index;
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        this.setBounds(700, 0, 750, 750);
        Graphics2D g2d = (Graphics2D) g;
        Axis(g2d);
        doDrawing(g2d);
    }
    
  public static void pause(int ms) {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        System.err.format("IOException: %s%n", e);
    }
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
            int f = 7*15;
            toi(g2d,a-f,b+7*15,2*15);
            toi(g2d,a-f,b+7*15,1*15);
            g2d.setColor(Color.red);
            g2d.fillOval(a-3*15, b-10*15, 5, 5);
            XeTang(g2d);
            DrawElip(g2d,a+3*15,d+10*15,8*15,2*15);
            //tinhtien(g2d);
//            banhxe(g2d,15*15,20*15,2*15);
                
        }
    }
    

    public void Axis(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i =0; i <= 80; i++) {
			g2d.drawLine(15 * i, 0, 15 * i, 750);// ta se set 15 don vi pixel tren mot square
			g2d.drawLine(0, 15 * i, 750, 15 * i);
		}
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(Color.BLACK);
		//g2d.drawLine(0, 375, 750, 375);
		//g2d.drawLine(375, 0, 375,750 );
        }
    //ham ve dda1
    
    public void muiTen(Graphics2D g2d)
    {
        //Truong hop 0<m<1 && x1<x2 && y1<y2
          //ve doan thang 
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int tamx,tamy;
            //MidpointLine(g2d,c,d,c-45,d+30);
            if(a<c){
            
            dy=d-b;
            dx=c-a;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=a;
            y=b;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
            if(b == d){// mui ten nam ngang huong ve ra xa truc oy  -------->
            muiten1(g2d,c,d,c,d);
            muiten2(g2d,c,d,c,d);
            muiten3(g2d,c,d,c,d);
            }
         }
            else if(a>c){
                dy=b-d;
                dx=a-c;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=c;
            y=d;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
            if(b == d){// mui ten nam ngang huong ve phhia truc oy <-----------
            muiten4(g2d,c,d,c,d);
            muiten5(g2d,c,d,c,d);
            muiten6(g2d,c,d,c,d);
            }
            }
            else if(b < d){
            dy=d-b;
            dx=a-c;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=a;
            y=b;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
            if(a == c){
            muiten7(g2d,c,d,c,d);
            muiten8(g2d,c,d,c,d);
            muiten9(g2d,c,d,c,d);
            }
            }
            else if(b > d){
            dy=b-d;
            dx=c-a;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x=c;
            y=d;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
            if(a == c){
            muiten10(g2d,c,d,c,d);
            muiten11(g2d,c,d,c,d);
            muiten12(g2d,c,d,c,d); 
            }
            }
            // ve  toa do 
        int x1 = Math.round(a / 15);
                    int y1 = Math.round(b / 15);
                    int x2 = Math.round(c / 15);
                    int y2 = Math.round(d / 15); 
                    x1=x1-25;
                    x2=x2-25;
                    y1=25-y1;
                    y2=25-y2;
                     
                     g2d.setColor(Color.BLUE);
                     g2d.setFont(new Font("", Font.BOLD, 20));
                     g2d.drawString("("+ x1 + "," + y1 + ")", a, b+30);
                     g2d.drawString("("+ x2 + "," + y2 + ")", c, d+30);
    }
    
    
    public void XeTang(Graphics2D g2d){
            //ve than xe tang
            int x = 2*15;
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
            duongthang((Graphics2D) g2d,c,d,e,d);
            duongthang((Graphics2D) g2d,c,d+1*15,e,d+1*15);
            duongthang((Graphics2D) g2d,c,d+2*15,e,d+2*15);
            duongthang((Graphics2D) g2d,e,d-1*15,e,d+3*15);
            duongthang((Graphics2D) g2d,e,d-1*15,e+5*15,d-1*15);
            duongthang((Graphics2D) g2d,e,d+3*15,e+5*15,d+3*15);
            duongthang((Graphics2D) g2d,e+5*15,d-1*15,e+5*15,d+3*15);
            duongthang((Graphics2D) g2d,a-5*15,b,c+6*15,b);
            duongthang((Graphics2D) g2d,a-5*15,b,a-5*15,b+5*15);
            duongthang((Graphics2D) g2d,c+6*15,b,c+6*15,b+5*15);
            duongthang((Graphics2D) g2d,a-10*15,b+5*15,c+10*15,b+5*15);
            duongthang((Graphics2D) g2d,a-5*15,b,a-10*15,b+5*15);
            duongthang((Graphics2D) g2d,c+6*15,b,c+10*15,b+5*15);
            duongthang((Graphics2D) g2d,a-5*15,b+5*15,a-5*15,b+9*15);
            duongthang((Graphics2D) g2d,a-10*15,b+5*15,a-5*15,b+9*15);
            duongthang((Graphics2D) g2d,c+6*15,b+9*15,c+10*15,b+5*15);
            duongthang((Graphics2D) g2d,c+6*15,b+5*15,c+6*15,b+9*15);
            duongthang((Graphics2D) g2d,a-5*15,b+9*15,c+6*15,b+9*15);
            //ve dau dan tank
            
            
            duongthang((Graphics2D) g2d,e+5*15,d-1*15,e+7*15,d+1*15);
            duongthang((Graphics2D) g2d,e+7*15,d+1*15,e+5*15,d+3*15);
            
            //tinh tien dau dan tank
           // ve banh xe
        
           
    }
    
    public void tinhtien(Graphics2D g2d) {
        int i=0;
//      while(i<25){
//                    MyThread mt = new MyThread();
//                    try {
//                 mt.Thread1();
//                 duongthang((Graphics2D) g2d,a+i,d,e+i,d);
//             } catch (InterruptedException ex) {
//                 Logger.getLogger(Surface.class.getName()).log(Level.SEVERE, null, ex);
//             }
//                    //duongthang((Graphics2D) g2d,e+(5+i)*15,d-1*15,e+(7+i)*15,d+1*15);
//                   // duongthang((Graphics2D) g2d,e+(7+i)*15,d+1*15,e+(5+i)*15,d+3*15);
//                    duongthang((Graphics2D) g2d,a+i,d,e+i,d);
//                    i++;
//             
//    }
duongthang((Graphics2D) g2d,a+i,d,e+i,d);
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
    
     void toi(Graphics2D g2d,int xc,int yc,int r){

         int kc = 0;
         for(int i=0;i<4;i++){
             
             kc +=4*15;
             banhxe(g2d,(xc+kc),yc,r);
            
             
     }
    
}
     
      public void DrawElip(Graphics2D g2d,int x_center,int y_center,int a,int b){
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
                          for(int i=0;i<15;i++){
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
                       for(int i=0;i<15;i++){
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
                        for(int i=0;i<15;i++){
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
                        for(int i=0;i<15;i++){
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
                    for(int i=0;i<15;i++){
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
    

            
        
        
    public void muiten1(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
           
            
            // ve canh tren 
           
            q3 = q3 - h;
            q4 = q4 - a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
        
        }
        
        public void muiten2(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
         
            
            // ve canh tren 
           
            q3 = q3 - h;
            q4 = q4 + a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
       
        }
        
        public void muiten3(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
            
            
            // ve canh tren 
            q1 = q1 - h;
            q2 = q2 - a;
            q3 = q3 - h;
            q4 = q4 + a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
           }
        
        }
        
        public void muiten4(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
  
            
            // ve canh tren 
           
            q3 = q3 + h;
            q4 = q4 - a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
        
        }
        
        public void muiten5(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
            
            
            // ve canh tren 
           
            q3 = q3 + h;
            q4 = q4 + a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
        
        }
        
        public void muiten6(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
          
            
            // ve canh tren 
            q1 = q1 + h;
            q2 = q2 - a;
            q3 = q3 + h;
            q4 = q4 + a;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
        
        }
//     void MidpointLine(Graphics2D g2d, int x1, int y1, int x2, int y2)
//{
//	int Dx = x2 - x1;
//	int Dy = y2 - y1;
//	int x = x1;
//	int y = y1;
//        
//	float D = Dy - Dx/2;
//	while(x <= x2)
//	{
//		x++;
//		if (D < 0 )
//		{
//			D = D + Dy;
//		}
//		else 
//		{
//			D = D + (Dy - Dx);
//			y++;
//		}
//                g2d.setColor(Color.red);
//		g2d.fillOval(x, y, 5, 5);
//	}
//}           
     public void muiten7(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
           
            
            // ve canh tren 
           
            q3 = q3 + a;
            q4 = q4 - h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
}
            public void muiten8(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
         
            
            // ve canh tren 
           
            q3 = q3 - a;
            q4 = q4 - h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
       
        }
        
        public void muiten9(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
            
            
            // ve canh tren 
            q1 = q1 + a;
            q2 = q2 - h;
            q3 = q3 - a;
            q4 = q4 - h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
           }
        
        }
        
        public void muiten10(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
           
            
            // ve canh tren 
           
            q3 = q3 - a;
            q4 = q4 + h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
        
        }
        
        public void muiten11(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
         
            
            // ve canh tren 
           
            q3 = q3 + a;
            q4 = q4 + h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
            }
       
        }
        
        public void muiten12(Graphics2D g2d,int q1,int q2,int q3,int q4){
          
            int dx,dy;
            int xet=1;
            float Xinc,Yinc,x,y,steps;
            int h = 30;
            int a = 15;
            
            
            // ve canh tren 
            q1 = q1 + a;
            q2 = q2 + h;
            q3 = q3 - a;
            q4 = q4 + h;
                    
            dy=q4-q2;
            dx=q3-q1;
            
            if(dy>dx){
                steps=Math.abs(dy);
            }
            else{
                steps=Math.abs(dx);
            }
            x = q1;
            y = q2;
            Yinc=dy/steps;
            Xinc=dx/steps;
            
            while(steps!=0){
                if(xet %2 != 0){
                    //net gach
                    for(int i=0;i<15;i++){
                    steps--;
                    x=x+Xinc;
                    y=y+Yinc;
                    g2d.setColor(Color.BLUE);
                    g2d.fillOval(Math.round(x), Math.round(y), 5, 5);
                    }   
                }
                xet++;
           }
        
        }
}