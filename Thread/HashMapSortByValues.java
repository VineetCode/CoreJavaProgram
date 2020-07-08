import java.util.*;
public class HashMapSortByValues{
 // function to sort hashmap by values 
    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
           

        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
         for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
       } 
        return temp; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
  
        // enter data into hashmap 
      //  hm.put("Math", 98); 
      //  hm.put("Data Structure", 85); 
      //  hm.put("Database", 91); 
      //  hm.put("Java", 95); 
      //  hm.put("Operating System", 79); 
      //  hm.put("Networking", 80); 

		 hm.put(1, 98); 
        hm.put(5, 85); 
        hm.put(6, 91); 
        hm.put(4, 95); 
        hm.put(10, 79); 
        hm.put(3, 80); 
        Map<Integer, Integer> hm1 = sortByValue(hm); 
  
        // print the sorted hashmap 
        for (Map.Entry<Integer, Integer> en : hm1.entrySet()) { 
            System.out.println("Key = " + en.getKey() +  
                          ", Value = " + en.getValue()); 
        } 
    } 
 
}
