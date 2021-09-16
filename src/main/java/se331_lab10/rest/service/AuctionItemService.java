package se331_lab10.rest.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331_lab10.rest.entity.AuctionItem;


public interface AuctionItemService {
    Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page);
    AuctionItem getAuctionItem(Long id);
    //Page<AuctionItem> getAuctionItems(String title, Pageable pageable);
    Page<AuctionItem> getAuctionItems(Integer amount, Pageable pageable);
}
