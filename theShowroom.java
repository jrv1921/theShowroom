    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theshowroom;

/**
 *
 * @author JRV
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon.*;

public class theShowroom implements ActionListener {
    

    /**
     * @param args the command line arguments
     */
     JFrame introFrame,menuFrame,carsFrame,motorsFrame
             ,sedanFrame,SUVFrame,vanFrame
             ,underboneFrame,scooterFrame;
     
     JPanel backgroundMenu,backgroundCars,backgroundMotors,background
             ,backgroundSedan,backgroundSUV,backgroundVan
                     ,backgroundUnderbone,backgroundScooter;
     
     JLabel backgroundgif,userlabel,passlabel,nameAccMenu,nameAccCars,nameAccMotors,nameAccSedan,nameAccSUV,nameAccVan,nameAccUnderbone,nameAccScooter,
             logoMenu,carsLabel,showroomLogoCars,showroomLogoMotors
             ,showroomsedanLogo,showroomSUVLogo,showroomvanLogo,showroomunderboneLogo,showroomscooterLogo,
             motorsLabel,carsLogo,motorsLogo,carsTitle,motorsTitle,sedanLabel,
             SUVLabel,vanLabel,underboneLabel,scooterLabel
             ,civicName,civicpriceText,civictransmissionPick,viosName,viospriceText,viostransmissionPick
             ,civicaddFee,viosaddFee;
     
     JButton logo,loginButton,motors,cars,backbuttonCars,backbuttonMotors,sedanLogo,SUVLogo,vanLogo,underboneLogo,scooterLogo
             ,backbuttonSedan,backbuttonSUV,backbuttonVan,backbuttonUnderbone,backbuttonScooter
             ,civicsedanButton,viossedanButton,civicbuyButton,civicconfirmButton,viosconfirmButton,viosbuyButton;
     
     JTextArea civicDescription,viosDescription;
     
     JRadioButton civicAutomatic,civicManual,viosAutomatic,viosManual;
     
     ButtonGroup bg;
             
     ImageIcon imagelogo;
     
     JTextField user;
     
     JPasswordField pass;
     
     String username,password;
    
    
    theShowroom(){
    //the account
    username= "customer1";
    password= "password";
    
    
        //WELCOME Frame Variables
    introFrame= new JFrame("Welcome");
    backgroundgif=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\background720p.gif"));
    logo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent4.png"));
    userlabel=new JLabel("USERNAME: ");
    passlabel=new JLabel("PASSWORD: ");
    user=new JTextField("");
    pass=new JPasswordField("");
    loginButton=new JButton("Login");
    
    //menuFrame Variables
    menuFrame=new JFrame("Menu");
    backgroundMenu= new JPanel();
    nameAccMenu=new JLabel(username);
    carsLabel=new JLabel("CARS");
    motorsLabel=new JLabel("MOTORCYCLES");
    carsLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\traffic-jam240p.png"));
    motorsLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    logoMenu=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    motors=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    cars=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\traffic-jam240p.png"));
    
    //carsFrame Variables
    carsFrame=new JFrame("Cars");
    backgroundCars=new JPanel();
    nameAccCars=new JLabel(username);
    carsTitle=new JLabel("CARS");
    sedanLabel=new JLabel("Sedan");
    SUVLabel=new JLabel("SUV");
    vanLabel=new JLabel("Van");
    showroomLogoCars=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    sedanLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\sedan.png"));
    SUVLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\suv.png"));
    vanLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\van.png"));
    backbuttonCars=new JButton("BACK");
    
    //sedanFrame
    sedanFrame=new JFrame("Sedan(CARS)");
    backgroundSedan=new JPanel();
    nameAccSedan=new JLabel(username);
    backbuttonSedan=new JButton("BACK");
    showroomsedanLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    civicsedanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\civicresize.png"));
    civicName= new JLabel("Phoenix Chevel");
    civicDescription=new JTextArea("A compact sedan that'll fit your taste."
            +"\n With comfortable seats and cool exterior \n design and a"
            + " V8 Engine + Turbo. AWD \n"
            + "Default Transmission: Automatic"); 
    civicpriceText=new JLabel("P1,250,000");
    civictransmissionPick=new JLabel("Transmission: ");
    civicbuyButton=new JButton("BUY");
    civicconfirmButton=new JButton("CONFIRM");
    civicAutomatic=new JRadioButton("Default");
    civicManual=new JRadioButton("Manual");
    civicaddFee=new JLabel("+ P100,000");
    bg=new ButtonGroup();
    
    
   
    viossedanButton=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\viosresize.png"));
    viosName=new JLabel("Olets Loco");
    viosDescription=new JTextArea("A budget sedan that fits for all your necessities \n"
            + "2.8mAL, CTEC Engine that goes up to 250hp. RWD \n "
            + "Defaul Transmission: Manual");
    viospriceText=new JLabel("P985,999");
    viostransmissionPick=new JLabel("Transmission: ");
    viosbuyButton=new JButton("BUY");
    viosconfirmButton=new JButton("CONFIRM");
    viosAutomatic=new JRadioButton("Automatic");
    viosManual=new JRadioButton("Default");
    viosaddFee=new JLabel("+ P300,000");
    
    //SUVFrame
    SUVFrame=new JFrame("SUV(CARS)");
    backgroundSUV=new JPanel();
    nameAccSUV=new JLabel(username);
    backbuttonSUV=new JButton("BACK");
    showroomSUVLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    //vanFrame
     vanFrame=new JFrame("Van(CARS)");
    backgroundVan=new JPanel();
    nameAccVan=new JLabel(username);
    backbuttonVan=new JButton("BACK");
    showroomvanLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    //motorsFrame Variables
    motorsFrame=new JFrame("Motorcycles");
    motorsTitle=new JLabel("MOTORCYCLES");
    nameAccMotors=new JLabel(username);
    backgroundMotors=new JPanel();
    underboneLabel=new JLabel("Underbone");
    scooterLabel=new JLabel("Scooter");
    showroomLogoMotors=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    backbuttonMotors=new JButton("BACK");
    underboneLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\underbone.png"));
    scooterLogo=new JButton(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\motorcycle240p.png"));
    
    //underboneFrame Variables
    underboneFrame=new JFrame("Underbone(MOTORCYCLES)");
    backgroundUnderbone=new JPanel();
    nameAccUnderbone=new JLabel(username);
    backbuttonUnderbone=new JButton("BACK");
    showroomunderboneLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
    
    //scooterFrame Variables
    scooterFrame=new JFrame("Scooter(MOTORCYCLES)");
    backgroundScooter=new JPanel();
    nameAccScooter=new JLabel(username);
    backbuttonScooter=new JButton("BACK");
    showroomscooterLogo=new JLabel(new ImageIcon("C:\\Users\\jrvil\\Documents\\NetBeansProjects\\theShowroom\\src\\theshowroom\\logotransparent144p.png"));
   
    //WELCOME FRAME
    userlabel.setBounds(500,400,150,150);
    userlabel.setForeground(Color.white);
    userlabel.setVisible(false);
    introFrame.add(userlabel);
   
    passlabel.setBounds(495,450,150,150);
    passlabel.setForeground(Color.white);
    passlabel.setVisible(false);
    introFrame.add(passlabel);
    
    
    user.setBounds(580,460,250,30);
    user.setBackground(Color.BLACK);
    user.setForeground(Color.WHITE);
    user.setVisible(false);
    introFrame.add(user);
    
    pass.setBounds(580,510,250,30);
    pass.setBackground(Color.BLACK);;
    pass.setForeground(Color.WHITE);
    pass.setVisible(false);
    introFrame.add(pass);
    
    loginButton.setBounds(650,560,100,30);
    loginButton.setOpaque(false);
    loginButton.setContentAreaFilled(false);
    loginButton.setForeground(Color.white);
    loginButton.setVisible(false);
    introFrame.add(loginButton);
    
    logo.setBounds(200,0,852,480);
    logo.setOpaque(false);
    logo.setContentAreaFilled(false);
    logo.setBorderPainted(false);
    introFrame.add(logo);
    
    backgroundgif.setBounds(0,0,1280,720);
    introFrame.add(backgroundgif);
    
    
   
    //menu FRAME
    
    cars.setBounds(280,220,256,256);
    cars.setOpaque(false);
    cars.setContentAreaFilled(false);
    cars.setBorderPainted(false);
    backgroundMenu.add(cars);
    
    motors.setBounds(720,220,256,256);
    motors.setOpaque(false);
    motors.setContentAreaFilled(false);
    motors.setBorderPainted(false);
    backgroundMenu.add(motors);
    
    /*carsLogo.setBounds(170,130,500,500);
    backgroundMenu.add(carsLogo);
    
    motorsLogo.setBounds(600,130,500,500);
    backgroundMenu.add(motorsLogo);
    */
    
            
    carsLabel.setBounds(350,500,100,100);
    carsLabel.setFont(new Font("Arial",Font.BOLD,25));
    carsLabel.setForeground(Color.BLACK);
    backgroundMenu.add(carsLabel);
    
    
    motorsLabel.setBounds(750,500,750,100);
    motorsLabel.setFont(new Font("Arial",Font.BOLD,25));
    motorsLabel.setForeground(Color.BLACK);
    backgroundMenu.add(motorsLabel);
    
    
    nameAccMenu.setBounds(250,25,500,100);
    nameAccMenu.setFont(new Font("Arial",Font.BOLD,25));
    nameAccMenu.setForeground(Color.WHITE);
    backgroundMenu.add(nameAccMenu);
    
    logoMenu.setBounds(1,1,256,144);
    backgroundMenu.add(logoMenu);
    
    backgroundMenu.setBounds(1,1,1280,720);
    backgroundMenu.setBackground(Color.GRAY);
    backgroundMenu.setLayout(null);
    menuFrame.add(backgroundMenu);
  
    
    //carsFrame
    sedanLogo.setBounds(100,300,256,256);
    sedanLogo.setOpaque(false);
    sedanLogo.setContentAreaFilled(false);
    sedanLogo.setBorderPainted(false);
    backgroundCars.add(sedanLogo);
    
    SUVLogo.setBounds(500,300,256,256);
    SUVLogo.setOpaque(false);
    SUVLogo.setContentAreaFilled(false);
    SUVLogo.setBorderPainted(false);
    backgroundCars.add(SUVLogo);
    
    vanLogo.setBounds(900,300,256,256);
    vanLogo.setOpaque(false);
    vanLogo.setContentAreaFilled(false);
    vanLogo.setBorderPainted(false);
    backgroundCars.add(vanLogo);
   
    carsTitle.setBounds(550,100,300,100);
    carsTitle.setFont(new Font("Arial",Font.BOLD,50));
    carsTitle.setForeground(Color.BLACK);
    backgroundCars.add(carsTitle);
    
    nameAccCars.setBounds(250,25,500,100);
    nameAccCars.setFont(new Font("Arial",Font.BOLD,25));
    nameAccCars.setForeground(Color.WHITE);
    backgroundCars.add(nameAccCars);
    
    sedanLabel.setBounds(200,500,100,100);
    sedanLabel.setFont(new Font("Arial",Font.BOLD,25));
    sedanLabel.setForeground(Color.BLACK);
    backgroundCars.add(sedanLabel);
    
    SUVLabel.setBounds(600,500,100,100);
    SUVLabel.setFont(new Font("Arial",Font.BOLD,25));
    SUVLabel.setForeground(Color.BLACK);
    backgroundCars.add(SUVLabel);
    
    vanLabel.setBounds(1000,500,100,100);
    vanLabel.setFont(new Font("Arial",Font.BOLD,25));
    vanLabel.setForeground(Color.BLACK);
    backgroundCars.add(vanLabel);
    
    showroomLogoCars.setBounds(1,1,256,144);
    backgroundCars.add(showroomLogoCars);
    
    backbuttonCars.setBounds(1100,630,100,30);
    backbuttonCars.setOpaque(false);
    backbuttonCars.setContentAreaFilled(false);
    backbuttonCars.setBorderPainted(false);
    backbuttonCars.setForeground(Color.BLACK);
    backgroundCars.add(backbuttonCars);
    
    backgroundCars.setBounds(1,1,1280,720);
    backgroundCars.setBackground(Color.GRAY);
    backgroundCars.setLayout(null);
    carsFrame.add(backgroundCars);
    
    //sedanFrame
    viossedanButton.setBounds(750,200,256,85);
    viossedanButton.setOpaque(false);
    viossedanButton.setContentAreaFilled(false);
    viossedanButton.setBorderPainted(false);
    backgroundSedan.add(viossedanButton);
    
    viospriceText.setBounds(880,350,200,100);
    viospriceText.setFont(new Font("Arial",Font.BOLD,25));
    viospriceText.setForeground(Color.BLACK);
    viospriceText.setVisible(false);
    backgroundSedan.add(viospriceText); 
    
    viosName.setBounds(830,250,200,100);
    viosName.setFont(new Font("Arial",Font.BOLD,18));
    viosName.setForeground(Color.BLACK);
    viosName.setVisible(false);
    backgroundSedan.add(viosName);
    
    viosDescription.setBounds(770,320,500,100);
    viosDescription.setFont(new Font("Arial",Font.BOLD,12));
    viosDescription.setForeground(Color.BLACK);
    viosDescription.setLineWrap(true);
    viosDescription.setWrapStyleWord(true);
    viosDescription.setBackground(Color.GRAY);
    viosDescription.setVisible(false);
    viosDescription.setEditable(false);
    backgroundSedan.add(viosDescription);
    
    viosbuyButton.setBounds(1000,470,100,30);
    viosbuyButton.setOpaque(false);
    viosbuyButton.setContentAreaFilled(false);
    viosbuyButton.setBorderPainted(false);
    viosbuyButton.setVisible(false);
    viosbuyButton.setForeground(Color.BLACK);
    backgroundSedan.add(viosbuyButton);
    
    viosconfirmButton.setBounds(1000,470,100,30);
    viosconfirmButton.setOpaque(false);
    viosconfirmButton.setContentAreaFilled(false);
    viosconfirmButton.setBorderPainted(false);
    viosconfirmButton.setVisible(false);
    viosconfirmButton.setForeground(Color.BLACK);
    backgroundSedan.add(viosconfirmButton);
    
    viostransmissionPick.setBounds(750,400,200,100);
    viostransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    viostransmissionPick.setForeground(Color.BLACK);
    viostransmissionPick.setVisible(false);
    backgroundSedan.add(viostransmissionPick);
    
    viosAutomatic.setBounds(870,435,100,30);
    viosAutomatic.setOpaque(false);
    viosAutomatic.setContentAreaFilled(false);
    viosAutomatic.setBorderPainted(false);
    viosAutomatic.setVisible(false);
    bg.add(viosAutomatic);
    backgroundSedan.add(viosAutomatic);
    
    viosManual.setBounds(960,435,100,30);
    viosManual.setOpaque(false);
    viosManual.setContentAreaFilled(false);
    viosManual.setBorderPainted(false);
    viosManual.setVisible(false);
    bg.add(viosManual);
    backgroundSedan.add(viosManual);
    
    viosaddFee.setBounds(1000,415,200,100);
    viosaddFee.setFont(new Font("Arial",Font.BOLD,10));
    viosaddFee.setForeground(Color.BLACK);
    viosaddFee.setVisible(false);
    backgroundSedan.add(viosaddFee);
    
    civicsedanButton.setBounds(250,200,256,85);
    civicsedanButton.setOpaque(false);
    civicsedanButton.setContentAreaFilled(false);
    civicsedanButton.setBorderPainted(false);
    backgroundSedan.add(civicsedanButton);
    
    civicpriceText.setBounds(330,350,200,100);
    civicpriceText.setFont(new Font("Arial",Font.BOLD,25));
    civicpriceText.setForeground(Color.BLACK);
    civicpriceText.setVisible(false);
    backgroundSedan.add(civicpriceText); 
    
    civicName.setBounds(310,250,200,100);
    civicName.setFont(new Font("Arial",Font.BOLD,18));
    civicName.setForeground(Color.BLACK);
    civicName.setVisible(false);
    backgroundSedan.add(civicName);
    
    civicDescription.setBounds(280,320,500,100);
    civicDescription.setFont(new Font("Arial",Font.BOLD,12));
    civicDescription.setForeground(Color.BLACK);
    civicDescription.setLineWrap(true);
    civicDescription.setWrapStyleWord(true);
    civicDescription.setBackground(Color.GRAY);
    civicDescription.setVisible(false);
    civicDescription.setEditable(false);
    backgroundSedan.add(civicDescription);
    
    civicbuyButton.setBounds(430,470,100,30);
    civicbuyButton.setOpaque(false);
    civicbuyButton.setContentAreaFilled(false);
    civicbuyButton.setBorderPainted(false);
    civicbuyButton.setVisible(false);
    civicbuyButton.setForeground(Color.BLACK);
    backgroundSedan.add(civicbuyButton);
    
    civicconfirmButton.setBounds(430,470,100,30);
    civicconfirmButton.setOpaque(false);
    civicconfirmButton.setContentAreaFilled(false);
    civicconfirmButton.setBorderPainted(false);
    civicconfirmButton.setVisible(false);
    civicconfirmButton.setForeground(Color.BLACK);
    backgroundSedan.add(civicconfirmButton);
    
    civictransmissionPick.setBounds(220,400,200,100);
    civictransmissionPick.setFont(new Font("Arial",Font.BOLD,15));
    civictransmissionPick.setForeground(Color.BLACK);
    civictransmissionPick.setVisible(false);
    backgroundSedan.add(civictransmissionPick);
    
    civicAutomatic.setBounds(350,435,100,30);
    civicAutomatic.setOpaque(false);
    civicAutomatic.setContentAreaFilled(false);
    civicAutomatic.setBorderPainted(false);
    civicAutomatic.setVisible(false);
    bg.add(civicAutomatic);
    backgroundSedan.add(civicAutomatic);
    
    civicManual.setBounds(430,435,100,30);
    civicManual.setOpaque(false);
    civicManual.setContentAreaFilled(false);
    civicManual.setBorderPainted(false);
    civicManual.setVisible(false);
    bg.add(civicManual);
    backgroundSedan.add(civicManual);
    
    civicaddFee.setBounds(480,415,200,100);
    civicaddFee.setFont(new Font("Arial",Font.BOLD,10));
    civicaddFee.setForeground(Color.BLACK);
    civicaddFee.setVisible(false);
    backgroundSedan.add(civicaddFee);
    
    backbuttonSedan.setBounds(1100,630,100,30);
    backbuttonSedan.setOpaque(false);
    backbuttonSedan.setContentAreaFilled(false);
    backbuttonSedan.setBorderPainted(false);
    backbuttonSedan.setForeground(Color.BLACK);
    backgroundSedan.add(backbuttonSedan);
    
    nameAccSedan.setBounds(250,25,500,100);
    nameAccSedan.setFont(new Font("Arial",Font.BOLD,25));
    nameAccSedan.setForeground(Color.WHITE);
    backgroundSedan.add(nameAccSedan);
    
    showroomsedanLogo.setBounds(1,1,256,144);
    backgroundSedan.add(showroomsedanLogo);
    
    backgroundSedan.setBounds(1,1,1280,720);
    backgroundSedan.setBackground(Color.GRAY);
    backgroundSedan.setLayout(null);
    sedanFrame.add(backgroundSedan);
    
    //SUVFrame
    backbuttonSUV.setBounds(1100,630,100,30);
    backbuttonSUV.setOpaque(false);
    backbuttonSUV.setContentAreaFilled(false);
    backbuttonSUV.setBorderPainted(false);
    backbuttonSUV.setForeground(Color.BLACK);
    backgroundSUV.add(backbuttonSUV);
    
    nameAccSUV.setBounds(250,25,500,100);
    nameAccSUV.setFont(new Font("Arial",Font.BOLD,25));
    nameAccSUV.setForeground(Color.WHITE);
    backgroundSUV.add(nameAccSUV);
    
    showroomSUVLogo.setBounds(1,1,256,144);
    backgroundSUV.add(showroomSUVLogo);
    
    backgroundSUV.setBounds(1,1,1280,720);
    backgroundSUV.setBackground(Color.GRAY);
    backgroundSUV.setLayout(null);
    SUVFrame.add(backgroundSUV);
    
    //vanFrame
    backbuttonVan.setBounds(1100,630,100,30);
    backbuttonVan.setOpaque(false);
    backbuttonVan.setContentAreaFilled(false);
    backbuttonVan.setBorderPainted(false);
    backbuttonVan.setForeground(Color.BLACK);
    backgroundVan.add(backbuttonVan);
    
    nameAccVan.setBounds(250,25,500,100);
    nameAccVan.setFont(new Font("Arial",Font.BOLD,25));
    nameAccVan.setForeground(Color.WHITE);
    backgroundVan.add(nameAccVan);
    
    showroomvanLogo.setBounds(1,1,256,144);
    backgroundVan.add(showroomvanLogo);
    
    backgroundVan.setBounds(1,1,1280,720);
    backgroundVan.setBackground(Color.GRAY);
    backgroundVan.setLayout(null);
    vanFrame.add(backgroundVan);
    
    //motorsFrame
    scooterLogo.setBounds(670,280,256,256);
    scooterLogo.setOpaque(false);
    scooterLogo.setContentAreaFilled(false);
    scooterLogo.setBorderPainted(false);
    backgroundMotors.add(scooterLogo);
    
    underboneLogo.setBounds(300,300,200,200);
    underboneLogo.setOpaque(false);
    underboneLogo.setContentAreaFilled(false);
    underboneLogo.setBorderPainted(false);
    backgroundMotors.add(underboneLogo);
    
    backbuttonMotors.setBounds(1100,630,100,30);
    backbuttonMotors.setOpaque(false);
    backbuttonMotors.setContentAreaFilled(false);
    backbuttonMotors.setBorderPainted(false);
    backbuttonMotors.setForeground(Color.BLACK);
    backgroundMotors.add(backbuttonMotors);
    
    underboneLabel.setBounds(350,500,200,100);
    underboneLabel.setFont(new Font("Arial",Font.BOLD,25));
    underboneLabel.setForeground(Color.BLACK);
    backgroundMotors.add(underboneLabel);
    
    showroomLogoMotors.setBounds(1,1,256,144);
    backgroundMotors.add(showroomLogoMotors);
    
    scooterLabel.setBounds(750,500,100,100);
    scooterLabel.setFont(new Font("Arial",Font.BOLD,25));
    scooterLabel.setForeground(Color.BLACK);
    backgroundMotors.add(scooterLabel);
     
    nameAccMotors.setBounds(250,25,500,100);
    nameAccMotors.setFont(new Font("Arial",Font.BOLD,25));
    nameAccMotors.setForeground(Color.WHITE);
    backgroundMotors.add(nameAccMotors);
    
    //logoMenu.setBounds(1,1,256,144);
   // backgroundMotors.add(logoMenu); //lipat moto dun sa menu itapat mo rin don *pati yung jpanel yun din
    
    backgroundMotors.setBounds(1,1,1280,720);
    backgroundMotors.setBackground(Color.GRAY);
    backgroundMotors.setLayout(null);
    motorsFrame.add(backgroundMotors);
   
    //underbone Frame
    
    backbuttonUnderbone.setBounds(1100,630,100,30);
    backbuttonUnderbone.setOpaque(false);
    backbuttonUnderbone.setContentAreaFilled(false);
    backbuttonUnderbone.setBorderPainted(false);
    backbuttonUnderbone.setForeground(Color.BLACK);
    backgroundUnderbone.add(backbuttonUnderbone);
    
    nameAccUnderbone.setBounds(250,25,500,100);
    nameAccUnderbone.setFont(new Font("Arial",Font.BOLD,25));
    nameAccUnderbone.setForeground(Color.WHITE);
    backgroundUnderbone.add(nameAccSedan);
    
    showroomunderboneLogo.setBounds(1,1,256,144);
    backgroundUnderbone.add(showroomunderboneLogo);
    
    backgroundUnderbone.setBounds(1,1,1280,720);
    backgroundUnderbone.setBackground(Color.GRAY);
    backgroundUnderbone.setLayout(null);
    underboneFrame.add(backgroundUnderbone);
    
    //scooter Frame
    backbuttonScooter.setBounds(1100,630,100,30);
    backbuttonScooter.setOpaque(false);
    backbuttonScooter.setContentAreaFilled(false);
    backbuttonScooter.setBorderPainted(false);
    backbuttonScooter.setForeground(Color.BLACK);
    backgroundScooter.add(backbuttonScooter);
    
    nameAccScooter.setBounds(250,25,500,100);
    nameAccScooter.setFont(new Font("Arial",Font.BOLD,25));
    nameAccScooter.setForeground(Color.WHITE);
    backgroundScooter.add(nameAccScooter);
    
    showroomscooterLogo.setBounds(1,1,256,144);
    backgroundScooter.add(showroomscooterLogo);
    
    backgroundScooter.setBounds(1,1,1280,720);
    backgroundScooter.setBackground(Color.GRAY);
    backgroundScooter.setLayout(null);
    scooterFrame.add(backgroundScooter);
    
    introFrame.setSize(1280,720);
    introFrame.setLayout(null);
    introFrame.setVisible(false);
    introFrame.setLocationRelativeTo(null);
    introFrame.setResizable(false);
    introFrame.setDefaultCloseOperation(introFrame.EXIT_ON_CLOSE);
    
    menuFrame.setSize(1280,720);
    menuFrame.setLayout(null);
    menuFrame.setVisible(false);
    menuFrame.setLocationRelativeTo(null);
    menuFrame.setResizable(false);
    menuFrame.setDefaultCloseOperation(menuFrame.EXIT_ON_CLOSE);
    
    carsFrame.setSize(1280,720);
    carsFrame.setLayout(null);
    carsFrame.setVisible(false);
    carsFrame.setLocationRelativeTo(null);
    carsFrame.setResizable(false);
    carsFrame.setDefaultCloseOperation(carsFrame.EXIT_ON_CLOSE);
     
    sedanFrame.setSize(1280,720);
    sedanFrame.setLayout(null);
    sedanFrame.setVisible(true);
    sedanFrame.setLocationRelativeTo(null);
    sedanFrame.setResizable(false);
    sedanFrame.setDefaultCloseOperation(sedanFrame.EXIT_ON_CLOSE);
    
    SUVFrame.setSize(1280,720);
    SUVFrame.setLayout(null);
    SUVFrame.setVisible(false);
    SUVFrame.setLocationRelativeTo(null);
    SUVFrame.setResizable(false);
    SUVFrame.setDefaultCloseOperation(SUVFrame.EXIT_ON_CLOSE);
    
    vanFrame.setSize(1280,720);
    vanFrame.setLayout(null);
    vanFrame.setVisible(false);
    vanFrame.setLocationRelativeTo(null);
    vanFrame.setResizable(false);
    vanFrame.setDefaultCloseOperation(vanFrame.EXIT_ON_CLOSE);
    
    motorsFrame.setSize(1280,720);
    motorsFrame.setLayout(null);
    motorsFrame.setVisible(false);
    motorsFrame.setLocationRelativeTo(null);
    motorsFrame.setResizable(false);
    motorsFrame.setDefaultCloseOperation(motorsFrame.EXIT_ON_CLOSE);
    
    underboneFrame.setSize(1280,720);
    underboneFrame.setLayout(null);
    underboneFrame.setVisible(false);
    underboneFrame.setLocationRelativeTo(null);
    underboneFrame.setResizable(false);
    underboneFrame.setDefaultCloseOperation(underboneFrame.EXIT_ON_CLOSE);
    
    scooterFrame.setSize(1280,720);
    scooterFrame.setLayout(null);
    scooterFrame.setVisible(false);
    scooterFrame.setLocationRelativeTo(null);
    scooterFrame.setResizable(false);
    scooterFrame.setDefaultCloseOperation(scooterFrame.EXIT_ON_CLOSE);
    
    
    
    
    
    
   //Login Frame
    logo.addActionListener(this);
    loginButton.addActionListener(this);
    //menu Frame
    cars.addActionListener(this);
    sedanLogo.addActionListener(this);
    SUVLogo.addActionListener(this);
    vanLogo.addActionListener(this);
    
    motors.addActionListener(this);
    underboneLogo.addActionListener(this);
    scooterLogo.addActionListener(this);
    //cars Frame
    backbuttonCars.addActionListener(this);
    //motorsFrame
    backbuttonMotors.addActionListener(this);
    //sedanFrame
    backbuttonSedan.addActionListener(this);
    civicsedanButton.addActionListener(this);
    viossedanButton.addActionListener(this);
    civicbuyButton.addActionListener(this);
    civicAutomatic.addActionListener(this);
    civicManual.addActionListener(this);
    viosbuyButton.addActionListener(this);
    viosAutomatic.addActionListener(this);
    viosManual.addActionListener(this);
    //SUVFrame
    backbuttonSUV.addActionListener(this);
    //vanFrame
    backbuttonVan.addActionListener(this);
    //underboneFrame
    backbuttonUnderbone.addActionListener(this);
    //ScooterFrame
    backbuttonScooter.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e ){
        //login Frame
        if (e.getSource()== logo){
            userlabel.setVisible(true);
            passlabel.setVisible(true);
            user.setVisible(true);
            pass.setVisible(true);
            loginButton.setVisible(true);
                    }
        
        if(e.getSource()== loginButton){
              String un=user.getText();
               String passw=pass.getText();
               if (un.equalsIgnoreCase(username) && passw.equalsIgnoreCase(password)) {
                           JOptionPane.showMessageDialog(null, "Log-in Successful!");
                           user.setText("");
                           pass.setText("");
                           introFrame.setVisible(false);
                           menuFrame.setVisible(true);
                            } 
                     
                     else {
                         user.setText("");
                         pass.setText("");
                    JOptionPane.showMessageDialog(null, "Log-in Failed! Try Again");
                       }
                }
        
         //menuFrame
       if (e.getSource()== cars){
           menuFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
       
       //sedan
       if (e.getSource()== sedanLogo){
           carsFrame.setVisible(false);
           sedanFrame.setVisible(true);
       }
       
       if(e.getSource()==civicsedanButton){
           civicName.setVisible(true);
           civicDescription.setVisible(true);
           civicpriceText.setVisible(true);
           civicbuyButton.setVisible(true);
           
           viosName.setVisible(false);
           viosDescription.setVisible(false);
           viospriceText.setVisible(false);
           viosbuyButton.setVisible(false);
           viostransmissionPick.setVisible(false);
           viosAutomatic.setVisible(false);
           viosManual.setVisible(false);
           viosaddFee.setVisible(false);
           viosconfirmButton.setVisible(false);
       }
       
       if(e.getSource()==civicbuyButton){
           civictransmissionPick.setVisible(true);
           civicAutomatic.setVisible(true);
           civicManual.setVisible(true);
           civicconfirmButton.setVisible(true);
           civicbuyButton.setVisible(false);
       }
       
       if(e.getSource()==civicManual){
           civicaddFee.setVisible(true);
       }
       
        if(e.getSource()==civicAutomatic){
           civicaddFee.setVisible(false);
       }
       
       if(e.getSource()==viossedanButton){
           civicName.setVisible(false);
           civicDescription.setVisible(false);
           civicpriceText.setVisible(false);
           civictransmissionPick.setVisible(false);
           civicAutomatic.setVisible(false);
           civicManual.setVisible(false);   
           civicconfirmButton.setVisible(false);
           civicbuyButton.setVisible(false);
           civicaddFee.setVisible(false);
           
           viosbuyButton.setVisible(true);
           viosName.setVisible(true);
           viosDescription.setVisible(true);
           viospriceText.setVisible(true);
       }
       
        if(e.getSource()==viosbuyButton){
           viostransmissionPick.setVisible(true);
           viosAutomatic.setVisible(true);
           viosManual.setVisible(true);
           viosconfirmButton.setVisible(true);
           viosbuyButton.setVisible(false);
       }
        
          if(e.getSource()==viosManual){
           viosaddFee.setVisible(false);
       }
       
        if(e.getSource()==viosAutomatic){
           viosaddFee.setVisible(true);
       }
        
       if (e.getSource()== SUVLogo){
           carsFrame.setVisible(false);
           SUVFrame.setVisible(true);
       }
       
       if (e.getSource()== vanLogo){
           carsFrame.setVisible(false);
           vanFrame.setVisible(true);
       }
       
       if (e.getSource()== motors){
           menuFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
       
        if (e.getSource()== underboneLogo){
           motorsFrame.setVisible(false);
           underboneFrame.setVisible(true);
       }
        
         if (e.getSource()== scooterLogo){
           motorsFrame.setVisible(false);
           scooterFrame.setVisible(true);
       }
         
       //carsFrame
       if (e.getSource()== backbuttonCars){
           carsFrame.setVisible(false);
           menuFrame.setVisible(true);
       }
       
        if (e.getSource()== backbuttonMotors){
           motorsFrame.setVisible(false);
           menuFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonSedan){
           sedanFrame.setVisible(false);
           carsFrame.setVisible(true);
           
            civicName.setVisible(false);
           civicDescription.setVisible(false);
           civicpriceText.setVisible(false);
           civictransmissionPick.setVisible(false);
           civicAutomatic.setVisible(false);
           civicManual.setVisible(false);
           civicconfirmButton.setVisible(false);
           civicbuyButton.setVisible(false);
           civicaddFee.setVisible(false);
           
           viosbuyButton.setVisible(false);
           viosName.setVisible(false);
           viosDescription.setVisible(false);
           viospriceText.setVisible(false);
           viostransmissionPick.setVisible(false);
           viosAutomatic.setVisible(false);
           viosManual.setVisible(false);
           viosconfirmButton.setVisible(false);
           
       }
        if (e.getSource()== backbuttonSUV){
           SUVFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonVan){
           vanFrame.setVisible(false);
           carsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonUnderbone){
           underboneFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
        if (e.getSource()== backbuttonScooter){
           scooterFrame.setVisible(false);
           motorsFrame.setVisible(true);
       }
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        new theShowroom();
    }

  
    
}
