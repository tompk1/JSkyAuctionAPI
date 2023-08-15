# JSkyAuctionAPI
A library which aims to make the Hypixel and MoulBerry API easier to use in java.
````
IMPORTANT:
```` This library uses GSON a working build of GSON can be found in the lib folder!
     https://github.com/google/gson

````
How to use (an example program to calculate profits):````
```JSkyAuctionAPI lib = new JSkyAuctionAPI();
  
  MoulBerryAuctionData lowest = lib.getLowestBINs();
  AuctionData auctions = lib.getPage(0);

  ArrayList<MoulBerryAuction> lowestBINs = new ArrayList<MoulBerryAuction>();

  for(MoulBerryAuction auction : lowest.getData()) {
			MoulBerryAuction lowestBIN = MoulBerryUtils.convertNameFormat(auction);
			lowestBINs.add(lowestBIN);
  }

  for(Auction auction : data.getAuctions()) {
      double profit = MoulBerryUtils.getProfit(lowestBINs, auction);

      System.out.println("name: " +
                          auction.getItem_name() + " profit:" +
                                  profit + " uuid:" + auction.getUuid());
  }

```

  
