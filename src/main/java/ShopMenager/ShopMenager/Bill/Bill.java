package ShopMenager.ShopMenager.Bill;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name ="BILL")
public class Bill {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private LocalDate saleDate;
    private Long customerId;
}
