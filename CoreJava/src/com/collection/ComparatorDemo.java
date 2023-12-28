package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp>{

	@Override
	public int compare(Emp e1, Emp e2) {
		int value=0;
		if(e1.getSalary()>e2.getSalary())
		{
			value=-1;
		}
		else if(e1.getSalary()<e2.getSalary())
		{
			value=1;
		}
		else if(e1.getSalary()==e2.getSalary())
		{
			value=0;
		}
		return value;
	}

	public static void main(String[] args) {
		ArrayList<Emp> list=new ArrayList<Emp>();
		
		Emp e1=new Emp();
		e1.setEid(1);
		e1.setEname("Mayur Dodiya");
		e1.setSalary(40000);
		
		Emp e2=new Emp();
		e2.setEid(2);
		e2.setEname("Mayur Patel");
		e2.setSalary(15000);
		
		Emp e3=new Emp();
		e3.setEid(3);
		e3.setEname("Kiran Vasu");
		e3.setSalary(20000);
		
		Emp e4=new Emp();
		e4.setEid(4);
		e4.setEname("Aqsa");
		e4.setSalary(32000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list, new ComparatorDemo());
		for(Emp e:list)
		{
			System.out.println("EID : "+e.getEid()+" ENAME : "+e.getEname()+" SALARY : "+e.getSalary());
		}
	}
}
