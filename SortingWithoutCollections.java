package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sorting s =new Sorting();
        s.SortingarrayList();
    }
}
class Sorting
{
    public static void SortingarrayList()
    {
        ArrayList<Integer> Sort = new ArrayList<Integer>();
        System.out.println("Enter the Number of Elements");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,temp,j;
        for (i = 0; i < n; i++) {
            Sort.add(in.nextInt());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(Sort.get(i)<Sort.get(j))
                {
                    temp = Sort.get(i);
                    Sort.set(i,Sort.get(j));
                    Sort.set(j,temp);
                }
            }
        }
        System.out.println(Sort);
    }
}