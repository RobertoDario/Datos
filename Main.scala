// Importa las clases necesarias para manejar conexiones y resultados de bases de datos
import java.sql.{Connection, DriverManager, ResultSet}

object Main {
  def main(args: Array[String]): Unit = {
    // Configuración de la conexión
    // URL de la base de datos en formato JDBC. Aquí se especifica el host (localhost),
    // el puerto (3306), el nombre de la base de datos (Datos) y el timezone para evitar advertencias.
    val url = "jdbc:mysql://localhost:3306/Datos?serverTimezone=UTC"

    // Usuario y contraseña para autenticarse en la base de datos MySQL.
    val user = "root"  // Reemplaza con tu usuario
    val password = "Beto8520" // Reemplaza con tu contraseña

    // Variable para almacenar la conexión a la base de datos.
    var connection: Connection = null
    try {
      // Establece la conexión a la base de datos utilizando DriverManager.
      // Si la conexión es exitosa, se almacenará en la variable 'connection'.
      connection = DriverManager.getConnection(url, user, password)
      println("Conexión exitosa a la base de datos.")

      // Crea un objeto Statement para ejecutar consultas SQL en la base de datos.
      val statement = connection.createStatement()

      // Ejecuta una consulta SELECT y obtiene los resultados en un objeto ResultSet.
      // Aquí se consulta la tabla 'users' para recuperar todos los registros.
      val resultSet = statement.executeQuery("SELECT * FROM users")

      // Itera sobre los resultados obtenidos de la consulta.
      while (resultSet.next()) {
        // Obtiene los valores de las columnas 'id', 'name' y 'email' de cada registro.
        val id = resultSet.getInt("id")       // Obtiene el ID del usuario (columna 'id')
        val name = resultSet.getString("name") // Obtiene el nombre del usuario (columna 'name')
        val email = resultSet.getString("email") // Obtiene el email del usuario (columna 'email')

        // Imprime los datos del registro actual en la consola.
        println(s"ID: $id, Nombre: $name, Email: $email")
      }
    } catch {
      // Captura y maneja cualquier excepción que ocurra durante la ejecución.
      case e: Exception =>
        e.printStackTrace() // Imprime el error en la consola para depuración.
    } finally {
      // Finalmente, cierra la conexión si está abierta para liberar recursos.
      if (connection != null) connection.close()
    }
  }
}
