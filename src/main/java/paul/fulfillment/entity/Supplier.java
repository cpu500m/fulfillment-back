package paul.algorithmboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.algorithmboard.entity
 * @fileName : Supplier
 * @date : 2024-09-21
 */
@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private Long id;
    @Column(nullable = false)
    private String supplier_name;

    @OneToMany(mappedBy = "supplier",fetch = FetchType.LAZY)
    private List<SupplierReleaseProduct> supplierReleaseProducts;
}
