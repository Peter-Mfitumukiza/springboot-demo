//package com.cgroup.smis.model;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Integer id;
//    @Column(name = "firstname", nullable = false, length = 100)
//    private String firstname;
//    @Column(name = "lastname", nullable = false, length = 100)
//    private String lastname;
//    @Column(name = "telephone", nullable = false, length = 10, unique = true)
//    private Integer telephone;
//    @Column(name = "email", nullable = false, length = 50, unique = true)
//    private String email;
//
//    @Column(name = "username", nullable = false, length = 50, unique = true)
//    private String username;
//    @Column(name = "password", nullable = false, length = 128)
//    private String password;
//    @Column(name = "dob", nullable = false)
//    private Date dob;
//    @Column(name = "gender", nullable = false, length = 10)
//    private String gender;
//
//    public Employee(){};
//
//    public Employee(Integer id, String firstname, String lastname, Integer telephone,String email,
//                    String username,String password,Date dob, String gender){
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.email = email;
//        this.telephone = telephone;
//        this.password = password;
//        this.dob = dob;
//        this.gender = gender;
//        this.username = username;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getLastname() {
//        return lastname;
//    }
//
//    public void setLastname(String lastname) {
//        this.lastname = lastname;
//    }
//
//    public Integer getTelephone() {
//        return telephone;
//    }
//
//    public void setTelephone(Integer telephone) {
//        this.telephone = telephone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//}
