package se331_lab10.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331_lab10.rest.entity.AuctionItem;
import se331_lab10.rest.entity.Bid;
import se331_lab10.rest.repository.AuctionItemRepository;
import se331_lab10.rest.repository.BidRepository;

import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDateTime;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionItemRepository auctionItemRepository;

    @Autowired
    BidRepository bidRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        AuctionItem auc1, auc2,auc3,auc4,auc5;
        Bid bid1,bid2,bid3,bid4,bid5,bid6,bid7,bid8,
                bid9,bid10,bid11,bid12,bid13,bid14,bid15;

        bid1 = bidRepository.save(Bid.builder()
                .amount(1000)
                .detetime(LocalDateTime.now())
                .build());

        bid2 = bidRepository.save(Bid.builder()
                .amount(2000)
                .detetime(LocalDateTime.now())
                .build());
        bid3 = bidRepository.save(Bid.builder()
                .amount(3500)
                .detetime(LocalDateTime.now())
                .build());
        bid4 = bidRepository.save(Bid.builder()
                .amount(5000)
                .detetime(LocalDateTime.now())
                .build());
        bid5 = bidRepository.save(Bid.builder()
                .amount(7000)
                .detetime(LocalDateTime.now())
                .build());
        bid6 = bidRepository.save(Bid.builder()
                .amount(6000)
                .detetime(LocalDateTime.now())
                .build());
        bid7 = bidRepository.save(Bid.builder()
                .amount(3000)
                .detetime(LocalDateTime.now())
                .build());
        bid8 = bidRepository.save(Bid.builder()
                .amount(4000)
                .detetime(LocalDateTime.now())
                .build());
        bid9 = bidRepository.save(Bid.builder()
                .amount(2000)
                .detetime(LocalDateTime.now())
                .build());
        bid10 = bidRepository.save(Bid.builder()
                .amount(1000)
                .detetime(LocalDateTime.now())
                .build());
        bid11 = bidRepository.save(Bid.builder()
                .amount(8000)
                .detetime(LocalDateTime.now())
                .build());
        bid12 = bidRepository.save(Bid.builder()
                .amount(5000)
                .detetime(LocalDateTime.now())
                .build());
        bid13 = bidRepository.save(Bid.builder()
                .amount(3500)
                .detetime(LocalDateTime.now())
                .build());
        bid14 = bidRepository.save(Bid.builder()
                .amount(4000)
                .detetime(LocalDateTime.now())
                .build());
        bid15 = bidRepository.save(Bid.builder()
                .amount(5000)
                .detetime(LocalDateTime.now())
                .build());


        auc1 = auctionItemRepository.save(AuctionItem.builder()
                .type("souvenir")
                .description("Autographed music memorabilia").build());
        auc2 = auctionItemRepository.save(AuctionItem.builder()
                .type("accessories")
                .description("Popular home accessories").build());
        auc3 = auctionItemRepository.save(AuctionItem.builder()
                .type("Flight")
                .description("Flight packages").build());
        auc4 = auctionItemRepository.save(AuctionItem.builder()
                .type("souvenir")
                .description("Fine dining restaurant certificates").build());
        auc5 = auctionItemRepository.save(AuctionItem.builder()
                .type("consumables")
                .description("High-end homeware").build());
//1
        bid1.setItem(auc1);
        auc1.getBids().add(bid1);
        bid2.setItem(auc1);
        auc1.getBids().add(bid2);
        bid3.setItem(auc1);
        auc1.getBids().add(bid3);

        auc1.setSuccessfulBid(bid3);
        //2
        bid4.setItem(auc2);
        auc2.getBids().add(bid4);
        bid5.setItem(auc2);
        auc2.getBids().add(bid5);
        bid6.setItem(auc2);
        auc2.getBids().add(bid6);

        auc2.setSuccessfulBid(bid5);
        //3
        bid7.setItem(auc3);
        auc3.getBids().add(bid7);
        bid8.setItem(auc3);
        auc3.getBids().add(bid8);
        bid9.setItem(auc3);
        auc3.getBids().add(bid8);

        auc3.setSuccessfulBid(bid3);
        //4
        bid10.setItem(auc4);
        auc4.getBids().add(bid10);
        bid11.setItem(auc4);
        auc4.getBids().add(bid11);
        bid12.setItem(auc4);
        auc4.getBids().add(bid12);

        auc4.setSuccessfulBid(bid11);
        //5
        bid13.setItem(auc5);
        auc5.getBids().add(bid13);
        bid14.setItem(auc5);
        auc5.getBids().add(bid14);
        bid15.setItem(auc5);
        auc5.getBids().add(bid15);

        auc5.setSuccessfulBid(bid15);
    }
}
