package image;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    ProxyImage(String fileName){
        this.fileName = fileName;
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        if(!realImage.equals(null)) realImage.display();
        else System.out.println("No image found.");
    }
}
