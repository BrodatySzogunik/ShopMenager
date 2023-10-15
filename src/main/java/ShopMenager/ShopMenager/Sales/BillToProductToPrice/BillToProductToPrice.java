package ShopMenager.ShopMenager.Sales.BillToProductToPrice;

import ShopMenager.ShopMenager.Products.Product.Product;
import ShopMenager.ShopMenager.Sales.Bill.Bill;
import jakarta.persistence.*;

@Entity
@Table(name ="BILL_PRODUCT_PRICE")
public class BillToProductToPrice {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(
            name="bill_id",
            insertable=false,
            updatable=false)
    private Bill billId;

    @ManyToOne
    @JoinColumn(
            name="product_id",
            insertable=false,
            updatable=false)
    private Product productId;

    @Column(
            name = "sale_price"
    )
    private double salePrice;

}
