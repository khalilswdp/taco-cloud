package sia.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);
}
