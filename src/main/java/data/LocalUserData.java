package data;
import java.sql.*;
import models.UserData;

public class LocalUserData {

    private static final String DATABASE_URL = "jdbc:h2:./data/sample;DATABASE_TO_UPPER=false;AUTO_SERVER=TRUE;DB_CLOSE_DELAY=-1;INIT=SET NAMES UTF8";
    private static final String DATABASE_USERNAME = "sa";
    private static final String DATABASE_PASSWORD = "";
    private static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS userData (id INT PRIMARY KEY, nome_funcionario VARCHAR(255), email VARCHAR(255), nome_empresa VARCHAR(255), telefone VARCHAR(255))";

    //inicializar o banco de dados e a tabela
    public static void initializeDatabase() {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            Statement statement = connection.createStatement();
            statement.execute(CREATE_TABLE_QUERY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Método para inserir um novo objeto no banco de dados
    public static void insertUserData(UserData userData) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO userData (id, nome_funcionario, email, nome_empresa, telefone) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, userData.getId());
            preparedStatement.setString(2, userData.getNomeFuncionario());
            preparedStatement.setString(3, userData.getEmail());
            preparedStatement.setString(4, userData.getNomeEmpresa());
            preparedStatement.setString(5, userData.getTelefone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //deletar
    public static void deleteUserData(int id) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM userData WHERE id = ?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static UserData getUserData(int id) {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM userData WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new UserData(
                        resultSet.getInt("id"),
                        resultSet.getString("nome_funcionario"),
                        resultSet.getString("email"),
                        resultSet.getString("nome_empresa"),
                        resultSet.getString("telefone")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static UserData getUserData() {
        try {
            Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM userData");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new UserData(
                        resultSet.getInt("id"),
                        resultSet.getString("nome_funcionario"),
                        resultSet.getString("email"),
                        resultSet.getString("nome_empresa"),
                        resultSet.getString("telefone")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Retorna null se não houver usuário encontrado
    }

}
