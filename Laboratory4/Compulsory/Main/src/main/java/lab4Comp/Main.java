package lab4Comp;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.ArrayList;

public class Main {
    //we create a list of students, using streams
    public static ArrayList<Student> createList(){
        ArrayList<Student> students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i) )
                .collect(Collectors.toCollection(ArrayList::new));
        return students;
    }
    //sorting the list
    public static LinkedList<Student> sortList(LinkedList<Student> list, LinkedList<Student> newSortedList){
         newSortedList = list.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toCollection(LinkedList::new));
        return newSortedList;
    }
    //copy an arraylist into linkedList into another one
    public static LinkedList<Student> arrayToLinkedList(ArrayList<Student> list1, LinkedList<Student> list2){
        for(Student s : list1){
            list2.add(s);
        }
        return list2;
    }
    public static TreeSet<School> createPrefferedSchoolsTreeSet(){
        TreeSet<School> prefferedSchools = (IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new School("School" + i) )
                .collect(Collectors.toCollection(TreeSet::new)));
        return prefferedSchools;
    }
    public static List<School>  createPrefferedSchoolsList(){
        List<School> prefferedSchoolsList = (IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new School("h" + i))
                .collect(Collectors.toList()));
        return prefferedSchoolsList;
    }
    public static Map<String, List<School>> fillSchoolsMapList(LinkedList<Student> list, List<School>prefferedSchoolsList, int index){
        Map<String, List<School>> prefferedSchoolsMapList = new HashMap<>();
        prefferedSchoolsMapList.put(list.get(index).getName(), prefferedSchoolsList);
        return prefferedSchoolsMapList;
    }
    public static Map<String, TreeSet<School>> fillSchoolsMapTreeSet(LinkedList<Student> list, TreeSet<School>prefferedSchoolsTreeSet, int index){
        Map<String, TreeSet<School>> prefferedSchoolsMapTree = new HashMap<>();
        prefferedSchoolsMapTree.put(list.get(index).getName(), prefferedSchoolsTreeSet);
        return prefferedSchoolsMapTree;
    }
    public static void printMapTree(Map<String, TreeSet<School>> prefferedSchoolsMapTree ){
        System.out.println("Map de tip <String, TreeSet<School>>:");
        for(String key: prefferedSchoolsMapTree.keySet())
        {
            System.out.println(key + " = " + prefferedSchoolsMapTree.get(key));
        }
    }
    public static void printMapList(Map<String, List<School>> prefferedSchoolsMapList){
        System.out.println("Map de tip <String, List<School>>:");
        prefferedSchoolsMapList.keySet().stream()
                .forEach(System.out::println);
    }


    public static void compulsory(){
        //operations on objects of type student
        ArrayList<Student> students= createList();
        LinkedList<Student> studentsLinkedList = new LinkedList<Student>();
        LinkedList<Student> newSortedList = new LinkedList<Student>();
        studentsLinkedList = arrayToLinkedList(students, studentsLinkedList);
        newSortedList = sortList(studentsLinkedList, newSortedList);
        //operations on objects of type School
        TreeSet<School> prefferedSchoolsTreeSet = createPrefferedSchoolsTreeSet();
        List<School> prefferedSchoolsList = createPrefferedSchoolsList();
        Map<String, TreeSet<School>> prefferedSchoolsMapTree = fillSchoolsMapTreeSet(newSortedList, prefferedSchoolsTreeSet, 0);
        Map<String, List<School>> prefferedSchoolsMapList = fillSchoolsMapList(newSortedList, prefferedSchoolsList, 0);
        printMapList(prefferedSchoolsMapList);
        printMapTree(prefferedSchoolsMapTree);

    }
    public static void main(String args[]){
        compulsory();
    }




}
