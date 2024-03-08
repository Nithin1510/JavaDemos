package org.doctorapp.client;

import org.doctorapp.exceptions.IdNotFoundException;
import org.doctorapp.model.Doctor;
import org.doctorapp.model.Specialization;
import org.doctorapp.service.DoctorServiceImpl;
import org.doctorapp.service.IDoctorService;

import java.util.List;
import java.util.Scanner;

public class User {
    public static void main(String[] args) throws IdNotFoundException {

        IDoctorService doctorService = new DoctorServiceImpl();
        Scanner sc = new Scanner(System.in);

        Specialization specialization = Specialization.GYNAE;
        String speciality = specialization.getSpeciality();
        Doctor doctor = new Doctor("reddy", speciality, 2800, 10, 15);
//        doctorService.addDoctor(doctor);
       List<Doctor>doctorsList = doctorService.getAll();
       for(Doctor doctor1: doctorsList){
           System.out.println(doctor1);
       }
        System.out.println("Enter doctor id: ");
        int doctorId = sc.nextInt();
        doctorService.getById(doctorId);
//        System.out.println("Enter fees : ");
//        double fees = sc.nextDouble();
//        doctorService.updateDoctor(doctorId, fees);
    }
}
