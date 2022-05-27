package com.arsalan;

public class MyNumber
{
    //Calculate the frequency of digits in number
    public void frequency(int number, int[] result)
    {
        int temp = 0;
        while (number != 0)
        {
            temp = number % 10;
            if (temp < 0)
            {
                //When get negative number
                temp = -temp;
            }
            //modify the value of temp index element in result array
            result[temp]++;
            number /= 10;
        }
    }
    public boolean stable_no(int number)
    {
        //resultant array which is store the frequency of number digits
        int[] result = new int[10];
        for (int i = 0; i < 10; ++i)
        {
            //Set the initial value of each element to zero
            result[i] = 0;
        }
        int auxiliary = 0, status = 1;
        //Calculate number digit frequency
        frequency(number, result);
        for (int i = 0; i < 10 && status == 1; ++i)
        {
            //Check that the resultant array
            //[i] location frequency is greater than zero or not
            if (result[i] != 0)
            {
                if (auxiliary == 0)
                {
                    //get first number frequency
                    auxiliary = result[i];
                }
                else if (auxiliary != result[i])
                {
                    //When no two numbers frequency are same in given number
                    //here, break the loop execution
                    status = 0;
                }
            }
        }
        if (status == 0)
        {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main(String[] args)
    {
        MyNumber obj = new MyNumber();
        //Test Case
        obj.stable_no(123);
        obj.stable_no(1111);
        obj.stable_no(89198);
        obj.stable_no(112233);
        obj.stable_no(10101);
    }
}
