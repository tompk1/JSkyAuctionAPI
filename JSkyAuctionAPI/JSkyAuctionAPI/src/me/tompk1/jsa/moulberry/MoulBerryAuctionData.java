package me.tompk1.jsa.moulberry;

import java.util.ArrayList;

public class MoulBerryAuctionData {
	private ArrayList<MoulBerryAuction> data;

    public MoulBerryAuctionData(ArrayList<MoulBerryAuction> data) {
        this.data = data;
    }
    
    public ArrayList<MoulBerryAuction> getData() {
		return data;
	}

	public void setData(ArrayList<MoulBerryAuction> data) {
		this.data = data;
	}
}
