package com.algurpe.dummydemo.interf;

import javax.ejb.Remote;

@Remote
public interface IBMPFacadeRemote extends IBMPFacadeLocal {
	
	public static final String JNDI_NAME = "ejb/BMPFacade";

}
