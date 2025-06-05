package NEW;

import java.util.TreeMap;
public class Country {
	    public static void main(String[] args) {
	        // Create a TreeMap to store country-capital pairs
	        TreeMap<String, String> countryCapitalMap = new TreeMap<>();

	        // Add entries to the TreeMap
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("USA", "Washington");
	        countryCapitalMap.put("Germany", "Berlin");
	        countryCapitalMap.put("Japan", "Tokyo");

	        // Display the TreeMap
	        System.out.println("Country-Capital Map: " + countryCapitalMap);

	        // Retrieve and display the first (lowest) key
	        String firstKey = countryCapitalMap.firstKey();
	        System.out.println("First Key: " + firstKey + " => " + countryCapitalMap.get(firstKey));

	        // Retrieve and display the last (highest) key
	        String lastKey = countryCapitalMap.lastKey();
	        System.out.println("Last Key: " + lastKey + " => " + countryCapitalMap.get(lastKey));

	        // Retrieve and display the key higher than "Germany"
	        String higherKey = countryCapitalMap.higherKey("Germany");
	        if (higherKey != null) {
	            System.out.println("Key higher than 'Germany': " + higherKey + " => " + countryCapitalMap.get(higherKey));
	        } else {
	            System.out.println("No key higher than 'Germany' found.");
	        }

	        // Retrieve and display the key lower than "Germany"
	        String lowerKey = countryCapitalMap.lowerKey("Germany");
	        if (lowerKey != null) {
	            System.out.println("Key lower than 'Germany': " + lowerKey + " => " + countryCapitalMap.get(lowerKey));
	        } else {
	            System.out.println("No key lower than 'Germany' found.");
	        }
	    }
	}



