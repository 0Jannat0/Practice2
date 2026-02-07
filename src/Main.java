import java.util.ArrayDeque;
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

        //11: Basic Offer/Peek/Poll

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Peek: "+queue.peek());

        while(!queue.isEmpty()){
            System.out.println("Poll: "+ queue.poll());
        }

        //12: Stack Behavior (push / pop)

        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

        //13: Add First/Last

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);

        for (int n : deque) {
            System.out.print(n + " ");
        }

        //14: Offer First/Last Return Value

        ArrayDeque<Integer> deque2 = new ArrayDeque<>();

        boolean r1 = deque2.offerFirst(100);
        boolean r2 = deque2.offerLast(200);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(deque2);

        //15: Peek Variants

        ArrayDeque<Integer> deque3 = new ArrayDeque<>();
        deque3.add(1);
        deque3.add(2);
        deque3.add(3);

        System.out.println(deque3.peek());
        System.out.println(deque3.peekFirst());
        System.out.println(deque3.peekLast());

        deque3.clear();

        System.out.println(deque3.peek());
        System.out.println(deque3.peekFirst());
        System.out.println(deque3.peekLast());

        //16: Poll Variants

        ArrayDeque<Integer> deque4 = new ArrayDeque<>();
        deque4.add(1);
        deque4.add(2);
        deque4.add(3);

        System.out.println(deque4.poll());
        System.out.println(deque4.pollFirst());
        System.out.println(deque4.pollLast());

        //17: Remove First / Last Occurrence

        ArrayDeque<String> deque5 = new ArrayDeque<>();
        deque5.add("a");
        deque5.add("b");
        deque5.add("c");
        deque5.add("b");
        deque5.add("a");

        deque5.removeFirstOccurrence("b");
        System.out.println(deque5);

        deque5.removeLastOccurrence("a");
        System.out.println(deque5);

        //18: IsEmpty & Size

        ArrayDeque<Integer> deque6 = new ArrayDeque<>();

        deque6.add(5);
        System.out.println(deque6.size());
        System.out.println(deque6.isEmpty());

        deque6.remove();
        System.out.println(deque6.size());
        System.out.println(deque6.isEmpty());

        //19: Clear Deque

        ArrayDeque<Integer> deque7 = new ArrayDeque<>();
        deque7.add(10);
        deque7.add(20);

        deque7.clear();

        System.out.println(deque7.peek());
        System.out.println(deque7.isEmpty());

        //20: Palindrome Check (Deque)

        String word = "level";
        ArrayDeque<Character> deque8 = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque8.add(c);
        }

        boolean isPalindrome = true;

        while (deque8.size() > 1) {
            if (deque8.pollFirst() != deque8.pollLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

        //21: Model a task scheduler system.

        ArrayDeque<String> tasks = new ArrayDeque<>();

        addTask(tasks, "Normal task 1", false);
        addTask(tasks, "High priority task", true);
        addTask(tasks, "Normal task 2", false);

        processTask(tasks);
        processTask(tasks);
        processTask(tasks);
        processTask(tasks);
    }

    public static void addTask(ArrayDeque<String> tasks,
                               String task,
                               boolean highPriority) {

        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    public static void processTask(ArrayDeque<String> tasks) {

        if (tasks.isEmpty()) {
            System.out.println("No tasks to process");
        } else {
            System.out.println("Processing: " + tasks.pollFirst());
        }
    }
}
