package onlineClothing.DAO;

import onlineClothing.model.OrderDetail;

public interface OrderDAO {
	public boolean saveOrder(OrderDetail orderDetail);
    public boolean updateCart(String username);
	
}
