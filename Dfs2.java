package NEW;

import java.util.*;

public class Dfs2 {

    private Map<String, List<String>> homeMap = new HashMap<>();
    private Set<String> visited = new HashSet<>();

    public void addRoom(String room, String connectedRoom) {
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
    }

    public void dfs(String currentRoom) {
        if (visited.contains(currentRoom)) return;

        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for (String neighbor : homeMap.getOrDefault(currentRoom, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        Dfs2 h = new Dfs2();

        h.addRoom("nithin", "Kumar");
        h.addRoom("nithin", "deeskhith");
        h.addRoom("nithin", "manju");

        System.out.println("DFS Traversal starting from nithin:\n");
        h.dfs("nithin");
    }
}
