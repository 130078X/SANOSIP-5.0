/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server_impl;

import controller.paymentController;
import dataAccess.payment;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

/**
 *
 * @author Nilanga
 */
public class paymentController_impl extends UnicastRemoteObject implements paymentController {

    private payment DA_payment = null;
    private payment DA_payment2 = null;

    public paymentController_impl() throws RemoteException  {
        super();
        DA_payment = new payment();
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int makePayment(model.payment monthlypayment) throws ClassNotFoundException, SQLException {
        return DA_payment.makePayment(monthlypayment);
    }

    @Override
    public int addPayment(model.payment Payment) throws ClassNotFoundException, SQLException, RemoteException {
        return DA_payment.makePayment(Payment);
    }

    @Override
    public int deletePayment(int payment_id) throws ClassNotFoundException, SQLException {
        return DA_payment.deletePayment(payment_id);
    }
}
