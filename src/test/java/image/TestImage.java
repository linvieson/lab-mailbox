package image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestImage {
    public RealImage realImage;
    public ProxyImage proxyImage;

    @BeforeEach
    void setUp(){
        realImage = new RealImage("somepath");
        proxyImage = new ProxyImage("proxypath");
    }

    @Test
    void TestGetFileNameRealImage(){
        assertEquals(realImage.getFileName(), "somepath");
    }

    @Test
    void TestGetFileNameProxyImage(){
        assertEquals(proxyImage.getFileName(), "proxypath");
    }


}
