package me.tompk1.jsa.hypixel.auction;

import java.util.ArrayList;

import com.google.gson.Gson;

import me.tompk1.jsa.hypixel.item.ItemCategory;
import me.tompk1.jsa.hypixel.item.ItemTier;

public class Auction {
	
	private String uuid, auctioneer, profile_id;
	private ArrayList<String> coop;
	private long start, end;
	private String item_name;
	private String item_lore;
	private String extra;
	private ItemCategory category;
	private ItemTier tier;
	private double starting_bid;
	private String item_bytes;
	private boolean claimed;
	private ArrayList<String> claimed_bidders;
	private double highest_bid_amount;
	private long last_updated;
	private boolean bin;
	private ArrayList<Bid> bids;
	private String item_uuid;
    
	public Auction(String uuid, String auctioneer, String profile_id, ArrayList<String> coop, long start, long end,
			String item_name, String item_lore, String extra, ItemCategory category, ItemTier tier, double starting_bid,
			String item_bytes, boolean claimed, ArrayList<String> claimed_bidders, double highest_bid_amount,
			long last_updated, boolean bin, ArrayList<Bid> bids, String item_uuid) {
		super();
		this.uuid = uuid;
		this.auctioneer = auctioneer;
		this.profile_id = profile_id;
		this.coop = coop;
		this.start = start;
		this.end = end;
		this.item_name = item_name;
		this.item_lore = item_lore;
		this.extra = extra;
		this.category = category;
		this.tier = tier;
		this.starting_bid = starting_bid;
		this.item_bytes = item_bytes;
		this.claimed = claimed;
		this.claimed_bidders = claimed_bidders;
		this.highest_bid_amount = highest_bid_amount;
		this.last_updated = last_updated;
		this.bin = bin;
		this.bids = bids;
		this.item_uuid = item_uuid;
	}

	public static Auction fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Auction.class);
    }

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAuctioneer() {
		return auctioneer;
	}

	public void setAuctioneer(String auctioneer) {
		this.auctioneer = auctioneer;
	}

	public String getProfile_id() {
		return profile_id;
	}

	public void setProfile_id(String profile_id) {
		this.profile_id = profile_id;
	}

	public ArrayList<String> getCoop() {
		return coop;
	}

	public void setCoop(ArrayList<String> coop) {
		this.coop = coop;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_lore() {
		return item_lore;
	}

	public void setItem_lore(String item_lore) {
		this.item_lore = item_lore;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public ItemCategory getCategory() {
		return category;
	}

	public void setCategory(ItemCategory category) {
		this.category = category;
	}

	public ItemTier getTier() {
		return tier;
	}

	public void setTier(ItemTier tier) {
		this.tier = tier;
	}

	public double getStarting_bid() {
		return starting_bid;
	}

	public void setStarting_bid(double starting_bid) {
		this.starting_bid = starting_bid;
	}

	public String getItem_bytes() {
		return item_bytes;
	}

	public void setItem_bytes(String item_bytes) {
		this.item_bytes = item_bytes;
	}

	public boolean isClaimed() {
		return claimed;
	}

	public void setClaimed(boolean claimed) {
		this.claimed = claimed;
	}

	public ArrayList<String> getClaimed_bidders() {
		return claimed_bidders;
	}

	public void setClaimed_bidders(ArrayList<String> claimed_bidders) {
		this.claimed_bidders = claimed_bidders;
	}

	public double getHighest_bid_amount() {
		return highest_bid_amount;
	}

	public void setHighest_bid_amount(double highest_bid_amount) {
		this.highest_bid_amount = highest_bid_amount;
	}

	public long getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(long last_updated) {
		this.last_updated = last_updated;
	}

	public boolean isBin() {
		return bin;
	}

	public void setBin(boolean bin) {
		this.bin = bin;
	}

	public ArrayList<Bid> getBids() {
		return bids;
	}

	public void setBids(ArrayList<Bid> bids) {
		this.bids = bids;
	}

	public String getItem_uuid() {
		return item_uuid;
	}

	public void setItem_uuid(String item_uuid) {
		this.item_uuid = item_uuid;
	}
}
