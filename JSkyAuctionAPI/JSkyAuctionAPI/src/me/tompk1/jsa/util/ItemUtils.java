package me.tompk1.jsa.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import me.tompk1.jsa.hypixel.item.Reforges;

public class ItemUtils {
	public static boolean isPet(String itemName) {
        String pattern = "\\[Lvl \\d+\\] [a-zA-Z]+";
        
        Pattern petPattern = Pattern.compile(pattern);
        
        Matcher matcher = petPattern.matcher(itemName);
        
        return matcher.matches();
    }
	
	public static int getStarCount(String itemName) {
        Pattern starPattern = Pattern.compile("✪+");
        Matcher matcher = starPattern.matcher(itemName);
        
        if (matcher.find()) {
            String stars = matcher.group();
            return stars.length();
        }
        
        return 0;
	}
	
	public static boolean doesItemHaveStars(String name) {
		return getStarCount(name) != 0;
	}
	
	public static boolean isReforgedItem(String itemName, Reforges[] reforges) {
        for (Reforges reforge : reforges) {
            if (itemName.startsWith(reforge.name() + " ")) {
                return true;
            }
        }
        return false;
    }
	
	public static String removeReforges(String itemName, Reforges[] reforges) {
        for (Reforges reforge : reforges) {
            if (itemName.startsWith(reforge.name() + " ")) {
                return reforge.name().replaceFirst(reforge.name() + " ", "");
            }
        }
        
        return itemName;
    }
	
	public static String removePetStats(String name) {
		if(name.contains("[Lvl")) {
			return name.replaceFirst("]", "");
		}

		return "";
	}
}
