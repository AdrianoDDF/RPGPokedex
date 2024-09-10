package pokedex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
  
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://192.168.101.7:3306/teste","usuario_remoto","1234");
            ResultSet rs = conexao.createStatement().executeQuery("select texto from teste.tabelaTeste");
            rs.getString("testo");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO: handle exception
        } finally {
            if(conexao != null) {
                conexao.close();
            }
        }
    }
}
