package appl_bean;

import java.io.Serializable;

import javax.ejb.Remote;

@Remote
public interface itemSessionRemote extends Serializable {
	public void itemSessionRemoteMethod();
}
