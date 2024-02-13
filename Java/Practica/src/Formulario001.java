import javax.swing.JFrame;

/**
 * Formulario001
 */
public class Formulario001 extends JFrame{
    //Generador de objetos
    public Formulario001(){
        setLayout(null);
    }

    public static void main(String[] args) {
        //Ejecucion de los objetos
        //Instanciar el objeto
        Formulario001 formulario1 = new Formulario001();
        formulario1.setBounds(0,0,600,800);//Dimension
        formulario1.setVisible(true);//Visible
        formulario1.setLocationRelativeTo(null);//center
        formulario1.setResizable(false); //Disable a los controles      
    }
}
