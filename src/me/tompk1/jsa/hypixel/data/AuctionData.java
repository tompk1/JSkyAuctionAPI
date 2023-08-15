package me.tompk1.jsa.hypixel.data;

import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import me.tompk1.jsa.hypixel.auction.Auction;

public class AuctionData {
	private boolean success;
	private int page, totalPages, totalAuctions;
	private long lastUpdated;
	private ArrayList<Auction> auctions;
	
	public AuctionData(boolean success, int page, int totalPages, int totalAuctions, long lastUpdated,
			ArrayList<Auction> auctions) {
		super();
		this.success = success;
		this.page = page;
		this.totalPages = totalPages;
		this.totalAuctions = totalAuctions;
		this.lastUpdated = lastUpdated;
		this.auctions = auctions;
	}

	public static AuctionData fromJson(String json) {
		Gson gson = new Gson();
		try {
		    AuctionData auctionData = gson.fromJson(json, AuctionData.class);
		    return auctionData;
		} catch (JsonSyntaxException e) {
		    e.printStackTrace();
		}
		return null;
    }

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getTotalAuctions() {
		return totalAuctions;
	}

	public void setTotalAuctions(int totalAuctions) {
		this.totalAuctions = totalAuctions;
	}

	public long getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(long lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public ArrayList<Auction> getAuctions() {
		return auctions;
	}

	public void setAuctions(ArrayList<Auction> auctions) {
		this.auctions = auctions;
	}
}

