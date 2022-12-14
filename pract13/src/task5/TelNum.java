package task5;

public class TelNum {
    String transform = "";

    public TelNum(String tel)
    {
        char[] telnum = tel.toCharArray();
        if (telnum[0] == '+')
        {
            transform += tel.substring(0,2) + " " + tel.substring(2,5) + " " + tel.substring(5,8) + " " + tel.substring(8,12);
        }
        else
        {
            int n = telnum[0];
            transform += '+' + Integer.toString(n-49) + " " + tel.substring(1,4) + " " + tel.substring(4,7) + " " + tel.substring(7,11);
        }
    }

    public String getTransform() {
        return transform;
    }
}
