import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "usuario", "senha");
        } catch(ClassNotFoundException ex){
            System.out.println("Driver do banco de dados não encontrado");
        } catch (SQLException ex){
            System.out.println("Ocorreu um erro ao acessar o banco de dados " + ex.getMessage());
        } finally {
            if(connection != null){
                connection.close();
            }
        }

    }
    
}
