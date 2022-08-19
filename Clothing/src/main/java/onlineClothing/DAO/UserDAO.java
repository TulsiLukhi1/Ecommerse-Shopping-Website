package onlineClothing.DAO;

import onlineClothing.model.UserDetail;

public interface UserDAO {
	
	public boolean registerUser(UserDetail user);
	public boolean updateUser(UserDetail user);
	public UserDetail getUser(String userName);

}
