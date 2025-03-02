package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customer_table")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nicNumber;
@OneToOne
    @JoinColumn(name ="nic_number")
    private IDCard idCard;
}


















