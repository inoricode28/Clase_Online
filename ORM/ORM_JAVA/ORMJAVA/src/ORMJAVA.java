import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ORMJAVA extends JFrame {
    private JTextArea textArea;

    public ORMJAVA() {
        setTitle("Datos de Categorías");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        add(scrollPane, BorderLayout.CENTER);

        // Conectar y obtener datos de la base de datos
        obtenerDatosDeBaseDeDatos();
    }

    private void obtenerDatosDeBaseDeDatos() {
        try {
            // Establecer conexión a la base de datos
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/COMERS", "nova", "1234");

            // Crear una declaración SQL
            Statement statement = connection.createStatement();

            // Ejecutar una consulta SQL para obtener datos
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CATEGORIA");

            // Procesar los resultados y agregarlos al JTextArea
            while (resultSet.next()) {
                int id = resultSet.getInt("ID_CATEGORIA");
                String categoria = resultSet.getString("CATEGORIA");
                boolean estado = resultSet.getBoolean("ESTADO");

                textArea.append("ID: " + id + ", Categoría: " + categoria + ", Estado: " + estado + "\n");
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ORMJAVA frame = new ORMJAVA();
            frame.setVisible(true);
        });
    }
}