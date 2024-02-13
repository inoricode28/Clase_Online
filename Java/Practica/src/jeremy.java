/**
 * jeremy
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jeremy extends JFrame {
    private JButton boton, boton2, boton3, boton4, boton5;
    private JLabel label, label2, label3, label4, label5;

    public jeremy() {
        setLayout(null);

        boton = new JButton("Presionar");
        boton.setBounds(330, 280, 100, 30);
        add(boton);

        label = new JLabel("Mensaje aqui");
        label.setBounds(345, 310, 200, 30);
        add(label);

        boton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label.setText("Bienvenido");
            }
        });

        boton2 = new JButton("¿Mi nombre es?");
        boton2.setBounds(500, 400, 200, 50);
        add(boton2);

        label2 = new JLabel("Respuesta aqui");
        label2.setBounds(515, 450, 200, 30);
        add(label2);

        boton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label2.setText("Jeremy");
            }
        });

        boton3 = new JButton("¿Cuantos años tengo?");
        boton3.setBounds(200, 280, 100, 30);
        add(boton3);

        label3 = new JLabel("Respuesta aqui");
        label3.setBounds(215, 310, 200, 30);
        add(label3);

        boton3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label3.setText("18 años");
        }
        });

        boton4 = new JButton("¿Que carrera estudio?");
        boton4.setBounds(300, 550, 250, 50);
        add(boton4);

        label4 = new JLabel("Respuesta aqui");
        label4.setBounds(325, 600, 200, 30);
        add(label4);

        boton4.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label4.setText("Ingeniería de Sistemas");
        }
        });

        boton5 = new JButton("¿Que ciclo voy?");
        boton5.setBounds(700, 550, 250, 50);
        add(boton5);

        label5 = new JLabel("Respuesta aqui");
        label5.setBounds(720, 600, 200, 30);
        add(label5);


        boton5.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label5.setText("5 ciclo");
        }
        });

    }

    public static void main(String[] args) {
        jeremy frm = new jeremy();
        frm.setBounds(0, 0, 1200, 800);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);
    }
}