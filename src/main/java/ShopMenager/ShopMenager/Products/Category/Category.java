package ShopMenager.ShopMenager.Products.Category;

import ShopMenager.ShopMenager.Products.Product.Product;
import ShopMenager.ShopMenager.Products.Property.Property;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name ="CATEGORY")
public class Category {
    @Id
    @Column(
            name = "category_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    private Long id;

    private String categoryName;


    @OneToMany(mappedBy = "categoryId")
    private List<Product> products;

    @OneToMany(mappedBy = "categoryId")
    private List<Property> properties;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

}
