package image;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    String fileName;
    
    public RealImage(String path){
        this.fileName = path;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println(this.fileName + " file loaded.");
    }


    @Override
    public void display() {
        System.out.println("Image displayed.");
    }
}
