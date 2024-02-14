import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Notas extends JFrame{
    private JLabel lblTitulo , lblnota1 , lblnota2 , lblnota3 , lblnota4 , lblResultado , lblerror;
    private JTextField txtnota1 , txtnota2 , txtnota3 , txtnota4 , txtResultado ;
    private JButton btnCalcular, btnLimpiar;
    /**
     * 
     */
    public Notas(){
    setLayout(null);
    getContentPane().setBackground(new Color(0x001AD5));

     
    lblTitulo = new JLabel("NOTA");
    lblTitulo.setBounds(130,20,400,60);
    lblTitulo.setFont(new Font("Consola",Font.PLAIN,48));
    lblTitulo.setForeground(new Color(0x00FF00));
    add(lblTitulo); 

    lblnota1 = new JLabel("NOTA 1");
    lblnota1.setBounds(40,100,150,20);
    lblnota1.setFont(new Font("Consola",Font.PLAIN,18));
    lblnota1.setForeground(new Color(0x00FF00));
    add(lblnota1);
    
    txtnota1 = new JTextField();
    txtnota1.setBounds(200,100,150,25);
    txtnota1.setFont(new Font("Consola",Font.PLAIN,18));
    txtnota1.setForeground(new Color(0x00FF00));
    txtnota1.setBackground(Color.black);
    add(txtnota1);

    lblnota2 = new JLabel("NOTA 2");
    lblnota2.setBounds(40,150 ,150 , 20);
    lblnota2.setFont(new Font("Consola",Font.PLAIN,18));
    lblnota2.setForeground(new Color(0x00FF00));
    add(lblnota2);

    txtnota2 = new JTextField();
    txtnota2.setBounds(200,150,150,25);
    txtnota2.setFont(new Font("Consola",Font.PLAIN,18));
    txtnota2.setForeground(new Color(0x00FF00));
    txtnota2.setBackground(Color.black);
    add(txtnota2);

    lblnota3 = new JLabel("NOTA 3");
    lblnota3.setBounds(40,200,150, 20);
    lblnota3.setFont(new Font("Consola",Font.PLAIN,18));
    lblnota3.setForeground(new Color(0x00FF00));
    add(lblnota3);

    txtnota3 = new JTextField();
    txtnota3.setBounds(200,200,150,25);
    txtnota3.setFont(new Font("Consola",Font.PLAIN,18));
    txtnota3.setForeground(new Color(0x00FF00));
    txtnota3.setBackground(Color.black);
    add(txtnota3);
    
    lblnota4 = new JLabel("NOTA 4");
    lblnota4.setBounds(40,250,150, 20);
    lblnota4.setFont(new Font("Consola",Font.PLAIN,18));
    lblnota4.setForeground(new Color(0x00FF00));
    add(lblnota4);

    txtnota4 = new JTextField();
    txtnota4.setBounds(200,250,150,25);
    txtnota4.setFont(new Font("Consola",Font.PLAIN,18));
    txtnota4.setForeground(new Color(0x00FF00));
    txtnota4.setBackground(Color.black);
    add(txtnota4);
    
    lblResultado = new JLabel("RESULTADO");
    lblResultado.setBounds(40,300,150, 20);
    lblResultado.setFont(new Font("Consola",Font.PLAIN,18));
    lblResultado.setForeground(new Color(0x00FF00));
    add(lblResultado);

    txtResultado = new JTextField();
    txtResultado.setBounds(200,300,150,25);
    txtResultado.setFont(new Font("Consola",Font.PLAIN,18));
    txtResultado.setForeground(new Color(0x00FF00));
    txtResultado.setBackground(Color.black);
    add(txtResultado);

    btnCalcular = new JButton("Calcular");
    btnCalcular.setBounds(40,350,150, 25);
    btnCalcular.setForeground(new Color(0x65E115));
    btnCalcular.setBackground(Color.black);
    add(btnCalcular);
   

    btnLimpiar = new JButton("Limpiar");
    btnLimpiar.setBounds(200,350,150, 25);
    btnLimpiar.setForeground(new Color(0x65E115));
    btnLimpiar.setBackground(Color.black);
    add(btnLimpiar);

    btnCalcular.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            Calcular();
        }
    });

    btnLimpiar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            txtnota1.setText("");
            txtnota2.setText("");
            txtnota3.setText("");
            txtnota4.setText("");
            txtResultado.setText("");
        }
    });
}

    private void Calcular () {

        try {
            double num1 = Double.parseDouble(txtnota1.getText());
            double num2 = Double.parseDouble(txtnota2.getText());
            double num3 = Double.parseDouble(txtnota3.getText());
            double num4 = Double.parseDouble(txtnota4.getText());

            double resultado = num1*(0.2) + num2*(0.3) + num3*(0.5) + num4*(0.7);

            txtResultado.setText(String.format("%.2f",resultado));
        } catch (NumberFormatException ex) {
            lblerror.setText( "Error:Debe ingresar un número valido");

        }

//aqui

    }

    public static void main(String[] args) {
    Notas frm = new Notas();  
    frm.setBounds(0, 0, 400, 450);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setResizable(false);  


    
    }
}
