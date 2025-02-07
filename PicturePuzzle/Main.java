package Games.PicturePuzzle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private final int ScreenWidth = 700;
    private final int ScreenHeight = 500;
    Icon icon = new ImageIcon("D:\\PicturePuzzle\\originalPicture\\darlingIcon.png");
    Icon icon_2 = new ImageIcon("D:\\PicturePuzzle\\originalPicture\\minionOriginal.png");
    Icon icon_3 = new ImageIcon("D:\\PicturePuzzle\\originalPicture\\mauOriginal.png");
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,ref;
    JButton teamInfo,reset,nextImage;
    JButton originalImage;
    JLabel info,info2;
    Font font = new Font("Ink Free",Font.BOLD,15);

    Image image = Toolkit.getDefaultToolkit().getImage("D:\\Coding Projects\\MiniProjects\\JavaApplication\\src\\Games\\PicturePuzzle\\originalPicture\\BackGroundImage.png");

    Icon icon0,target,icon01,icon02;
    Icon icon1=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon1.png");
    Icon icon2=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon5.png");
    Icon icon3=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon2.png");
    Icon icon4=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon7.png");
    Icon icon5=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon4.png");
    Icon icon6=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon6.png");
    Icon icon7=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon8.png");
    Icon icon8=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon9.png");
    Icon icon9=new ImageIcon("D:\\PicturePuzzle\\IconImages\\icon3.png");

    Icon micon1=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon1.png");
    Icon micon2=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon5.png");
    Icon micon3=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon2.png");
    Icon micon4=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon7.png");
    Icon micon5=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon4.png");
    Icon micon6=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon6.png");
    Icon micon7=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon8.png");
    Icon micon8=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon9.png");
    Icon micon9=new ImageIcon("D:\\PicturePuzzle\\IconImages\\micon3.png");

    Icon cicon1=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon1.png");
    Icon cicon2=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon5.png");
    Icon cicon3=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon2.png");
    Icon cicon4=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon7.png");
    Icon cicon5=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon4.png");
    Icon cicon6=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon6.png");
    Icon cicon7=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon8.png");
    Icon cicon8=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon9.png");
    Icon cicon9=new ImageIcon("D:\\PicturePuzzle\\IconImages\\cicon3.png");

    Main(){
        setTitle("PuzzlePictureByAnni");
        setSize(ScreenWidth,ScreenHeight);
        getContentPane().setBackground(new Color(106,148,212));
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        info = new JLabel("Hint : Use the right bottom corner icon to swap the icons ;)");
        info.setBounds(10,30 ,450,30);
        info.setFont(new Font("Ink Free",Font.BOLD,15));

        info2 = new JLabel("Original Image");
        info2.setBounds(460,350 ,200,40);
        info2.setFont(new Font("Ink Free",Font.BOLD,20));

        originalImage = new JButton(icon);
        originalImage.setBounds(400,100,250,250);
        originalImage.setBorderPainted(false);
        add(originalImage);

        b1=new JButton(icon1);
        b1.setBounds(10,80,100,100);
        b1.setFocusable(false);
        b1.setBorderPainted(false);
        b2=new JButton(icon2);
        b2.setBounds(110,80,100,100);
        b2.setFocusable(false);
        b2.setBorderPainted(false);
        b3=new JButton(icon3);
        b3.setBounds(210,80,100,100);
        b3.setFocusable(false);
        b3.setBorderPainted(false);
        b4=new JButton(icon4);
        b4.setBounds(10,180,100,100);
        b4.setFocusable(false);
        b4.setBorderPainted(false);
        b5=new JButton(icon5);
        b5.setBounds(110,180,100,100);
        b5.setFocusable(false);
        b5.setBorderPainted(false);
        b6=new JButton(icon6);
        b6.setBounds(210,180,100,100);
        b6.setFocusable(false);
        b6.setBorderPainted(false);
        b7=new JButton(icon7);
        b7.setBounds(10,280,100,100);
        b7.setFocusable(false);
        b7.setBorderPainted(false);
        b8=new JButton(icon8);
        b8.setBounds(110,280,100,100);
        b8.setFocusable(false);
        b8.setBorderPainted(false);
        b9=new JButton(icon9);
        b9.setBounds(210,280,100,100);
        b9.setFocusable(false);
        b9.setBorderPainted(false);


        ref =new JButton(icon0);
        ref.setBounds(330,5,50,50);
        target=b9.getIcon();

        teamInfo = new JButton("Team");
        teamInfo.setBounds(580,430,100,30);
        teamInfo.setBackground(Color.gray);
        teamInfo.setFocusable(false);

        reset = new JButton("Reset");
        reset.setBounds(470,430,100,30);
        reset.setBackground(Color.gray);
        reset.setFocusable(false);

        nextImage = new JButton("Next");
        nextImage.setBounds(360,430,100,30);
        nextImage.setBackground(Color.gray);
        nextImage.setFocusable(false);

        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
        add(info);add(info2);
        add(teamInfo);add(reset);add(nextImage);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        teamInfo.addActionListener(this);
        reset.addActionListener(this);
        nextImage.addActionListener(this);

    }
    public static void main(String[] args) {
        new Main();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== teamInfo){
            aboutTeam();
        }
        if(e.getSource() == reset){
            this.dispose();
            new Main();
        }
        if(e.getSource()==b1){
            Icon s1=b1.getIcon();
            if(b2.getIcon()==target){
                b2.setIcon(s1);
                b1.setIcon(target);
            } else if(b4.getIcon()==target){
                b4.setIcon(s1);
                b1.setIcon(target);
            }
        }
        if(e.getSource()==b2){
            Icon s1=b2.getIcon();
            if(b1.getIcon()==target){
                b1.setIcon(s1);
                b2.setIcon(target);
            } else if(b5.getIcon()==target){
                b5.setIcon(s1);
                b2.setIcon(target);
            }
            else if(b3.getIcon()==target){
                b3.setIcon(s1);
                b2.setIcon(target);
            }
        }
        if(e.getSource()==b3){
            Icon s1=b3.getIcon();
            if(b2.getIcon()==target){
                b2.setIcon(s1);
                b3.setIcon(target);
            } else if(b6.getIcon()==target){
                b6.setIcon(s1);
                b3.setIcon(target);
            }
        }
        if(e.getSource()==b4){
            Icon s1=b4.getIcon();
            if(b1.getIcon()==target){
                b1.setIcon(s1);
                b4.setIcon(target);
            } else if(b5.getIcon()==target){
                b5.setIcon(s1);
                b4.setIcon(target);
            }
            else if(b7.getIcon()==target){
                b7.setIcon(s1);
                b4.setIcon(target);
            }
        }
        if(e.getSource()==b5){
            Icon s1=b5.getIcon();
            if(b2.getIcon()==target){
                b2.setIcon(s1);
                b5.setIcon(target);
            } else if(b4.getIcon()==target){
                b4.setIcon(s1);
                b5.setIcon(target);
            }
            else if(b6.getIcon()==target){
                b6.setIcon(s1);
                b5.setIcon(target);
            }
            else if(b8.getIcon()==target){
                b8.setIcon(s1);
                b5.setIcon(target);
            }
        }
        if(e.getSource()==b6){
            Icon s1=b6.getIcon();
            if(b3.getIcon()==target){
                b3.setIcon(s1);
                b6.setIcon(target);
            } else if(b5.getIcon()==target){
                b5.setIcon(s1);
                b6.setIcon(target);
            }
            else if(b9.getIcon()==target){
                b9.setIcon(s1);
                b6.setIcon(target);
            }
        }
        if(e.getSource()==b7){
            Icon s1=b7.getIcon();
            if(b4.getIcon()==target){
                b4.setIcon(s1);
                b7.setIcon(target);
            } else if(b8.getIcon()==target){
                b8.setIcon(s1);
                b7.setIcon(target);
            }
        }
        if(e.getSource()==b8){
            Icon s1=b8.getIcon();
            if(b7.getIcon()==target){
                b7.setIcon(s1);
                b8.setIcon(target);
            } else if(b5.getIcon()==target){
                b5.setIcon(s1);
                b8.setIcon(target);
            }
            else if(b9.getIcon()==target){
                b9.setIcon(s1);
                b8.setIcon(target);
            }

        }
        if(e.getSource()==b9){
            Icon s1=b9.getIcon();
            if(b8.getIcon()==target){
                b8.setIcon(s1);
                b9.setIcon(target);
            } else if(b6.getIcon()==target){
                b6.setIcon(s1);
                b9.setIcon(target);
            }
        }
        if(e.getSource()==nextImage) {
            Icon s1 = originalImage.getIcon();
            if (s1 == icon_3) {
                originalImage.setIcon(icon);
                b1.setIcon(icon1);
                b2.setIcon(icon2);
                b3.setIcon(icon3);
                b4.setIcon(icon4);
                b5.setIcon(icon5);
                b6.setIcon(icon6);
                b7.setIcon(icon7);
                b8.setIcon(icon8);
                b9.setIcon(icon9);
                target = b9.getIcon();
                ref.setIcon(icon0);
            }
            else if(s1==icon){
                originalImage.setIcon(icon_2);
                b1.setIcon(micon1);
                b2.setIcon(micon2);
                b3.setIcon(micon3);
                b4.setIcon(micon4);
                b5.setIcon(micon5);
                b6.setIcon(micon6);
                b7.setIcon(micon7);
                b8.setIcon(micon8);
                b9.setIcon(micon9);
                target=b6.getIcon();
                ref.setIcon(icon01);
            }
            else{
                originalImage.setIcon(icon_3);
                b1.setIcon(cicon1);
                b2.setIcon(cicon2);
                b3.setIcon(cicon3);
                b4.setIcon(cicon4);
                b5.setIcon(cicon5);
                b6.setIcon(cicon6);
                b7.setIcon(cicon7);
                b8.setIcon(cicon8);
                b9.setIcon(cicon9);
                target=b6.getIcon();
                ref.setIcon(icon02);
            }
        }
    }
    public void aboutTeam(){
        JDialog log = new JDialog(this,"About Team");
        log.setResizable(false);
        log.getContentPane().setBackground(Color.cyan);
        log.setLocationRelativeTo(null);
        log.setLayout(new GridLayout(5,1));
        log.setSize(new Dimension(400,300));
        JLabel label = new JLabel();
        label.setFont(font);
        JLabel label1 = new JLabel();
        label1.setFont(font);
        JLabel label2 = new JLabel();
        label2.setFont(font);
        JLabel label3 = new JLabel();
        label3.setFont(font);
        JLabel label4 = new JLabel();
        label4.setFont(font);
        label2.setText("Lalit Shinde  \n" );
        label4.setText(".");
        log.add(label);log.add(label1);log.add(label2);log.add(label3);add(label4);
        log.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        log.setVisible(true);
    }


}
