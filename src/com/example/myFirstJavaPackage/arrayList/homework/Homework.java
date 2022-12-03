package com.example.myFirstJavaPackage.arrayList.homework;

import java.util.ArrayList;
import java.util.Collections;

public class Homework {

    public static ArrayList abc(String ... array) {

        ArrayList<String> arrayList = new ArrayList<>();
        for (String element : array) {
            if (!arrayList.contains(element)) {
                arrayList.add(element);
            }
        }

        Collections.sort(arrayList);

        System.out.println(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {

        abc("Ho", "Ha", "He");
    }
}
