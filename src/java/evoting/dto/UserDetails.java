/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoting.dto;

/**
 *
 * @author Dell
 */
public class UserDetails {

    @Override
    public String toString() {
        return "UserDetails{" + "userId=" + userId + ", password=" + password + ", userName=" + userName + ", address=" + address + ", city=" + city + ", email=" + email + ", mobileNo=" + mobileNo + '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public UserDetails(String userId, String password, String userName, String address, String city, String email, long mobileNo) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.address = address;
        this.city = city;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public UserDetails() {
    }
    private String userId;
    private String password;
    private String userName;
    private String address;
    private String city;
    private String email;
    private long mobileNo;
}
