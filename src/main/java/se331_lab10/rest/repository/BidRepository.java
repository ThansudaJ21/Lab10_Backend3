package se331_lab10.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se331_lab10.rest.entity.Bid;

public interface BidRepository extends JpaRepository<Bid,Long> {

}
