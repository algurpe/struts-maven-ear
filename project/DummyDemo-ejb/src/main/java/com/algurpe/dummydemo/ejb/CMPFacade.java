package com.algurpe.dummydemo.ejb;

import com.algurpe.dummydemo.HelloMessageMethod;
import com.algurpe.dummydemo.entity.AppTable1Model;
import com.algurpe.dummydemo.entity.AppTable2Model;
import com.algurpe.dummydemo.entity.AppTable3Model;
import com.algurpe.dummydemo.foundation.interf.INames;
//import com.algurpe.dummydemo.helper.SomeHelper;
import com.algurpe.dummydemo.interf.ICMPFacadeLocal;
import com.algurpe.dummydemo.interf.ICMPFacadeRemote;

public class CMPFacade implements ICMPFacadeLocal, ICMPFacadeRemote {

	public String printHelloMessage(String msg) {
		// TODO Auto-generated method stub
		return null;
	}

	public int performAddition(int value1, int value2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void executeCMPProcess(AppTable1Model model1, AppTable2Model model2,
			AppTable3Model model3) throws Exception {
		// TODO Auto-generated method stub

	}

	public AppTable1Model findAppTable1ByContents(String contents) {
		// TODO Auto-generated method stub
		return null;
	}

	public AppTable2Model findAppTable2ByContents(String contents) {
		// TODO Auto-generated method stub
		return null;
	}

	public AppTable3Model findAppTable3ByContents(String contents) {
		// TODO Auto-generated method stub
		return null;
	}

	public void cleanupTables() throws Exception {
		// TODO Auto-generated method stub

	}

}
