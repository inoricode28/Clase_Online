import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Formulario002
 */
public class Formulario002 extends JFrame{
    
    //Generar los objetos
    private JButton boton, btnLimpiar;
    private JLabel label;

    public Formulario002(){
        setLayout(null);

        //Creacion de un Boton
        boton = new JButton("Presionar");
        boton.setBounds(330,280,100,30);
        add(boton);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(500,280,100,30);
        add(btnLimpiar);

        //Crear una Etiqueta
        label = new JLabel("Mensaje aqui");
        label.setBounds(345,310,200,30);
        add(label);

        //Funcion que escribora un hola
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("Hola Jeremy");
            }            
        });

        btnLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("");
            }            
        });
        
    }


    public static void main(String[] args) {
        //Ejecuta los formularios
        //Instanciamos el objeto
        Formulario002 frm = new Formulario002();
        frm.setBounds(0,0,800,600);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);

    }
}
