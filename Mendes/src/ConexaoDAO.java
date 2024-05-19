import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class ConexaoDAO {
	public Connection conectaBD() {
		Connection conn = null;
		try {

			String DB_URL = "jdbc:mysql://localhost/mendes";

			// Database credentials
			final String USER = "root";
			final String PASS = "admin";

			 conn = DriverManager.getConnection(DB_URL, USER, PASS);

			
		} catch (SQLException e) {
			// JOptionPane.showMessageDialog(null, "ConexaoDAO" + e.getMessage());
			System.out.print(e.getMessage());
		}
		return conn;
	}

	public void insertProduto(Connection conn, Produto pro)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		try {
		String query = " insert into PRODUTO (preco, cor, modelo) values (?, ?, ?)";

		// create the mysql insert preparedstatement
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		preparedStatement.setString(1, pro.getPreco());
		preparedStatement.setString(2, pro.getCor());
		preparedStatement.setString(3, pro.getModelo());


		// execute the preparedstatement
		preparedStatement.execute();

		conn.close();
		
		
		
		
		
//
//			PreparedStatement pstmt = con.prepareStatement(criando);
//			System.out.println("entrou2");
//			pstmt.execute();
//			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
