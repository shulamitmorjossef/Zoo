//package Graphics;
//import Animals.*;
//import Olympics.Medal;
//
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.image.BufferedImage;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.text.NumberFormat;
//import javax.swing.text.NumberFormatter;
//import java.net.URL;
//import java.util.Scanner;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import javax.imageio.ImageIO;
////        ImageIcon animalImageIcon = new ImageIcon(("src//Images//alligator.png"));
//public class CompetitionPanel extends JPanel {
//
//    private int competitionType;    //1 - water, 2 - air, 3 - terrestrial
//    private int animalType;         //1 - Alligator, 2 - Cat, 3 - Dog, 4 - Dolphin, 5- Eagle, 6 - Pigeon, 7 - Snake, 8 - Whale
//
//    private Animal[] participates;
//    private Image backgroundImage;
//    private int buttonsPanelHeight = 30;
//
//
//
//    private JLabel smallImage1;
//    private JLabel smallImage2;
//
//
//
//
////    @Override
////    protected void paintComponent(Graphics g) {
////        super.paintComponent(g);
////        int availableHeight = getHeight() - buttonsPanelHeight;
////
////        // Draw the background image
////        if (backgroundImage != null) {
////            g.drawImage(backgroundImage, 0, 0, getWidth(), availableHeight, this);
////        } else {
////            System.out.println("Background image not loaded.");
////        }
////
////
////    }
//
//
//
//
//
//
//
//    public CompetitionPanel() {
//
//        participates = null;
//        competitionType = 0;
//        animalType = 0;
//        backgroundImage = null;
//
//        URL imageUrl = getClass().getResource("competitionBackground.png");
//        if (imageUrl != null) {
////            backgroundImage = new ImageIcon(imageUrl).getImage();
//            // Load the background image from the Graphics package
//            backgroundImage = new ImageIcon(getClass().getResource("competitionBackground.png")).getImage();
//            JLabel smallImage1 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\alligator.png", 100, 100);
//            JLabel smallImage2 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\alligator2.png", 200, 200);
//            //TODO handle when image is not loaded
//        }
//
//
//
//
//
//        ////
//        // יצירת פאנל מותאם אישית
////        BackgroundPanel backgroundPanel = new BackgroundPanel();
////        backgroundPanel.setLayout(null);
//
////        smallImage1 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",250,0 );
////        smallImage2 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",0,0);
////
////        setLayout(null);
////        add(smallImage1);
////        add(smallImage2);
//
//
//
//
//
//
//
//
//
//        setLayout(new BorderLayout());
//
//
//        // Buttons Panel
//        JPanel buttonsPanel = new JPanel();
//        buttonsPanel.setLayout(new GridLayout(1, 6));
//        buttonsPanel.setPreferredSize(new Dimension(getWidth(), buttonsPanelHeight));
//
//        // AddCompetition Button
//        JButton addCompetitionButton = new JButton("Add Competition");
//        addCompetitionButton.addActionListener(e -> addCompetition());
//        buttonsPanel.add(addCompetitionButton);
//
//        // AddAnimal Button
//        JButton addAnimalButton = new JButton("Add Animal");
//        addAnimalButton.addActionListener(e -> addAnimal());
//        buttonsPanel.add(addAnimalButton);
//
//        // Clear Button
//        JButton clearButton = new JButton("Clear");
//        clearButton.addActionListener(e -> clearAnimals());
//        buttonsPanel.add(clearButton);
//
//        // Eat Button
//        JButton eatButton = new JButton("Eat");
//        eatButton.addActionListener(e -> eatAnimal());
//        buttonsPanel.add(eatButton);
//
//        // Info Button
//        JButton infoButton = new JButton("Info");
//        infoButton.addActionListener(e -> showInfo());
//        buttonsPanel.add(infoButton);
//
//        // Exit Button
//        JButton exitButton = new JButton("Exit");
//        exitButton.addActionListener(e -> System.exit(0));
//        buttonsPanel.add(exitButton);
//
//        add(buttonsPanel, BorderLayout.SOUTH);
//
//
//    }
//
//
//
//
//
//
//
////    private JLabel createImageLabel(String imagePath, int x, int y) {
////
////        ImageIcon icon = resizeImageIcon(imagePath, 65, 65);
////        JLabel label = new JLabel(icon);
////        label.setBounds(x, y, 65, 65);
////        return label;
////    }
//
//    private ImageIcon resizeImageIcon(String imagePath, int width, int height) {
//        try {
//            BufferedImage originalImage = ImageIO.read(new File(imagePath));
//            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
//            return new ImageIcon(resizedImage);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        int availableHeight = getHeight() - buttonsPanelHeight;
//
//        // Draw the background image
//        if (backgroundImage != null) {
//            g.drawImage(backgroundImage, 0, 0, getWidth(), availableHeight, this);
//        } else {
//            System.out.println("Background image not loaded.");
//        }
//    }
//
//
//
//
//
//
//    private void clearAnimals() {
////        // Clear all animals from the panel
////        animals.clear();
////        repaint();
////        JOptionPane.showMessageDialog(this, "All animals cleared.");
//    }
//
//    private void increaseEnergy(JFrame frame,String energy) throws IllegalStateException
//    {
//        if(participates == null)
//        {
//            throw new IllegalStateException("Participants array is null.");
//        }
//        int participatesLen = participates.length;
//        if(participatesLen == 0)
//        {
//            throw new IllegalStateException("Participants array is empty.");
//        }
//        else{
//            System.out.println("before: " + participates[participatesLen - 1].getCurrentEnergy());
//            if(participates[participatesLen - 1].eat(Integer.parseInt(energy))) {
//                JOptionPane.showMessageDialog(frame, "Animal was fed successfully.\ncurrent " +
//                participates[participatesLen - 1].getType() + " energy: " + participates[participatesLen - 1].getCurrentEnergy(),
//                participates[participatesLen - 1].getType() + " Feeding", JOptionPane.INFORMATION_MESSAGE);
//            }
//
////            System.out.println("after: " + participates[participatesLen - 1].getCurrentEnergy());
//
//
//        }
//
//
//
//
//        frame.dispose();
//    }
//    //TODO check what methods throw exceptions and add try catch
//
//    private void eatAnimal() {
//
//
//        JFrame frame = new JFrame("Feed Animal");
//        frame.setSize(500, 200);
//        frame.setLayout(new BorderLayout());
//
//
//        if(participates == null)
//        {
//            JOptionPane.showMessageDialog(frame, "No participate yet", "Invalid operation", JOptionPane.WARNING_MESSAGE);
//        }
//        else {
//
//
//            JLabel foodEnergyLabel = new JLabel("Enter an integer to increase the animal's energy level\n");
//            foodEnergyLabel.setFont(new Font("Arial", Font.PLAIN, 15));
//
//            JFormattedTextField foodEnergyField = new JFormattedTextField(createNumberFormatter());
//            foodEnergyField.setColumns(20);
//            JButton updateEnergy = new JButton("update energy");
//            updateEnergy.setFont(new Font("Arial", Font.BOLD, 14)); //TODO here is the button font. change in rest
//            updateEnergy.addActionListener(e ->
//            {
//                try {
//                    increaseEnergy(frame, foodEnergyField.getText());
//                } catch (IllegalStateException exception) {
//                    JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//                }
//
//            });
//
//            // Create and configure panel for layout
//            JPanel fieldsPanel = new JPanel();
//            fieldsPanel.setLayout(new GridBagLayout());
//            GridBagConstraints gbc = new GridBagConstraints();
//            gbc.insets = new Insets(10, 10, 10, 10); // Add padding around components
//
//            // Add label
//            gbc.gridx = 0;
//            gbc.gridy = 0;
//            gbc.anchor = GridBagConstraints.WEST;
//            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
//            fieldsPanel.add(foodEnergyLabel, gbc);
//
//            // Add text field
//            gbc.gridy = 1;
//            gbc.anchor = GridBagConstraints.CENTER;
//            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
//            fieldsPanel.add(foodEnergyField, gbc);
//
//            // Add button
//            gbc.gridy = 2;
//            gbc.anchor = GridBagConstraints.CENTER;
//            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
//            fieldsPanel.add(updateEnergy, gbc);
//
//            // Add panel to frame
//            frame.add(fieldsPanel, BorderLayout.CENTER);
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//        }
//
//    }
//
//
//    private Object [][] buildCompetitionTableData(int columns, JFrame frame)//cols are 8
//    {
//        Object[][] CompetitionTableData = null;
//        if(columns == 0 || participates == null)
//        {
//            JOptionPane.showMessageDialog(frame, "No participate yet", "Invalid operation", JOptionPane.WARNING_MESSAGE);
//        }
//        else {
//            int rows = participates.length;
//            CompetitionTableData = new Object[rows][columns];
//            for (int i = 0; i < rows; ++i) {
//                CompetitionTableData[i][columns - 8] = participates[i].getAnimalName();
//                CompetitionTableData[i][columns - 7] = participates[i].getType();
//                CompetitionTableData[i][columns - 6] = participates[i].getCategory();
//                CompetitionTableData[i][columns - 5] = participates[i].getSpeed();
//                CompetitionTableData[i][columns - 4] = participates[i].getAnimalName();
//                CompetitionTableData[i][columns - 3] = participates[i].getTotalDistance();
//                CompetitionTableData[i][columns - 2] = participates[i].getAnimalName();
//                CompetitionTableData[i][columns - 1] = participates[i].getAnimalName();
//            }
//        }
//        return CompetitionTableData;
//
//    }
//
//
//    private void showInfo() {
//
//        JFrame frame = new JFrame("Participate Animals Information");
//        frame.setSize(900, 200);
//
//        // Create column names
//        String[] columnNames = {"Animal", "Category", "Type", "Speed", "Energy", "Amount", "Distance", "Energy Consuming"};
//
//        Object CompetitionTableData[][] = buildCompetitionTableData(columnNames.length, frame);
//
//        JTable table = null;
//        if(CompetitionTableData != null){
//            DefaultTableModel tableModel = new DefaultTableModel(CompetitionTableData, columnNames);
//            table = new JTable(tableModel);
//        }
//        else{
//            // Create data for the table
//            Object[][] data = {
//                    {"John Doe", 25, "New York"},
//                    {"Jane Smith", 30, "Los Angeles"},
//                    {"Sam Brown", 22, "Chicago"},
//                    {"John Doe", 25, "New York"},
//                    {"Jane Smith", 30, "Los Angeles"},
//                    {"Sam Brown", 22, "Chicago"}
//            };
//
//            // Create a table model and set it to the table
//            DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
//            table = new JTable(tableModel);
//
//        }
//
//
//
//        // Customize the table
//        table.setRowHeight(30);
//        table.setFont(new Font("Arial", Font.PLAIN, 12));
//
//
//        // Add the table to a scroll pane
//        JScrollPane scrollPane = new JScrollPane(table);
//        frame.add(scrollPane, BorderLayout.CENTER);
//
//        // Set the frame visible
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//
//    private void addCompetition() {
//
//        JFrame frame = new JFrame("Add competition");
//        frame.setSize(700, 500);
//        BorderLayout borderLayout = new BorderLayout();
//        frame.setLayout(borderLayout);
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//
//        JLabel title = new JLabel("Add Competition");
//        title.setFont(new Font("Arial", Font.BOLD, 24));
//        titlePanel.add(title);
//
//        mainPanel.add(Box.createVerticalStrut(50)); // Adjust height as needed
//
//        JPanel addCompetitionButtons = new JPanel();
//        addCompetitionButtons.setLayout(new FlowLayout());//6, 5
//        addCompetitionButtons.setPreferredSize(new Dimension(600, 50));
//
//        JButton water = new JButton("Water");
//        JButton air = new JButton("Air");
//        JButton terrestrial = new JButton("Terrestrial");
//
//        water.setPreferredSize(new Dimension(100, 30));
//        air.setPreferredSize(new Dimension(100, 30));
//        terrestrial.setPreferredSize(new Dimension(100, 30));
//
//        water.addActionListener(e -> setCompetitionType(1, frame));
//        air.addActionListener(e -> setCompetitionType(2, frame));
//        terrestrial.addActionListener(e -> setCompetitionType(3, frame));
//
//
//        addCompetitionButtons.add(water);
//        addCompetitionButtons.add(air);
//        addCompetitionButtons.add(terrestrial);
//
//        mainPanel.add(titlePanel);
//        mainPanel.add(addCompetitionButtons);
//        frame.add(mainPanel, BorderLayout.CENTER);
//        frame.setLocationRelativeTo(null);
//
//        frame.setVisible(true);
//
//    }
//
//    private void setCompetitionType(int type, JFrame frame) {
//        competitionType = type;
//        frame.dispose();
//        System.out.println("type: " + competitionType);
//    }
//
//
//    private void handleAnimalSelection(int type, JFrame frame) {
//        if (competitionType == 0) {
//            JOptionPane.showMessageDialog(frame, "Must select competition type before selecting animal", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return; // Prevent form submission
//        }
//
//        animalType = type;
//        if(!IsValidAnimalTypeFields())
//            performMessageDialog(frame);
//        frame.dispose();
//        if(IsValidAnimalTypeFields())
//            buildAnimal();
//
//    }
//
//    private String getAnimalStringType(int type) {
//        switch (type) {
//            case 1:
//                return "Alligator";
//            case 2:
//                return "Cat";
//            case 3:
//                return "Dog";
//            case 4:
//                return "Dolphin";
//            case 5:
//                return "Eagle";
//            case 6:
//                return "Pigeon";
//            case 7:
//                return "Snake";
//            case 8:
//                return "Whale";
//            default:
//                throw new IllegalArgumentException();
//        }
//    }
//
//
//
//    private NumberFormatter createNumberFormatter() {
//        NumberFormat format = NumberFormat.getIntegerInstance();
//
//        NumberFormatter formatter = new NumberFormatter(format);
//        format.setGroupingUsed(false);
//        formatter.setMinimum(1);
//        formatter.setAllowsInvalid(false); // Prevent invalid input
//        return formatter;
//    }
//
//    private int convertCategoryToInt(String category) throws IllegalArgumentException
//    {
//        if(category.equals("Water"))
//            return 1;
//        else if(category.equals("Air"))
//            return 2;
//        else if(category.equals("Terrestrial"))
//            return 3;
//
//        throw new IllegalArgumentException("Invalid category: " + category);
//    }
//
//
//    private int convertTypeToInt(String type) throws IllegalArgumentException
//    {
//
//        if(type.equals("Alligator"))
//            return 1;
//        else if(type.equals("Cat"))
//            return 2;
//        else if(type.equals("Dog"))
//            return 3;
//        else if(type.equals("Dolphin"))
//            return 4;
//        else if(type.equals("Eagle"))
//            return 5;
//        else if(type.equals("Pigeon"))
//            return 6;
//        else if(type.equals("Snake"))
//            return 7;
//        else if(type.equals("Whale"))
//            return 8;
//
//        throw new IllegalArgumentException("Invalid category: " + type);
//    }
//
//
//
//
//
//
//
//    private void addAnimal() {
//        JFrame frame = new JFrame("Add Animal");
//        frame.setSize(700, 500);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//
//        // Title panel
//        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
//        JLabel title = new JLabel("Add Animal");
//        title.setFont(new Font("Arial", Font.BOLD, 24));
//        titlePanel.add(title);
//
//        mainPanel.add(Box.createVerticalStrut(20)); // Space before title
//        mainPanel.add(titlePanel);
//
//        // Create row panels with FlowLayout
//        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
//
//        // Create buttons
//        JButton alligator = new JButton("Alligator");
//        JButton cat = new JButton("Cat");
//        JButton dog = new JButton("Dog");
//        JButton dolphin = new JButton("Dolphin");
//        JButton eagle = new JButton("Eagle");
//        JButton pigeon = new JButton("Pigeon");
//        JButton snake = new JButton("Snake");
//        JButton whale = new JButton("Whale");
//
//
//
//
//        alligator.addActionListener(e -> handleAnimalSelection(1, frame));
//        cat.addActionListener(e -> handleAnimalSelection(2, frame));
//        dog.addActionListener(e -> handleAnimalSelection(3, frame));
//        dolphin.addActionListener(e -> handleAnimalSelection(4, frame));
//        eagle.addActionListener(e -> handleAnimalSelection(5, frame));
//        pigeon.addActionListener(e -> handleAnimalSelection(6, frame));
//        snake.addActionListener(e -> handleAnimalSelection(7, frame));
//        whale.addActionListener(e -> handleAnimalSelection(8, frame));
//
//
//
//        // Set consistent button size
//        Dimension buttonSize = new Dimension(100, 30); // Adjust button size as needed
//        alligator.setPreferredSize(buttonSize);
//        cat.setPreferredSize(buttonSize);
//        dog.setPreferredSize(buttonSize);
//        dolphin.setPreferredSize(buttonSize);
//        eagle.setPreferredSize(buttonSize);
//        pigeon.setPreferredSize(buttonSize);
//        snake.setPreferredSize(buttonSize);
//        whale.setPreferredSize(buttonSize);
//
//        // Add buttons to rows
//        row1.add(alligator);
//        row1.add(cat);
//        row1.add(dog);
//        row1.add(dolphin);
//
//        row2.add(eagle);
//        row2.add(pigeon);
//        row2.add(snake);
//        row2.add(whale);
//
//        // Add vertical space between rows
//        int rowGap = 1; // Same as button gap
//        row1.setBorder(BorderFactory.createEmptyBorder(0, 0, rowGap, 0));
//        row2.setBorder(BorderFactory.createEmptyBorder(rowGap, 0, 0, 0));
//
//        // Button panel to stack rows vertically
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
//        buttonPanel.add(row1);
//        buttonPanel.add(row2);
//
//        // Add the button panel to the main panel
//        mainPanel.add(Box.createVerticalStrut(20)); // Space before buttons
//        mainPanel.add(buttonPanel);
//
//        frame.add(mainPanel, BorderLayout.CENTER);
//        frame.setLocationRelativeTo(null); // Center the window
//        frame.dispose();
//        frame.setVisible(true);
//
//
//    }
//
//
//
//
//
//
//
//    private boolean IsValidAnimalType(int competitionType, int animalType)
//    {
//        System.out.println("competitionType: " +competitionType + " animalType " + animalType);
//
//        //Alligator is Water Animal and Terrestrial
//        if (animalType == 1 && (competitionType == 1 || competitionType == 3))
//            return true;
//
//        //only Dolphin and Wale(and Alligator) are Water Animal
//        if (competitionType == 1) {
//            if (animalType == 4 || animalType == 8)
//                return true;
//        }
//        //only Eagle and Pigeon are Air Animal
//        else if (competitionType == 2) {
//            if (animalType == 5 || animalType == 6)
//                return true;
//        }
//        //only Dog, Cat and Snake are Terrestrial Animal
//        else if (competitionType == 3) {
//            if (animalType == 2 || animalType == 3 || animalType == 7)
//                return true;
//        }
//        return false;
//    }
//    private boolean IsValidAnimalTypeFields() {
//        return IsValidAnimalType(competitionType, animalType);
//    }
//
//
//    private void performMessageDialog(JFrame frame) {
//        String message = "";
//
//        if (competitionType == 1) {
//            message = String.format("%s is not a Water Animal", getAnimalStringType(animalType));
//
//        } else if (competitionType == 2) {
//            message = String.format("%s is not an Air Animal", getAnimalStringType(animalType));
//
//        } else if (competitionType == 3) {
//            message = String.format("%s is not a Terrestrial Animal", getAnimalStringType(animalType));
//
//        }
//        JOptionPane.showMessageDialog(frame, message, "Input Values", JOptionPane.INFORMATION_MESSAGE);
//    }
//
//
//    private Animal createSpecificAnimal(int selectedCategoryInt, int selectedTypeInt,String name, int speedInt,int energyPerMeterInt, int maxEnergyInt){
//
//        Animal animalObj = null;
//
//
//        switch (selectedCategoryInt) {
//            case 1: {
//
//
//                switch (selectedTypeInt) {
//
//                    case 1: {
//                        animalObj = new Alligator(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//
//                    }
//                    case 2: {
//                        animalObj = new Whale(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//
//
//                    }
//                    case 3: {
//                        animalObj = new Dolphin(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//
//                    }
//                    default:
//                        System.out.println("Error");
//                }
//                break;
//            }
//            case 2: {
//
//
//                switch (selectedTypeInt) {
//                    case 1: {
//                        animalObj = new Eagle(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//
//                    }
//                    case 2: {
//                        animalObj = new Pigeon(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//                    }
//                    default:
//                        System.out.println("Error");
//
//                }
//                break;
//            }
//            case 3: {
//
//                switch (selectedTypeInt) {
//                    case 1: {
//                        animalObj = new Dog(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//
//                    }
//                    case 2: {
//                        animalObj = new Cat(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//                    }
//                    case 3: {
//                        animalObj = new Snake(name, speedInt,energyPerMeterInt, maxEnergyInt);
//                        break;
//                    }
//                    default:
//                        System.out.println("Error");
//                }
//                break;
//            }
//            default:
//                System.out.println("Error");
//        }
//
//        return animalObj;
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    private void buildAnimal() {
//        String animalStringType = getAnimalStringType(animalType);
//        JFrame frame = new JFrame(animalStringType);
//        frame.setSize(700, 500);
//        frame.setLayout(new BorderLayout(10, 10));
//
//        JPanel fieldsPanel = showAnimalForm(frame, animalStringType);
//        addSubmitButton(fieldsPanel, frame);
//
//        frame.setLocationRelativeTo(null);
//        frame.setVisible(true);
//    }
//
//    private JPanel showAnimalForm(JFrame frame, String animalStringType) {
//        JPanel fieldsPanel = new JPanel();
//        fieldsPanel.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.insets = new Insets(10, 10, 10, 10);
//        gbc.anchor = GridBagConstraints.WEST;
//
//        JLabel nameLabel = new JLabel("Name:");
//        JTextField nameField = new JTextField(20);
//
//        JLabel categoryLabel = new JLabel("Category:");
//        String[] categoryOptions = {"Water", "Air", "Terrestrial"};
//        JComboBox<String> categoryComboBox = new JComboBox<>(categoryOptions);
//        categoryComboBox.setPreferredSize(new Dimension(200, 30));
//
//        JLabel typeLabel = new JLabel("Type:");
//        String[] typeOptions = {"Alligator", "Cat", "Dog", "Dolphin", "Eagle", "Pigeon", "Snake", "Whale"};
//        JComboBox<String> typeComboBox = new JComboBox<>(typeOptions);
//        typeComboBox.setPreferredSize(new Dimension(200, 30));
//
//        JLabel speedLabel = new JLabel("Speed:");
//        JFormattedTextField speedField = new JFormattedTextField(createNumberFormatter());
//        speedField.setColumns(20);
//
//        JLabel energyPerMeterLabel = new JLabel("Energy Per Meter:");
//        JFormattedTextField energyPerMeterField = new JFormattedTextField(createNumberFormatter());
//        energyPerMeterField.setColumns(20);
//
//        JLabel maxEnergyLabel = new JLabel("Max Energy:");
//        JFormattedTextField maxEnergyField = new JFormattedTextField(createNumberFormatter());
//        maxEnergyField.setColumns(20);
//
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        fieldsPanel.add(nameLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(nameField, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 1;
//        fieldsPanel.add(categoryLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(categoryComboBox, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 2;
//        fieldsPanel.add(typeLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(typeComboBox, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 3;
//        fieldsPanel.add(speedLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(speedField, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 4;
//        fieldsPanel.add(energyPerMeterLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(energyPerMeterField, gbc);
//
//        gbc.gridx = 0;
//        gbc.gridy = 5;
//        fieldsPanel.add(maxEnergyLabel, gbc);
//        gbc.gridx = 1;
//        fieldsPanel.add(maxEnergyField, gbc);
//
//        frame.add(fieldsPanel, BorderLayout.CENTER);
//
//        return fieldsPanel;
//    }
//
//    private void addAnimalToCompetition(Animal animal)
//    {
//        if (animal == null) {
//            System.out.println("Animal creation failed. Cannot add null animal to the competition.");
//            return;
//        }
//
//
//        if(participates == null)
//        {
//            participates = new Animal[1];
//            participates[0] = animal;
//        }
//        else{
//            int len = participates.length;
//            Animal[] tmp = new Animal[len + 1];
//            for(int i=0; i<len; ++i)
//            {
//                tmp[i] = participates[i];
//            }
//            tmp[len] = animal;
//            participates = tmp;
//        }
//
//
////        System.out.println("----------------------");
////        for(int i=0; i<participates.length; ++i)
////        {
////            System.out.println(participates[i].toString());
////        }
////        System.out.println("----------------------");
//
//    }
//
//    private void addAnimalToScreen()
//    {
//        smallImage1 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",250,0 );
//        smallImage2 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",0,0);
//
//        setLayout(null);
//        add(smallImage1);
//        add(smallImage2);
//    }
//
//
//    private JLabel createImageLabel(String imagePath, int x, int y) {
//        // Create an ImageIcon from the image path
//        ImageIcon icon = new ImageIcon(imagePath);
//
//        // Create a JLabel with the icon
//        JLabel label = new JLabel(icon);
//
//        // Set the position of the label
//        label.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());
//
//        return label;
//    }
//
//
//
//
//
//    private JPanel createBackgroundPanel() {
//        // Create a JLabel with the background image
//        JLabel backgroundLabel = new JLabel(new ImageIcon("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\background.png"));
//
//        // Create a JPanel with null layout
//        JPanel backgroundPanel = new JPanel(null); // Use null layout for manual positioning
//
//        // Add the background image to the panel
//        backgroundPanel.add(backgroundLabel);
//
//        // Set the size of the panel to the size of the background image
//        backgroundPanel.setPreferredSize(new Dimension(backgroundLabel.getIcon().getIconWidth(), backgroundLabel.getIcon().getIconHeight()));
//
//        return backgroundPanel;
//    }
//
//
//
//
//
//
//
////    private void displayAnimalImage(JFrame frame, Animal animal) {
////        String animalImageName = getAnimalImageName(animal); // Get the image name based on the animal
////        ImageIcon animalImageIcon = new ImageIcon(getClass().getResource("/resources/images/" + animalImageName));
////
////        JLabel imageLabel = new JLabel(animalImageIcon);
////        JPanel imagePanel = new JPanel();
////        imagePanel.add(imageLabel);
////
////        frame.add(imagePanel, BorderLayout.SOUTH); // Add the image panel to the bottom of the frame
////        frame.revalidate(); // Refresh the frame to show the new image
////        frame.repaint();
////    }
////
////    private String getAnimalImageName(Animal animal) {
////        // Return the appropriate image file name based on the animal's type
////        if (animal.getType() ==  "Alligator") return "alligator.png";
////        if (animal.getType() == "Cat") return "cat.png";
////        if (animal.getType() == "Dog") return "dog.png";
////        if (animal.getType() == "Dolphin") return "dolphin.png";
////        if (animal.getType() == "Eagle") return "eagle.png";
////        if (animal.getType() == "Pigeon") return "pigeon.png";
////        if (animal.getType() == "Snake") return "snake.png";
////        if (animal.getType() == "Whale") return "whale.png";
////        return "default.png"; // Fallback image
////    }
//
//
//
//
//
//    private void addSubmitButton(JPanel fieldsPanel, JFrame frame) {
//        JButton submitButton = new JButton("Create");
//        submitButton.addActionListener(e -> {
//            Animal animal = getAnimalInput(frame, fieldsPanel);
//
//            if (animal != null) {
//                addAnimalToCompetition(animal);
//            }
//            frame.dispose();
//            addAnimalToScreen();
//        });
//
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 1;
//        gbc.gridy = 6;
//        gbc.gridwidth = 1;
//        fieldsPanel.add(submitButton, gbc);
//    }
//
//    private Animal getAnimalInput(JFrame frame, JPanel fieldsPanel) {
//        JTextField nameField = (JTextField) fieldsPanel.getComponent(1);
//        JComboBox<String> categoryComboBox = (JComboBox<String>) fieldsPanel.getComponent(3);
//        JComboBox<String> typeComboBox = (JComboBox<String>) fieldsPanel.getComponent(5);
//        JFormattedTextField speedField = (JFormattedTextField) fieldsPanel.getComponent(7);
//        JFormattedTextField energyPerMeterField = (JFormattedTextField) fieldsPanel.getComponent(9);
//        JFormattedTextField maxEnergyField = (JFormattedTextField) fieldsPanel.getComponent(11);
//
//        String name = nameField.getText();
//        String selectedCategory = (String) categoryComboBox.getSelectedItem();
//        String selectedType = (String) typeComboBox.getSelectedItem();
//        String speed = speedField.getText();
//        String energyPerMeter = energyPerMeterField.getText();
//        String maxEnergy = maxEnergyField.getText();
//
//        int selectedCategoryInt = 0;
//        int selectedTypeInt = 0;
//        int speedInt = 0;
//        int energyPerMeterInt = 0;
//        int maxEnergyInt = 0;
//
//        try {
//            selectedCategoryInt = convertCategoryToInt(selectedCategory);
//        } catch (IllegalArgumentException exception) {
//            JOptionPane.showMessageDialog(frame, exception.getMessage(), "Invalid Category", JOptionPane.ERROR_MESSAGE);
//        }
//
//        try {
//            selectedTypeInt = convertTypeToInt(selectedType);
//        } catch (IllegalArgumentException exception) {
//            JOptionPane.showMessageDialog(frame, exception.getMessage(), "Invalid Type", JOptionPane.ERROR_MESSAGE);
//        }
//
//        try {
//            speedInt = Integer.parseInt(speed);
//            energyPerMeterInt = Integer.parseInt(energyPerMeter);
//            maxEnergyInt = Integer.parseInt(maxEnergy);
//        } catch (NumberFormatException exception) {
//            JOptionPane.showMessageDialog(frame, "Invalid Speed", "Invalid Input", JOptionPane.ERROR_MESSAGE);
//        }
//
//        if (name.isEmpty() || selectedCategory.isEmpty() || selectedType.isEmpty() || speed.isEmpty() || maxEnergy.isEmpty()) {
//            JOptionPane.showMessageDialog(frame, "Not all fields have been filled.", "Input Error", JOptionPane.ERROR_MESSAGE);
//            return null;
//        }
//
//        if (!IsValidAnimalType(selectedCategoryInt, selectedTypeInt)) {
//            performMessageDialog(frame);
//            return null;
//        }
//
//        return createAnimal(selectedCategoryInt, selectedTypeInt, name, speedInt, energyPerMeterInt, maxEnergyInt);
//    }
//
//    private Animal createAnimal(int selectedCategoryInt, int selectedTypeInt, String name, int speedInt, int energyPerMeterInt, int maxEnergyInt) {
//        Animal animalObj = null;
//
//        switch (selectedCategoryInt) {
//            case 1: // Water
//                switch (selectedTypeInt) {
//                    case 1:
//                        animalObj = new Alligator(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    case 4:
//                        animalObj = new Dolphin(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    case 8:
//                        animalObj = new Whale(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    default:
//                        throw new IllegalArgumentException("Invalid Water Animal Type");
//                }
//                break;
//            case 2: // Air
//                switch (selectedTypeInt) {
//                    case 5:
//                        animalObj = new Eagle(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    case 6:
//                        animalObj = new Pigeon(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    default:
//                        throw new IllegalArgumentException("Invalid Air Animal Type");
//                }
//                break;
//            case 3: // Terrestrial
//                switch (selectedTypeInt) {
//                    case 2:
//                        animalObj = new Cat(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    case 3:
//                        animalObj = new Dog(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    case 7:
//                        animalObj = new Snake(name, speedInt, energyPerMeterInt, maxEnergyInt);
//                        break;
//                    default:
//                        throw new IllegalArgumentException("Invalid Terrestrial Animal Type");
//                }
//                break;
//            default:
//                throw new IllegalArgumentException("Invalid Category");
//        }
//
//        addAnimalToScreen();
//        return animalObj;
//    }
//
//
//
//
//}
//
//
//
//
package Graphics;

import Animals.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class CompetitionPanel extends JPanel  {
    private Image backgroundImage;
    private final List<Image> additionalImages;
    private int competitionType;    //1 - water, 2 - air, 3 - terrestrial
    private int animalType;         //1 - Alligator, 2 - Cat, 3 - Dog, 4 - Dolphin, 5- Eagle, 6 - Pigeon, 7 - Snake, 8 - Whale

    private Animal[] participates;
    private int buttonsPanelHeight = 30;

    private JLabel smallImage1;
    private JLabel smallImage2;


    public CompetitionPanel() {
        additionalImages = new ArrayList<>();
        loadImage("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Images\\competitionBackground2.png");
    }

    private void loadImage(String path) {
        try {
            backgroundImage = new ImageIcon(path).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        repaint();
    }

    public void addImage(String path) {
        try {
            Image newImage = new ImageIcon(path).getImage();
            additionalImages.add(newImage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
        for (Image img : additionalImages) {
            g.drawImage(img, 0, 0, this);
        }
    }

    public void openImageSelectionDialog() {
        String[] options = {"Option 1", "Option 2"};
        int choice = JOptionPane.showOptionDialog(
                this,
                "Choose an image:",
                "Image Selection",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
        );

        switch (choice) {
            case 0:
                addImage("C:\\Users\\Student\\IdeaProjects\\stam\\src\\image1.png");
                break;
            case 1:
                addImage("C:\\Users\\Student\\IdeaProjects\\stam\\src\\image2.png");
                break;
            default:
                // Do nothing if the user closes the dialog without choosing an option
                break;
        }
    }

    public void addCompetition() {

        JFrame frame = new JFrame("Add competition");
        frame.setSize(700, 500);
        BorderLayout borderLayout = new BorderLayout();
        frame.setLayout(borderLayout);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JLabel title = new JLabel("Add Competition");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(title);

        mainPanel.add(Box.createVerticalStrut(50)); // Adjust height as needed

        JPanel addCompetitionButtons = new JPanel();
        addCompetitionButtons.setLayout(new FlowLayout());//6, 5
        addCompetitionButtons.setPreferredSize(new Dimension(600, 50));

        JButton water = new JButton("Water");
        JButton air = new JButton("Air");
        JButton terrestrial = new JButton("Terrestrial");

        water.setPreferredSize(new Dimension(100, 30));
        air.setPreferredSize(new Dimension(100, 30));
        terrestrial.setPreferredSize(new Dimension(100, 30));

        water.addActionListener(e -> setCompetitionType(1, frame));
        air.addActionListener(e -> setCompetitionType(2, frame));
        terrestrial.addActionListener(e -> setCompetitionType(3, frame));


        addCompetitionButtons.add(water);
        addCompetitionButtons.add(air);
        addCompetitionButtons.add(terrestrial);

        mainPanel.add(titlePanel);
        mainPanel.add(addCompetitionButtons);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }

    private void setCompetitionType(int type, JFrame frame) {
        competitionType = type;
        frame.dispose();
        System.out.println("type: " + competitionType);
    }

    public void addAnimal() {
        JFrame frame = new JFrame("Add Animal");
        frame.setSize(700, 500);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Title panel
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel title = new JLabel("Add Animal");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(title);

        mainPanel.add(Box.createVerticalStrut(20)); // Space before title
        mainPanel.add(titlePanel);

        // Create row panels with FlowLayout
        JPanel row1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JPanel row2 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Create buttons
        JButton alligator = new JButton("Alligator");
        JButton cat = new JButton("Cat");
        JButton dog = new JButton("Dog");
        JButton dolphin = new JButton("Dolphin");
        JButton eagle = new JButton("Eagle");
        JButton pigeon = new JButton("Pigeon");
        JButton snake = new JButton("Snake");
        JButton whale = new JButton("Whale");




        alligator.addActionListener(e -> handleAnimalSelection(1, frame));
        cat.addActionListener(e -> handleAnimalSelection(2, frame));
        dog.addActionListener(e -> handleAnimalSelection(3, frame));
        dolphin.addActionListener(e -> handleAnimalSelection(4, frame));
        eagle.addActionListener(e -> handleAnimalSelection(5, frame));
        pigeon.addActionListener(e -> handleAnimalSelection(6, frame));
        snake.addActionListener(e -> handleAnimalSelection(7, frame));
        whale.addActionListener(e -> handleAnimalSelection(8, frame));



        // Set consistent button size
        Dimension buttonSize = new Dimension(100, 30); // Adjust button size as needed
        alligator.setPreferredSize(buttonSize);
        cat.setPreferredSize(buttonSize);
        dog.setPreferredSize(buttonSize);
        dolphin.setPreferredSize(buttonSize);
        eagle.setPreferredSize(buttonSize);
        pigeon.setPreferredSize(buttonSize);
        snake.setPreferredSize(buttonSize);
        whale.setPreferredSize(buttonSize);

        // Add buttons to rows
        row1.add(alligator);
        row1.add(cat);
        row1.add(dog);
        row1.add(dolphin);

        row2.add(eagle);
        row2.add(pigeon);
        row2.add(snake);
        row2.add(whale);

        // Add vertical space between rows
        int rowGap = 1; // Same as button gap
        row1.setBorder(BorderFactory.createEmptyBorder(0, 0, rowGap, 0));
        row2.setBorder(BorderFactory.createEmptyBorder(rowGap, 0, 0, 0));

        // Button panel to stack rows vertically
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.add(row1);
        buttonPanel.add(row2);

        // Add the button panel to the main panel
        mainPanel.add(Box.createVerticalStrut(20)); // Space before buttons
        mainPanel.add(buttonPanel);

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); // Center the window
        frame.dispose();
        frame.setVisible(true);


    }

    private void handleAnimalSelection(int type, JFrame frame) {
        if (competitionType == 0) {
            JOptionPane.showMessageDialog(frame, "Must select competition type before selecting animal", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; // Prevent form submission
        }

        animalType = type;
        if(!IsValidAnimalTypeFields())
            performMessageDialog(frame);
        frame.dispose();
        if(IsValidAnimalTypeFields())
            buildAnimal();

    }

    private void performMessageDialog(JFrame frame) {
        String message = "";

        if (competitionType == 1) {
            message = String.format("%s is not a Water Animal", getAnimalStringType(animalType));

        } else if (competitionType == 2) {
            message = String.format("%s is not an Air Animal", getAnimalStringType(animalType));

        } else if (competitionType == 3) {
            message = String.format("%s is not a Terrestrial Animal", getAnimalStringType(animalType));

        }
        JOptionPane.showMessageDialog(frame, message, "Input Values", JOptionPane.INFORMATION_MESSAGE);
    }

    private boolean IsValidAnimalTypeFields() {
        return IsValidAnimalType(competitionType, animalType);
    }

    private boolean IsValidAnimalType(int competitionType, int animalType)
    {
        System.out.println("competitionType: " +competitionType + " animalType " + animalType);

        //Alligator is Water Animal and Terrestrial
        if (animalType == 1 && (competitionType == 1 || competitionType == 3))
            return true;

        //only Dolphin and Wale(and Alligator) are Water Animal
        if (competitionType == 1) {
            if (animalType == 4 || animalType == 8)
                return true;
        }
        //only Eagle and Pigeon are Air Animal
        else if (competitionType == 2) {
            if (animalType == 5 || animalType == 6)
                return true;
        }
        //only Dog, Cat and Snake are Terrestrial Animal
        else if (competitionType == 3) {
            if (animalType == 2 || animalType == 3 || animalType == 7)
                return true;
        }
        return false;
    }

    private void buildAnimal() {
        String animalStringType = getAnimalStringType(animalType);
        JFrame frame = new JFrame(animalStringType);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout(10, 10));

        JPanel fieldsPanel = showAnimalForm(frame, animalStringType);
        addSubmitButton(fieldsPanel, frame);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private String getAnimalStringType(int type) {
        switch (type) {
            case 1:
                return "Alligator";
            case 2:
                return "Cat";
            case 3:
                return "Dog";
            case 4:
                return "Dolphin";
            case 5:
                return "Eagle";
            case 6:
                return "Pigeon";
            case 7:
                return "Snake";
            case 8:
                return "Whale";
            default:
                throw new IllegalArgumentException();
        }
    }

    private JPanel showAnimalForm(JFrame frame, String animalStringType) {
        JPanel fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel categoryLabel = new JLabel("Category:");
        String[] categoryOptions = {"Water", "Air", "Terrestrial"};
        JComboBox<String> categoryComboBox = new JComboBox<>(categoryOptions);
        categoryComboBox.setPreferredSize(new Dimension(200, 30));

        JLabel typeLabel = new JLabel("Type:");
        String[] typeOptions = {"Alligator", "Cat", "Dog", "Dolphin", "Eagle", "Pigeon", "Snake", "Whale"};
        JComboBox<String> typeComboBox = new JComboBox<>(typeOptions);
        typeComboBox.setPreferredSize(new Dimension(200, 30));

        JLabel speedLabel = new JLabel("Speed:");
        JFormattedTextField speedField = new JFormattedTextField(createNumberFormatter());
        speedField.setColumns(20);

        JLabel energyPerMeterLabel = new JLabel("Energy Per Meter:");
        JFormattedTextField energyPerMeterField = new JFormattedTextField(createNumberFormatter());
        energyPerMeterField.setColumns(20);

        JLabel maxEnergyLabel = new JLabel("Max Energy:");
        JFormattedTextField maxEnergyField = new JFormattedTextField(createNumberFormatter());
        maxEnergyField.setColumns(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        fieldsPanel.add(nameLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        fieldsPanel.add(categoryLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(categoryComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        fieldsPanel.add(typeLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(typeComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        fieldsPanel.add(speedLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(speedField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        fieldsPanel.add(energyPerMeterLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(energyPerMeterField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        fieldsPanel.add(maxEnergyLabel, gbc);
        gbc.gridx = 1;
        fieldsPanel.add(maxEnergyField, gbc);

        frame.add(fieldsPanel, BorderLayout.CENTER);

        return fieldsPanel;
    }

    private NumberFormatter createNumberFormatter() {
        NumberFormat format = NumberFormat.getIntegerInstance();

        NumberFormatter formatter = new NumberFormatter(format);
        format.setGroupingUsed(false);
        formatter.setMinimum(1);
        formatter.setAllowsInvalid(false); // Prevent invalid input
        return formatter;
    }

    private void addSubmitButton(JPanel fieldsPanel, JFrame frame) {
        JButton submitButton = new JButton("Create");
        submitButton.addActionListener(e -> {
            Animal animal = getAnimalInput(frame, fieldsPanel);

            if (animal != null) {
                addAnimalToCompetition(animal);
            }
            frame.dispose();
            addAnimalToScreen(1);
        });

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        fieldsPanel.add(submitButton, gbc);
    }

    private Animal getAnimalInput(JFrame frame, JPanel fieldsPanel) {
        JTextField nameField = (JTextField) fieldsPanel.getComponent(1);
        JComboBox<String> categoryComboBox = (JComboBox<String>) fieldsPanel.getComponent(3);
        JComboBox<String> typeComboBox = (JComboBox<String>) fieldsPanel.getComponent(5);
        JFormattedTextField speedField = (JFormattedTextField) fieldsPanel.getComponent(7);
        JFormattedTextField energyPerMeterField = (JFormattedTextField) fieldsPanel.getComponent(9);
        JFormattedTextField maxEnergyField = (JFormattedTextField) fieldsPanel.getComponent(11);

        String name = nameField.getText();
        String selectedCategory = (String) categoryComboBox.getSelectedItem();
        String selectedType = (String) typeComboBox.getSelectedItem();
        String speed = speedField.getText();
        String energyPerMeter = energyPerMeterField.getText();
        String maxEnergy = maxEnergyField.getText();

        int selectedCategoryInt = 0;
        int selectedTypeInt = 0;
        int speedInt = 0;
        int energyPerMeterInt = 0;
        int maxEnergyInt = 0;

        try {
            selectedCategoryInt = convertCategoryToInt(selectedCategory);
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(frame, exception.getMessage(), "Invalid Category", JOptionPane.ERROR_MESSAGE);
        }

        try {
            selectedTypeInt = convertTypeToInt(selectedType);
        } catch (IllegalArgumentException exception) {
            JOptionPane.showMessageDialog(frame, exception.getMessage(), "Invalid Type", JOptionPane.ERROR_MESSAGE);
        }

        try {
            speedInt = Integer.parseInt(speed);
            energyPerMeterInt = Integer.parseInt(energyPerMeter);
            maxEnergyInt = Integer.parseInt(maxEnergy);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(frame, "Invalid Speed", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }

        if (name.isEmpty() || selectedCategory.isEmpty() || selectedType.isEmpty() || speed.isEmpty() || maxEnergy.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Not all fields have been filled.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        if (!IsValidAnimalType(selectedCategoryInt, selectedTypeInt)) {
            performMessageDialog(frame);
            return null;
        }

        return createAnimal(selectedCategoryInt, selectedTypeInt, name, speedInt, energyPerMeterInt, maxEnergyInt);
    }

    private void addAnimalToCompetition(Animal animal)
    {
        if (animal == null) {
            System.out.println("Animal creation failed. Cannot add null animal to the competition.");
            return;
        }


        if(participates == null)
        {
            participates = new Animal[1];
            participates[0] = animal;
        }
        else{
            int len = participates.length;
            Animal[] tmp = new Animal[len + 1];
            for(int i=0; i<len; ++i)
            {
                tmp[i] = participates[i];
            }
            tmp[len] = animal;
            participates = tmp;
        }


//        System.out.println("----------------------");
//        for(int i=0; i<participates.length; ++i)
//        {
//            System.out.println(participates[i].toString());
//        }
//        System.out.println("----------------------");

    }

    private void addAnimalToScreen(int choice)
    {
//        smallImage1 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",250,0 );
//        smallImage2 = createImageLabel("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Graphics\\cat2.png",0,0);
//
//        setLayout(null);
//        add(smallImage1);
//        add(smallImage2);

        switch (choice) {
            case 0:
                addImage("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Images\\dog1.png");
                break;
            case 1:
                addImage("C:\\Users\\Student\\IdeaProjects\\Zoo-competition\\src\\Images\\cat1.png");
                break;
            default:
                // Do nothing if the user closes the dialog without choosing an option
                break;
        }
    }

    private int convertCategoryToInt(String category) throws IllegalArgumentException
    {
        if(category.equals("Water"))
            return 1;
        else if(category.equals("Air"))
            return 2;
        else if(category.equals("Terrestrial"))
            return 3;

        throw new IllegalArgumentException("Invalid category: " + category);
    }

    private int convertTypeToInt(String type) throws IllegalArgumentException
    {

        if(type.equals("Alligator"))
            return 1;
        else if(type.equals("Cat"))
            return 2;
        else if(type.equals("Dog"))
            return 3;
        else if(type.equals("Dolphin"))
            return 4;
        else if(type.equals("Eagle"))
            return 5;
        else if(type.equals("Pigeon"))
            return 6;
        else if(type.equals("Snake"))
            return 7;
        else if(type.equals("Whale"))
            return 8;

        throw new IllegalArgumentException("Invalid category: " + type);
    }

    private Animal createAnimal(int selectedCategoryInt, int selectedTypeInt, String name, int speedInt, int energyPerMeterInt, int maxEnergyInt) {
        Animal animalObj = null;

        switch (selectedCategoryInt) {
            case 1: // Water
                switch (selectedTypeInt) {
                    case 1:
                        animalObj = new Alligator(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    case 4:
                        animalObj = new Dolphin(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    case 8:
                        animalObj = new Whale(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Water Animal Type");
                }
                break;
            case 2: // Air
                switch (selectedTypeInt) {
                    case 5:
                        animalObj = new Eagle(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    case 6:
                        animalObj = new Pigeon(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Air Animal Type");
                }
                break;
            case 3: // Terrestrial
                switch (selectedTypeInt) {
                    case 2:
                        animalObj = new Cat(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    case 3:
                        animalObj = new Dog(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    case 7:
                        animalObj = new Snake(name, speedInt, energyPerMeterInt, maxEnergyInt);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid Terrestrial Animal Type");
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid Category");
        }

        addAnimalToScreen(1);
        return animalObj;
    }

    private JLabel createImageLabel(String imagePath, int x, int y) {
        // Create an ImageIcon from the image path
        ImageIcon icon = new ImageIcon(imagePath);

        // Create a JLabel with the icon
        JLabel label = new JLabel(icon);

        // Set the position of the label
        label.setBounds(x, y, icon.getIconWidth(), icon.getIconHeight());

        return label;
    }

    public void showInfo() {

        JFrame frame = new JFrame("Participate Animals Information");
        frame.setSize(900, 200);

        // Create column names
        String[] columnNames = {"Animal", "Category", "Type", "Speed", "Energy", "Amount", "Distance", "Energy Consuming"};

        Object CompetitionTableData[][] = buildCompetitionTableData(columnNames.length, frame);

        JTable table = null;
        if(CompetitionTableData != null){
            DefaultTableModel tableModel = new DefaultTableModel(CompetitionTableData, columnNames);
            table = new JTable(tableModel);
        }
        else{
            // Create data for the table
            Object[][] data = {
                    {"John Doe", 25, "New York"},
                    {"Jane Smith", 30, "Los Angeles"},
                    {"Sam Brown", 22, "Chicago"},
                    {"John Doe", 25, "New York"},
                    {"Jane Smith", 30, "Los Angeles"},
                    {"Sam Brown", 22, "Chicago"}
            };

            // Create a table model and set it to the table
            DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
            table = new JTable(tableModel);

        }



        // Customize the table
        table.setRowHeight(30);
        table.setFont(new Font("Arial", Font.PLAIN, 12));


        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set the frame visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private Object [][] buildCompetitionTableData(int columns, JFrame frame)//cols are 8
    {
        Object[][] CompetitionTableData = null;
        if(columns == 0 || participates == null)
        {
            JOptionPane.showMessageDialog(frame, "No participate yet", "Invalid operation", JOptionPane.WARNING_MESSAGE);
        }
        else {
            int rows = participates.length;
            CompetitionTableData = new Object[rows][columns];
            for (int i = 0; i < rows; ++i) {
                CompetitionTableData[i][columns - 8] = participates[i].getAnimalName();
                CompetitionTableData[i][columns - 7] = participates[i].getType();
                CompetitionTableData[i][columns - 6] = participates[i].getCategory();
                CompetitionTableData[i][columns - 5] = participates[i].getSpeed();
                CompetitionTableData[i][columns - 4] = participates[i].getAnimalName();
                CompetitionTableData[i][columns - 3] = participates[i].getTotalDistance();
                CompetitionTableData[i][columns - 2] = participates[i].getAnimalName();
                CompetitionTableData[i][columns - 1] = participates[i].getAnimalName();
            }
        }
        return CompetitionTableData;

    }

    public void clearAnimals() {
//        // Clear all animals from the panel
//        animals.clear();
//        repaint();
//        JOptionPane.showMessageDialog(this, "All animals cleared.");
    }

    private void increaseEnergy(JFrame frame,String energy) throws IllegalStateException
        {
        if(participates == null)
        {
            throw new IllegalStateException("Participants array is null.");
        }
        int participatesLen = participates.length;
        if(participatesLen == 0)
        {
            throw new IllegalStateException("Participants array is empty.");
        }
        else{
            System.out.println("before: " + participates[participatesLen - 1].getCurrentEnergy());
            if(participates[participatesLen - 1].eat(Integer.parseInt(energy))) {
                JOptionPane.showMessageDialog(frame, "Animal was fed successfully.\ncurrent " +
                participates[participatesLen - 1].getType() + " energy: " + participates[participatesLen - 1].getCurrentEnergy(),
                participates[participatesLen - 1].getType() + " Feeding", JOptionPane.INFORMATION_MESSAGE);
            }

//            System.out.println("after: " + participates[participatesLen - 1].getCurrentEnergy());


        }




        frame.dispose();
    }
//    //TODO check what methods throw exceptions and add try catch
    public void eatAnimal() {

        JFrame frame = new JFrame("Feed Animal");
        frame.setSize(500, 200);
        frame.setLayout(new BorderLayout());


        if(participates == null)
        {
            JOptionPane.showMessageDialog(frame, "No participate yet", "Invalid operation", JOptionPane.WARNING_MESSAGE);
        }
        else {


            JLabel foodEnergyLabel = new JLabel("Enter an integer to increase the animal's energy level\n");
            foodEnergyLabel.setFont(new Font("Arial", Font.PLAIN, 15));

            JFormattedTextField foodEnergyField = new JFormattedTextField(createNumberFormatter());
            foodEnergyField.setColumns(20);
            JButton updateEnergy = new JButton("update energy");
            updateEnergy.setFont(new Font("Arial", Font.BOLD, 14)); //TODO here is the button font. change in rest
            updateEnergy.addActionListener(e ->
            {
                try {
                    increaseEnergy(frame, foodEnergyField.getText());
                } catch (IllegalStateException exception) {
                    JOptionPane.showMessageDialog(frame, "An unexpected error occurred: " + exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            });

            // Create and configure panel for layout
            JPanel fieldsPanel = new JPanel();
            fieldsPanel.setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(10, 10, 10, 10); // Add padding around components

            // Add label
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
            fieldsPanel.add(foodEnergyLabel, gbc);

            // Add text field
            gbc.gridy = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
            fieldsPanel.add(foodEnergyField, gbc);

            // Add button
            gbc.gridy = 2;
            gbc.anchor = GridBagConstraints.CENTER;
            gbc.gridwidth = GridBagConstraints.REMAINDER; // Span across all columns
            fieldsPanel.add(updateEnergy, gbc);

            // Add panel to frame
            frame.add(fieldsPanel, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

    }
}
