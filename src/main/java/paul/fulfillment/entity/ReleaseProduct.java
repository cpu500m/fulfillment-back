package paul.fulfillment.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.fulfillment.entity
 * @fileName : RelaseProduct
 * @date : 2024-09-21
 */
@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class ReleaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="release_product_id")
    private Long id;
    @Column(nullable = false)
    private String productName;
    private int quantity;
    private boolean useExpireDate;
    private LocalDateTime expireDate;
    private boolean isInspecting;
    @OneToMany(mappedBy = "releaseProduct", fetch = FetchType.LAZY)
    private List<LocationReleaseProduct> locationReleaseProducts;

    @OneToMany(mappedBy = "releaseProduct", fetch = FetchType.LAZY)
    private List<SupplierReleaseProduct> supplierReleaseProducts;

    @OneToMany(mappedBy = "releaseProduct", fetch = FetchType.LAZY)
    private List<ReleaseSalesProduct> releaseSalesProducts;

    @ManyToOne
    @JoinColumn(name = "product_inspection_id")
    private ProductInspection productInspection;
}
