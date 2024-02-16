import javax.swing.ImageIcon;

public class MyFrame {
    public static void main(String[] args){
    
        practica001 frm = new practica001();
        frm.setBounds(0, 0, 1000, 1050);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false); 
        
        ImageIcon image = new ImageIcon("image.png");
        frm.setIconImage(image.getImage());        

    }
}