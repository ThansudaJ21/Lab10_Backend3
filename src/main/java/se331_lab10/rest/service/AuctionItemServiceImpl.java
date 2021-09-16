package se331_lab10.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331_lab10.rest.dao.AuctionItemDao;
import se331_lab10.rest.entity.AuctionItem;

@Service
public class AuctionItemServiceImpl implements AuctionItemService{

    @Autowired
    AuctionItemDao auctionItemDao;


    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return auctionItemDao.getAuctionItems(pageSize,page);
    }

    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionItemDao.getAuctionItem(id);
    }

    //@Override
    //public Page<AuctionItem> getAuctionItems(String title, Pageable pageable) {
    //    return auctionItemDao.getAuctionItem(title,pageable);
    //}

    @Override
    public Page<AuctionItem> getAuctionItems(Integer amount, Pageable pageable) {
        return auctionItemDao.getAuctionItem(amount,pageable);
    }
}
