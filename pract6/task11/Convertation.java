package task11;

public class Convertation implements Convertable {
   int cels;

   public Convertation(int Cels){
       cels = Cels;
   }

    @Override
    public String convert() {
        return ("Fahrenheit: " + ((double)cels*1.8+32) + "\n" + "Kelvin: " + (cels+ 273));
    }
}
