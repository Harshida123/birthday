package com.Example;

public class Example {
/*
package com.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    //Map example
    Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
    List<Integer> ListofInteger = new ArrayList<>(Arrays.asList(intArray));
    Function<Integer,Integer> timestwo = (x)-> x*2;
    List<Integer> doubled = ListofInteger.stream().map(timestwo).collect(Collectors.toList());
        System.out.println(doubled);List
    List<Integer> number =  Arrays.asListList(1,2,3,4);
    List<Integer> newnumber = new ArrayList<Integer>();
         number.stream().map(n->n*2).forEach(System.out::println);
    //Example Filter
    Predicate<Integer> isEven = (x)-> x % 2 ==0;
    List<Integer> Even = ListofInteger.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(Even);
    Predicate<String> stringlength = (str) -> str.length()>5;
    // Set instead of List
    Set<Integer> Even1 = ListofInteger.stream().filter(isEven).collect(Collectors.toSet());
    // String s  = ListofInteger.stream().filter(stringlength).collect(Collectors.joining(","));

    // apply condition withoutfunctioni
    String [] name ={"Harshida","Rita","Manoj","Jyotnsan","dsddsdsdsdsdsdsdsdsdds"};

    List<String> names = new ArrayList<>(Arrays.asList(name));
    List<String> longname = new ArrayList<String>();
    longname = names.stream().filter(l ->l.length() > 4 && l.length() <9).collect(Collectors.toList());
        System.out.println(longname);
        List<WebElement> links = driver.findElements(By.tagname("a"));
        driver.findElement(By.xpath("//input[contains(@id, firstthree letter)]");
        driver.findElement(By.xpath("//input[starts-with(@id, firstthree letter)]");
         driver.findElement(By.xpath("//input[enda-with(@id, lasttthree letter)]");

         List<String>findsmallestone = Arrays.asList("Java","C","Selenium","Scala","hi");
        Comparator<String> comparebylength = (a,b) ->a.length()-b.length();
        Comparator<String> comparebyle = (a,b) ->a.compareTo(b);


        findsmallestone.stream().sorted(comparebylength).forEach(System.out::println);
        List<String>revorder =Arrays.asList("Selenium", "Appium", "RestAssured", "SqL", "Jenkins", "Jmeter");
        List<String> newrevorder = new ArrayList<String>();

    Collections.sort(revorder ,Collections.reverseOrder());
        System.out.println(revorder);
        Collections.sort(revorder);

        System.out.println(revorder);

        String newstring  = ("Helloworld");
        Comparator <String>stringreverseOrderWay1=
                (s1,s2)->s2.compareTo(s1);
        Comparator <String>stringReverseOrderWay2=
                Comparator.reverseOrder();

        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = Arrays.asList("abcd","efgh","hijk");
        boolean a =l3.contains("abcd");


        List<Boolean> l23 = new ArrayList<Boolean>();
        l23= l3.stream().map(x->x.contains("a")).collect(Collectors.toList());
        System.out.println(l23);
        l1 = l3.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(l1);
        l1 = l3.stream().map(x->x.substring(0,2)).collect(Collectors.toList());
        l2 = l3.stream().map(x->x.substring(2)).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println(l2);



}
*/
/*
package com.Example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    //Map example
    Integer [] intArray = {1,2,3,4,5,6,7,8,9,10};
    List<Integer> ListofInteger = new ArrayList<>(Arrays.asList(intArray));
    Function<Integer,Integer> timestwo = (x)-> x*2;
    List<Integer> doubled = ListofInteger.stream().map(timestwo).collect(Collectors.toList());
        System.out.println(doubled);List
    List<Integer> number =  Arrays.asListList(1,2,3,4);
    List<Integer> newnumber = new ArrayList<Integer>();
         number.stream().map(n->n*2).forEach(System.out::println);
    //Example Filter
    Predicate<Integer> isEven = (x)-> x % 2 ==0;
    List<Integer> Even = ListofInteger.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(Even);
    Predicate<String> stringlength = (str) -> str.length()>5;
    // Set instead of List
    Set<Integer> Even1 = ListofInteger.stream().filter(isEven).collect(Collectors.toSet());
    // String s  = ListofInteger.stream().filter(stringlength).collect(Collectors.joining(","));

    // apply condition withoutfunctioni
    String [] name ={"Harshida","Rita","Manoj","Jyotnsan","dsddsdsdsdsdsdsdsdsdds"};

    List<String> names = new ArrayList<>(Arrays.asList(name));
    List<String> longname = new ArrayList<String>();
    longname = names.stream().filter(l ->l.length() > 4 && l.length() <9).collect(Collectors.toList());
        System.out.println(longname);
        List<WebElement> links = driver.findElements(By.tagname("a"));
        driver.findElement(By.xpath("//input[contains(@id, firstthree letter)]");
        driver.findElement(By.xpath("//input[starts-with(@id, firstthree letter)]");
         driver.findElement(By.xpath("//input[enda-with(@id, lasttthree letter)]");

         List<String>findsmallestone = Arrays.asList("Java","C","Selenium","Scala","hi");
        Comparator<String> comparebylength = (a,b) ->a.length()-b.length();
        Comparator<String> comparebyle = (a,b) ->a.compareTo(b);


        findsmallestone.stream().sorted(comparebylength).forEach(System.out::println);
        List<String>revorder =Arrays.asList("Selenium", "Appium", "RestAssured", "SqL", "Jenkins", "Jmeter");
        List<String> newrevorder = new ArrayList<String>();

    Collections.sort(revorder ,Collections.reverseOrder());
        System.out.println(revorder);
        Collections.sort(revorder);

        System.out.println(revorder);

        String newstring  = ("Helloworld");
        Comparator <String>stringreverseOrderWay1=
                (s1,s2)->s2.compareTo(s1);
        Comparator <String>stringReverseOrderWay2=
                Comparator.reverseOrder();

        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = Arrays.asList("abcd","efgh","hijk");
        boolean a =l3.contains("abcd");


        List<Boolean> l23 = new ArrayList<Boolean>();
        l23= l3.stream().map(x->x.contains("a")).collect(Collectors.toList());
        System.out.println(l23);
        l1 = l3.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
        System.out.println(l1);
        l1 = l3.stream().map(x->x.substring(0,2)).collect(Collectors.toList());
        l2 = l3.stream().map(x->x.substring(2)).collect(Collectors.toList());
        System.out.println(l1);
        System.out.println(l2);



}
*/
}
