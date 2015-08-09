/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.Date;

/**
 *
 * @author Wiranji Dinelka
 */
public class student {
    private String firstName;
    private String lastName;
    private String school;
    private String address;
    private int alYear;
    private int contactNo;
    private String gender;
    private Date date;
    private String nic;
    private String gurName;
    private int  gurContactNo;
    
    public student(String firstName,String lastName,String school,String address,int alYear,int contactNo,String gender,String nic,Date date,String gurName,int  gurContactNo)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.school=school;
        this.address=address;
        this.alYear=alYear;
        this.contactNo=contactNo;
        this.gender=gender;
        this.date=date;
        this.nic=nic;
        this.gurName=gurName;
        this.gurContactNo=gurContactNo;
        
        
        
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the school
     */
    public String getSchool() {
        return school;
    }

    /**
     * @param school the school to set
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the alYear
     */
    public int getAlYear() {
        return alYear;
    }

    /**
     * @param alYear the alYear to set
     */
    public void setAlYear(int alYear) {
        this.alYear = alYear;
    }

    /**
     * @return the contactNo
     */
    public int getContactNo() {
        return contactNo;
    }

    /**
     * @param contactNo the contactNo to set
     */
    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the gurName
     */
    public String getGurName() {
        return gurName;
    }

    /**
     * @param gurName the gurName to set
     */
    public void setGurName(String gurName) {
        this.gurName = gurName;
    }

    /**
     * @return the gurContactNo
     */
    public int getGurContactNo() {
        return gurContactNo;
    }

    /**
     * @param gurContactNo the gurContactNo to set
     */
    public void setGurContactNo(int gurContactNo) {
        this.gurContactNo = gurContactNo;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }
    
}
