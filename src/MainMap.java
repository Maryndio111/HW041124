import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMap {
    public static Map<String, Auto> createMapByNumber(List<Auto> autos) {
        Map<String, Auto> autoMap = new HashMap<>();
        for (Auto auto : autos) {
            autoMap.put(auto.getNumber(), auto);
        }
        return autoMap;
    }

    public static Map<String, List<Auto>> createMapByBrand(List<Auto> autos) {
        Map<String, List<Auto>> brandMap = new HashMap<>();
        for (Auto auto : autos) {
            brandMap.put(auto.getBrand(), autos);

        }
        return brandMap;
    }

}
