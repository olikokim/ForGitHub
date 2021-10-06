package production;

public class RomanNumber {
    public static void String intToRoman(int num){
        String[] units=
                {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens=
                {"","XX","XXX","XL","L","LX","LXX","LXXX", "XC"};
        String[] hundreds= {"","C"};
        return hundreds[(num%1000)/100]+
                tens[(num%100)/10]+
                units[num%10];

    }
}