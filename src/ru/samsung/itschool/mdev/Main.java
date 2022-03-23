package ru.samsung.itschool.mdev;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Collection
        // List-ы
        // List - интерфейс
        // Реализации: ArrayList, LinkedList, Stack, Queue
        //                                     LIFO  FIFO
        // LIFO - Last in First out (Stack)
        // FIFO - First in First out (Queue)
        // ArrayList<String> arrayList = new ArrayList<>();
        // Set-ы
        // Множества
        // Реализации: TreeSet, HashSet
        //
        // Map-ы
        // Словари
        // Реализации: Hashtable, HashMap, LinkedHashMap, TreeMap

        // Collection - интерфейс

        ArrayList arrayLis2 = new ArrayList();
        Collection arr2 = new ArrayList();

        // Collections - класс

        // Collections - вспомогат. класс для коллекций
        // Arrays - только для массивов



        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.add(0,i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList add to the begin:  "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<100000;i++) {
            linkedList.add(0,i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the begin: "+(end-start));

        start = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList get from the middle:  "+(end-start));

        start = System.nanoTime();
        for(int i=30000;i<70000;i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList get from the middle: "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<50000;i++) {
            arrayList.add(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList add to the end:  "+(end-start));

        start = System.nanoTime();
        for(int i=0;i<50000;i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList add to the end: "+(end-start));

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>(); // классич. очередь
        String[] str = {"1","2","3","4","5"};
        for(String s: str) {
            stack.push(s); // кладем в стек
            queue.offer(s);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
        while(!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        ArrayList<Integer> arraysList3 = new ArrayList<>();
        Collections.addAll(arraysList3,5,56,34,5,2,3,5,6,7,346,213);
        Collections.sort(arraysList3);
        System.out.println(Collections.binarySearch(arraysList3,5));

        class Student implements Comparable<Student>{
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public int compareTo(Student o) {
                return this.age - o.age;
            }
        }

        Comparator<Student> comparator = (o1, o2) -> o1.age-o2.age;


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan",12));
        students.add(new Student("Alex",12));
        students.add(new Student("Max",15));
        students.add(new Student("Oleg",18));

        Collections.sort(students);

        for(Student s:students) {
            System.out.println(s.age + " "+s.name);
        }

    }
}
