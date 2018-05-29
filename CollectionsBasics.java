package com.ab.basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsBasics {
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1 , "A", "Research");
		Employee e2 = new Employee(2 , "B", "Development");
		Employee e3 = new Employee(3 , "C", "Software");
		Employee e4 = new Employee(4 , "D", "Testing");
		   // now from here on we will be adding duplicates 
		Employee e5 = new Employee(5 , "E", "Research");
		Employee e6 = new Employee(6 , "A", "Software");
		Employee e7 = new Employee(7 , "D", "Testing");
		Employee e8 = new Employee(1 , "A", "Research"); //  same as e1
		
		List<String> listOfStrings = new ArrayList<>();
		
		      listOfStrings.add("Akash");
		      listOfStrings.add("Nilesh");
		      listOfStrings.add("Prasad");
		      listOfStrings.add("Abhi");
		      listOfStrings.add("Dayanand");
		       //  we are adding multiple null elements  and duplicates also
		      listOfStrings.add(null);
		      listOfStrings.add(null);
		      listOfStrings.add("Akash");
		      listOfStrings.add("Prasad");
		      
		      System.out.println(" number of elements in listOfStrings --- "+listOfStrings.size());
		      System.out.println(" elements present in listOfStrings --- "+listOfStrings);
		      
		 List<Employee> listOfEmployees = new ArrayList<>(); 
		  
		     listOfEmployees.add(e1);
		     listOfEmployees.add(e2);
		     listOfEmployees.add(e3);
		     listOfEmployees.add(e4);
		     listOfEmployees.add(e5);
		     listOfEmployees.add(e6);
		     listOfEmployees.add(e7);
		     listOfEmployees.add(e8);
		     
		     System.out.println();
		     System.out.println( " number of elements in listOfEmployees " +listOfEmployees.size() );
		     
		     
		     // lets iterate through  listOfEmployees using Iterator cursor
		      Iterator loeItr = listOfEmployees.iterator();
		      
		      System.out.println("--------------------------------------------------");
		        while(loeItr.hasNext()) 
		        {
		        	System.out.println(loeItr.next());
		        }
		      System.out.println("--------------------------------------------------");
		     
		     //lets iterate  through  listOfEmployees using ListIterator
		       ListIterator loeLitr = listOfEmployees.listIterator();
		       
		       System.out.println("--------------------------------------------------");
		        while(loeLitr.hasNext()) 
		        {
		        	System.out.println(loeLitr.next());
		        }
		       System.out.println("--------------------------------------------------");
		
		Vector<String>  vectorOfStrings = new Vector<>();
		
		  vectorOfStrings.add("Akash");
		  vectorOfStrings.add("Nilesh");
		  vectorOfStrings.add("Prasad");
		  vectorOfStrings.add("Abhi");
		  vectorOfStrings.add("Dayanand");
	       //  we are adding multiple null elements  and duplicates also
		  vectorOfStrings.add(null);
		  vectorOfStrings.add(null);
		  vectorOfStrings.add("Akash");
		  vectorOfStrings.add("Prasad");
	      
	      System.out.println(" number of elements in vectorOfStrings --- "+vectorOfStrings.size());
	      System.out.println(" elements present in vectorOfStrings --- "+vectorOfStrings);
	      
	    Vector<Employee> vectorOfEmployees = new Vector<>();
	      
	      vectorOfEmployees.add(e1);
	      vectorOfEmployees.add(e2);
	      vectorOfEmployees.add(e3);
	      vectorOfEmployees.add(e4);
	      vectorOfEmployees.add(e5);
	      vectorOfEmployees.add(e6);
	      vectorOfEmployees.add(e7);
	      vectorOfEmployees.add(e8);
	     
	     System.out.println();
	     System.out.println( " number of elements in vectorOfEmployees " +vectorOfEmployees.size() );
	     
	      
	     
	     // lets iterate through  vectorOfEmployees using Iterator cursor
	      Iterator voeItr = vectorOfEmployees.iterator();
	      
	      System.out.println("--------------------------------------------------");
	        while(voeItr.hasNext()) 
	        {
	        	System.out.println(voeItr.next());
	        }
	      System.out.println("--------------------------------------------------");
	     
	     //lets iterate  through  vectorOfEmployees using ListIterator
	       ListIterator voeLitr = vectorOfEmployees.listIterator();
	       
	       System.out.println("--------------------------------------------------");
	        while(voeLitr.hasNext()) 
	        {
	        	System.out.println(voeLitr.next());
	        }
	       System.out.println("--------------------------------------------------");
		
	     //lets  iterate through  vectorOfEmployees  using  Enumeration  because  "Vector is LEGACY CLASS"
	       Enumeration voeEnum = vectorOfEmployees.elements();
	       
	       System.out.println("--------------------------------------------------");
	         while(voeEnum.hasMoreElements()) 
	         {
	        	 System.out.println(voeEnum.nextElement());
	         }
		   System.out.println("--------------------------------------------------");
		   
	   
	   Set<String> setOfStrings = new HashSet<>(); // allows 1 null & no duplicates allowed
	   
	   /*no need to override hashCode()  & equals() in String 
       already overriden  in "String"*/
	        
	     setOfStrings.add("Akash");
	     setOfStrings.add("Nilesh");
	     setOfStrings.add("Prasad");
	     setOfStrings.add("Abhi");
	     setOfStrings.add("Dayanand");
	       //  we are adding multiple null elements  and duplicates also
	     setOfStrings.add(null);
	     setOfStrings.add(null);
	     setOfStrings.add("Akash");
	     setOfStrings.add("Prasad");
		   
	     System.out.println(" number of elements in setOfStrings --- "+setOfStrings.size());
	     System.out.println(" elements present in setOfStrings --- "+setOfStrings);
	     
	    Set<Employee> setOfEmployees = new HashSet<>();
	    
	    /*in equals we have overriden that if id,name & department of 
	    objects is equal then only it should be considered as duplicate*/
	    
	    /* we need to override  hashCode()  &  equlas()  method in Employee class
	     *  so that the contract /  rules(not allows duplicate) set by Set should not be broken */
	    
	    setOfEmployees.add(e1);
	    setOfEmployees.add(e2);
	    setOfEmployees.add(e3);
	    setOfEmployees.add(e4);
	    setOfEmployees.add(e5);
	    setOfEmployees.add(e6);
	    setOfEmployees.add(e7);
	    setOfEmployees.add(e8);
	    
	    System.out.println();
	    System.out.println(" number of elements in setOfEmployees --- "+setOfEmployees.size());
	    
	    
	 // lets iterate through  setOfEmployees using Iterator cursor
	      Iterator soeItr = setOfEmployees.iterator();
	      
	      System.out.println("--------------------------------------------------");
	        while(soeItr.hasNext()) 
	        {
	        	System.out.println(soeItr.next());
	        }
	      System.out.println("--------------------------------------------------");
	      
	   
	      
         	                            // preserves  insertion  order
	  Set<String> linkedSetOfString = new LinkedHashSet<>(); 
	   
	     linkedSetOfString.add("Akash");
	     linkedSetOfString.add("Nilesh");
	     linkedSetOfString.add("Prasad");
	     linkedSetOfString.add("Abhi");
	     linkedSetOfString.add("Dayanand");
	       //  we are adding multiple null elements  and duplicates also
	     linkedSetOfString.add(null);
	     linkedSetOfString.add(null);
	     linkedSetOfString.add("Akash");
	     linkedSetOfString.add("Prasad");
		   
	     System.out.println(" number of elements in linkedSetOfString --- "+linkedSetOfString.size());
	     System.out.println(" elements present in linkedSetOfString --- "+linkedSetOfString);
	     
	     
	                                          // preserves  insertion  order
	  Set<Employee> linkedSetOfEmployees = new LinkedHashSet<>();
	     
	     linkedSetOfEmployees.add(e1);
	     linkedSetOfEmployees.add(e2);
	     linkedSetOfEmployees.add(e3);
	     linkedSetOfEmployees.add(e4);
	     linkedSetOfEmployees.add(e5);
	     linkedSetOfEmployees.add(e6);
	     linkedSetOfEmployees.add(e7);
	     linkedSetOfEmployees.add(e8);
	    
	     System.out.println();
	     System.out.println(" number of elements in linkedSetOfEmployees --- "+linkedSetOfEmployees.size());
	     
	    
	    
	 // lets iterate through  linkedSetOfEmployees using Iterator cursor
	      Iterator lsoeItr = linkedSetOfEmployees.iterator();
	      
	      System.out.println("--------------------------------------------------");
	        while(lsoeItr.hasNext()) 
	        {
	        	System.out.println(lsoeItr.next());
	        }
	      System.out.println("--------------------------------------------------");
	      
	      
	      
	                                     //  preserves  alphabetical  order OR however we want 
	    Set<String>  treeSetOfStrings = new TreeSet<>();
	      
	      treeSetOfStrings.add("Akash");
	      treeSetOfStrings.add("Nilesh");
	      treeSetOfStrings.add("Prasad");
	      treeSetOfStrings.add("Abhi");
	      treeSetOfStrings.add("Dayanand");
	       //  we are adding multiple null elements  and duplicates also
	      
	      /*TreeSet doesnt allow null  , if you uncomment below two statements
	      you will  get  "NullPointerException"*/
	      
	      /*treeSetOfStrings.add(null);
	      treeSetOfStrings.add(null);*/
	      
	      treeSetOfStrings.add("Akash");
	       treeSetOfStrings.add("Prasad");
		   
	     System.out.println(" number of elements in treeSetOfStrings --- "+treeSetOfStrings.size());
	     System.out.println(" elements present in treeSetOfStrings --- "+treeSetOfStrings);
	     
	                                  
	                                  //  preserves  alphabetical  order OR however we want
	  Set<Employee> treeOfEmployees = new TreeSet<>(new MyDepartment());
	    
	    /*when we  are dealing with objects in TreeSet  you have to add what field you 
	    want to compare 
	    otherwise  you will get  "ClassCastException"  */
	  
	   /* below  we have added a class MyDepartment   which is comapring department field
	    * to comapre them arrange them in Natural Order */
	  
	     treeOfEmployees.add(e1);
	     treeOfEmployees.add(e2);
	     treeOfEmployees.add(e3);
	     treeOfEmployees.add(e4);
	     treeOfEmployees.add(e5);
	     treeOfEmployees.add(e6);
	     treeOfEmployees.add(e7);
	     treeOfEmployees.add(e8);
	    
	    System.out.println();
	    System.out.println(" number of elements in treeOfEmployees --- "+treeOfEmployees.size());
	    
	    
	    
	 // lets iterate through  treeOfEmployees using Iterator cursor
	      Iterator tsoeItr = treeOfEmployees.iterator();
	      
	      System.out.println("--------------------------------------------------");
	        while(tsoeItr.hasNext()) 
	        {
	        	System.out.println(tsoeItr.next());
	        }
	      System.out.println("--------------------------------------------------");
	      
	      
	      HashMap<String , String> hmapOfStrings = new HashMap<>();
	      
	      /*
	       *  duplicate keys are not allowed but duplicate values are allowed 
	       *  
	       *  null as key as well as for value is valid
	       * */
	      
	         hmapOfStrings.put("Akash","Badnale");
	         hmapOfStrings.put("Nilesh","Patil");
	         hmapOfStrings.put("Prasad","Patil");
	         hmapOfStrings.put("Abhi","Suryavanshi");
	         hmapOfStrings.put("Dayanand","Kshirsagar");
		       //  we are adding multiple null elements  and duplicates also
	         hmapOfStrings.put("Guru",null);
	         hmapOfStrings.put("Guru",null);
	         hmapOfStrings.put(null,"Badnale");
	         hmapOfStrings.put(null,"Gosling");
	         
	         System.out.println();
	 	     System.out.println(" number of elements in hmap --- "+hmapOfStrings.size());
	 	     System.out.println(" elements present in hmap --- "+hmapOfStrings);
	         
	 	     
	 	HashMap<Employee,String> hmapOfEmployee = new HashMap <>();
	 	     
	 	     hmapOfEmployee.put(e1, "Employee1");
	 	     hmapOfEmployee.put(e2, "Employee2");
	 	     hmapOfEmployee.put(e3, "Employee3");
	 	     hmapOfEmployee.put(e4, "Employee4");
	 	     hmapOfEmployee.put(e5, "Employee5");
	 	     hmapOfEmployee.put(e6, "Employee6");
	 	     hmapOfEmployee.put(e7, "Employee7");
	 	     hmapOfEmployee.put(e8, "Employee8");
	 	     
	 	     System.out.println();
	 	     System.out.println(" number of elements in hmapOfEmployee --- "+hmapOfEmployee.size());
	 	     
	 	      /*
	 	       * To iterate through  map we cant use Iterator  directly
	 	         keySet() ---  to get the set of keys & using key we can have the values
	 	         values() --- to get the values only
	 	         entrySet() --- to get keys as well as values we have different methods*/
	 	     
	 	     //lets use keySet()
	 	       Set<Employee> setOfKeys = hmapOfEmployee.keySet();
	 	       
	 	       Iterator kItr = setOfKeys.iterator();
	 	       
	 	          System.out.println("----------------------keySet iterator---------------------------");
	 	          while(kItr.hasNext()) 
	 	          {
	 	        	  Employee key = (Employee) kItr.next();
	 	        	  System.out.println(key +"--"+hmapOfEmployee.get(key));
	 	        	  
	 	        	  /* we will get 7 objects because we have duplicate e1 & e8
	 	        	   * but as we know in hashMap  working  when duplicate found old value is
	 	        	   * replaced by new value &  old value is returned 
	 	        	   * thats how  value of 1 -- employee8  will be*/
	 	          }
	 	          System.out.println("----------------------keySet iterator---------------------------");
	 	          
	 	          
	 	       //let us use values()
	 	          Collection<String> collectionOfValues = hmapOfEmployee.values();
	 	          
	 	         System.out.println("---------------------values iterator----------------------------");
	 	          for(String collectionOfValue : collectionOfValues) 
	 	          {
	 	        	  System.out.println(collectionOfValue);
	 	          }
	 	         System.out.println("-----------------------values iterator--------------------------");
	 	          
	 	       //let us use entrySet()
	 	          Set<Map.Entry<Employee, String>> setOfKeysAndValues = hmapOfEmployee.entrySet();
	 	          
	 	             System.out.println("--------------------entrySet iterator-----------------------------");
	 	             for(Map.Entry<Employee, String> setOfKeyAndValue : setOfKeysAndValues) 
	 	             {
	 	            	Employee key = setOfKeyAndValue.getKey();
	 	            	String value =setOfKeyAndValue.getValue();
	 	            	
	 	            	System.out.println(key +"---" + value);
	 	             }
	 	             System.out.println("-------------------entrySet iterator------------------------------");
	 	     
	 	  
	 	             
	 	    HashMap<String , String> lhmapOfStrings = new LinkedHashMap<>();
	 	    
	 	    //   LinkedHashMap  maintains the insertion order
	 	      lhmapOfStrings.put("Akash","Badnale");
	 	      lhmapOfStrings.put("Nilesh","Patil");
	 	      lhmapOfStrings.put("Prasad","Patil");
	 	      lhmapOfStrings.put("Abhi","Suryavanshi");
	 	      lhmapOfStrings.put("Dayanand","Kshirsagar");
		       //  we are adding multiple null elements  and duplicates also
	 	      lhmapOfStrings.put("Guru",null);
	 	      lhmapOfStrings.put("Guru",null);
	 	      lhmapOfStrings.put(null,"Badnale");
	 	      lhmapOfStrings.put(null,"Gosling");
	         
	         System.out.println();
	 	     System.out.println(" number of elements in lhmapOfStrings --- "+lhmapOfStrings.size());
	 	     System.out.println(" elements present in lhmapOfStrings --- "+lhmapOfStrings);
	 	     
	 	  HashMap<Employee , String> lhmapOfEmployees = new LinkedHashMap<>();
	 	   
	 	     lhmapOfEmployees.put(e1, "Employee1");
	 	     lhmapOfEmployees.put(e2, "Employee2");
	 	     lhmapOfEmployees.put(e3, "Employee3");
	 	     lhmapOfEmployees.put(e4, "Employee4");
	 	     lhmapOfEmployees.put(e5, "Employee5");
	 	     lhmapOfEmployees.put(e6, "Employee6");
	 	     lhmapOfEmployees.put(e7, "Employee7");
	 	     lhmapOfEmployees.put(e8, "Employee8");
 	     
 	     System.out.println();
 	     System.out.println(" number of elements in lhmapOfEmployees --- "+lhmapOfEmployees.size());
 	     
 	  //let us use entrySet()
          Set<Map.Entry<Employee, String>> setOfKeysAndValues_lmap = lhmapOfEmployees.entrySet();
          
             System.out.println("--------------------entrySet iterator   linkedHashMap-----------------------------");
             for(Map.Entry<Employee, String> setOfKeyAndValue : setOfKeysAndValues_lmap) 
             {
            	Employee key = setOfKeyAndValue.getKey();
            	String value =setOfKeyAndValue.getValue();
            	
            	System.out.println(key +"---" + value);
             }
             System.out.println("-------------------entrySet iterator   linkedHashMap ------------------------------");
	
	
	   Map<String , String> tmapOfStrings = new TreeMap<>();
	   
	        tmapOfStrings.put("Akash","Badnale");
	        tmapOfStrings.put("Nilesh","Patil");
	        tmapOfStrings.put("Prasad","Patil");
	        tmapOfStrings.put("Abhi","Suryavanshi");
	        tmapOfStrings.put("Dayanand","Kshirsagar");
	       //  we are adding multiple null elements  and duplicates also
	        tmapOfStrings.put("Guru",null);
	        tmapOfStrings.put("Guru",null);
	        
	        //  If we below lines are uncommented  we get  "NullPointerException"
	        
	        /*  tmapOfStrings.put(null,"Badnale");
	            tmapOfStrings.put(null,"Gosling");  */
            System.out.println();
	        System.out.println(" number of elements in tmapOfStrings --- "+tmapOfStrings.size());
	        System.out.println(" elements present in tmapOfStrings --- "+tmapOfStrings);
	        
	        
	   Map<Employee , String> tmapOfEmployees = new TreeMap<>(  new MyDepartment() );
	   
	   /*when we  are dealing with objects in TreeSet  you have to add what field you 
	    want to compare 
	    otherwise  you will get  "ClassCastException"  */
	        tmapOfEmployees.put(e1, "Employee1");
	        tmapOfEmployees.put(e2, "Employee2");
	        tmapOfEmployees.put(e3, "Employee3");
	        tmapOfEmployees.put(e4, "Employee4");
	        tmapOfEmployees.put(e5, "Employee5");
	        tmapOfEmployees.put(e6, "Employee6");
	        tmapOfEmployees.put(e7, "Employee7");
	        tmapOfEmployees.put(e8, "Employee8");
	        
	        
	        System.out.println();
	        
	        /*
	         * you might get size less than you expected  because  these is now seeing  department  keys 
	         *   it will not allow  duplicate departments
	         * */
	 	    System.out.println(" number of elements in 	tmapOfEmployees --- "+tmapOfEmployees.size());
	        
	      //let us use entrySet()
	          Set<Map.Entry<Employee, String>> setOfKeysAndValues_tmap = tmapOfEmployees.entrySet();
	          
	             System.out.println("--------------------entrySet iterator   treeMap-----------------------------");
	             for(Map.Entry<Employee, String> setOfKeyAndValue : setOfKeysAndValues_tmap) 
	             {
	            	Employee key = setOfKeyAndValue.getKey();
	            	String value =setOfKeyAndValue.getValue();
	            	
	            	System.out.println(key +"---" + value);
	             }
	             System.out.println("-------------------entrySet iterator   treeMap ------------------------------");
	      
	       
	}//main

}//CollectionsBasics


class MyDepartment implements Comparator<Employee>{
	 
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}//MyDepartment
