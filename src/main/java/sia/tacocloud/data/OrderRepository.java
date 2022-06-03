package sia.tacocloud.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sia.tacocloud.Order;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByDeliveryZip(String deliveryZip);

    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);

    List<Order> findByDeliveryCityOrderByNameAllIgnoreCase(String deliveryCity);

    @Query("SELECT o FROM Order o where o.deliveryCity='Seattle'")
    List<Order> readOrdersDeliveredInSeattle();
}
