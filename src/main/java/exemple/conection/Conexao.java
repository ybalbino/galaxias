package exemple.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection getConnection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/galaxia",
                    "postgres", "postegres");
            if (connection != null){
                System.out.println("Conexão com o banco de dados feita com sucesso!");
            }else {
                System.out.println("Conexão com o banco de dados falha!");
            }
            return connection;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
