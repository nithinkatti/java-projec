package NEW;

import java.util.*;
import java.util.Queue;

public class Simple_bfs {
    public static void main(String[] args) {
        Map<String, List<String>> house = new HashMap<>();

        // Define room connections
        house.put("Living Room", Arrays.asList("Bathroom"));
        house.put("Kitchen", Arrays.asList("Bathroom"));
        house.put("Bedroom", Arrays.asList("Balcony"));
        house.put("Study Room", new ArrayList<>());
        house.put("Bathroom", new ArrayList<>());
        house.put("Balcony", new ArrayList<>());

        System.out.println("Exploring the house using BFS starting from Living Room:");
        bfs(house, "Living Room");
    }

    public static void bfs(Map<String, List<String>> house, String startRoom) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(startRoom);
        visited.add(startRoom);

        while (!queue.isEmpty()) {
            String currentRoom = queue.poll();
            System.out.println("Visited: " + currentRoom);

            for (String neighbor : house.get(currentRoom)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}
