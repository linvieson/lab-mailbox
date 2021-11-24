package client;

public class ClientId {
    private static int counter = 0;

    public static void setCounter(int counter) {
        ClientId.counter = counter;
    }

    public static int getCounter(){
        return ++counter;
    }


}

