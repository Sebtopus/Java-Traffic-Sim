/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.Random;
/**
 *
 * @author Seb
 */
public class Graph extends JApplet implements Runnable{

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
    
    int Afslag1 = 1; 
    int afslag2;
    
    int Auto5X;
    int Auto5Y;
    
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
        Auto1X = 980;
        Auto1Y = 1000;
        Auto2X = 920;
        Auto2Y = 1;
        Auto3X = 1;
        Auto3Y = 520;
        Auto4X = 1920;
        Auto4Y = 460;
        Auto5Y = 520;
        Auto5X = 980;
        Autonieuw1 = 0;
        Autonieuw2 = 0;
        Autonieuw3 = 0;
        Autonieuw4 = 0;
        
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
        
        animator = new Thread(this);
       animator.start();
          
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
///eerste weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 440, 800, 60);
        g2.fillRect(0, 500, 800, 60);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(0, 500, 800, 3);
        
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 380, 2000, 1);
        
        ///tweede weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(1100, 440, 800, 60);
        g2.fillRect(1100, 500, 800, 60);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(1100, 500, 800, 3);
        
       //hulplijnen
       g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 380, 2000, 1); 
       
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(0, 500, 2000, 1);
        ///Derde weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(900, 0, 60, 400);
        g2.fillRect(960, 0, 60, 400);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(960, 0, 3, 400);
        
        ///Vierde weg
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(900, 600, 60, 700);
        g2.fillRect(960, 600, 60, 700);
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(960, 600, 3, 600);
        
        //Kruispunt
        g2.setColor(new Color(96, 96, 96));
        g2.fillRect(740, 280, 440, 440);
        
       //Auto5
           g2.setColor(Autokleur5);
        g2.fillRect(Auto5X, Auto5Y, 55, 25);
         g2.setColor(Koplamp5);
        g2.fillRect(Auto5X+50, Auto5Y, 5, 5);
        g2.fillRect(Auto5X+50, Auto5Y+20, 5, 5);
        g2.setColor(Achterlamp5);
        g2.fillRect(Auto5X, Auto5Y, 5, 5);
        g2.fillRect(Auto5X, Auto5Y+20, 5, 5);
        g2.setColor(Dak5);
        g2.fillRect(Auto5X+10, Auto5Y+5, 35, 15);
        
        //auto1
        g2.setColor(Autokleur1);
        g2.fillRect(Auto1X, Auto1Y, 25, 55);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto1X, Auto1Y, 5, 5);
        g2.fillRect(Auto1X+20, Auto1Y, 5, 5);
        g2.setColor(Color.red);
        g2.fillRect(Auto1X, Auto1Y+50, 5, 5);
        g2.fillRect(Auto1X+20, Auto1Y+50, 5, 5);
        g2.setColor(Color.gray);
        g2.fillRect(Auto1X+5, Auto1Y+10, 15, 35);
        
        //auto2
        g2.setColor(Autokleur2);
        g2.fillRect(Auto2X, Auto2Y, 25, 85);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto2X, Auto2Y+80, 5, 5);
        g2.fillRect(Auto2X+20, Auto2Y+80, 5, 5);
        g2.setColor(Color.red);
        g2.fillRect(Auto2X, Auto2Y, 5, 5);
        g2.fillRect(Auto2X+20, Auto2Y, 5, 5);
        g2.setColor(Color.gray);
        g2.fillRect(Auto2X+5, Auto2Y+10, 15, 65);
        
        //auto3
        g2.setColor(Autokleur3);
        g2.fillRect(Auto3X, Auto3Y, 55, 25);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto3X+50, Auto3Y, 5, 5);
        g2.fillRect(Auto3X+50, Auto3Y+20, 5, 5);
        g2.setColor(Color.red);
        g2.fillRect(Auto3X, Auto3Y, 5, 5);
        g2.fillRect(Auto3X, Auto3Y+20, 5, 5);
        g2.setColor(Color.gray);
        g2.fillRect(Auto3X+10, Auto3Y+5, 35, 15);
        
        //auto4
        g2.setColor(Autokleur4);
        g2.fillRect(Auto4X, Auto4Y, 55, 25);
         g2.setColor(Color.yellow);
        g2.fillRect(Auto4X, Auto4Y, 5, 5);
        g2.fillRect(Auto4X, Auto4Y+20, 5, 5);
        g2.setColor(Color.red);
        g2.fillRect(Auto4X+50, Auto4Y, 5, 5);
        g2.fillRect(Auto4X+50, Auto4Y+20, 5, 5);
        g2.setColor(Color.gray);
        g2.fillRect(Auto4X+10, Auto4Y+5, 35, 15);
        
            
              

//Stoplicht1
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(1080, 740, 50, 150, 30, 30);
            //rode cirkel
            g2.setColor(Stoplichtrood1);
            g2.fillOval(1085, 840 , 40, 40);
            //oranje cirkel
            g2.setColor(Stoplichtoranje1);
            g2.fillOval(1085, 800, 40, 40);
            //groene cirkel
            g2.setColor(Stoplichtgroen1);
            g2.fillOval(1085, 760, 40, 40);
        
            //Stoplicht2
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(800, 100, 50, 150, 30, 30);
            //rode cirkel
            g2.setColor(Stoplichtrood1);
            g2.fillOval(805, 200 , 40, 40);
            //oranje cirkel
            g2.setColor(Stoplichtoranje1);
            g2.fillOval(805, 160, 40, 40);
            //groene cirkel
            g2.setColor(Stoplichtgroen1);
            g2.fillOval(805, 120, 40, 40);
            
             //Stoplicht3
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(1250, 280, 50, 150, 30, 30);
            //rode cirkel
            g2.setColor(Stoplichtrood2);
            g2.fillOval(1255, 370 , 40, 40);
            //oranje cirkel
            g2.setColor(Stoplichtoranje2);
            g2.fillOval(1255, 330, 40, 40);
            //groene cirkel
            g2.setColor(Stoplichtgroen2);
            g2.fillOval(1255, 290, 40, 40);
            
            //Stoplicht4
            g2.setColor(Color.BLACK);
            g2.fillRoundRect(660, 580, 50, 150, 30, 30);
            //rode cirkel
            g2.setColor(Stoplichtrood2);
            g2.fillOval(665, 670 , 40, 40);
            //oranje cirkel
            g2.setColor(Stoplichtoranje2);
            g2.fillOval(665, 630, 40, 40);
            //groene cirkel
            g2.setColor(Stoplichtgroen2);
            g2.fillOval(665, 590, 40, 40);
            
            
            
        g.drawImage(img, 0, 0, this);
    }
public static void main(String s[]) {
        JFrame f = new JFrame("Java Graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JApplet applet = new Graph();
        f.getContentPane().add(applet);
        applet.init();
        f.pack();
        f.setSize(new Dimension(1920, 1080));
        f.setVisible(true);
        applet.start();
    }
     
 public void run() {
        while (Thread.currentThread() == animator) {

           if (Auto1)
           {{
                if (Auto1Y > 10)
                    Auto1Y--;
                Auto1Y--;
         if (Afslag1 == 1){
                if (Auto1Y == 520) {Auto1X = -100; Auto1Y = -100; Auto1 = false;
          
          Auto5 = true;
          
          
          
          
          
          }}
                
                if (Auto1Y == 10) {
                  Auto1Y = 990;
                  Afslag1 = 1 + (int)(Math.random() * 2);    
          Autonieuw1++;
               if (Autonieuw1 > 3)
               {Autonieuw1 = 0;}
          
          
          
          
          
          }}}
                 
         
            if (Auto5) {
              Autokleur5 = Autokleur1 ;
               
        Koplamp5 = new Color(0,255,0);
        Achterlamp5 = new Color(255,2,2);
        Dak5 = new Color(96,96,96);
              
              
              
              if (Auto5X > 10){
                    Auto5X++;
                Auto5X++;
             
              }
          }if (Auto5X == 1900) {
                    Auto5X = 1000;
                    Auto5Y = 520;       
                     Auto1Y = 1000;
                     Auto1X= 980;
                     Auto1 = true;
                     Auto5 = false;
                      Autokleur5 = new Color(96,96,96);
        Koplamp5 = new Color(96,96,96);
        Achterlamp5 = new Color(96,96,96);
        Dak5 = new Color(96,96,96);       
          
        
        
        Afslag1 = 1 + (int)(Math.random() * 2);          
                     
        ;}
           
           
           
           if (Auto2){
                if (Auto2Y < 10)
                    Auto2Y++;
                Auto2Y++;
               
          
          
               
               
               
               if (Auto2Y == 1000) {
                    Auto2Y = 1;
                    Autonieuw2++;
               if (Autonieuw2 > 3)
               {Autonieuw2 = 0;}
               }}
          
          if (Auto3){
                if (Auto3X < 10)
                    Auto3X++;
                Auto3X++;
                Auto3X++;
             
                
          if (Auto3X == 1920) {
                    Auto3X = 1;
          
          Autonieuw3++;
               if (Autonieuw3 > 3)
               {Autonieuw3 = 0;}
          }}
          
          if (Auto4){
                if (Auto4X > 10)
                    Auto4X--;
                Auto4X--;
                
          if (Auto4X == 1) {
                    Auto4X = 1920;
          Autonieuw4++;
               if (Autonieuw4 > 3)
               {Autonieuw4 = 0;}
          }}
          
           
        
              
          
          
          
          
          
          if (Auto2Y == 600) 
               
               {Stoplicht1switch = 1;}
               
              if (Stoplicht1switch == 1) 
              {
              Stoplichtoranje1 = new Color(255,164,4); 
              Stoplichtgroen1 = new Color(13,161,0); 
              Stoplichtrood1 = new Color(142,2,2);
              }
              
              if (Auto2Y == 800) 
               
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
               if (Auto4X == 500) 
               {Stoplicht1switch = 3;}
                   
              if (Stoplicht1switch == 3) 
              {
              Stoplichtoranje2 = new Color(255,164,4); 
              Stoplichtgroen2 = new Color(13,161,0); 
              Stoplichtrood2 = new Color(142,2,2);
              }
              
              if (Auto4X == 100) 
               
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
          
          
          if (Rood2) { if (Auto3X == 670){Auto3 = false;}}
               if (Rood2) { if (Auto4X == 1200){Auto4 = false;}}
               
               
               if (Rood1) { if (Auto1Y == 740){Auto1 = false;}}
               if (Rood1) { if (Auto2Y == 200){Auto2 = false;}}
               
               
               if (Groen2) {  {Auto3 = true;}}
               if (Groen2) {{Auto4 = true;}}
                if (Groen1) { if (Auto1Y == 740) {Auto1 = true;}}
               if (Groen1) {if (Auto2Y == 200) {Auto2 = true;}}
          
               
               
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
                Thread.sleep(12); //time in milliseconds
            }
            catch (Exception e) {
                break;
            }
        }}}
