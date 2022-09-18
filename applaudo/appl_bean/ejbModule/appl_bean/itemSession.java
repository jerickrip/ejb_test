package appl_bean;

import javax.ejb.Stateful;

@Stateful
public class itemSession implements itemSessionRemote {

	private static final long serialVersionUID = -5347791263789572616L;

	@Override
	public void itemSessionRemoteMethod() {
		System.out.println("Executed...");
	}
	
}
