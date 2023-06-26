package seminar_03;

// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
// 2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
// 3) Найти максимальное значение
// 4) Найти среднее значение

// То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Collections;

public class Homework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,8,-4,15,11,22,0,-10,13));
        System.out.println(findMin(list));
        System.out.println(findMax(list));
        System.out.println(getAverage(list));
        removeEven(list);
        System.out.println(list); 
        
    }
    private static void removeEven(ArrayList<Integer> list) {
        list.removeIf(next -> next%2==0);
    }

    private static Integer findMin(ArrayList<Integer> list){
        return Collections.min(list); 
    }

    private static Integer findMax(ArrayList<Integer> list){
        return Collections.max(list); 
    }

    private static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }
    
}