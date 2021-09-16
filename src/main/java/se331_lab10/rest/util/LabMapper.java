package se331_lab10.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331_lab10.rest.entity.AuctionItem;
import se331_lab10.rest.entity.AuctionItemDTO;
import se331_lab10.rest.entity.Bid;
import se331_lab10.rest.entity.BidDTO;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);
    AuctionItemDTO getAuctionItemDto(AuctionItem auctionItem);
    List<AuctionItemDTO> getAuctionItemDto(List<AuctionItem> auctionItem);

    BidDTO getBidDTO(Bid bid);
    List<BidDTO> getBidDTO(List<BidDTO> bid);
}
