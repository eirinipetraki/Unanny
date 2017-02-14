package UNannyDB;

import HandleData.Gender;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import HandleData.Member;

import java.util.UUID;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseMember extends DataBase {

    public boolean checkPassword(String Login, String Password) {
        String sqlStmt = null;
        boolean state = false;
        System.out.println("Login"+Login);
        System.out.println("pASSWORD"+Password);
        try {
            this.connect();
            sqlStmt = "SELECT UserName FROM `CS359Project`.`Member` "
                    + "WHERE UserName = '" + Login
                    + "' AND Password = '" + Password + "'";
            ResultSet res = statement.executeQuery(sqlStmt);
             System.out.println("EXECUTED");
            state = (res.next()) ? true : false;
            if(!res.isClosed())
                res.close();
            this.close();
            return state;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return state;
        }
    }

    public boolean checkValid(String Login) {
        String sqlStmt = null;
        boolean state = true;

        try {
            this.connect();
            sqlStmt = "SELECT UserName FROM `CS359Project`.`Member` "
                    + "WHERE UserName = '" + Login + "'";
            ResultSet res = statement.executeQuery(sqlStmt);
            state = (res.next()) ? false : true;
            if(!res.isClosed())
                res.close();
            this.close();
            return state;
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
            return state;
        }
    }
    
    public boolean setStudentStatus(String Login, String status){
        String sqlStmt = null;
        PreparedStatement pstmt = null;

        try {
            this.connect();
            connection.setAutoCommit(false);
            sqlStmt = "UPDATE `CS359Project`.`Member` SET ProfileStatus = ? WHERE UserName = '" + Login +"'";
            pstmt = connection.prepareStatement(sqlStmt);

            pstmt.setString(1, status);

            pstmt.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
            pstmt.close();
            this.close();
            return true;
        }
        catch (SQLException ex) {
            Logger.getLogger(DataBaseMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean insertStudentIntoBase(Member student){
        String sqlStmt = null;
        PreparedStatement pstmt = null;

        try {
            this.connect();
            connection.setAutoCommit(false);
            System.out.println("eimai member");
            sqlStmt = "INSERT INTO `CS359Project`.`Member`(UserName,Password,FirstName,LastName, " +
                    "BirthDay,mail,Telephone,Country,University,Department,TotalRateScore, " +
                    "TotalReviews,ProfileStatus,RegistrationDate,MasterStudent,Gender) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = connection.prepareStatement(sqlStmt);
            
            pstmt.setString(1, student.getUserName());
            pstmt.setString(2, student.getPassWord());
            pstmt.setString(3, student.getFirstName());
            pstmt.setString(4, student.getLastName());
            pstmt.setDate(5, null);
            pstmt.setString(6, student.getMail());
            pstmt.setString(7, student.getPhone());
            pstmt.setString(8, student.getCountry());
            pstmt.setString(9, student.getUniversity());
            pstmt.setString(10, student.getDepartment());
            pstmt.setInt(11, 0);
            pstmt.setInt(12, 0);
            pstmt.setString(13, student.getProfileStatus());
            pstmt.setString(14, new java.util.Date().toString());
            pstmt.setBoolean(15, student.getMaster());
            pstmt.setString(16, student.getGender().toString());

            pstmt.executeUpdate();
            connection.commit();
            connection.setAutoCommit(true);
            pstmt.close();
            this.close();
            return true;
        }
        catch (SQLException ex) {
            Logger.getLogger(DataBaseMember.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Member getStudentFromBase(String Login){
        Member newStudent = new Member(Login);
        String sqlStmt = null;

        try {
            this.connect();
            sqlStmt = "SELECT UserName,FirstName,LastName,BirthDay, "
                    + "Country,University,Department,Picture,TotalRateScore, "
                    + "TotalReviews,ProfileStatus,MasterStudent,Gender "
                    + "FROM `CS359Project`.`Member` WHERE UserName = '"
                    + Login + "'";
            ResultSet res = statement.executeQuery(sqlStmt);
            if(res.next()){
                newStudent.setUserName(res.getString("UserName"));
                newStudent.setFirstName(res.getString("FirstName"));
                newStudent.setLastName(res.getString("LastName"));
                newStudent.setBirthday(res.getDate("BirthDay"));
                newStudent.setCountry(res.getString("Country"));
                newStudent.setUniversity(res.getString("University"));
                newStudent.setDepartment(res.getString("Department"));
                newStudent.setPicture(res.getBlob("Picture"));
                newStudent.setTotalRateScore(res.getInt("TotalRateScore"));
                newStudent.setTotalReviews(res.getInt("TotalReviews"));
                newStudent.setProfileStatus(res.getString("ProfileStatus"));
                newStudent.setMaster(res.getBoolean("MasterStudent"));
                newStudent.setGender(Gender.fromString(res.getString("Gender")));
            }
            if(!res.isClosed())
                res.close();
            this.close();
        }
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return newStudent;
    }

    public String[] getSuggestedMembers(String UserName){
        Vector<String> suggested = new Vector<String>();
        
        if(suggested.size()>0){
            String tmp[] = new String[suggested.size()];
            return suggested.toArray(tmp);
        } else {
            return null;
        }
    }

    
   

   
}
