package com.ngocvm.example.Day79;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        List< Person > listPersons = new ArrayList<>();
        listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
        listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
        listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
        listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
        listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
        listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
        listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
        listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
        listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
        listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));

        listPersons.stream().filter(p->p.getGender().equals(Gender.MALE))
                            .forEach(System.out::println);

        //---shows only female who are under 25
        listPersons.stream().filter(p->p.getGender().equals(Gender.FEMALE) && p.getAge() < 25)
                            .forEach(System.out::println);

        //---
        listPersons.stream()
                .map(p -> p.getEmail())
                .forEach(System.out::println);

        //---
        listPersons.stream()
                .mapToInt(p -> p.getAge())
                .forEach(age -> System.out.print(age + " - "));

        //---
        listPersons.stream()
                .map(p -> p.getFirstName().toUpperCase())
                .forEach(System.out::println);

        //---
        listPersons.stream()
                .sorted()
                .forEach(p -> System.out.println(p + " - " + p.getAge()));

        //---
        listPersons.stream()
                .sorted((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()))
                .forEach(System.out::println);

        //---
        int[] numbers = {23, 58, 12, 23, 17, 29, 99, 98, 29, 12};
        Arrays.stream(numbers).distinct().forEach(i ->System.out.print(i + " "));

        //---
        System.out.println();
        List< String > top3Students = listPersons.stream()
                .map(p->p.getLastName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Top 3 --- " + top3Students);

        //--- shows top 5 youngest persons:
        listPersons.stream()
                .sorted()
                .limit(5)
                .forEach(System.out::println);

        //--- finds the oldest age of the persons above:
        System.out.print("The oldest age: ");
        listPersons.stream()
                .sorted()
                .map(p -> p.getAge())
                .skip(listPersons.size() - 1)
                .forEach(System.out::println);

        //--- checks if all persons are male
        boolean areAllMale = listPersons.stream()
                                .allMatch(p->p.getGender().equals(Gender.MALE));
        System.out.println("Are all person male? " + areAllMale);

        //--- check if all people using GMail:
        boolean useGmail = listPersons.stream()
                                .allMatch(p->p.getEmail().endsWith("gmail.com"));
        System.out.println("Does everyone use GMail? " + useGmail);

        //--- checks whether the list has any female:
        boolean anyFemale = listPersons.stream()
                                .anyMatch(p->p.getGender().equals(Gender.FEMALE));
        System.out.println(("Is there any female? " + anyFemale));

        //--- checks whether the list has any teenager (age under 20):
        boolean anyTeenager =  listPersons.stream()
                                    .anyMatch(p -> p.getAge() < 20);
        System.out.println("Is there any teenager? " + anyTeenager);

        //--- checks if no none uses Yahoo email:
        boolean noYahooMail = listPersons.stream()
                                    .noneMatch(p->p.getEmail().endsWith("yahoo.com"));
        System.out.println("No one uses Yahoo mails? " + noYahooMail);

        //--- Does anyone come from the Hill family?
        boolean noHill = listPersons.stream()
                            .noneMatch(p->p.getLastName().equals("Hill"));
        System.out.println("No one comes from Hill family? " + noHill);

        //---
        List<String> listEmails = listPersons.stream().map(p->p.getEmail()).collect(Collectors.toList());
        System.out.println("List of emails: " + listEmails);

        //---  the following code collects emails into a TreeSet:
        Set<String> setEmails = listPersons.stream()
                                    .map(p->p.getEmail())
                                    .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Set of emails: " + setEmails);

        //---  groups the person by gender:
        Map<Gender, List<Person>> byGender = listPersons.stream()
                                                .collect(Collectors.groupingBy(p ->p.getGender()));
        System.out.println("Groups by gender:\n" + byGender);

        //---  accumulates first names and concatenates them into a String, separated by commas:
        String firstName = listPersons.stream()
                                .map(p -> p.getFirstName())
                                .collect(Collectors.joining(", "));
        System.out.println(firstName);

        //--- finds how many people are male:
        long totalMale = listPersons.stream()
                            .filter(p->p.getGender().equals(Gender.MALE))
                            .count();
        System.out.println("Total male: " + totalMale);

        System.out.println("People are female:");
        listPersons.stream()
                .filter(p -> p.getGender().equals(Gender.FEMALE))
                .forEach(System.out::println);

        //--- finds the youngest female person in the list:
        Optional<Person> min = listPersons.stream()
                                    .filter(p->p.getGender().equals(Gender.FEMALE))
                                    .min((p1, p2) -> p1.getAge() - p2.getAge());
        if (min.isPresent()) {
            Person youngestGirl = min.get();
            System.out.println("The youngest girl is: " + youngestGirl + " (" + youngestGirl.getAge() + ")");
        }

        Optional<Person> max = listPersons.stream()
                                    .filter(p->p.getGender().equals(Gender.MALE))
                                    .max((p1, p2)-> p1.getAge() - p2.getAge());
        if (max.isPresent()) {
            Person oldestMan = max.get();
            System.out.println("The oldest man is: " + oldestMan + " (" + oldestMan.getAge() + ")");
        }

        //--- accumulates first names of all persons into a String
        Optional<String> reduceValue = listPersons.stream()
                                        .map(p->p.getFirstName())
                                        .reduce((nam1, nam2) -> nam1 + ", " + nam2);
        if (reduceValue.isPresent()) {
            String names = reduceValue.get();
            System.out.println(names);
        }
        //--- calculates sum of numbers in a stream:
        int[] numbers1 = {123, 456, 789, 246, 135, 802, 791};
        int sum = Arrays.stream(numbers1).reduce(0, (x, y) -> (x + y));
        System.out.println("sum = " + sum);
    }
}
