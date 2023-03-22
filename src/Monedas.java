import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class Monedas extends JFrame implements ActionListener, ItemListener {

    private JTextField valor, resultado;
    private JComboBox combo1, combo2;
    private JButton boton1, boton2;

    private JLabel label1, label2, label3, label4;
    public String respuesta;




    public Monedas(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Conversor de monedas");

        valor = new JTextField();
        valor.setBounds(10,30,90,21);
        valor.setBackground(new Color(220,220, 220));
        add(valor);

        boton1 = new JButton("Convertir");
        boton1.setBounds(175,90,95,21);
        boton1.setForeground(new Color(15, 99, 13));
        boton1.setBackground(new Color(220,220, 220));
        add(boton1);
        boton1.addActionListener(this);


        boton2 = new JButton("Salir");
        boton2.setBounds(95, 180, 95, 21);
        boton2.setForeground(new Color(15, 99, 13));
        boton2.setBackground(new Color(220,220, 220));
        add(boton2);
        boton2.addActionListener(this);


        resultado = new JTextField();
        resultado.setBounds(75,140,100,21);
        resultado.setBackground(new Color(220,220, 220));
        add(resultado);

        combo1 = new JComboBox();
        combo1.addItem("Pesos");
        combo1.addItem("Dolar");
        combo1.addItem("Euro");
        combo1.addItem("Libras Esterlinas");
        combo1.addItem("Yen Japonés");
        combo1.addItem("Won sul-coreano");

        combo1.addItemListener(this);
        combo1.setBounds(120,30,145,20);
        combo1.setForeground(new Color(15, 99, 13));
        combo1.setBackground(new Color(220,220, 220));
        add(combo1);

        combo2 =new JComboBox();
        combo2.addItem("Pesos");
        combo2.addItem("Dolar");
        combo2.addItem("Euro");
        combo2.addItem("Libras Esterlinas");
        combo2.addItem("Yen Japonés");
        combo2.addItem("Won sul-coreano");

        combo2.setBounds(10,90,145,20);
        combo2.setForeground(new Color(15, 99, 13));
        combo2.setBackground(new Color(220,220, 220));
        combo2.addItemListener(this);
        add(combo2);

        label1 = new JLabel();
        label1.setBounds(180,140,120,21);
        label1.setBackground(new Color(220,220, 220));
        add(label1);

        label2 = new JLabel("Ingresa el valor");
        label2.setBounds(10, 3, 125, 30);
        label2.setBackground(new Color(220,220, 220));
        add(label2);

        label3 = new JLabel("Elige una opccion");
        label3.setBounds(128,8,145,20);
        label3.setBackground(new Color(220,220, 220));
        add(label3);

        label4 = new JLabel("Resultado");
        label4.setBounds(10,140,145,20);
        label4.setBackground(new Color(220,220, 220));
        add(label4);





    }



    public void actionPerformed(ActionEvent e){

        if (e.getSource() == boton1) {

            Double valor = Double.valueOf(this.valor.getText());
            int opcionUno = combo1.getSelectedIndex();
            int opcionDos = combo2.getSelectedIndex();

            if (opcionUno == 0 && opcionDos == 1) {
                double operacion = valor / 4761;
                resultado.setText(String.format("%.4f", operacion));
                label1.setText("Dolares");

            } else if (opcionUno == 1 && opcionDos == 0) {
                double operacion = valor * 4761;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Pesos");

            }else if (opcionUno == 0 && opcionDos == 2) {
                double operacion = valor / 5019.38;
                resultado.setText(String.format("%.2f", operacion));

                label1.setText("Euros");


            } else if (opcionUno == 2 && opcionDos == 0) {
                double operacion = valor * 5019.38;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Pesos");



            } else if (opcionUno == 0 && opcionDos == 3) {
                double operacion = valor / 5632.29;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Libras Esterlinas");



            } else if (opcionUno == 3 && opcionDos == 0) {
                double operacion = valor * 5632.29;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Pesos");



            } else if (opcionUno == 0 && opcionDos == 4) {
                double operacion = valor / 34.67;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Yenes Japoneses");



            } else if (opcionUno == 4 && opcionDos == 0) {
                double operacion = valor * 34.67;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Pesos");



            } else if (opcionUno == 0 && opcionDos == 5) {
                double operacion = valor / 3.69;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Wones Surcoreanos");



            }else if (opcionUno == 5 && opcionDos == 0) {
                double operacion = valor * 3.69;
                resultado.setText(String.format("%.2f", operacion));
                label1.setText("Pesos");



            }else if (opcionUno == 0 & opcionUno==0 || opcionDos==1 & opcionDos ==1 || opcionUno == 2 & opcionUno==2
                    || opcionDos==3 & opcionDos ==3 || opcionDos==4 & opcionDos ==4 || opcionUno == 5 & opcionUno==5 ){
                JOptionPane.showMessageDialog(null, "Haz seleccionado el mismo tipo de moneda");


            }
        } else if (e.getSource() == boton2) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres salir del conversor?",
                    "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {

                System.exit(0);
            }
            
        }

    }


    public static void main(String args[]){
        Monedas monedas = new Monedas();
        monedas.setBounds(0,0,310,250);
        monedas.setVisible(true);
        monedas.setResizable(false);
        monedas.setLocationRelativeTo(null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {




    }
}


