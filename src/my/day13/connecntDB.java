
package my.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connecntDB {
	public static Connection makeConnection() throws SQLException {
		// ����̹� �ε�
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� �ε� ����......");
		//����̹� ����
			String url = "jdbc:mysql://localhost:3306/book?serverTimezone=UTC"; //���� �ּ� �� �����ͺ��̽� �̸�
			con = DriverManager.getConnection(url, "root", "hhj6325228");
			System.out.println("�����ͺ��̽� ���� ����......");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����̹��� �������� �ʽ��ϴ�......");
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
	





