/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;



/**
 *
 * @author Nilanga
 */
public class payment {

    private int paymentID;
    private int studentID;
    private String month;
    private int amount;
    private Date date;

    public payment(int paymentID, int studentID, String month, int amount, Date date) {
        this.paymentID = paymentID;
        this.studentID = studentID;
        this.month = month;
        this.amount = amount;
        this.date = date;
    }

   

    public int getPaymentID() {
        return this.paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getAmount() {
        return this.getAmount();
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
