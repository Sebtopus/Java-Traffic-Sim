/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph43;

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author Seb
 */
public class Graph43 extends JApplet implements Runnable{

     Thread animator;
     
     boolean Auto1 = true;
     boolean Auto2 = true;
     boolean Auto3 = true;
     boolean Auto4 = true;
     boolean Rood1 = false;
     boolean Rood2 = true;
     boolean Groen1 = true;
     boolean Groen2 = false;
     boolean Auto5 = false;
     boolean Auto6 = false;
     
     
//variables for animating the cloud
    int Auto1X;
    int Auto1Y;
    int Auto2X;
    int Auto2Y;
     int Auto3X;
    int Auto3Y;
    int Auto4X;
    int Auto4Y;
    int Auto1tracker = 0;
    int A = 0;
    int Afslag1 = 1; 
    int afslag2;
    
    int Auto6X;
    int Auto6Y;
    
    int Auto5X;
    int Auto5Y;
    
    int Knipper1;
    
    Color Stoplichtgroen1;
    Color Stoplichtoranje1;
    Color Stoplichtrood1;
    Color Stoplichtgroen2;
    Color Stoplichtoranje2;
    Color Stoplichtrood2;
    Color Autokleur1;
    Color Autokleur2;
    Color Autokleur3;
    Color Autokleur4;
    Color Autokleur5; 
    Color Koplamp5;
    Color Achterlamp5;
    Color Dak5;
    
    Color Koplamp1;
    
    int Speed;
    int Autonieuw1;
    int Autonieuw2;
    int Autonieuw3;
    int Autonieuw4;
    
    int Stoplicht1switch;        
    
    BufferedImage img;
    Graphics g2;
    
    
    
    
    @Override
    public void init() {
        JRootPane root = this.getRootPane();
        root.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    }
     
    @Override
    public void start()
    {
       img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
       g2 = img.createGraphics();
        //Auto start posities
        Auto1X = 490;
        Auto1Y = 500;
        Auto2X = 460;
        Auto2Y = 1;
        Auto3X = 1;
        Auto3Y = 260;
        Auto4X = 960;
        Auto4Y = 230;
        Auto5Y = 260;
        Auto5X = 460;
        Autonieuw1 = 0;
        Autonieuw2 = 0;
        Autonieuw3 = 0;
        Autonieuw4 = 0;
        Knipper1 = 0;
        
        Auto6Y = 240;
        Auto6X = 450;
        
        Speed = 10;
        
        Stoplichtrood1 = new Color(142,2,2);
        Stoplichtoranje1 = new Color(142,84,2);
        Stoplichtgroen1 = new Color(0,255,7);
        
        Stoplichtrood2 = new Color(255,2,2);
        Stoplichtoranje2 = new Color(142,84,2);
        Stoplichtgroen2 = new Color(13,161,0);
        
        Autokleur5 = new Color(96,96,96);
        Koplamp5 = new Color(96,96,96);
        Achterlamp5 = new Color(96,96,96);
        Dak5 = new Color(96,96,96);
         
       Koplamp1 = new Color(226,255,0);
           
         
        Autokleur5 = new Color(96,96,96);
        Koplamp5 = new Color(96,96,96);
        Achterlamp5 = new Color(96,96,96);
        Dak5 = new Color(96,96,96);
        
        animator = new Thread(this);
       animator.start();
   
String input = JOptionPane.showInputDialog(null,
     "Vul een getal in voor de snelheid van de animatie. 10 is normaal, 1 is snel");
JOptionPane.showMessageDialog(null,"You entered "+ input);
     Speed = Integer.parseInt(input);  
    }
    
    @Override
    public void stop()
    {
       animator = null;
    }

    @Override
    public void destroy()
    {
     
    }

    @Override
    public void paint(Graphics g) {
       
 //achtergrond
        g2.setColor(Color.green);
        g2.fillRect(0,0, getWidth(), getHeight());        



//Kruispunt
     //   g2.setColor(Color.BLACK);
       // g2.fillRect(735, 275, 450, 450);
        
///eerste weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 220, 400, 30);
        g2.fillRect(0, 250, 400, 30);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(0, 250, 400, 3);
        
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 190, 1000, 3);
        
        ///tweede weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(550, 220, 400, 30);
        g2.fillRect(550, 250, 400, 30);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(550, 250, 400, 3);
        
 
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 500, 2000, 1);
        ///Derde weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(450, 0, 30, 200);
        g2.fillRect(480, 0, 30, 200);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(480, 0, 3, 200);
        
        ///Vierde weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(450, 300, 30, 350);
        g2.fillRect(480, 300, 30, 350);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(480, 300, 3, 300);
        
        //Kruispunt
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(370, 140, 220, 220);
      
//Zebra pad
        g2.setColor(Color.white);
        g2.fillRect(710, 440, 30, 5);     
        g2.fillRect(710, 450, 30, 5);     
        g2.fillRect(710, 460, 30, 5);     
        g2.fillRect(710, 470, 30, 5);     
        g2.fillRect(710, 480, 30, 5);    
        g2.fillRect(710, 490, 30, 5);     
        g2.fillRect(710, 500, 30, 5);     
        g2.fillRect(710, 510, 30, 5);     
        g2.fillRect(710, 520, 30, 5);     
        g2.fillRect(710, 530, 30, 5);     
        g2.fillRect(710, 540, 30, 5);    
        g2.fillRect(710, 550, 30, 5);     
                                  
//Zebra pad
        g2.setColor(Color.white);
        g2.fillRect(1180, 440, 30, 5);     
        g2.fillRect(1180, 450, 30, 5);     
        g2.fillRect(1180, 460, 30, 5);     
        g2.fillRect(1180, 470, 30, 5);     
        g2.fillRect(1180, 480, 30, 5);    
        g2.fillRect(1180, 490, 30, 5);     
        g2.fillRect(1180, 500, 30, 5);     
        g2.fillRect(1180, 510, 30, 5);     
        g2.fillRect(1180, 520, 30, 5);     
        g2.fillRect(1180, 530, 30, 5);     
        g2.fillRect(1180, 540, 30, 5);    
        g2.fillRect(1180, 550, 30, 5); 
        
        //Zebra pad
        g2.setColor(Color.white);
        g2.fillRect(905, 720,  5, 30);     
        g2.fillRect(915, 720,  5, 30);     
        g2.fillRect(925, 720,  5, 30);     
        g2.fillRect(935, 720,  5, 30);     
        g2.fillRect(945, 720,  5, 30);    
        g2.fillRect(955, 720,  5, 30);     
        g2.fillRect(965, 720,  5, 30);     
        g2.fillRect(975, 720,  5, 30);     
        g2.fillRect(985, 720,  5, 30);     
        g2.fillRect(995, 720,  5, 30);     
        g2.fillRect(1005, 720,  5, 30);    
        g2.fillRect(1015, 720,  5, 30); 
        
            //Zebra pad
        g2.setColor(Color.white);
        g2.fillRect(905, 250,  5, 30);     
        g2.fillRect(915, 250,  5, 30);     
        g2.fillRect(925, 250,  5, 30);     
        g2.fillRect(935, 250,  5, 30);     
        g2.fillRect(945, 250,  5, 30);    
        g2.fillRect(955, 250,  5, 30);     
        g2.fillRect(965, 250,  5, 30);     
        g2.fillRect(975, 250,  5, 30);     
        g2.fillRect(985, 250,  5, 30);     
        g2.fillRect(995, 250,  5, 30);     
        g2.fillRect(1005, 250,  5, 30);    
        g2.fillRect(1015, 250,  5, 30);
        
//groene cirkel
           
       
        
//Auto6
     //  g2.setColor(Autokleur4);
       // g2.fillRect(Auto6X, Auto6Y, 25, 55);
         //g2.setColor(Color.yellow);
        //g2.fillRect(Auto6X, Auto6Y, 5, 5);
       // g2.fillRect(Auto6X+20, Auto6Y, 5, 5);
       // g2.setColor(Color.red);
       // g2.fillRect(Auto1X, Auto1Y+50, 5, 5);
        //g2.fillRect(Auto1X+20, Auto1Y+50, 5, 5);
       // g2.setColor(Color.gray);
       // g2.fillRect(Auto1X+5, Auto1Y+10, 15, 35);
        
//Auto5
           g2.setColor(Autokleur5);
        g2.fillRect(Auto5X, Auto5Y, 23, 13);
         g2.setColor(Koplamp5);
        g2.fillRect(Auto5X+25, Auto5Y, 3, 3);
        g2.fillRect(Auto5X+25, Auto5Y+10, 3, 3);
        g2.setColor(Achterlamp5);
        g2.fillRect(Auto5X, Auto5Y, 3, 3);
        g2.fillRect(Auto5X, Auto5Y+10, 3, 3);
        g2.setColor(Dak5);
        g2.fillRect(Auto5X+5, Auto5Y+3, 18, 8);
        
        //auto1
        g2.setColor(Autokleur1);
        g2.fillRect(Auto1X, Auto1Y, 13, 28);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto1X, Auto1Y, 3, 3);
        g2.setColor(Koplamp1);
        g2.fillRect(Auto1X+10, Auto1Y, 3, 3);
        g2.setColor(Color.red);
        g2.fillRect(Auto1X, Auto1Y+25, 3, 3);
        g2.fillRect(Auto1X+10, Auto1Y+25, 3, 3);
        g2.setColor(Color.gray);
        g2.fillRect(Auto1X+3, Auto1Y+5, 8, 18);
        
        //auto2
        g2.setColor(Autokleur2);
        g2.fillRect(Auto2X, Auto2Y, 13, 43);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto2X, Auto2Y+40, 3, 3);
        g2.fillRect(Auto2X+10, Auto2Y+40, 3, 3);
        g2.setColor(Color.red);
        g2.fillRect(Auto2X, Auto2Y, 3, 3);
        g2.fillRect(Auto2X+10, Auto2Y, 3, 3);
        g2.setColor(Color.gray);
        g2.fillRect(Auto2X+3, Auto2Y+5, 8, 38);
        
        //auto3
        g2.setColor(Autokleur3);
        g2.fillRect(Auto3X, Auto3Y, 28, 13);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto3X+25, Auto3Y, 3, 3);
        g2.fillRect(Auto3X+25, Auto3Y+10, 3, 3);
        g2.setColor(Color.red);
        g2.fillRect(Auto3X, Auto3Y, 3, 3);
        g2.fillRect(Auto3X, Auto3Y+10, 3, 3);
        g2.setColor(Color.gray);
        g2.fillRect(Auto3X+5, Auto3Y+3, 18, 8);
        
        //auto4
        g2.setColor(Autokleur4);
        g2.fillRect(Auto4X, Auto4Y, 28, 13);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto4X, Auto4Y, 3, 3);
        g2.fillRect(Auto4X, Auto4Y+10, 3, 3);
        g2.setColor(Color.red);
        g2.fillRect(Auto4X+25, Auto4Y, 3, 3);
        g2.fillRect(Auto4X+25, Auto4Y+10, 3, 3);
        g2.setColor(Color.gray);
        g2.fillRect(Auto4X+5, Auto4Y+3, 18, 8);
        

//groene cirkel
            
          //hoek
            g2.setColor(Color.black);
            g2.fillRect(370, 140, 80, 80); 
         g2.setColor(Color.green);
            g2.fillRect(370, 140, 78, 78);
     
            
          //Hoek
            
         g2.setColor(Color.green);
            g2.fillRect(370, 283, 78, 78);
            
            //Hoek
            g2.setColor(Color.black);
            g2.fillRect(510, 280, 80, 80); 
         g2.setColor(Color.green);
            g2.fillRect(513, 283, 78, 78);
            
             //Hoek
            g2.setColor(Color.black);
            g2.fillRect(510, 140, 80, 80); 
         g2.setColor(Color.green);
            g2.fillRect(513, 140, 78, 78);
            
            
            

//Stoplicht1
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(515, 370, 25, 75, 15, 15);
            //rode cirkel
            g2.setColor(Stoplichtrood1);
            g2.fillOval(518, 420 , 20, 20);
            //oranje cirkel
            g2.setColor(Stoplichtoranje1);
            g2.fillOval(518, 400, 20, 20);
            //groene cirkel
            g2.setColor(Stoplichtgroen1);
            g2.fillOval(518, 380, 20, 20);
        
            //Stoplicht2
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(400, 50, 25, 75, 15, 15);
            //rode cirkel
            g2.setColor(Stoplichtrood1);
            g2.fillOval(403, 60 , 20, 20);
            //oranje cirkel
            g2.setColor(Stoplichtoranje1);
            g2.fillOval(403, 80, 20, 20);
            //groene cirkel
            g2.setColor(Stoplichtgroen1);
            g2.fillOval(403, 100, 20, 20);
            
             //Stoplicht3
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(600, 190, 75, 25, 15, 15);
            //rode cirkel
            g2.setColor(Stoplichtrood2);
            g2.fillOval(648, 193 , 20, 20);
            //oranje cirkel
            g2.setColor(Stoplichtoranje2);
            g2.fillOval(628, 193, 20, 20);
            //groene cirkel
            g2.setColor(Stoplichtgroen2);
            g2.fillOval(608, 193, 20, 20);
            
            //Stoplicht4
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(290, 285, 75, 25, 15, 15);
            //rode cirkel
            g2.setColor(Stoplichtrood2);
            g2.fillOval(298, 288 , 20, 20);
            //oranje cirkel
            g2.setColor(Stoplichtoranje2);
            g2.fillOval(318, 288, 20, 20);
            //groene cirkel
            g2.setColor(Stoplichtgroen2);
            g2.fillOval(338, 288, 20, 20);
            
            
            
            
        g.drawImage(img, 0, 0, this);
    }
public static void main(String s[]) {
        JFrame f = new JFrame("Java Graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new Graph43();
        f.getContentPane().add(applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(960, 540));
        f.setVisible(true);
        applet.start();
    

}
     
 public void run() {
        while (Thread.currentThread() == animator) {

           if (Auto1)
           {{
                if (Auto1Y > 10)
                    Auto1Y--;
              
         if (Afslag1 == 1){
             
             
             
                if (Auto1Y == 260 ) {Auto1X = -100; Auto1Y = -100; Auto1 = false;
          
          Auto5 = true;
          
          
          
          
          
          }}
                
                if (Auto1Y == 10) {
                  Auto1Y = 495;
                  Afslag1 = 1 + (int)(Math.random() * 2);    
          Autonieuw1 = 0 + (int)(Math.random() * 3);
          
          
          
          
          
          }if (Afslag1 == 1){Koplamp1 = new Color(255,164,4);}
           else   {   Koplamp1 = new Color(226,255,0); }}}
          
           
           
          
           
           if (Auto5) {
              Autokleur5 = Autokleur1 ;
               
        Koplamp5 = new Color(226,255,0);
        Achterlamp5 = new Color(255,2,2);
        Dak5 = new Color(149,149,149);
              
              
              
              if (Auto5X > 5){
                    Auto5X++;
                
             
              }
          }if (Auto5X == 950) {
                    Auto5X = 500;
                    Auto5Y = 260;       
                     Auto1Y = 500;
                     Auto1X= 490;
                     Auto1 = true;
                     Auto5 = false;
                      Autokleur5 = new Color(96,96,96);
        Koplamp5 = new Color(96,96,96);
        Achterlamp5 = new Color(96,96,96);
        Dak5 = new Color(96,96,96);       
           Autonieuw1 = 0 + (int)(Math.random() * 3);
        
        
        Afslag1 = 1 + (int)(Math.random() * 2);          
                     
        ;}
           
           
           
           if (Auto2){
                if (Auto2Y < 5)
                    Auto2Y++;
                Auto2Y++;
               
          
          
               
               
               
               if (Auto2Y == 500) {
                    Auto2Y = 1;
                   Autonieuw2 = 0 + (int)(Math.random() * 3);
               }}
          
          if (Auto3){
                if (Auto3X < 10)
                    Auto3X++;
                Auto3X++;
                   
                      
             
                
          if (Auto3X > 900) {
                    Auto3X = 4;
          
         Autonieuw3 = 1 + (int)(Math.random() * 3);
          }}
          
          if (Auto4){
                if (Auto4X > 10)
                    Auto4X--;
                Auto4X--;
                
          if (Auto4X == 10) {
                    Auto4X = 960;
          Autonieuw4 = 1 + (int)(Math.random() * 3);
          }}
          
           
        
              
          
          
          
          
          
          if (Auto2Y == 300) 
               
               {Stoplicht1switch = 1;}
               
              if (Stoplicht1switch == 1) 
              {
              Stoplichtoranje1 = new Color(255,164,4); 
              Stoplichtgroen1 = new Color(13,161,0); 
              Stoplichtrood1 = new Color(142,2,2);
              Rood1 = true;
              Groen1 = false; 
              }
              
              if (Auto2Y == 400) 
               
               {Stoplicht1switch = 2;}
               
              if (Stoplicht1switch == 2) 
              {
              Stoplichtoranje1 = new Color(142,84,2); 
              Stoplichtgroen1 = new Color(13,161,0); 
              Stoplichtrood1 = new Color(255,2,2);
              Rood1 = true;
              Groen2 = true; 
              Rood2 = false;
              Groen1 = false; 
              Stoplichtrood2 = new Color(142,2,2);
              Stoplichtoranje2 = new Color(142,84,2);
              Stoplichtgroen2 = new Color(0,255,7);
              
              }
               if (Auto4X == 250) 
               {Stoplicht1switch = 3;}
                   
              if (Stoplicht1switch == 3) 
              {
              Stoplichtoranje2 = new Color(255,164,4); 
              Stoplichtgroen2 = new Color(13,161,0); 
              Stoplichtrood2 = new Color(142,2,2);
              Rood2 = true;
              Groen2 = false; 
              }
              
              if (Auto4X == 50) 
               
               {Stoplicht1switch = 4;}
               
              if (Stoplicht1switch == 4) 
              {
              Stoplichtoranje2 = new Color(142,84,2); 
              Stoplichtgroen2 = new Color(13,161,0); 
              Stoplichtrood2 = new Color(255,2,2);
              Rood2 = true;
              Groen1 = true; 
              Rood1 = false;
              Groen2 = false; 
              Stoplichtrood1 = new Color(142,2,2);
              Stoplichtoranje1 = new Color(142,84,2);
              Stoplichtgroen1 = new Color(0,255,7);
              
              }
          
          
          if (Rood2) { if (Auto3X == 335){Auto3 = false;}}
               if (Rood2) { if (Auto4X == 600){Auto4 = false;}}
               
               
               if (Rood1) { if (Auto1Y == 370){Auto1 = false;}}
               if (Rood1) { if (Auto2Y == 100){Auto2 = false;}}
               
               
               if (Groen2) {  {Auto3 = true;}}
               if (Groen2) {{Auto4 = true;}}
                if (Groen1) { if (Auto1Y == 370) {Auto1 = true;}}
               if (Groen1) {if (Auto2Y == 100) {Auto2 = true;}}
          
               
               
               //Autokleuren
              
               if (Autonieuw1 == 0) {Autokleur1 = new Color(0,0,0);}
               if (Autonieuw1 == 1) {Autokleur1 = new Color(2,255,2);}
               if (Autonieuw1 == 2) {Autokleur1 = new Color(2,2,255);}
               if (Autonieuw1 == 3) {Autokleur1 = new Color(255,2,2);}
               
               if (Autonieuw2 == 0) {Autokleur2 = new Color(255,2,2);}
               if (Autonieuw2 == 1) {Autokleur2 = new Color(0,0,0);}
               if (Autonieuw2 == 2) {Autokleur2 = new Color(2,255,2);}
               if (Autonieuw2 == 3) {Autokleur2 = new Color(2,2,255);}
               
               if (Autonieuw3 == 0) {Autokleur3 = new Color(2,255,2);}
               if (Autonieuw3== 1) {Autokleur3 = new Color(2,2,255);}
               if (Autonieuw3 == 2) {Autokleur3 = new Color(0,0,0);}
               if (Autonieuw3 == 3) {Autokleur3 = new Color(255,2,2);}
               
               if (Autonieuw4 == 0) {Autokleur4 = new Color(2,2,255);}
               if (Autonieuw4 == 1) {Autokleur4 = new Color(255,2,2);}
               if (Autonieuw4 == 2) {Autokleur4 = new Color(2,255,2);}
               if (Autonieuw4 == 3) {Autokleur4 = new Color(0,0,0);}
               
               
            
               
               
               repaint();
            
                 try {
                Thread.sleep(Speed); //time in milliseconds
            }
            catch (Exception e) {
                break;
            }
        }}}
