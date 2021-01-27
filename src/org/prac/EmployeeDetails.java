package org.prac;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDetails {
public static void main(String[] args) {
	UserDefined u1 = new UserDefined();
	u1.setIdNo(100);
	u1.setName("Arya");
	u1.setPhNo(123456789l);
	
	UserDefined u2 = new UserDefined();
	u2.setIdNo(200);
	u2.setName("Surya");
	u2.setPhNo(124536987l);
	
	UserDefined u3 = new UserDefined();
	u3.setIdNo(3000);
	u3.setName("Suresh");
	u3.setPhNo(1245369874l);
	
//	Set<UserDefined> s = new LinkedHashSet();
//	s.add(u3);
//	s.add(u2);
//	s.add(u1);
//	
//	for (UserDefined x : s) {
//		System.out.println(x.getIdNo());
//		System.out.println(x.getName());
//		System.out.println(x.getPhNo());
//		
//	}
	
	
	Map<Integer, UserDefined> m = new LinkedHashMap<>();
	m.put(1, u1);
	m.put(2, u2);
	m.put(3, u3);
	
	Set<Entry<Integer, UserDefined>> entrySet = m.entrySet();
	for (Entry<Integer, UserDefined> e : entrySet) {
		System.out.println(e.getValue().getIdNo());
		System.out.println(e.getValue().getName());
		System.out.println(e.getValue().getPhNo());
		
	}
}
}
