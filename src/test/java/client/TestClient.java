package client;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClient{
    Client client;

    @BeforeEach
    void setUp() {
        ClientId.setCounter(0);
        client = new Client("Alina", 19, Gender.FEMALE);
        client.setEmail("alina@gmail.com");
    }

    @Test
    void TestGetName() {
        assertEquals(client.getName(),"Alina");
    }

    @Test
    void TestGetAge() {
        assertEquals(client.getAge(),19);
    }

    @Test
    void testGetSex() {
        assertEquals(client.getSex(),Gender.FEMALE);
    }

    @Test
    void TestGetId() {
        assertEquals(client.getId(),1);
    }


    @Test
    void getEmail() {
        assertEquals(client.getEmail(),"alina@gmail.com");
    }
}