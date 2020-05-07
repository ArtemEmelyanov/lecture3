package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        long m = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        System.out.println((double) (System.currentTimeMillis() - m));

        m = System.currentTimeMillis();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        System.out.println((double) (System.currentTimeMillis() - m));

        m = System.currentTimeMillis();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        System.out.println((double) (System.currentTimeMillis() - m));

        m = System.currentTimeMillis();
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(i);
        }
        System.out.println((double) (System.currentTimeMillis() - m));
        //в среднем время вставки в ArrayList элемента в конец списка является постоянным
        //LinkedList в абсолютных величинах проигрывает ArrayList и по потребляемой памяти и по скорости выполнения операций.

        System.out.println();

        m = System.currentTimeMillis();
        arrayList.add(0, 5);
        arrayList.add(arrayList.size(), 55);
        System.out.println((double) (System.currentTimeMillis() - m));

        m = System.currentTimeMillis();
        linkedList.add(0, 5);
        linkedList.add(linkedList.size(), 55);
        System.out.println((double) (System.currentTimeMillis() - m));
        //вставка элемента в linkedlist происходит быстрее, тк он хранит ссылки на первый и последний элементы
        //в arraylist все элементы сдвигаются с первого по конечный при вставке элемента на 0 индекс

        //как писать тест с помощью contains я не понял(
    }
}
