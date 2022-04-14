package org.Ex9;
import java.util.*;


public class Main {
    public static void main(String[] args) {
//        List<Integer> someList = Arrays.asList(1,1,2,3,4,4,4,5,6,7,8,8,9,9,10,11,11);
//        Collections.removeDuplicate(someList);
//          List<Integer> list1 = new ArrayList<>();
//          List<Integer> list2 = new LinkedList<>();
//          Collections.addMillionItemsToList(list1);
//          Collections.chooseRandomItem100000Times(list1);
        User user1 = new User("Andrew");
        User user2 = new User("Alice");
        User user3 = new User();
        user3.setName("John");
        User user4 = new User();
        user4.setName("Bruce");

        //  Key   Value
        Map<User,Integer> userScoreMap = new HashMap<>();
        userScoreMap.put(user1, 87);
        userScoreMap.put(user2, 94);
        userScoreMap.put(user3, 97);
        userScoreMap.put(user4, 79);

        printUsers(userScoreMap);

        System.out.println("\nЧтобы узнать колличество баллов игрока:");
        System.out.println("Введите имя из списка имен, указанных выше");
        Scanner scanName = new Scanner(System.in);
        String userName = scanName.nextLine();
        
        PrintScores(userScoreMap, userName);


    }

    private static void PrintScores(Map<User, Integer> userScoreMap, String userName) {
       Integer result=0;
       for (Map.Entry<User, Integer> pair: userScoreMap.entrySet()){
           Integer Score = pair.getValue();
           User key = pair.getKey();
           if(key.getName().equals(userName)){
               System.out.println(Score);

           }

       }

    }

    public static void printUsers(Map<User, Integer> userScoreMap) {
        for (Map.Entry<User,Integer> pair: userScoreMap.entrySet()){
            System.out.print(pair.getKey().getName());
            System.out.print(" ");
        }


    }

}

