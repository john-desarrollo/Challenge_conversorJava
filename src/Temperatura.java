
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class Temperatura extends JFrame implements ActionListener, ItemListener {
    private JTextField valor, resultado;
    private JComboBox combo1;
    private JButton boton1, boton2;
    //private JTextArea resultado;
    private JLabel label1, label2, label3;


    public Temperatura() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Temperatura");

        valor = new JTextField();
        valor.setBounds(150, 10, 99, 30);
        valor.setBackground(new Color(220, 220, 220));
        add(valor);

        combo1 = new JComboBox();
        combo1.addItem("Celsius a Fahrenheit");
        combo1.addItem("Fahrenheit a Celsius");
        combo1.addItem("Celsius a Kelvin");
        combo1.addItem("Fahrenheit a Kelvin");
        combo1.addItem("Kelvin a Fahrenheit");
        combo1.addItem("Kelvin a Celsius");

        combo1.addItemListener(this);
        combo1.setBounds(50, 70, 145, 30);
        combo1.setForeground(new Color(15, 99, 13));
        combo1.setBackground(new Color(220, 220, 220));
        add(combo1);

        resultado = new JTextField();
        resultado.setBounds(100, 125, 99, 30);
        resultado.setBackground(new Color(220, 220, 220));
        add(resultado);

        label1 = new JLabel();
        label1.setBounds(202, 125, 25, 25);
        add(label1);

        label2 = new JLabel("Ingresa los grados");
        label2.setBounds(10, 10, 125, 30);
        add(label2);

        label3 = new JLabel("Resultado");
        label3.setBounds(35, 125, 125, 30);
        add(label3);

        boton1 = new JButton("Convertir");
        boton1.setBounds(85, 170, 99, 30);
        add(boton1);
        boton1.addActionListener(this);


    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == boton1) {
            Double valor = Double.valueOf(this.valor.getText());
            int opcionUno = combo1.getSelectedIndex();
            if (opcionUno == 0) {
                double Celsius = (valor - 32) * 5 / 9;
                resultado.setText(String.valueOf(Celsius = (double) Math.round(Celsius * 100d) / 100));
                label1.setText("C°");


            } else if (opcionUno == 1) {
                double Fahrenheit = (valor * 9 / 5) + 32;
                resultado.setText(String.valueOf(Fahrenheit = (double) Math.round(Fahrenheit * 100d) / 100));
                label1.setText("F°");


            } else if (opcionUno == 2) {
                double Kelvin = valor + 273.15;
                resultado.setText(String.valueOf(Kelvin = (double) Math.round(Kelvin * 100d) / 100));
                label1.setText("K°");


            } else if (opcionUno == 3) {

                double Fahrenheit = (valor + 459.67) * 5 / 9;
                resultado.setText(String.valueOf(Fahrenheit = (double) Math.round(Fahrenheit * 100d) / 100));
                label1.setText("K°");


            } else if (opcionUno == 4) {

                double Kelvin = ((valor - 273.15) * 1.8) + 32;
                resultado.setText(String.valueOf(Kelvin = (double) Math.round(Kelvin * 100d) / 100));
                label1.setText("F°");


            } else if (opcionUno == 5) {

                double Kelvin = valor - 273.15;
                resultado.setText(String.valueOf(Kelvin = (double) Math.round(Kelvin * 100d) / 100));
                label1.setText("C°");


            }
        }


    }

    public static void main(String args[]) {
        Temperatura temperatura = new Temperatura();
        temperatura.setBounds(0, 0, 300, 250);
        temperatura.setVisible(true);
        temperatura.setResizable(false);
        temperatura.setLocationRelativeTo(null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

}





