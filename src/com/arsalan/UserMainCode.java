package com.arsalan;

public class UserMainCode {
    public int findkey(int input1,int input2,int input3){
        int th1=find_thousand(input1);
        int th2=find_thousand(input2);
        int th3=find_thousand(input3);
        int h1=find_hundreds(input1);
        int h2=find_hundreds(input2);
        int h3=find_hundreds(input3);
        int te1=find_tens(input1);
        int te2=find_tens(input2);
        int te3=find_tens(input3);
        int o1=find_ones(input1);
        int o2=find_ones(input2);
        int o3=find_ones(input3);
        int large1=find_largest(th1,th2,th3);
        int large2=find_largest(h1,h2,h3);
        int large3=find_largest(te1,te2,te3);
        int large4=find_largest(o1,o2,o3);
        return((large1*1000)+(large2*100)+(large3*10)+large4);
    }
    public int find_thousand(int n)
    {
        return(n/1000)%10;
    }
    public int find_hundreds(int n) {
        return (n / 100) % 10;
    }
        public int find_tens(int n)
        {
            return(n/10)%10;
        }
        int find_ones(int n)
        {
            return(n/10);
        }
        int find_largest(int x,int y,int z)
        {
            int largest;
            if(x>y&&x>z)
                largest =x;
            else if(y>z)
                largest=y;
            else
                largest =z;
            return largest;
        }
    }


