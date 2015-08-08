/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server_impl;

import controller.RemoteFactory;
import controller.paymentController;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 *
 * @author cmjd
 */
public class RemoteFactoryImpl extends UnicastRemoteObject implements RemoteFactory {

    public RemoteFactoryImpl() throws RemoteException{
        super();
    }
    
    
    @Override
    public paymentController getPaymentController() throws RemoteException{
        return new paymentController_impl();
    }

    
}
