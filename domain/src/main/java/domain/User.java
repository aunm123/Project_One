package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by timhuo on 2017/2/10.
 */
@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
    private double salary;
    private Date birthday;
    private String gender;
    private String station;
    private String telephone;
    private String remark;

    public User() {
    }

    public User(String username, String password, double salary, Date birthday, String gender, String station, String telephone, String remark) {
        this.username = username;
        this.password = password;
        this.salary = salary;
        this.birthday = birthday;
        this.gender = gender;
        this.station = station;
        this.telephone = telephone;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", station='" + station + '\'' +
                ", telephone='" + telephone + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
