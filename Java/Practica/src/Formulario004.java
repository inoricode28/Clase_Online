import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Formulario03
 */
public class Formulario004 extends JFrame {

    // Area Global
    private JLabel lblTitulo, lblPrimerNumero, lblSegundoNumero, lblResultadosuma ;
    private JTextField txtPrimerNumero, txtSegundoNumero;
    private JButton btnSumar, btnLimpiar, btnRestar, btnMultiplicar , btnDividir;

    public Formulario004() {
        setLayout(null);

        // Background
        getContentPane().setBackground(new Color(0x333333));

        lblTitulo = new JLabel("ARITMETICA");// Objeto Etiqueta
        lblTitulo.setBounds(270, 20, 400, 60);// Atributo
        lblTitulo.setFont(new Font("Consola", Font.PLAIN, 48));
        lblTitulo.setForeground(new Color(0x65E115));
        add(lblTitulo);// Añade el objeto al formulario

        // Primer Numero
        lblPrimerNumero = new JLabel("Primer numero");
        lblPrimerNumero.setBounds(40, 100, 150, 20);
        lblPrimerNumero.setFont(new Font("Consola", Font.PLAIN, 18));
        lblPrimerNumero.setForeground(new Color(0x65E115));
        add(lblPrimerNumero);

        txtPrimerNumero = new JTextField();
        txtPrimerNumero.setBounds(200, 100, 150, 38);
        txtPrimerNumero.setFont(new Font("Consola", Font.PLAIN, 25));
        txtPrimerNumero.setForeground(new Color(0x00FF00));
        txtPrimerNumero.setBackground(Color.black);
        add(txtPrimerNumero);

        // Segundo Numero
        lblSegundoNumero = new JLabel("Segundo numero");
        lblSegundoNumero.setBounds(40, 150, 150, 20);
        lblSegundoNumero.setFont(new Font("Consola", Font.PLAIN, 18));
        lblSegundoNumero.setForeground(new Color(0x65E115));
        add(lblSegundoNumero);

        txtSegundoNumero = new JTextField();
        txtSegundoNumero.setBounds(200, 150, 150, 38);
        txtSegundoNumero.setFont(new Font("Consola", Font.PLAIN, 25));
        txtSegundoNumero.setForeground(new Color(0x00FF00));
        txtSegundoNumero.setBackground(Color.black);
        add(txtSegundoNumero);

        // Boton Sumar
        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(150, 200, 200, 40);
        btnSumar.setBackground(Color.RED);
        btnSumar.setForeground(Color.WHITE);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(400, 200, 200, 40);
        btnRestar.setBackground(Color.RED);
        btnRestar.setForeground(Color.WHITE);
        add(btnRestar);

        btnMultiplicar = new JButton("Multiplicar");
        btnMultiplicar.setBounds(650, 200, 200, 40);
        btnMultiplicar.setBackground(Color.RED);
        btnMultiplicar.setForeground(Color.WHITE);
        add(btnMultiplicar);

        btnDividir = new JButton("Dividir");
        btnDividir.setBounds(900, 200, 200, 40);
        btnDividir.setBackground(Color.RED);
        btnDividir.setForeground(Color.WHITE);
        add(btnDividir);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(1150, 200, 200, 40);
        btnLimpiar.setBackground(Color.RED);
        btnLimpiar.setForeground(Color.WHITE);
        add(btnLimpiar);

        // Resultado
        lblResultadosuma = new JLabel("Resultado de la suma: ");
        lblResultadosuma.setBounds(50, 260, 500, 40);
        lblResultadosuma.setFont(new Font("Consola", Font.PLAIN, 35));
        lblResultadosuma.setForeground(new Color(0x65E115));
        add(lblResultadosuma);

        

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumarNumero();
            }
        });
        
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txtPrimerNumero.setText("");
                txtSegundoNumero.setText("");
                lblResultadosuma.setText("");
                
            }            
        });

        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                restarNumero();
            }
        });

        btnMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                multiplicarNumero();
            }
        });

        btnDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dividirNumero();
            }
        });
    }

    private void sumarNumero() {
        try {
            int num1 = Integer.parseInt(txtPrimerNumero.getText());
            int num2 = Integer.parseInt(txtSegundoNumero.getText());

            // Realizar la suma
            int resultado1 = num1 + num2;
            

            // Mostrar el resultado en la eqtiqueta
            lblResultadosuma.setText("Resultado: " + resultado1);
            
        } catch (NumberFormatException ex) {
            lblResultadosuma.setText("Error: Ingrese un numero valido");
        }
    }

    private void restarNumero() {
        try {
            int num1 = Integer.parseInt(txtPrimerNumero.getText());
            int num2 = Integer.parseInt(txtSegundoNumero.getText());

            int resultado2 = num1 - num2;

            lblResultadosuma.setText("Resultado: " + resultado2);
            
        } catch (NumberFormatException ex) {
            lblResultadosuma.setText("Error: Ingrese un numero valido");
        }
    }
          

    private void multiplicarNumero() { 
        try {
            int num1 = Integer.parseInt(txtPrimerNumero.getText());
            int num2 = Integer.parseInt(txtSegundoNumero.getText());

            int resultado3 = num1 * num2;

            lblResultadosuma.setText("Resultado: " + resultado3);
            
        } catch (NumberFormatException ex) {
            lblResultadosuma.setText("Error: Ingrese un numero valido");
        }
    }

    private void dividirNumero() {
        try {
            int num1 = Integer.parseInt(txtPrimerNumero.getText());
            int num2 = Integer.parseInt(txtSegundoNumero.getText());
            int resultado4 = num1 / num2;
            lblResultadosuma.setText("Resultado: " + resultado4);
            
        } catch (NumberFormatException ex) {
            lblResultadosuma.setText("Error: Ingrese un numero valido");
        }
    }
            
    public static void main(String[] args) {
        Formulario004 frm = new Formulario004();
        frm.setBounds(0, 0, 1500, 1100);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
    } 

}
