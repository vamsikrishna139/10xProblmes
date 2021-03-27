package com.practice.java.check;

import java.util.Arrays;

public class FindFirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,10,-5,9,8,6};
		System.out.println(firstMissingPositive(arr));
	}

	public static int firstMissingPositive(int[] A) {
		// 1 2 0 ---> 3
		// 3 4 1 -1 ---> 2
		//-6 -7 -8 ----> 1

		int first = 1;
		int firstIdx = Integer.MIN_VALUE;
		int len = A.length;
		Arrays.sort(A);

		for(int i=0;i<len;i++)
		{
			if(A[i] > 0)
			{
				firstIdx = i;
				break;
			}
		}

		if(firstIdx == Integer.MIN_VALUE){
			return 1;
		}
		for(int i=firstIdx;i<len;i++)
		{
			if(i>0 && A[i] == A[i-1]){
                continue;
            }// to handle the duplicate numbers scenario
			if(first == A[i])
			{
				first++;
			}
			else
			{
				break;
			}
		}

		return first;
	}

}
