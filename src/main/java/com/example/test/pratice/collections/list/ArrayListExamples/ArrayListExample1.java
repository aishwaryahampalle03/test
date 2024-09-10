package com.example.test.pratice.collections.list.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
	
	public static void main(String[] args) {
		List<Integer>numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		
		for(Integer number : numberList) {
			System.out.println("List"+number);
		}
	}
}