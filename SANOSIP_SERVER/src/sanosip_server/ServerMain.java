/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sanosip_server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import sanosip_server_impl.RemoteFactoryImpl;


/**
 *
 * @author cmjd
 */
public class ServerMain {
    public static void main(String args[]){
        System.setProperty("java.rmi.server.hostname","localhost");
        try {
            Registry customerRegistry = LocateRegistry.createRegistry(1099);
            customerRegistry.rebind("rmi://localhost:1099/sanosip_2_0", new RemoteFactoryImpl());
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
