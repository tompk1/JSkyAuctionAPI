package me.tompk1.jsa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import me.tompk1.jsa.hypixel.data.AuctionData;
import me.tompk1.jsa.moulberry.MoulBerryAuctionData;
import me.tompk1.jsa.moulberry.MoulBerryResponce;

public class JSkyAuctionAPI {
	public AuctionData getPage(int page) throws IOException {
        URL url = new URL("https://api.hypixel.net/skyblock/auctions?page=" + page);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            
            return AuctionData.fromJson(content.toString());
        } finally {
            con.disconnect();
        }
    }
	
	public MoulBerryAuctionData getLowestBINs() throws IOException {
		MoulBerryAuctionData responce;
		
		URL url = new URL("http://moulberry.codes/lowestbin.json");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            
            responce = MoulBerryResponce.fromJson(content.toString());
        } finally {
            con.disconnect();
        }
        
        return responce;
	}
}
