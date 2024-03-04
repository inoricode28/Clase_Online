import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CRUD extends JFrame implements ActionListener {
    
    private JLabel lblid, lblcategoria, lblestado;
    private JTextField txtid, txtcategoria, txtestado;
    private JButton btngrabar, btnactualizar, btnlistar, btneliminar;
    private DefaultTableModel model;
    private JTable table;
    //private Connection connection;

    public CRUD() {
        getContentPane().setBackground(new Color(0x071AFE));
        setLayout(null);

        lblid = new JLabel("ID");
        lblid.setBounds(100, 70, 400, 40);
        lblid.setFont(new Font("Consola", Font.PLAIN, 25));
        lblid.setForeground(new Color(0x00FF00));
        add(lblid);

        txtid = new JTextField();
        txtid.setBounds(100, 120, 400, 40);
        txtid.setFont(new Font("Consola", Font.PLAIN, 25));
        txtid.setForeground(new Color(0x00FF00));
        txtid.setBackground(Color.black);
        add(txtid);

        lblcategoria = new JLabel("CATEGORIA");
        lblcategoria.setBounds(100, 170, 400, 40);
        lblcategoria.setFont(new Font("Consola", Font.PLAIN, 25));
        lblcategoria.setForeground(new Color(0x00FF00));
        add(lblcategoria);

        txtcategoria = new JTextField();
        txtcategoria.setBounds(100, 220, 400, 40);
        txtcategoria.setFont(new Font("Consola", Font.PLAIN, 25));
        txtcategoria.setForeground(new Color(0x00FF00));
        txtcategoria.setBackground(Color.black);
        add(txtcategoria);

        lblestado = new JLabel("ESTADO");
        lblestado.setBounds(100, 270, 400, 40);
        lblestado.setFont(new Font("Consola", Font.PLAIN, 25));
        lblestado.setForeground(new Color(0x00FF00));
        add(lblestado);

        txtestado = new JTextField();
        txtestado.setBounds(100, 320, 400, 40);
        txtestado.setFont(new Font("Consola", Font.PLAIN, 25));
        txtestado.setForeground(new Color(0x00FF00));
        txtestado.setBackground(Color.black);
        add(txtestado);

        btngrabar = new JButton("GRABAR");
        btngrabar.setBounds(100, 370, 200, 40);
        btngrabar.setFont(new Font("Consola", Font.PLAIN, 25));
        btngrabar.setForeground(new Color(0x00FF00));
        btngrabar.setBackground(Color.black);
        btngrabar.addActionListener(this);
        add(btngrabar);

        btnactualizar = new JButton("ACTUALIZAR");
        btnactualizar.setBounds(300, 370, 200, 40);
        btnactualizar.setFont(new Font("Consola", Font.PLAIN, 25));
        btnactualizar.setForeground(new Color(0x00FF00));
        btnactualizar.setBackground(Color.black);
        btnactualizar.addActionListener(this);
        add(btnactualizar);

        btnlistar = new JButton("LISTAR");
        btnlistar.setBounds(500, 370, 200, 40);
        btnlistar.setFont(new Font("Consola", Font.PLAIN, 25));
        btnlistar.setForeground(new Color(0x00FF00));
        btnlistar.setBackground(Color.black);
        btnlistar.addActionListener(this);
        add(btnlistar);

        btneliminar = new JButton("ELIMINAR");
        btneliminar.setBounds(700, 370, 200, 40);
        btneliminar.setFont(new Font("Consola", Font.PLAIN, 25));
        btneliminar.setForeground(new Color(0x00FF00));
        btneliminar.setBackground(Color.black);
        btneliminar.addActionListener(this);
        add(btneliminar);

        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Categoria");
        model.addColumn("Estado");
        
        // Crear tabla
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 420, 800, 300);
        add(scrollPane);    

        setTitle("CRUD Application");
        setBounds(0, 0, 1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
   

    public static void main(String[] args) {
        new CRUD().setVisible(true);
    }
}
