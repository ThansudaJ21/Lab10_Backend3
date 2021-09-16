package se331_lab10.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331_lab10.rest.entity.AuctionItem;

import java.util.List;
import java.util.Optional;

public interface AuctionItemRepository extends JpaRepository<AuctionItem,Long> {
    List<AuctionItem> findAll();
    Page<AuctionItem> findByDescriptionIgnoreCaseContaining
            (String description, Pageable pageRequest);
    Page<AuctionItem> findBySuccessfulBidIgnoreCaseContaining
            (String description, Pageable pageRequest);
}
