package client;

import java.util.HashMap;

public enum Gender {
    MALE, FEMALE;

    public static HashMap<String, Gender> genderHashMap = new HashMap<String, Gender> (){{
        put("male", Gender.MALE);
        put("m", Gender.MALE);
        put("MALE", Gender.MALE);
        put("female", Gender.FEMALE);
        put("f", Gender.FEMALE);
        put("FEMALE", Gender.FEMALE);
    }};

    public static Gender mapGender(String gender){
        return genderHashMap.get(gender);


    }
}
