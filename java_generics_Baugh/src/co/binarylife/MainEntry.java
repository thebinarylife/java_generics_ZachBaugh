package co.binarylife;

import co.binarylife.generics.MyGenClass;
import co.binarylife.generics.MyGenInterface;
import co.binarylife.regulars.MyRegularClass;

public class MainEntry {
	
	public static void main(String[] args) {
		MyGenInterface<Integer, String> mgi1;
		MyGenInterface<Integer, Integer> mgi2;
		
		mgi1 = new MyGenClass<>(1, "Zachary Baugh");
		mgi2 = new MyGenClass<>(1, 2017);
		
		int i1 = MyRegularClass.getSum(10, 20);
		Float f1 = MyRegularClass.getSum(100f, 200f);
		
		System.out.println("Key: " + mgi1.getKey() + " Value: " + mgi2.getValue());
		System.out.println("i1: " + i1 + " f1: " + f1);
	}

}
