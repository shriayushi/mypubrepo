package util;

import java.util.UUID;

public class Util {
    public static String makeId() {
        return UUID.randomUUID().toString();
    }
}
