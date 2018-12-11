import java.util.ArrayList;

public class Digits
{
    private ArrayList<Integer> digitList = new ArrayList<>();

    public Digits(int num)
    {
        String str = String.valueOf(num);
        for(int i = 0; i < str.length(); i++)
        {
            String digitStr = str.substring(i, i+1);
            Integer digit = new Integer(String.valueOf(digitStr));
            digitList.add(digit);
        }
    }

    public boolean isStrictlyIncreasing()
    {
        for(int i = 0; i < digitList.size()-1; i++)
        {
            if(digitList.get(i) >= digitList.get(i+1))
            {
                return false;
            }
        }
        return true;
    }

    public String getDigitList()
    {
        String list = "[";
        for(int i = 0; i < digitList.size()-1; i++)
        {
            int digit = digitList.get(i);
            list += String.valueOf(digit) + ", ";
        }
        list += String.valueOf(digitList.get(digitList.size()-1))+ "]";
        return list;
    }
}
