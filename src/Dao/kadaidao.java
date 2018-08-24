package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dto.kadaidto;

public class kadaidao {

	public static void add(int num, String name, String pass) {
		Connection co = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qualification?useSSL=false", "test", "pass");
			String sql = "INSERT INTO Student VALUES(?,?,?)";
			ps = co.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, pass);

			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
	public static void login(int num, String pass) {
		Connection co = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qualification?useSSL=false", "test", "pass");
			String sql = "SELECT * FROM Student WHERE id = ? AND pass = ?;";
			ps = co.prepareStatement(sql);
			ps.setInt(1, num);
			ps.setString(2, pass);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			System.out.println("DBアクセスに失敗しました。");
			System.out.println("存在しないユーザです。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (co != null) {
					co.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
	public static ArrayList<kadaidto> search(int num) {
		ArrayList<kadaidto> resultList = new ArrayList<kadaidto>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qualification?useSSL=false", "test", "pass");
			String sql = "SELECT * FROM Qualification WHERE sid = ? ORDER BY date+0;";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String date = rs.getString("date");
				int sid = rs.getInt("sid");
				String result = rs.getString("result");
				resultList.add(new kadaidto(id, name, date, sid, result));
			}
		} catch (SQLException e) {
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
		return resultList;
	}
	public static void Insert(String name, String date, int sid, String result) {
		Connection co = null;
		PreparedStatement ps = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			co = DriverManager.getConnection("jdbc:mysql://localhost:3306/Qualification?useSSL=false", "test", "pass");
			String sql = "INSERT INTO Qualification(name,date,sid,result) VALUES(?,?,?,?)";
			ps = co.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, date);
			ps.setInt(3, sid);
			ps.setString(4, result);

			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("数字を指定してください。");
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}
	}
}