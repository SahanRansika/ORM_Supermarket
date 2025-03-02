package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "orderdetails")
public class Orderdetails {
//    @Id
//    private int id;

    @EmbeddedId
    private OrderdetailsId id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @MapsId("itemId")
    private Item item;

    private int quantity;

    @Column(name = "price",precision = 10,scale = 2)
    private BigDecimal unitPrice;
}
