package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // Create a list
        List<String> list1 = Arrays.asList("a", "b", "c");

        // Create new stream
        Stream<String> stream = list1.stream();

        // Invoke the forEach() method
        stream.forEach(System.out::println);

        System.out.println("----------------------------");


        // Create a new list
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);

        // Create new stream
        Stream<Integer> stream2 = list2.stream();

        // Invoke the sort() method
        stream2.sorted().forEach(System.out::println);

        System.out.println("----------------------------");

        // Create a new list
        List<Integer> list3 = Arrays.asList(12, 8, 89, 45, 56);

        // Create new stream
        Stream<Integer> stream3 = list3.stream();

        // Invoke the sort() and reverse() method
        stream3.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("----------------------------");

        Employee employee1 = new Employee("John", 25);
        Employee employee2 = new Employee("Joe", 30);
        Employee employee3 = new Employee("Jack", 35);
        Employee employee4 = new Employee("Jill", 40);

        // Create new stream
        Stream<Employee> stream4 = Stream.of(employee1, employee2, employee3, employee4);

        // Invoke the forEach() method
        stream4.forEach((items) -> {
            System.out.println(items.getName() + " " + items.getAge());
        });

        // Create new stream
        Stream<Employee> stream5 = Stream.of(employee1, employee2, employee3, employee4);

        System.out.println("----------------------------");

        // Invoke the map() method
        stream5.map(Employee::getName).forEach(System.out::println);
    }
}