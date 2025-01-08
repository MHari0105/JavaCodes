package streams.streams3_flatmap_example;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        List<String> team1 = Arrays.asList("Scott", "David", "John");
        List<String> team2 = Arrays.asList("Mary", "Luna", "Tom");
        List<String> team3 = Arrays.asList("Ken", "Jonny", "Kitty");

        List<List<String>> playersList = Arrays.asList(team1, team2, team3);

        // IMPERATIVE APPROACH - Before java 8
        /* for (List<String> teams : playersList) {
            for (String player : teams) {
                System.out.println(player);
            }
        } */

        // DECLARATIVE APPROACH
        playersList.stream().flatMap(players -> players.stream())
                .forEach(playerName -> System.out.println(playerName));

    }
}
