// Importa el módulo mysql
const mysql = require('mysql2');

// Configura la conexión a tu base de datos MySQL
const connection = mysql.createConnection({
  host: 'localhost',
  user: 'nova',
  password: '1234',
  database: 'comers'
});

// Conecta a la base de datos
connection.connect((err) => {
  if (err) {
    console.error('Error al conectar a la base de datos:', err);
    return;
  }
  console.log('Conexión exitosa a la base de datos MySQL');
});

// Realiza una consulta a la base de datos
connection.query('SELECT * FROM categoria', (err, rows) => {
  if (err) {
    console.error('Error al ejecutar la consulta:', err);
    return;
  }

  // Muestra los resultados en el terminal
  console.log('Contenido de la tabla:');
  rows.forEach((row) => {
    console.log(row); // Este es solo un ejemplo, puedes formatear la salida como desees
  });

  // Cierra la conexión a la base de datos
  connection.end();
});