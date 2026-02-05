import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static boolean isAllowed(String name, HashSet<String> users) {
        return users.contains(name);
    }


    public static void main(String[] args){

        //1: Unique Integers

        int[] list = {1, 2, 2, 3, 4, 4, 4, 5};
        HashSet<Integer> res = new HashSet<>();

        for(int i = 0; i< list.length; i++){
            res.add(list[i]);
        }
        System.out.println(res);

        //2: Check Membership

        HashSet<String> allowedUsers = new HashSet<>();
        allowedUsers.add("Alice");
        allowedUsers.add("Bob");
        allowedUsers.add("Charlie");

        System.out.println(isAllowed("Bob", allowedUsers));
        System.out.println(isAllowed("David", allowedUsers));

        //3: Set Size & Emptiness

        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(30);

        System.out.println(nums.size());

        nums.clear();
        System.out.println(nums.isEmpty());

        //4: Remove Elements

        HashSet<String> names = new HashSet<>();
        names.add("Mike");
        names.add("Will");
        names.add("Lucas");
        names.add("Dustin");
        names.add("Jane");

        boolean removed = names.remove("Jane");
        System.out.println(removed);
        System.out.println(names);

        //5: Bulk Add (addAll)

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);

        set1.addAll(set2);
        System.out.println(set1);

        //6: Bulk Remove (removeAll)

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);

        setA.removeAll(setB);
        System.out.println(setA);

        //7: Retain Common (retainAll)

        HashSet<Integer> setX = new HashSet<>();
        setX.add(1);
        setX.add(2);
        setX.add(3);

        HashSet<Integer> setY = new HashSet<>();
        setY.add(2);
        setY.add(3);
        setY.add(4);

        setX.retainAll(setY);
        System.out.println(setX);

        //8: Contains All (containsAll)

        if(setA.containsAll(setB)){
            System.out.println("setA contains all elements of setB");
        }else{
            System.out.println("setA DOES NOT contain all elements of setB");
        }

        //9: Deduplicate Words

        String sentence = "We are learning Java";
        String[] words = sentence.split(" ");

        HashSet<String> unique = new HashSet<>();
        for(String word: words){
            unique.add(word);
        }
        System.out.println(unique);

        //10: Case-Insensitive Unique Words

        String[] inputWords = {"Apple", "apple", "APPLE"};

        HashSet<String> result = new HashSet<>();

        for (String w : inputWords) {
            result.add(w.toLowerCase());
        }

        System.out.println(result);



    }
}
