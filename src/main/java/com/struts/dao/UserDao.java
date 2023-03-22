package com.struts.dao;

import com.struts.model.User;
import com.struts.util.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private Connection connection = null;

    public User getUserById(int id){
        String sql = "SELECT * FROM USER WHERE ID = ?";

        getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("NAME"));
                user.setPhone(rs.getString("PHONE"));
                user.setUsername(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setRole(rs.getString("ROLE"));
                user.setFavourites(rs.getString("FAVOURITES"));
                user.setAbout(rs.getString("ABOUT"));
                user.setAvatar(rs.getString("AVATAR"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();

        String sql = "SELECT * FROM USER";

        getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                User user = new User();

                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("NAME"));
                user.setPhone(rs.getString("PHONE"));
                user.setUsername(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setAbout(rs.getString("ABOUT"));
                user.setFavourites(rs.getString("FAVOURITES"));
                user.setRole(rs.getString("ROLE"));
                user.setAvatar(rs.getString("AVATAR"));

                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    public void addUser(User user){
        String sql = "INSERT INTO USER(NAME, PHONE, USERNAME, PASSWORD, ABOUT, FAVOURITES, ROLE, AVATAR) VALUE(?,?,?,?,?,?,?,?)";

        getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            prepareParameter(user, preparedStatement);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user){
        String sql = "UPDATE USER SET NAME = ?, PHONE = ?, USERNAME = ?, PASSWORD = ?, ABOUT = ?, FAVOURITES = ?, ROLE = ?, AVATAR = ?" +
                     "WHERE ID=?";

        getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            prepareParameter(user, preparedStatement);
            preparedStatement.setInt(9, user.getId());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void prepareParameter(User user, PreparedStatement preparedStatement) throws SQLException {
        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getPhone());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());
        preparedStatement.setString(5, user.getAbout());
        preparedStatement.setString(6, user.getFavourites());
        preparedStatement.setString(7, user.getRole());
        preparedStatement.setString(8, user.getAvatar());
    }

    private void getConnection() {
        if(connection == null){
            connection = JDBCConnection.getJDBCConnection();
        }
    }
}
