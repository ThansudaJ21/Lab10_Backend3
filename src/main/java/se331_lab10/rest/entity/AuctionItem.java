package se331_lab10.rest.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AuctionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    Long id;
    String type;
    String description;

    @OneToMany(mappedBy = "item")
    @Builder.Default
    List<Bid> bids = new ArrayList<>();

    @OneToOne
    Bid successfulBid;
}
