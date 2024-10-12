package com.bptn.course._19_MultiThreading;
import java.util.ArrayList;
public class MultiThreadingDemo {
	

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(2);
        
        int val1 = 1;
        int val2 = 6;
        
        boolean isEqual = (!nums.get(val1).equals(nums.get(val2)));
    }
}
}
