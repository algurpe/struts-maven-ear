package com.algurpe.dummydemo.interf;

import com.algurpe.dummydemo.entity.AppTable1Model;
import com.algurpe.dummydemo.entity.AppTable2Model;
import com.algurpe.dummydemo.entity.AppTable3Model;
import java.io.Serializable;
import javax.ejb.Local;
 
@Local
public interface IBMPFacadeLocal extends Serializable{
	
	public void executeBMPProcess( AppTable1Model model1, AppTable2Model model2, AppTable3Model model3 ) throws Exception;
	 
    public void cleanupTables() throws Exception;

}
