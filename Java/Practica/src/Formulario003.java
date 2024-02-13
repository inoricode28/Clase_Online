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
public class Formulario003 extends JFrame {

    // Area Global
    private JLabel lblTitulo, lblPrimerNumero, lblSegundoNumero, lblResultado;
    private JTextField txtPrimerNumero, txtSegundoNumero;
    private JButton btnSumar, btnLimpiar;

    public Formulario003() {
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

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(400, 200, 200, 40);
        btnLimpiar.setBackground(Color.RED);
        btnLimpiar.setForeground(Color.WHITE);
        add(btnLimpiar);

        // Resultado
        lblResultado = new JLabel("Resultado: ");
        lblResultado.setBounds(50, 260, 500, 40);
        lblResultado.setFont(new Font("Consola", Font.PLAIN, 35));
        lblResultado.setForeground(new Color(0x65E115));
        add(lblResultado);

        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sumarNumero();
            }

        });
        
        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                txtPrimerNumero.setText("");
                txtSegundoNumero.setText("");
                lblResultado.setText("");
            }            
        });

    }

    private void sumarNumero() {
        try {
            int num1 = Integer.parseInt(txtPrimerNumero.getText());
            int num2 = Integer.parseInt(txtSegundoNumero.getText());

            // Realizar la suma
            int resultado = num1 + num2;

            // Mostrar el resultado en la eqtiqueta
            lblResultado.setText("Resultado:  " + resultado);

        } catch (NumberFormatException ex) {
            lblResultado.setText("Error: Ingrese un numero valido");
        }
    }

    public static void main(String[] args) {
        Formulario003 frm1 = new Formulario003();
        frm1.setSize(800, 600);
        frm1.setLocationRelativeTo(null);
        frm1.setVisible(true);
        frm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
