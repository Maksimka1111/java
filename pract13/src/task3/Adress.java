package task3;

import java.util.StringTokenizer;

public class Adress {
    String country,region,city,street,house,corp,flat;
    Adress(String info)
    {
        boolean b = false;
        char[] array = info.toCharArray();
        for(int i = 0; i<info.length(); i++)
        {
            if (array[i] == '.' || array[i] == ';')
                b = true;
        }
        if (!b)
        {
            String[] words = info.split(",");
            country = words[0];
            region = words[1];
            city = words[2];
            street = words[3];
            house = words[4];
            corp = words[5];
            flat = words[6];
        }
        else
        {
            StringTokenizer stringTokenizer = new StringTokenizer(info, ",.;");
            country = stringTokenizer.nextToken();
            region = stringTokenizer.nextToken();
            city = stringTokenizer.nextToken();
            street = stringTokenizer.nextToken();
            house = stringTokenizer.nextToken();
            corp = stringTokenizer.nextToken();
            flat = stringTokenizer.nextToken();
        }
    }

    public String getCity() {
        return city;
    }

    public String getCorp() {
        return corp;
    }

    public String getCountry() {
        return country;
    }

    public String getFlat() {
        return flat;
    }

    public String getHouse() {
        return house;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

}
