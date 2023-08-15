package me.tompk1.jsa.moulberry;

import java.util.ArrayList;
import java.util.Map;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.google.gson.Gson;

public class MoulBerryResponce {
    public static MoulBerryAuctionData fromJson(String json) {
        Gson gson = new Gson();

        Type mapType = new TypeToken<Map<String, Double>>() {}.getType();
        Map<String, Double> itemData = gson.fromJson(json, mapType);

        ArrayList<MoulBerryAuction> auctionItems = new ArrayList<MoulBerryAuction>();
        for (Map.Entry<String, Double> entry : itemData.entrySet()) {
        	MoulBerryAuction item = new MoulBerryAuction(entry.getKey(), entry.getValue());
            auctionItems.add(item);
        }        
        
        MoulBerryAuctionData auctionData = new MoulBerryAuctionData(auctionItems);
        return auctionData;
    }
}
