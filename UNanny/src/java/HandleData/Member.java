package HandleData;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member {
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    private Date   birthday;
    private String mail;
    private String phone;
    private String country;
    private String university;
    private String department;
    private Integer totalRateScore;
    private Integer totalReviews;
    private Date universityRegDate;
    private String siteRegDate;
    private Gender gender;
    private boolean master;
    private String picture;
    private byte[] picBuffer;
    private String profileStatus;

    public Member(String username) {
        this.userName = username;
    }

    public Member(String username, String password) {
        this.userName = username;
        this.passWord = password;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public void setPassWord(String password) {
        this.passWord = password;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMaster(boolean master) {
        this.master = master;
    }

    public void setTotalRateScore(Integer score) {
        this.totalRateScore = score;
    }
    
    public void setTotalReviews(Integer reviews) {
        this.totalReviews = reviews;
    }

    public void setUniversityRegDate(Date universityRegDate) {
        this.universityRegDate = universityRegDate;
    }

    public void setSiteRegDate(String siteRegDate) {
        this.siteRegDate = siteRegDate;
    }
    
    public void setProfileStatus(String message) {
        this.profileStatus = message;
    }

    public void setPicture(java.sql.Blob pic) {
        if(pic == null){
            picBuffer = null;
            return;
        }
        try {
            picBuffer = pic.getBytes(1, (int)pic.length());
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setPicture(byte[] pic) {
        picBuffer = new byte[pic.length];
        System.arraycopy(pic, 0, picBuffer, 0, pic.length);
    }

    public void setPicture(File pic) {
        DataInputStream in = null;
        try {
            picBuffer = new byte[(int)pic.length()];
            in = new DataInputStream(new FileInputStream(pic));
            in.read(picBuffer);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
//        finally {
//            try {
//               in.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        finally {
//            try {
//               in.close();
//            } catch (IOException ex) {
//                Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }


    public String getUserName() {
        return this.userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    
    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMail() {
        return this.mail;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getDepartment() {
        return this.department;
    }

    public String getUniversity() {
        return this.university;
    }

    public String getCountry() {
        return this.country;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Integer getTotalRateScore() {
        return this.totalRateScore;
    }

    public Integer getTotalReviews() {
        return this.totalReviews;
    }
    
    public Date getUniversityRegDate() {
        return this.universityRegDate;
    }

    public String getSiteRegDate() {
        return this.siteRegDate;
    }

    public boolean getMaster() {
        return this.master;
    }

    public String getProfileStatus() {
        return this.profileStatus;
    }

    public byte[] getPicture() {
        return this.picBuffer;
    }
}
