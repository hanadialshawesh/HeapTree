package Tree;
import java.util.Scanner;

import Tree.HeapTree;

public class Main {
    public static void main(String[] args)  {
    Scanner san = new Scanner(System.in);
    HeapTree Tree=new HeapTree();
     boolean exitCode=true;
     while (exitCode) {



    int mainchoice;
    System.out.println("Please enter the service");
    System.out.println(" ");
    System.out.println(" 1. addHeapify 2. MaxHeapify 3. MinHeapify  4. remove 5. Exit ");
    mainchoice = san.nextInt();
    switch (mainchoice) {
        case 1 -> {

        int k;
        System.out.println("please enter the number to add it ");
        k = san.nextInt();
        Tree.add(k);
        Tree.print();
        System.out.println(" ");
        }
        case 2 ->{
        System.out.println("Please enter 7 elements to make it heapifyMax ");
        int k1 = san.nextInt();
        Tree.add(k1);
        int k2 = san.nextInt();
        Tree.add(k2);
        int k3 = san.nextInt();
        Tree.add(k3);
        int k4 = san.nextInt();
        Tree.add(k4);
        int k5 = san.nextInt();
        Tree.add(k5);
        int k6 = san.nextInt();
        Tree.add(k6);
        int k7 = san.nextInt();
        Tree.add(k7);
        System.out.println(" ");
        Tree.print();System.out.println(" ");
        System.out.println("if u wanna to choose the service again run the code again ");

        }
        case 3 -> {

        System.out.println("Please enter 7 elements to make it heapifyMin ");
        int k1 = san.nextInt();
        Tree.addmin(k1);
        int k2 = san.nextInt();
        Tree.addmin(k2);
        int k3 = san.nextInt();
        Tree.addmin(k3);
        int k4 = san.nextInt();
        Tree.addmin(k4);
        int k5 = san.nextInt();
        Tree.addmin(k5);
        int k6 = san.nextInt();
        Tree.addmin(k6);
        int k7 = san.nextInt();
        Tree.addmin(k7);
        System.out.println(" ");
        Tree.print();
        System.out.println("");
        System.out.println("if u wanna to choose the service again run the code again");

        }
        case 4 -> {

        int k;
         System.out.println("please enter the number to remove it ");
         k = san.nextInt();
        Tree.remove(k);
        System.out.println(" ");

        }

        case 5 -> {
            System.out.println("Thank you. Code exit done");

          exitCode = false;
        }
    }
  }

 }
}