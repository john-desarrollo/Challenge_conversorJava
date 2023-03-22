import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Principal extends JFrame implements ChangeListener, ActionListener {



    private JButton boton1;
    private JCheckBox check1, check2;


    public Principal() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Conversor");

        check1 = new JCheckBox("Conversor de Monedas");
        check1.setBounds(25, 15, 180, 21);
        check1.setForeground(new Color(15, 99, 13));
        check1.setBackground(new Color(220, 220, 220));
        check1.addChangeListener( this);
        add(check1);

        check2 = new JCheckBox("Conversor de Temperatura");
        check2.setBounds(25,50,180,21);
        check2.setForeground(new Color(15, 99, 13));
        check2.setBackground(new Color(220, 220, 220));
        check2.addChangeListener(this);
        add(check2);

        boton1 = new JButton("Aceptar");
        boton1.setBounds(65,80,95,21);
        boton1.setForeground(new Color(15, 99, 13));
        boton1.setBackground(new Color(220,220, 220));
        add(boton1);
        boton1.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1 & check1.isSelected()== true) {
            Monedas monedas = new Monedas();
            monedas.setBounds(0, 0, 310, 250);
            monedas.setVisible(true);
            monedas.setResizable(false);
            monedas.setLocationRelativeTo(null);
        } else if (e.getSource() == boton1 & check2.isSelected()== true) {
            Temperatura temperatura = new Temperatura();
            temperatura.setBounds(0,0,300,250);
            temperatura.setVisible(true);
            temperatura.setResizable(false);
            temperatura.setLocationRelativeTo(null);

        }
    }

    public void stateChanged(ChangeEvent e) {
        if(check1.isSelected() == true & check2.isSelected() == false || check1.isSelected() == false & check2.isSelected() == true){
            boton1.setEnabled(true);


        }else {
            boton1.setEnabled(false);

        }
    }



    public static void main(String args[]){
        Principal principal = new Principal();
        principal.setBounds(0,0,250,150);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }


}

