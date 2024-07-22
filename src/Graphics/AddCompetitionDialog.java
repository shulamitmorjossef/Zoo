package Graphics;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class AddCompetitionDialog extends JDialog {
//    private JComboBox<String> competitionTypeCombo;
//    private JButton confirmButton;
//    private JButton cancelButton;
//    private String selectedCompetitionType;
//
//    public AddCompetitionDialog() {
////        super(owner, "Add Competition", true);
//
//        // Setup layout
//        setLayout(new BorderLayout());
//
//        // Competition type selection
//        String[] competitionTypes = {"Air", "Water", "Land"};
//        competitionTypeCombo = new JComboBox<>(competitionTypes);
//        add(competitionTypeCombo, BorderLayout.CENTER);
//
//        // Buttons panel
//        JPanel buttonsPanel = new JPanel();
//        buttonsPanel.setLayout(new FlowLayout());
//
//        // Confirm button
//        confirmButton = new JButton("Confirm");
//        confirmButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Handle confirm action
//                selectedCompetitionType = (String) competitionTypeCombo.getSelectedItem();
//                dispose();
//            }
//        });
//        buttonsPanel.add(confirmButton);
//
//        // Cancel button
//        cancelButton = new JButton("Cancel");
//        cancelButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                selectedCompetitionType = null;
//                dispose();
//            }
//        });
//        buttonsPanel.add(cancelButton);
//
//        add(buttonsPanel, BorderLayout.SOUTH);
//
//        pack();
////        setLocationRelativeTo();
//    }
//
//    public String getSelectedCompetitionType() {
//        return selectedCompetitionType;
//    }
//}
