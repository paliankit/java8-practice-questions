package com.demo.java8;

import javax.xml.transform.Source;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
//        //Q1  Count Frequency of Characters in a String
//        String str = "banana";
//        Map<Character,Integer> hm=new HashMap<Character,Integer>();
//        for(int i=0;i<str.length();i++){
//            hm.merge(str.charAt(i),1,Integer::sum);
//        }
//        System.out.println(hm);
//        //using java8 features

//        //Q2. Filter Even Numbers from a List
//
//        List<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6));
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)%2!=0){
//                list.remove(i);
//                i--;
//            }
//        }
//        System.out.println(list);
//        //java8 features
//        List<Integer> list1= new ArrayList<>(Arrays.asList(1,2,3,3,4,5,6));
//        System.out.println(list1.stream().filter(n->n%2==0).collect(Collectors.toList()));

//        //3. Sort a List of Strings Alphabetically
//        List<String> list=Arrays.asList("Ronaldo","Messi","Hazard");
//        Collections.sort(list);
//        System.out.println(list);
//
//        //java8
//        System.out.println(list.stream().sorted().collect(Collectors.toList()));

//        //4. Remove duplicates from a list
//        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
//        Set<Integer> set=new HashSet<>(nums);
//        System.out.println(set);
//
//            //java8
//        System.out.println(nums.stream().distinct().collect(Collectors.toList()));

//        //5. Count words in a sentence
//
//        String sentence = "this is a test this is only a test";
//        String[] stringArray=sentence.split("\\s+");
//        Map<String,Integer> hm=new LinkedHashMap<>();
//        for(int i=0;i<stringArray.length;i++){
//            hm.merge(stringArray[i],1,Integer::sum);
//        }
//        System.out.println(hm);
//        //generally split doesnt work as expected if there is 2 spaces consequently, in that case we can use split("\\s+")
//
//            //java8

//        //Q6. calculate the sum of a list
//
//        List<Integer> list=Arrays.asList(1,3,5,6,7,8);
//        //traditional way
//        int sum=0;
// 		for(int i=0;i<list.size();i++){
// 		    sum+=list.get(i);
// 		}
// 		System.out.println(sum);
//
//         //java8
//
//        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

//        //Q7.Count Numbers Greater Than a Given Value (e.g., > 3)
//
//        List<Integer> list=Arrays.asList(1,3,5,6,7,8);
//
//        //traditional way
//        int count=0;
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)>3){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        //java8
//
//        System.out.println(list.stream().filter(n->n>3).count());

//        //Q8. Find the Maximum Element
//
//        List<Integer> list=Arrays.asList(1,3,5,6,7,8);
//
//        //traditional way
//        int max=list.get(0);
//        for(int i=1;i<list.size();i++){
//            max=Math.max(max,list.get(i));
//        }
//        System.out.println(max);
//
//        //java8
//
//        System.out.println(list.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE));

        // Q9. Convert List of Integers to List of Strings

        List<Integer> list=Arrays.asList(1,3,5,6,7,8);

        //traditional way
        List<String> result=new ArrayList<String>();
        for(int i=0;i<list.size();i++){
            result.add(String.valueOf(list.get(i)));
        }
        System.out.println(result);

        //java8

        List<String> resultList=list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(resultList);

        //just checking method overriding,overloading behaviour
        AnotherClass anotherClass=new AnotherClass();
        anotherClass.printThis(1);
        System.out.println(Constant.THIS_IS_A_CONSTANT);


        //thread created using runnable implemenation
        Thread thread1=new Thread(new RunnableImplementation());
        thread1.start();

        //we can directly implement run method using lambda expressions

        Thread thread2=new Thread(() -> System.out.println("This is printed from thread created by lambda expression of run method"));

        thread2.start();


        //before lambda expresions (pre java8) we use to implement interfaces temporarily using
        //anonymous classes
        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is printed from thread created by anonymous implementaion of runnable");
            }
        });
        thread3.start();










    }
}
