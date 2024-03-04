import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUD01 extends JFrame implements ActionListener {
    
    private JLabel lblid , lblcategoria  , lblestado;
    private JTextField txtid , txtcategoria , txtestado ;
    private JButton btngrabar , btnactualizar , btnlistar , btneliminar ;
    private DefaultTableModel model;
    private JTable table;

    private Connection connection;

    public CRUD01() {
        getContentPane().setBackground(new Color(0x071AFE));
        setLayout(null);

        lblid = new JLabel( "ID" );
        lblid.setBounds(100,70,400,40);
        lblid.setFont( new Font("Consola",Font.PLAIN,25));
        lblid.setForeground(new Color(0x00FF00));
        add(lblid);

        txtid = new JTextField();
        txtid.setBounds(100,120,400,40);    
        txtid.setFont( new Font("Consola",Font.PLAIN,25));
        txtid.setForeground(new Color(0x00FF00));
        txtid.setBackground(Color.black);
        add(txtid);

        lblcategoria = new JLabel( "CATEGORIA" );
        lblcategoria.setBounds(100,170,400,40);
        lblcategoria.setFont( new Font("Consola",Font.PLAIN,25));
        lblcategoria.setForeground(new Color(0x00FF00));
        add(lblcategoria);

        txtcategoria = new JTextField();
        txtcategoria.setBounds(100,220,400,40);
        txtcategoria.setFont( new Font("Consola",Font.PLAIN,25));
        txtcategoria.setForeground(new Color(0x00FF00));
        txtcategoria.setBackground(Color.black);
        add(txtcategoria);

        lblestado = new JLabel( "ESTADO" );
        lblestado.setBounds(100,270,400,40);
        lblestado.setFont( new Font("Consola",Font.PLAIN,25));
        lblestado.setForeground(new Color(0x00FF00));
        add(lblestado);

        txtestado = new JTextField();
        txtestado.setBounds(100,320,400,40);
        txtestado.setFont( new Font("Consola",Font.PLAIN,25));
        txtestado.setForeground(new Color(0x00FF00));
        txtestado.setBackground(Color.black);
        add(txtestado);

        btngrabar = new JButton( "GRABAR" );
        btngrabar.setBounds(100,370,200,40);
        btngrabar.setFont( new Font("Consola",Font.PLAIN,25));
        btngrabar.setForeground(new Color(0x00FF00));
        btngrabar.setBackground(Color.black);
        add(btngrabar);

        btnactualizar = new JButton( "ACTUALIZAR" );
        btnactualizar.setBounds(300,370,200,40);
        btnactualizar.setFont( new Font("Consola",Font.PLAIN,25));
        btnactualizar.setForeground(new Color(0x00FF00));
        btnactualizar.setBackground(Color.black);
        add(btnactualizar);

        btnlistar = new JButton( "LISTAR" );
        btnlistar.setBounds(500,370,200,40);
        btnlistar.setFont( new Font("Consola",Font.PLAIN,25));
        btnlistar.setForeground(new Color(0x00FF00));
        btnlistar.setBackground(Color.black);
        add(btnlistar);

        btneliminar = new JButton( "ELIMINAR" );
        btneliminar.setBounds(700,370,200,40);
        btneliminar.setFont( new Font("Consola",Font.PLAIN,25));
        btneliminar.setForeground(new Color(0x00FF00));
        btneliminar.setBackground(Color.black);
        add(btneliminar);
            
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Categoria");
        model.addColumn("Estado"); 
        model.addColumn("Stock"); 
              
        
        // Crear tabla
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 420, 800, 300);
        add(scrollPane);
        
        initializeDatabase();
        loadDataFromDatabase();

        btngrabar.addActionListener(this);
        btnactualizar.addActionListener(this);
        btnlistar.addActionListener(this);
        btneliminar.addActionListener(this);
    }

    private void initializeDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/comers","nova","1234");                

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void loadDataFromDatabase(){
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CATEGORIA");
            while(resultSet.next()){
                int id = resultSet.getInt("ID_CATEGORIA");
                String categoria = resultSet.getString("CATEGORIA");
                boolean estado = resultSet.getBoolean("ESTADO");
                model.addRow(new Object[]{id,categoria,estado});
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btngrabar) {
            grabarDatos();
        } else if (e.getSource() == btnactualizar) {
            actualizarDatos();
        } else if (e.getSource() == btnlistar) {
            listarDatos();
        } else if (e.getSource() == btneliminar) {
            eliminarDatos();
        }
    }

    private void grabarDatos(){
        String categoria = txtcategoria.getText();
        boolean estado = Boolean.parseBoolean(txtestado.getText());
        try{
            PreparedStatement statement = connection.prepareStatement("INSERT INTO CATEGORIA (CATEGORIA, ESTADO) VALUE (?, ?)");
            statement.setString(1, categoria);
            statement.setBoolean(2, estado);
            statement.executeUpdate();
            model.addRow(new Object[]{getLastInsertedId(),categoria,estado});

        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    private int getLastInsertedId() {
        int lastId = -1;

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT LAST_INSERT_ID()");
            if(resultSet.next()){
                lastId = resultSet.getInt(1);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return lastId;
    }

    private void actualizarDatos() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) model.getValueAt(selectedRow, 0);
            String categoria = txtcategoria.getText();
            boolean estado = Boolean.parseBoolean(txtestado.getText());
            try {
                PreparedStatement statement = connection.prepareStatement("UPDATE CATEGORIA SET CATEGORIA = ?, ESTADO = ? WHERE ID_CATEGORIA = ?");
                statement.setString(1, categoria);
                statement.setBoolean(2, estado);
                statement.setInt(3, id);
                statement.executeUpdate();
                model.setValueAt(categoria, selectedRow, 1);
                model.setValueAt(estado, selectedRow, 2);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void listarDatos(){
        model.setRowCount(0);
        loadDataFromDatabase();        
    }

    private void eliminarDatos(){
        int selectRow = table.getSelectedRow();
        if(selectRow != -1){
            int id = (int) model.getValueAt(selectRow, 0);
            try{
                PreparedStatement statement = connection.prepareStatement("DELETE FROM CATEGORIA WHERE ID_CATEGORIA = ?");
                statement.setInt(1, id);
                statement.executeUpdate();
                model.removeRow(selectRow);

            }catch(SQLException e){
                e.printStackTrace();

            }
        }
    }

    public static void main(String[] args){
        CRUD01 frm = new CRUD01();
        frm.setBounds(0,0,1000,800);
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setResizable(false);  
    }
}
