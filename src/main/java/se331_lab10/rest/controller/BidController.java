package se331_lab10.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import se331_lab10.rest.entity.Bid;
import se331_lab10.rest.service.BidService;
import se331_lab10.rest.util.LabMapper;

@RestController
public class BidController {
    @Autowired
    BidService bidService;

    @GetMapping("/bids")
    ResponseEntity<?> getBids(){
        return ResponseEntity.ok(LabMapper.INSTANCE.getBidDTO
                ((Bid) bidService.getAllBid()));
    }
}
