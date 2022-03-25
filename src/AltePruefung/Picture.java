package AltePruefung;

public class Picture {
    public int width ;
    public int length ;



    public int totalPixels(){
        return length * width;
    }

    public int totalSize(int bytePerPixel){
        return bytePerPixel * totalPixels();
    }
    public void scale(double factor){
        length = (int)(length * factor);
        width *= factor;
    }
}
