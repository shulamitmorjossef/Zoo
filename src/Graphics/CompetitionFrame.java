//package Graphics;
//import Animals.*;
//import Mobility.Point;
//import Olympics.Medal;
//import Olympics.MedalType;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
//
//
//public class CompetitionFrame extends JFrame {
//
//
//
//    public static void myF()
//    {
//        JFrame frame = new JFrame("try");
//        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.setSize(700,500);
//
//        BorderLayout borderLayout = new BorderLayout();
//        frame.setLayout(borderLayout);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//
//
//
//        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        JTextArea title = new JTextArea("Add competition");
//        title.setFont(new Font("Arial", Font.BOLD, 24));
//        title.setEditable(false);
//        titlePanel.add(title);
//
//        mainPanel.add(Box.createVerticalStrut(50)); // Adjust height as needed
//        mainPanel.add(titlePanel);
//
//
//        JPanel addCompetitionButtons  = new JPanel();
//        addCompetitionButtons.setLayout(new FlowLayout());//6, 5
//        addCompetitionButtons.setPreferredSize(new Dimension (600, 50));
//
//        JButton water = new JButton("Water");
//        water.setPreferredSize(new Dimension(100,30));
//        JButton air = new JButton("Air");
//        air.setPreferredSize(new Dimension(100,30));
//        JButton terrestrial = new JButton("Terrestrial");
//        terrestrial.setPreferredSize(new Dimension(100,30));
//
//        addCompetitionButtons.add(water);
//        addCompetitionButtons.add(air);
//        addCompetitionButtons.add(terrestrial);
//
//        mainPanel.add(addCompetitionButtons);
//
//        frame.add(mainPanel, BorderLayout.CENTER);
//
//
//        frame.setVisible(true);
//
//    }
//
//
//
//    public static void testAlligator()
//    {
//        Medal m11 = new Medal(MedalType.bronze,"AVIV",1233);
//        Medal m12 = new Medal(MedalType.gold,"ghgh",87);
//        Medal m13 = new Medal(MedalType.silver,"gorf",123803);
//        Medal m14 = new Medal(MedalType.bronze,"tokyo",900);
//        Medal m15 = new Medal(MedalType.bronze,"tokyo",900);
//
//        Medal m21 = new Medal(MedalType.bronze,"AVIV",1233);
//        Medal m22 = new Medal(MedalType.gold,"ghgh",87);
//        Medal m23 = new Medal(MedalType.silver,"gorf",123803);
//        Medal m24 = new Medal(MedalType.bronze,"tokyo",900);
//
//        Medal[] medals1 = new Medal[5];
//        Medal[] medals2 = new Medal[4];
//
//        medals1[0] = m11;
//        medals1[1] = m12;
//        medals1[2] = m13;
//        medals1[3] = m14;
//        medals1[4] = m15;
//
//        medals2[0] = m21;
//        medals2[1] = m22;
//        medals2[2] = m23;
//        medals2[3] = m24;
//
//
//
//
//        Animal a1=new Alligator("Noji", Gender.Male,34,700,medals1,new Point(2,4),12,12345678,
//                Orientation.EAST,34,9,null,-80,"singapure");
//        Animal a2=new Alligator("Noji", Gender.Male,34,700,medals2,new Point(2,4),12,12345678,
//                Orientation.EAST,34,9,null,-80,"singapure");
//        if(a1.equals(a2))
//            System.out.println("equals++");
//        else
//            System.out.println("Not equals--");
//
//
//        System.out.println(a1.toString());
//    }
//
//
//    public static void testAnyWaterAnimal()
//    {
//        Medal m11 = new Medal(MedalType.bronze,"AVIV",1233);
//        Medal m12 = new Medal(MedalType.gold,"ghgh",87);
//        Medal m13 = new Medal(MedalType.silver,"gorf",123803);
//        Medal m14 = new Medal(MedalType.bronze,"tokyo",900);
//        Medal m15 = new Medal(MedalType.bronze,"tokyo",900);
//
//        Medal m21 = new Medal(MedalType.bronze,"AVIV",1233);
//        Medal m22 = new Medal(MedalType.gold,"ghgh",87);
//        Medal m23 = new Medal(MedalType.silver,"gorf",123803);
//        Medal m24 = new Medal(MedalType.bronze,"tokyo",900);
//
//        Medal[] medals1 = new Medal[5];
//        Medal[] medals2 = new Medal[4];
//
//        medals1[0] = m11;
//        medals1[1] = m12;
//        medals1[2] = m13;
//        medals1[3] = m14;
//        medals1[4] = m15;
//
//        medals2[0] = m21;
//        medals2[1] = m22;
//        medals2[2] = m23;
//        medals2[3] = m24;
//
//
//
//
//        Animal a1=new Whale("Noji", Gender.Male,34,700,medals1,new Point(2,4),12,12345678,
//                Orientation.EAST,34,9,null,-80,"sushi");
//        Animal a2=new Whale("Noji", Gender.Male,34,700,medals2,new Point(2,4),12,12345678,
//                Orientation.EAST,34,9,null,-80,"sushi");
//        if(a1.equals(a2))
//            System.out.println("equals++");
//        else
//            System.out.println("Not equals--");
//
//        System.out.println(a1.toString());
//    }
//
//
//
//
//    private CompetitionPanel competitionPanel;
//
//    public CompetitionFrame() {
//        setTitle("Competition");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(1000, 600);
//        setLayout(new BorderLayout());
//
//        // Menu
//        JMenuBar menuBar = new JMenuBar();
//        JMenu file = new JMenu("File");
//        JMenu help = new JMenu("Help");
//        JMenuItem exitItem = new JMenuItem("Exit");
//        exitItem.addActionListener(e -> System.exit(0));
//        JMenuItem helpItem = new JMenuItem("Help");
//        helpItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Home Work 2\nGUI"));
//
//        help.add(helpItem);
//        file.add(exitItem);
//        menuBar.add(file);
//        menuBar.add(help);
//        setJMenuBar(menuBar);
//
//
//
//        competitionPanel = new CompetitionPanel();
//        add(competitionPanel, BorderLayout.CENTER);
//
//        setLocationRelativeTo(null);
//
//    }
//
//    public static void main(String[] args) {
////        Animal a = new Alligator("Noji", Gender.Male,34,700,null,new Point(2,4),12,12345678,
////                Orientation.EAST,34,9,new CompetitionPanel(),-80,"singapure");
//
////        myF();
//
//        SwingUtilities.invokeLater(() -> {
//            CompetitionFrame frame = new CompetitionFrame();
//            frame.setVisible(true);
//        });
//
//
//
////     Animal a=new Alligator();
////      Animal b=new Alligator();
//
//// a.loadImages("alligator");
//    }
//}
//
//
package Graphics;

import javax.swing.*;
import java.awt.*;

public class CompetitionFrame extends JFrame {
    private int buttonsPanelHeight = 30;
    private CompetitionPanel competitionPanel; // Add this field

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CompetitionFrame frame = new CompetitionFrame();
            frame.setVisible(true);
        });
    }

    public CompetitionFrame() {
        setTitle("Competition");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLocationRelativeTo(null);

        competitionPanel = new CompetitionPanel();
        competitionPanel.setLayout(null);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        JMenuItem helpItem = new JMenuItem("Help");
        helpItem.addActionListener(e -> JOptionPane.showMessageDialog(this, "Home Work 2\nGUI"));

        help.add(helpItem);
        file.add(exitItem);
        menuBar.add(file);
        menuBar.add(help);
        setJMenuBar(menuBar);

        // Buttons Panel
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 6));
        buttonsPanel.setPreferredSize(new Dimension(getWidth(), buttonsPanelHeight));

        // AddCompetition Button
        JButton addCompetitionButton = new JButton("Add Competition");
        addCompetitionButton.addActionListener(e -> competitionPanel.addCompetition()); // Call the method on competitionPanel
        buttonsPanel.add(addCompetitionButton);

        // AddAnimal Button
        JButton addAnimalButton = new JButton("Add Animal");
        addAnimalButton.addActionListener(e -> competitionPanel.addAnimal());
        buttonsPanel.add(addAnimalButton);


        // Clear Button
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> competitionPanel.clearAnimals());
        buttonsPanel.add(clearButton);

        // Eat Button
        JButton eatButton = new JButton("Eat");
        eatButton.addActionListener(e -> competitionPanel.eatAnimal());
        buttonsPanel.add(eatButton);

        // Info Button
        JButton infoButton = new JButton("Info");
        infoButton.addActionListener(e -> competitionPanel.showInfo());
        buttonsPanel.add(infoButton);

        // Exit Button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        buttonsPanel.add(exitButton);

        add(buttonsPanel, BorderLayout.NORTH); // Add the buttons panel to the frame
        add(competitionPanel, BorderLayout.CENTER); // Add the competition panel to the frame
    }
}
