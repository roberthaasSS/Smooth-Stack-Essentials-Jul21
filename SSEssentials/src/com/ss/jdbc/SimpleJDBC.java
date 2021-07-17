/**
 * 
 */
package com.ss.jdbc;

/**
 * @author Robert Haas
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SimpleJDBC {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "root";
	
	public static void main(String[] args) throws ClassNotFoundException {

		Connection conn = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
//			 Legacy
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
			String sql = "SELECT * FROM library.tbl_author where authorId=?";
			prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setInt(1, 1);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				System.out.println("author name is :: " + resultSet.getString("authorName"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Legacy -Catch
		// } catch (ClassNotFoundException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		finally { // if we use try with resources approach we do not need the finally block and
					// resources will automatically get closed
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (prepareStatement != null) {
					prepareStatement.close();

				}
				if (conn != null) {
					conn.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
