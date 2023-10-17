import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
        String username = "seu_usuario";
        String password = "sua_senha";

        try {
            // Carregando o driver JDBC do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecendo a conexão com o banco de dados
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            if (connection != null) {
                System.out.println("Conexão bem-sucedida!");
                // Faça operações no banco de dados aqui
                connection.close(); // Feche a conexão quando terminar
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao estabelecer a conexão: " + e.getMessage());
        }
    }
}
