/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formularios;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
/**
 *
 * @author Ger
 */
public class FormulariosSwing extends JFrame implements ActionListener{
    
    JButton send_data_button;
    JTextField name_text;
    JTextField last_name_text;
    JTextField age_text;
    JCheckBox is_checkbox;
    JComboBox gender_combobox;
    
    JLabel name_label;
    JLabel last_name_label;
    JLabel age_label;
    JLabel check_label;
    JLabel gender_label;
    
    public FormulariosSwing()
    {
        JFrame jfContenido = new JFrame(); //Declara la Variable jfContenido que actuara como Frame
        jfContenido.setBounds(100, 20, 400, 400); //Establece las Propiedades de Dimension (BordeHorizontal,BordeVertical,TamañoHorizontal,TamañoVerical)
        jfContenido.setLayout(null);
        jfContenido.setVisible(true);
        jfContenido.setResizable(false);
        jfContenido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container f = jfContenido.getContentPane();
        f.setBackground(new Color(219, 216, 255));
        
        name_text = new JTextField();
        name_text.setBounds(120, 83, 200, 25);
        f.add(name_text);
        
        last_name_text = new JTextField();
        last_name_text.setBounds(120, 120, 200, 25);
        f.add(last_name_text);
        
        age_text = new JTextField();
        age_text.setBounds(120, 160, 200, 25);
        f.add(age_text);
        
        is_checkbox = new JCheckBox();
        is_checkbox.setBounds(120, 200, 200, 25);
        f.add(is_checkbox);
        
        gender_combobox = new JComboBox();
        gender_combobox.addItem("Hombre");
        gender_combobox.addItem("Mujer");
        gender_combobox.setBounds(120, 240, 200, 25);
        f.add(gender_combobox);
        
        send_data_button = new JButton("Check data");
        send_data_button.setBounds(120, 320, 150, 40);
        f.add(send_data_button);        
        
        name_label = new JLabel("Name: ");
        name_label.setBounds(50, 83, 200, 25);
        f.add(name_label);
        
        last_name_label = new JLabel("Last name: ");
        last_name_label.setBounds(50, 120, 200, 25);
        f.add(last_name_label);
        
        age_label = new JLabel("Age: ");
        age_label.setBounds(50, 160, 200, 25);
        f.add(age_label);
        
        check_label = new JLabel("Check: ");
        check_label.setBounds(50, 200, 200, 25);
        f.add(check_label);
        
        gender_label = new JLabel("Gender: ");
        gender_label.setBounds(50, 240, 200, 25);
        f.add(gender_label);
        
        send_data_button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(e.getSource()==send_data_button)
        {
            String name = name_text.getText();
            String last_name = last_name_text.getText();
            String age = age_text.getText();
            boolean checked = is_checkbox.isSelected();
            Object gender = gender_combobox.getSelectedItem();
            System.out.println("Name: " + name);
            System.out.println("Last name: " + last_name);
            System.out.println("Age: " + age);
            System.out.println("Male: " + checked);
            System.out.println("Gender: " + gender);
            JOptionPane.showMessageDialog(null, "Name: " + name + "\nLast name: " + last_name + "\nAge: " + age + "\nIs checked?: " + checked + "\nGender: " + gender);
        }
    }
}