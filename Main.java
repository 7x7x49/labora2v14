package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите x");
        double x = in.nextDouble();

        System.out.println("Введите не отрицательный n");
        int n = in.nextInt();

        while (n < 0)
        {
            System.out.println("Это отрицательный n, введите не отрицательный n");
            n = in.nextInt();
        }

        double sum = 0;
        for (int i=0; i<n+1; i++)
        {
            int fact = 1;
            if(i!=0)
            {
                for (int j=2; j<i*2+1; j++)
                {
                    fact += j;
                }
            }
            sum += (Math.pow(-1, i)*Math.pow(x,2*i))/fact;
        }
        System.out.println(sum);
    }
}