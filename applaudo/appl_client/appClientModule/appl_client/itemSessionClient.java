package appl_client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import appl_bean.itemSessionRemote;

public class itemSessionClient {

	public static void main(String[] args) throws NamingException{
		Context ctx = itemSessionClient.getInitialContext();
		itemSessionRemote isr = (itemSessionRemote) ctx.lookup("itemSession/remote");
		isr.itemSessionRemoteMethod();
	}
	
	public static Context getInitialContext() throws NamingException{
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingFactory");
		props.setProperty("java.naming.factory.url.pkgs","org.jboss.naming");
		props.setProperty("java.naming.provider.url","127.0.0.1:1099");
		return new InitialContext(props);
	}

}
