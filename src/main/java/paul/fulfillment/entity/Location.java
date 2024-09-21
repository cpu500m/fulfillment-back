package paul.fulfillment.entity;

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
 * @packageName : paul.fulfillment.entity
 * @fileName : Location
 * @date : 2024-09-21
 */
@EqualsAndHashCode
@Getter
@Entity
@RequiredArgsConstructor
public class Location{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private Long id;

    @Column(nullable = false)
    private String locationName;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "location", fetch = FetchType.LAZY)
    private List<LocationReleaseProduct> locationReleaseProducts;
}
