package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends JFrame {

    JTextField name_field, email_field;
    JRadioButton male, female;
    JCheckBox checkBox;

    public ContactForm(){
        super("Contact form");
        super.setBounds(100, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 2 , 2, 10));

        JLabel name = new JLabel("Enter name:");
        name_field = new JTextField("", 1);
        JLabel email = new JLabel("Enter email:");
        email_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(email);
        container.add(email_field);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        checkBox = new JCheckBox("Are you agree?", false);
        JButton send_button = new JButton("Send");

        male.setSelected(true);
        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(checkBox);
        container.add(send_button);

        send_button.addActionListener(new ButtonEvent());

    }
    class ButtonEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String email = email_field.getText();
            String isMale = "Male";
            if(!male.isSelected())
                isMale = "Female";

            boolean isCheckBox = checkBox.isSelected();

            JOptionPane.showMessageDialog(null,
                    "Your email: " + email + "\nYour are " + isMale + "\nAre you argree? " + isCheckBox,
                    "Hello " + name, JOptionPane.PLAIN_MESSAGE);
        }
    }

}
