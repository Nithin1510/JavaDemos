package com.util.maps;


import java.util.*;

public class MapStudent {
    public static void main(String[] args) {

        Map<Department, List< Student >> hashMap = new HashMap<>();

        Department department1 = new Department("Joe", 341, "CSE");
        Department department2 = new Department("Nithin", 343, "ECE");
        Department department3 = new Department("Kumar", 345, "EEE");

        hashMap.put(department1, Arrays.asList(
                new Student("Chandu", "Kadapa"),
                new Student("Reddy", "CCPalli"),
                new Student("Kumar", "Galivedu")));
        hashMap.put(department2, Arrays.asList(
                new Student("Mani", "Bangalore"),
                new Student("Muni", "Vellore"),
                new Student("Charan", "vellore")));
        hashMap.put(department3, Arrays.asList(
                new Student("Chandini", "Kadapa"),
                new Student("vani", "Guntur"),
                new Student("Vamsi", "Huderabad")));

//        Set<Department> departments = hashMap.keySet();

        for (Department department: hashMap.keySet()){
            System.out.println(department.getDeptHead() + " "+department.getDeptId() + " "+ department.getDeptName());
//            List<Student> students = hashMap.get(department);
            for(Student student: hashMap.get(department)){
                System.out.println(student.getStudentName()+ " "+student.getCity());
            }
        }

    }
}
