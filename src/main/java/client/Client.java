package client;

import server.TheRootFinder;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static final String UNIQUE_BINDING_NAME = "server.finder";

    public static void main(String[] args) throws RemoteException, NotBoundException {

        Registry registry = LocateRegistry.getRegistry(7777);
        TheRootFinder rootFinder = (TheRootFinder) registry.lookup(UNIQUE_BINDING_NAME);
        String result = rootFinder.find(1, 5, 4);
        System.out.println(result);

    }

}