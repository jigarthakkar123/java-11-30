package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(908,"Mayur Dodiya");
		hm.put(789,"Mayur Patel");
		hm.put(654,"Shivam");
		System.out.println(hm);
		hm.put(908,"Jigar");
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
