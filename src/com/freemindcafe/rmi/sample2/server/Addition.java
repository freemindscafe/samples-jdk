package com.freemindcafe.rmi.sample2.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Addition extends UnicastRemoteObject implements IAddition {
	
	public Addition () throws RemoteException {   }
	
	public int add(int a, int b) throws RemoteException {
		int result=a+b;
		return result;
	}

}
