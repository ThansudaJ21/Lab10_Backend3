package se331_lab10.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import se331_lab10.rest.entity.AuctionItem;
import se331_lab10.rest.service.AuctionItemService;
import se331_lab10.rest.util.LabMapper;

@Controller
public class AuctionItemController {
    @Autowired
    AuctionItemService auctionItemService;

    @GetMapping("auctionitem")
    public ResponseEntity<?> getAuctionItemList (
            @RequestParam(value = "_limit", required = false) Integer perPage
            , @RequestParam(value = "_page", required = false) Integer page
            , @RequestParam(value = "desc" , required = false) String desc ){
        perPage = perPage == null ? 5 : perPage;
        page = page == null ? 1 : page;
        Page<AuctionItem> pageOutput;
        if (desc == null) {
            pageOutput = auctionItemService.getAuctionItems(perPage, page);
        } else {
            pageOutput = auctionItemService.getAuctionItems(desc, PageRequest.of(page-1, perPage));
        }
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count", String.valueOf(pageOutput.getTotalElements()));
        return new ResponseEntity<>(LabMapper.INSTANCE.getAuctionItemDto(pageOutput.getContent())
                ,responseHeader, HttpStatus.OK);

    }
}
