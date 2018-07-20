
package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connecntDB {
	public static Connection makeConnection() throws SQLException {
		// 드라이버 로딩
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 성공......");
		//드라이버 연결
			String url = "jdbc:mysql://localhost:3306/book?serverTimezone=UTC"; //서버 주소 및 데이터베이스 이름
			con = DriverManager.getConnection(url, "root", "hhj6325228");
			System.out.println("데이터베이스 연결 성공......");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버가 존재하지 않습니다......");
			e.printStackTrace();
		}
		return con;	
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		connecntDB cd =new connecntDB();
		Connection con = cd.makeConnection();
		
		try { 
			Statement st =con.createStatement();
			String sql = "SELECT * from asd";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt("asd");
				String title =rs.getString("title");
				System.out.println(id + " " + title);
			}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	





