package se331_lab10.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331_lab10.rest.entity.AuctionItem;
import se331_lab10.rest.repository.AuctionItemRepository;

@Repository
@Profile("db")
public class AuctionItemDaoDbImpl implements AuctionItemDao {

    @Autowired
    AuctionItemRepository auctionItemRepository;

    @Override
    public Integer getAuctionItemSize() {
        return Math.toIntExact(auctionItemRepository.count());
    }

    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionItemRepository.findById(id).orElse(null);
    }

    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return auctionItemRepository.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Page<AuctionItem> getAuctionItem(String name, Pageable page) {
        return auctionItemRepository.findByDescriptionIgnoreCaseContaining(name, page);
    }
}
