package paul.fulfillment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.fulfillment.entity
 * @fileName : SalesProduct
 * @date : 2024-09-21
 */
@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class SalesProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_product_id")
    private Long id;
    @Column(nullable = false)
    private String productName;
    private int quantity;
    private boolean isSale;
    private Double salePercent;

    @OneToMany(mappedBy = "salesProduct", fetch = FetchType.LAZY)
    private List<ReleaseSalesProduct> releaseSalesProducts;}
