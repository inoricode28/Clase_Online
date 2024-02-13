import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class practica001 extends JFrame {

    private JLabel lblTitulo, lblError;
     
    private JTextField txtprocesador, txttarjetavideo, txtmemoria, txtplacamadre , txtnvmem2 , txtfuentedepoder , txtrefrigeracionliquida, txtcase , txtdolar , txtPbasico, txtigv, txttotal, txtPbasicosoles,txtigvsoles, txttotalsoles; 
    private JButton btnCalcular , btnlimpiar;           
        

    public practica001() {        
        
        getContentPane().setBackground(new Color(0x071AFE));

        
    setLayout(null); // existencia del formulario (formulario en blanco)
    lblTitulo = new JLabel("Facturacion");
    lblTitulo.setBounds(400, 10, 400, 40);
    lblTitulo.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
    lblTitulo.setForeground(new Color(0xFEE807));
    add(lblTitulo);

    JLabel lblError = new JLabel("");
    lblError.setBounds(100, 900, 700, 30);
    lblError.setFont(new Font("Consolas", Font.PLAIN, 18));
    lblError.setForeground(Color.RED);
    add(lblError);

    JLabel lblprocesador = new JLabel("Processor");
    lblprocesador.setBounds(100, 70, 400, 40);
    lblprocesador.setFont(new Font("Consola", Font.PLAIN, 25));
    lblprocesador.setForeground(new Color(0x65E115));
    add(lblprocesador);

    txtprocesador = new JTextField();
    txtprocesador.setBounds(320, 70, 150, 38);
    txtprocesador.setFont(new Font("Consola", Font.PLAIN, 25));
    txtprocesador.setForeground(new Color(0x00FF00));
    txtprocesador.setBackground(Color.black);
    add(txtprocesador);

    JLabel lbltarjetavideo = new JLabel("Graphic Card");
    lbltarjetavideo.setBounds(100, 130, 400, 40);
    lbltarjetavideo.setFont(new Font("Consola", Font.PLAIN, 25));
    lbltarjetavideo.setForeground(new Color(0x65E115));
    add(lbltarjetavideo);

    txttarjetavideo = new JTextField();
    txttarjetavideo.setBounds(320, 130, 150, 38);
    txttarjetavideo.setFont(new Font("Consola", Font.PLAIN, 25));
    txttarjetavideo.setForeground(new Color(0x00FF00));
    txttarjetavideo.setBackground(Color.black);
    add(txttarjetavideo);

    JLabel lblmemoria = new JLabel("Memory");
    lblmemoria.setBounds(100, 190, 400, 40);
    lblmemoria.setFont(new Font("Consola", Font.PLAIN, 25));
    lblmemoria.setForeground(new Color(0x65E115));
    add(lblmemoria);

    txtmemoria = new JTextField();
    txtmemoria.setBounds(320, 190, 150, 38);
    txtmemoria.setFont(new Font("Consola", Font.PLAIN, 25));
    txtmemoria.setForeground(new Color(0x00FF00));
    txtmemoria.setBackground(Color.black);
    add(txtmemoria);

    JLabel lblplacamadre = new JLabel("Motherboard");
    lblplacamadre.setBounds(100, 250, 400, 40);
    lblplacamadre.setFont(new Font("Consola", Font.PLAIN, 25));
    lblplacamadre.setForeground(new Color(0x65E115));
    add(lblplacamadre);
    
    txtplacamadre = new JTextField();
    txtplacamadre.setBounds(320, 250, 150, 38);
    txtplacamadre.setFont(new Font("Consola", Font.PLAIN, 25));
    txtplacamadre.setForeground(new Color(0x00FF00));   
    txtplacamadre.setBackground(Color.black);
    add(txtplacamadre);

    JLabel lblnvmem2 = new JLabel("Nvme.m2");
    lblnvmem2.setBounds(100,310,150,38);
    lblnvmem2.setFont(new Font("Consola", Font.PLAIN, 25));
    lblnvmem2.setForeground(new Color(0x65E115));
    add(lblnvmem2);

    txtnvmem2 = new JTextField();
    txtnvmem2.setBounds(320,310,150,38);
    txtnvmem2.setFont(new Font("Consola", Font.PLAIN, 25));
    txtnvmem2.setForeground(new Color(0x00FF00));
    txtnvmem2.setBackground(Color.black);
    add(txtnvmem2);

    JLabel lblfuentedepoder = new JLabel("Power supply");
    lblfuentedepoder.setBounds(100,370,300,38);
    lblfuentedepoder.setFont(new Font("Consola", Font.PLAIN, 25));
    lblfuentedepoder.setForeground(new Color(0x65E115));
    add(lblfuentedepoder);

    txtfuentedepoder = new JTextField();
    txtfuentedepoder.setBounds(320,370,150,38);
    txtfuentedepoder.setFont(new Font("Consola", Font.PLAIN, 25));
    txtfuentedepoder.setForeground(new Color(0x00FF00));
    txtfuentedepoder.setBackground(Color.black);
    add(txtfuentedepoder);


    JLabel lblrefrigeracionliquida = new JLabel("Liquid refrigeration"); 
    lblrefrigeracionliquida.setBounds(100,430, 300,38);
    lblrefrigeracionliquida.setFont(new Font("Consola", Font.PLAIN, 25));
    lblrefrigeracionliquida.setForeground(new Color(0x65E115));
    add(lblrefrigeracionliquida);

    txtrefrigeracionliquida = new JTextField();
    txtrefrigeracionliquida.setBounds(320,430, 150,38);
    txtrefrigeracionliquida.setFont(new Font("Consola", Font.PLAIN, 25));
    txtrefrigeracionliquida.setForeground(new Color(0x00FF00));
    txtrefrigeracionliquida.setBackground(Color.black);
    add(txtrefrigeracionliquida);

    JLabel lblcase = new JLabel("Case");
    lblcase.setBounds(100,490, 150,38);
    lblcase.setFont(new Font("Consola", Font.PLAIN, 25));
    lblcase.setForeground(new Color(0x65E115));
    add(lblcase);

    txtcase = new JTextField();
    txtcase.setBounds(320,490, 150,38);
    txtcase.setFont(new Font("Consola", Font.PLAIN, 25));
    txtcase.setForeground(new Color(0x00FF00));
    txtcase.setBackground(Color.black);
    add(txtcase);

    JLabel lbldolar = new JLabel("Dolar");
    lbldolar.setBounds(600 ,70 , 200, 38);
    lbldolar.setFont(new Font("Consola", Font.PLAIN, 25));
    lbldolar.setForeground(new Color(0x65E115));
    add(lbldolar);

    txtdolar = new JTextField();
    txtdolar.setBounds(700,70, 150, 38);
    txtdolar.setFont(new Font("Consola",Font.PLAIN, 25));
    txtdolar.setForeground(new Color(0X00FF00));
    txtdolar.setBackground(Color.black);
    add(txtdolar);
    
    JLabel lblnd = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    lblnd.setBounds(5,550, 1000, 68);
    lblnd.setFont(new Font("Consola", Font.PLAIN, 25)); 
    lblnd.setForeground(new Color(0x000000));
    add(lblnd);

    JLabel lblDOLARES = new JLabel("DOLARES");
    lblDOLARES.setBounds(330,600, 150, 38);
    lblDOLARES.setFont(new Font("Consola", Font.PLAIN, 25));
    lblDOLARES.setForeground(new Color(0x65E115));
    add(lblDOLARES);

    JLabel lblSoles = new JLabel("SOLES");
    lblSoles.setBounds(590,600, 150, 38);
    lblSoles.setFont(new Font("Consola", Font.PLAIN, 25));
    lblSoles.setForeground(new Color(0x65E115));
    add(lblSoles);

    
    JLabel lblPbasico = new JLabel("PBasico");
    lblPbasico.setBounds(100,640, 150, 38);
    lblPbasico.setFont(new Font("Consola", Font.PLAIN, 25));
    lblPbasico.setForeground(new Color(0x65E115));
    add(lblPbasico);

    txtPbasico = new JTextField();
    txtPbasico.setBounds(320,640, 150, 38);
    txtPbasico.setFont(new Font("Consola", Font.PLAIN, 25));
    txtPbasico.setForeground(new Color(0x00FF00));
    txtPbasico.setBackground(Color.black);
    add(txtPbasico);

    txtPbasicosoles = new JTextField();
    txtPbasicosoles.setBounds(560,640, 150, 38);
    txtPbasicosoles.setFont(new Font("Consola", Font.PLAIN, 25));
    txtPbasicosoles.setForeground(new Color(0x00FF00));
    txtPbasicosoles.setBackground(Color.black);
    add(txtPbasicosoles);

    JLabel lbligv = new JLabel("IGV 18%");
    lbligv.setBounds(100,700, 150, 38);
    lbligv.setFont(new Font("Consola", Font.PLAIN, 25));
    lbligv.setForeground(new Color(0x65E115));
    add(lbligv);

    txtigv = new JTextField();
    txtigv.setBounds(320,700, 150, 38);
    txtigv.setFont(new Font("Consola", Font.PLAIN, 25));
    txtigv.setForeground(new Color(0x00FF00));
    txtigv.setBackground(Color.black);
    add(txtigv);

    txtigvsoles = new JTextField();
    txtigvsoles.setBounds(560,700, 150, 38);
    txtigvsoles.setFont(new Font("Consola", Font.PLAIN, 25));
    txtigvsoles.setForeground(new Color(0x00FF00));
    txtigvsoles.setBackground(Color.black);
    add(txtigvsoles);

    JLabel lbltotal = new JLabel("Total");
    lbltotal.setBounds(100,760, 150, 38);
    lbltotal.setFont(new Font("Consola", Font.PLAIN, 25));
    lbltotal.setForeground(new Color(0x65E115));
    add(lbltotal);

    txttotal = new JTextField();
    txttotal.setBounds(320,760,150, 38);
    txttotal.setFont(new Font("Consola", Font.PLAIN, 25));
    txttotal.setForeground(new Color(0x00FF00));
    txttotal.setBackground(Color.black);
    add(txttotal);

    txttotalsoles = new JTextField();
    txttotalsoles.setBounds(560,760, 150, 38);
    txttotalsoles.setFont(new Font("Consola", Font.PLAIN, 25));
    txttotalsoles.setForeground(new Color(0x00FF00));
    txttotalsoles.setBackground(Color.black);
    add(txttotalsoles);
    
    btnCalcular = new JButton("Calcular");
    btnCalcular.setBounds(320,860, 150, 38);
    btnCalcular.setForeground(new Color(0x65E115));
    btnCalcular.setBackground(Color.black);
    add(btnCalcular);

    btnlimpiar = new JButton("Limpiar"); 
    btnlimpiar.setBounds(560,860, 150, 38);
    btnlimpiar.setForeground(new Color(0x65E115));
    btnlimpiar.setBackground(Color.black);
    add(btnlimpiar);

   
    
    
    
    btnlimpiar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            txtprocesador.setText("");
            txttarjetavideo.setText("");
            txtmemoria.setText("");
            txtplacamadre.setText("");
            txtnvmem2.setText("");
            txtfuentedepoder.setText("");
            txtrefrigeracionliquida.setText("");
            txtcase.setText("");
            txtdolar.setText("");
            txtPbasico.setText("");
            txtPbasicosoles.setText("");
            txtigv.setText("");
            txtigvsoles.setText("");
            txttotal.setText("");
            txttotalsoles.setText("");
            lblError.setText("");

        }            
    });

    btnCalcular.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            multiplicarNumero();
        }
    });
    
    

 }


 private void multiplicarNumero() { 
    try {
        double Dolar = Double.parseDouble(txtdolar.getText());
        double num1 = Double.parseDouble(txttarjetavideo.getText());
        double num2 = Double.parseDouble(txtmemoria.getText());
        double num3 = Double.parseDouble(txtmemoria.getText());
        double num4 = Double.parseDouble(txtplacamadre.getText());
        double num5 = Double.parseDouble(txtnvmem2.getText());
        double num6 = Double.parseDouble(txtfuentedepoder.getText());
        double num7 = Double.parseDouble(txtrefrigeracionliquida.getText());
        double num8 = Double.parseDouble(txtcase.getText()); 
        //Calculo del precio Basico
        double PBasicoDolar = num1 + num2 + num3 + num4 +num5 + num6 +num7 +num8;
        double PBasicoSoles = PBasicoDolar*Dolar;

        //Calculo del IGV
        double IGVDOLAR = PBasicoDolar *0.18;
        double IGVSOLES = PBasicoDolar *0.18;

        //TOTALES
        double ResultDolar = PBasicoDolar + IGVDOLAR;
        double ResultSoles = PBasicoSoles + IGVSOLES;
        
        
        //Salidas
        txtPbasico.setText(Double.toString(PBasicoDolar));
        txtPbasicosoles.setText(Double.toString(PBasicoSoles));
        txtigv.setText(Double.toString(IGVDOLAR));
        txtigvsoles.setText(Double.toString(IGVSOLES));
        txttotal.setText(Double.toString(ResultDolar));
        txttotalsoles.setText(Double.toString(ResultSoles));
        
    } catch (NumberFormatException ex) {
        lblError.setText("Error: Ingrese un numero valido");
    }
}

}
    





  






    



