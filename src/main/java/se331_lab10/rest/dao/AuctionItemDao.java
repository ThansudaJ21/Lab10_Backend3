package se331_lab10.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331_lab10.rest.entity.AuctionItem;

public interface AuctionItemDao {
    Integer getAuctionItemSize();
    AuctionItem getAuctionItem(Long id);
    Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page);
    Page<AuctionItem> getAuctionItem(String name, Pageable page);
}
