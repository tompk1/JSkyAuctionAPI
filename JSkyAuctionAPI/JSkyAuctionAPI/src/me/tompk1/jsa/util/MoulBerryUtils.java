package me.tompk1.jsa.util;

import java.util.ArrayList;

import me.tompk1.jsa.hypixel.auction.Auction;
import me.tompk1.jsa.hypixel.item.Reforges;
import me.tompk1.jsa.moulberry.MoulBerryAuction;

public class MoulBerryUtils {
	public static MoulBerryAuction convertNameFormat(MoulBerryAuction auction) {
		MoulBerryAuction convertedAuction = auction;
		
		if(auction.getName().contains("+ATTRIBUTE_")) {
			try {
				convertedAuction.setName(auction.getName().split("\\+ATTRIBUTE_")[0]);
				convertedAuction.setName(convertedAuction.getName().replace("_", " "));
			} catch(Exception e) {e.printStackTrace();}
		}
		
		return convertedAuction;
	}

	public static double getProfit(ArrayList<MoulBerryAuction> lowestBINs, Auction auction) {
		for(MoulBerryAuction lowestBIN : lowestBINs) {
			String name = auction.getItem_name();
			
			name = ItemUtils.removePetStats(
						ItemUtils.removeReforges(lowestBIN.getName(), Reforges.values())
					);
			
			if(name.equalsIgnoreCase(name)) {
				return lowestBIN.getPrice() - auction.getStarting_bid();
			}
		}
		
		return -1;
	}
}
