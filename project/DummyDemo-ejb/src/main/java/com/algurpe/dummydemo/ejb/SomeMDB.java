package com.algurpe.dummydemo.ejb;


import com.algurpe.dummydemo.HelloMessageMethod;
import com.algurpe.dummydemo.entity.AppTable1Model;
import com.algurpe.dummydemo.foundation.interf.INames;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJBException;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/*
 * At the beginning of a JMS client program, you usually inject a connection factory resource into a ConnectionFactory object. For example, the following code fragment specifies a resource whose JNDI name is jms/ConnectionFactory and assigns it to a ConnectionFactory object:

@Resource(mappedName="jms/ConnectionFactory")
private static ConnectionFactory connectionFactory;

 */
 
@MessageDriven( mappedName = "jms/TestQueue", activationConfig = {
    @ActivationConfigProperty( propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge" ),
    @ActivationConfigProperty( propertyName = "destinationType", propertyValue = "javax.jms.Queue" )
} )
public class SomeMDB implements MessageListener{
	
	@PersistenceContext( unitName = INames.PU_NAME )
    private EntityManager em;
 
    //@Override
    public void onMessage( Message message ) {
        TextMessage txtMsg = ( TextMessage ) message;
 
        try {
            if ( txtMsg.getText() == null ) {
                throw new EJBException( "Message is null..." );
            } else {
            	HelloMessageMethod snm = new HelloMessageMethod();
 
                AppTable1Model model = new AppTable1Model();
                model.setContents( snm.helloMethod( txtMsg.getText() ) );
                em.persist( model );
            }
        } catch ( JMSException ex ) {
            throw new EJBException( "Something wrong with message..." );
        }
    }

}
