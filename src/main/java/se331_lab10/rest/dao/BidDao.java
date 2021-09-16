package se331_lab10.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331_lab10.rest.entity.Bid;

import java.util.Optional;

public interface BidDao {
    Page<Bid> getBid(Pageable pageRequest);

    Optional<Bid> findById(Long id);
}
