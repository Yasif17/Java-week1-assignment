import java.util.*;

class HashMapChallenge{
    public static void main(String[] args){
    Map<Integer,String> students = new HashMap<>();

    // insert key value pair
    students.put(101,"Yasif");
    students.put(102,"Amit");
    students.put(103,"zafar");
    students.put(104,"manish");
    students.put(105,"sajjan");

    // retrieve value  by key
    System.out.println(students.get(103));

    // update value
    students.put(102,"Updated");

    // checking whether a key exist
    students.containsKey(103);

    // iterate through entries
    for(Map.Entry<Integer,String> entry:students.entrySet()){
        System.out.println(entry.getKey()+"->"+entry.getValue());
    }


}