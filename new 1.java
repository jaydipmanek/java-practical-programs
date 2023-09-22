/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author jaydi
 */
public class main {
     public static void main(String[] args){
       JFrame frame=new JFrame("snake game");
       frame.setBounds(10,10,905,700);
       frame.setResizable(false);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
       Gamepanel panel=new Gamepanel();
       panel.setBackground(Color.DARK_GRAY);
       frame.add(panel);
       
       frame.setVisible(true);
    }
    
}
