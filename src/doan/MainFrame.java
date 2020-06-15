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
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author thanhliem
 */
public class MainFrame extends JFrame implements ActionListener {

    
    Surface sf = new Surface();

    JLabel label4 = new JLabel();


    JButton bt4 = new JButton();

    // ham khoi tao
    public MainFrame()
    {
        //ham khoi tao cac gia trido hoa
        initUI();
    }
    public void initUI()
    {
                this.setSize(1520, 820);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setTitle("KTDH - NHOM 13");
                
                bt4.setText("Ve hinh");
		bt4.setBounds(70,580, 150, 40);
		bt4.setBorder(BorderFactory.createBevelBorder(1));
		bt4.setFocusable(false);
		bt4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));
                
            
                
		
                this.add(label4);
               
              
		
               
                
     
                // nut 4
                this.add(bt4);
                bt4.setActionCommand("Ve hinh");
                    this.add(sf);
		bt4.addActionListener(this);
    }
public void xuLy()
{
                                       
					
					int a = 10 * 5;
					int b = 103* 5;
                                        int c = 15 * 5;
                                        int d = 100 * 5;
                                        int e = 22 *5;
                                        
                                        int x = 2*5;
                                        
					
                                                
						sf.a = a;
						sf.b = b;
                                                sf.c = c;
                                                sf.d = d;
                                                sf.e = e;
						System.out.println(sf.a);
						System.out.println(sf.b);
                                                System.out.println(sf.c);
						System.out.println(sf.d);
						sf.repaint();
									
			}

    @Override
    public void actionPerformed(ActionEvent e) {

         if("Ve hinh".equals(e.getActionCommand()))
        {
            sf.index=1;
            xuLy();
            
        }
            
    }
    
  public static void main(String []args) {
            EventQueue.invokeLater(new Runnable() {
         
            @Override
            public void run() {
                MainFrame mainframe = new MainFrame();
                mainframe.setVisible(true);
                }
});
                    }
}
