package com.recepkabakci;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

	static Iterator func(ArrayList mylist){
	      Iterator it=mylist.iterator();
	      while(it.hasNext()){
	         Object element =it.next();
	         if(element instanceof String)//Hints: use instanceof operator
				break;
			}
	      return it;
	}      
}
