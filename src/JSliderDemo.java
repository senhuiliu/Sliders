/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderDemo extends JFrame
{
   public JPanel panel;
   public JLabel label;
   public JSlider jslider1,jslider2,jslider3;
   JSliderDemo()
   {
       panel=new JPanel();
       panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),new EmptyBorder(2, 2, 2, 2)));
       label=new JLabel("Notice Color change when you scroll the bars");
       label.setForeground(Color.BLACK);
       panel.add(label);
       jslider1=new JSlider(JSlider.HORIZONTAL);
       jslider2=new JSlider(JSlider.HORIZONTAL);
       jslider3=new JSlider(JSlider.HORIZONTAL);
       //Register listener for the scroll bars
       ChangeListener listener1=new Listener1();
       ChangeListener listener2=new Listener2();
       ChangeListener listener3=new Listener3();
       jslider1.addChangeListener(listener1);
       jslider2.addChangeListener(listener2);
       jslider3.addChangeListener(listener3);
       panel.add(jslider1);
       panel.add(jslider2);
       panel.add(jslider3);
       add(panel);
   }
   public static void main(String[] args)
   {
       JSliderDemo scr=new JSliderDemo();
       scr.setSize(300, 200);
       scr.setLocationRelativeTo(null);
       scr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       scr.setVisible(true);  
   }
   class Listener1 implements ChangeListener
   {
       @Override
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.RED);
       }  
   }
   class Listener2 implements ChangeListener
   {
       @Override
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.GREEN);
       }  
   }
   class Listener3 implements ChangeListener
   {
       @Override
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.BLUE);
       }  
   }

}
