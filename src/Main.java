import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Auto> autos = Arrays.asList(
                new Auto("MW2354", "Toyota", "Red"),
                new Auto("CM09878", "Honda", "Blue"),
                new Auto("Nk94569", "Ford", "Green"),
                new Auto("PL3120", "Mersedes", "Silber")
        );
        Map<String, Auto>mapByNumber = MainMap.createMapByNumber(autos);
        System.out.println("Map by Number:  "+ mapByNumber);

        Map<String, List<Auto>>mapByBrand = MainMap.createMapByBrand(autos);
        System.out.println("Map by Brand:  "+mapByBrand);

    }
}