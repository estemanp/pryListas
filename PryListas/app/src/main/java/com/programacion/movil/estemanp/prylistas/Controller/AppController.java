package com.programacion.movil.estemanp.prylistas.Controller;

import android.app.Application;

import com.programacion.movil.estemanp.prylistas.Model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by estemanp on 10/09/17.
 */

public class AppController extends Application {

    private List<Student> studentList;

    public AppController(){
        super();
        fillStundets();
    }

    private void fillStundets(){
        studentList = new ArrayList<>();
        studentList.add(new Student("1711114702","Juan Esteban Gallego", 17));
        studentList.add(new Student("1710911712","Alison Ramirez", 22));
        studentList.add(new Student("1710925703","Jhon Alexander Giraldo", 25));
        studentList.add(new Student("1711114702","Juan Esteban Gallego", 17));
        studentList.add(new Student("1710911712","Alison Ramirez", 22));
        studentList.add(new Student("1710925703","Jhon Alexander Giraldo", 25));
        studentList.add(new Student("1711114702","Juan Esteban Gallego", 17));
        studentList.add(new Student("1710911712","Alison Ramirez", 22));
        studentList.add(new Student("1710925703","Jhon Alexander Giraldo", 25));
        studentList.add(new Student("1711114702","Juan Esteban Gallego", 17));
        studentList.add(new Student("1710911712","Alison Ramirez", 22));
        studentList.add(new Student("1710925703","Jhon Alexander Giraldo", 25));

    }

    public List<Student> getStudents(){
        return studentList;
    }


}
