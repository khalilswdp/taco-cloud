package sia.tacocloud.data;

import sia.tacocloud.Order;

public interface OrderRepository {

    Order save(Order order);
}
