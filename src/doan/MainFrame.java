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
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author thanhliem
 */
public class MainFrame extends JFrame implements ActionListener {

    Transformation tm =new Transformation();
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
                this.setSize(1350, 800);
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setTitle("TANK");
                
                bt4.setText("PLAY");
		bt4.setBounds(70,580, 150, 40);
		bt4.setBorder(BorderFactory.createBevelBorder(1));
		bt4.setFocusable(false);
		bt4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));
               
                this.add(label4);
          
                this.add(bt4);
                bt4.setActionCommand("PLAY");
                    this.add(sf);
		bt4.addActionListener(this);
    }
public void xuLy()
{
	System.out.println(sf.a);
        System.out.println(sf.b);
        System.out.println(sf.c);
	System.out.println(sf.d);
	sf.repaint();
									
}

    @Override
    public void actionPerformed(ActionEvent e) {

         if("PLAY".equals(e.getActionCommand()))
        {
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
