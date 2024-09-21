package paul.algorithmboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.algorithmboard.entity
 * @fileName : LocationReleaseProduct
 * @date : 2024-09-21
 */

@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class LocationReleaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lcoation_release_product_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;

    @ManyToOne
    @JoinColumn(name="release_product_id", nullable = false)
    private ReleaseProduct releaseProduct;
}
