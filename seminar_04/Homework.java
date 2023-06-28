package seminar_04;

// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
// 4. Если введено exit, то программа завершается

// > - ввод в консоль (stdin), < - вывод на консоль (stdout)
// > java
// > python
// > c#
// > print
// < [c#, python, java]
// > revert
// > print
// < [python, java]
// > revert
// > revert
// > print
// < []
// > revert -> throw new NoSuchElementException

import java.util.LinkedList;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> arrayLst = new LinkedList<>();
            while (true) {
                String scanResult = scanner.nextLine();
                if (scanResult.equals("revert")) {
                    if (arrayLst.size() >= 1)
                        arrayLst.removeFirst();
                } 
                else if (scanResult.equals("print")) {
                    System.out.println(arrayLst);
                } 
                else if (scanResult.equals("exit")) {
                    break;
                } 
                else {
                    arrayLst.addFirst(scanResult);
                }
            }

        }
    }
}