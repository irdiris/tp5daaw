package com.example.tp5daaw.Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {

	public UserDAO() {
		
	}

	// connection to database
	public Connection connectDB() throws InstantiationException, IllegalAccessException {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybd", "root", "Bakaazzedine456");
			System.out.println("Connection avec succes a la base de donnees !");
		} catch (ClassNotFoundException cnf) {
			System.out.print("Driver non chargé...");
		} catch (SQLException sqlex) {
			System.out.println("Incapable de connecter a la base de donnees...");
		}
		return connection;

	}

	
	
	
	public void addUser(User user) throws InstantiationException, IllegalAccessException {
		
		Connection connection = null;
		String requete;
		PreparedStatement stmt;
		
		connection = connectDB();

		try {

			requete = "INSERT INTO users(firstname,lastname,adress,phone,username,password) VALUES(?,?,?,?,?,?)";			
			stmt = connection.prepareStatement(requete);
			
			stmt.setString(1,user.getFirstname());
			stmt.setString(2,user.getLastname());
			stmt.setString(3,user.getAdress());
			stmt.setString(4,user.getPhone());
			stmt.setString(5,user.getUsername());
			stmt.setString(6,user.getPassword());
			
			stmt.executeUpdate();
			stmt.close();

			System.out.println("Inserted !");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public User getUser(int ID)
			throws InstantiationException, IllegalAccessException {
		
		Connection connection = null;
		String requete;
		PreparedStatement statement;
		
		User user = null;

		try {
			
			connection = connectDB();
			
			requete = "SELECT * FROM users WHERE id = ? ";
			statement = connection.prepareStatement(requete);
			statement.setInt(1, ID);
			
			
			ResultSet result = statement.executeQuery();			
			
	        if (result.next()) {
	            user = new User();
	            user.setFirstname(result.getString("firstname"));
	            user.setLastname(result.getString("lastname"));
	            user.setAdress(result.getString("adress"));
	            user.setPhone(result.getString("phone"));
	            user.setUsername(result.getString("username"));
	            user.setPassword(result.getString("password"));
	            

	        }
	        
			statement.close();

			System.out.println("succés !");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return user;
	}
	
	public ArrayList<User> getUsers() throws InstantiationException, IllegalAccessException {
		
		Connection connection = null;
		String requete;
		PreparedStatement statement;
		
		User user = null;
		ArrayList<User> usersList = new ArrayList<User>();
		
		try {
			
			connection = connectDB();
			
			requete = "SELECT * FROM users";
			statement = connection.prepareStatement(requete);
			
			
			ResultSet result = statement.executeQuery();			
			
	        while (result.next()) {
	        	
	            user = new User();
	            user.setFirstname(result.getString("firstname"));
	            user.setLastname(result.getString("lastname"));
	            user.setAdress(result.getString("adress"));
	            user.setPhone(result.getString("phone"));
	            user.setUsername(result.getString("username"));
	            user.setPassword(result.getString("password"));
	            
	            
	            usersList.add(user);
	        }
	        
			statement.close();

			System.out.println("Users --- succés !");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return usersList;
	}
	
	public User checkLogin(String username, String password)
			throws InstantiationException, IllegalAccessException {
		
		Connection connection = null;
		String requete;
		PreparedStatement statement;
		
		User user = null;

		try {
			
			connection = connectDB();
			
			requete = "SELECT * FROM users WHERE username = '"+username+"' and password ='" +password+"'";
			statement = connection.prepareStatement(requete);
//			statement.setString(1, username);
//			statement.setString(2, password);
			
			ResultSet result = statement.executeQuery();			
			
	        if (result.next()) {
	            user = new User();
	            user.setFirstname(result.getString("firstname"));
	            user.setLastname(result.getString("lastname"));
	            user.setAdress(result.getString("adress"));
	            user.setPhone(result.getString("phone"));
	            user.setUsername(result.getString("username"));
	            user.setPassword(result.getString("password"));
	            

	        }
	        
			statement.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return user;
	}

	public User deleteUser(String username , String password) throws IllegalAccessException,IllegalAccessException {

		Connection connection = null;
		String requete;
		PreparedStatement statement;
		User user = null;
		try {

			connection = connectDB();

			requete = "DELETE FROM users WHERE username = ? and password = ?";
			statement = connection.prepareStatement(requete);
			statement.setString(1, username);
			statement.setString(2, password);
			statement.executeUpdate();

			statement.close();
			System.out.println("user"+" "+username+" "+"is deleted");
		} catch (SQLException e) {
			System.out.println(e);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public User updateUser(User user, int ID) throws IllegalAccessException {
		Connection connection = null;
		String requete;
		PreparedStatement statement;

		try {
			connection = connectDB();
			requete ="UPDATE users SET Password = ?,Firstname = ?,Lastname = ?,Adress = ?,Phone = ?,Username = ? WHERE id=  ?";
			statement = connection.prepareStatement(requete);
			statement.setString(1, user.getPassword());
			statement.setString(2,user.getFirstname());
			statement.setString(3,user.getLastname());
			statement.setString(4,user.getAdress());
			statement.setString(5,user.getPhone());
			statement.setString(6,user.getUsername());
			statement.setInt(7, ID);
			statement.executeUpdate();
			statement.close();
			System.out.println("updated !");

		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;



	}





}
