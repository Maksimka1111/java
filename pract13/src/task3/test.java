package task3;

public class test {
    public static void main(String[] args) {
        Adress adress1 = new Adress("cont1,reg1,city1,street1,house1,corp1,flat1");
        System.out.println("Adress1:");
        System.out.print(adress1.getCountry() + "  ");
        System.out.print(adress1.getRegion()+ "  ");
        System.out.print(adress1.getCity()+ "  ");
        System.out.print(adress1.getStreet()+ "  ");
        System.out.print(adress1.getHouse()+ "  ");
        System.out.print(adress1.getCorp()+ "  ");
        System.out.println(adress1.getFlat());
        Adress adress2 = new Adress("cont2;reg2;city2;street2;house2;corp2;flat2.");
        System.out.println("Adress2:");
        System.out.print(adress2.getCountry() + "  ");
        System.out.print(adress2.getRegion()+ "  ");
        System.out.print(adress2.getCity()+ "  ");
        System.out.print(adress2.getStreet()+ "  ");
        System.out.print(adress2.getHouse()+ "  ");
        System.out.print(adress2.getCorp()+ "  ");
        System.out.println(adress2.getFlat());
        Adress adress3 = new Adress("cont3,reg3,city3;street3,house3,corp3.flat3");
        System.out.println("Adress3:");
        System.out.print(adress3.getCountry() + "  ");
        System.out.print(adress3.getRegion()+ "  ");
        System.out.print(adress3.getCity()+ "  ");
        System.out.print(adress3.getStreet()+ "  ");
        System.out.print(adress3.getHouse()+ "  ");
        System.out.print(adress3.getCorp()+ "  ");
        System.out.println(adress3.getFlat());
        Adress adress4 = new Adress("cont4,reg4;city4.street4;house4;corp4;flat4.");
        System.out.println("Adress4:");
        System.out.print(adress4.getCountry() + "  ");
        System.out.print(adress4.getRegion()+ "  ");
        System.out.print(adress4.getCity()+ "  ");
        System.out.print(adress4.getStreet()+ "  ");
        System.out.print(adress4.getHouse()+ "  ");
        System.out.print(adress4.getCorp()+ "  ");
        System.out.print(adress4.getFlat());
    }
}
