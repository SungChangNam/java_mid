package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZone : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZone);
            System.out.println(zoneId +" | "+zoneId.getRules());
        }
        
        ZoneId zoneI = ZoneId.systemDefault();
        System.out.println("zoneI.systemDefault = " + zoneI);

        ZoneId seoulZoneId = zoneI.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
