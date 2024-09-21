package paul.algorithmboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.algorithmboard.entity
 * @fileName : InspectionProduct
 * @date : 2024-09-21
 */
@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class ProductInspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_inspection_id")
    private Long id;
    @Column(nullable = false)
    private LocalDate startDate;
    private int expectedQuantity;
    private int inspectionQuantity;
    @OneToMany(mappedBy = "productInspection", fetch = FetchType.LAZY)
    private List<ReleaseProduct> releaseProducts;
}
