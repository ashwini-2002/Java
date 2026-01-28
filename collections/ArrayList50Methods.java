package collections;

import java.util.*;

public class ArrayList50Methods {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // 1. add
        list.add("Ashu");
        System.out.println("1. After add Ashu: " + list);

        // 2. add
        list.add("Mimi");
        System.out.println("2. After add Mimi: " + list);

        // 3. add
        list.add("Kiki");
        System.out.println("3. After add Kiki: " + list);

        // 4. add at index
        list.add(1, "Ashi");
        System.out.println("4. After add at index 1: " + list);

        // 5. size
        System.out.println("5. Size: " + list.size());

        // 6. get
        System.out.println("6. Get index 2: " + list.get(2));

        // 7. set
        list.set(2, "MINU");
        System.out.println("7. After set index 2: " + list);

        // 8. contains
        System.out.println("8. Contains Ashu: " + list.contains("Ashu"));

        // 9. indexOf
        System.out.println("9. IndexOf Mimi: " + list.indexOf("Mimi"));

        // 10. lastIndexOf
        list.add("Ashu");
        System.out.println("10. LastIndexOf Ashu: " + list.lastIndexOf("Ashu"));

        // 11. isEmpty
        System.out.println("11. Is Empty: " + list.isEmpty());

        // 12. remove by index
        list.remove(1);
        System.out.println("12. After remove index 1: " + list);

        // 13. remove by object
        list.remove("Kiki");
        System.out.println("13. After remove Kiki: " + list);

        // 14. iterator
        System.out.print("14. Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 15. for-each
        System.out.print("15. For-each: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 16. addAll
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list.addAll(list2);
        System.out.println("16. After addAll: " + list);

        // 17. addAll at index
        list.addAll(1, list2);
        System.out.println("17. After addAll at index 1: " + list);

        // 18. containsAll
        System.out.println("18. ContainsAll list2: " + list.containsAll(list2));

        // 19. removeAll
        list.removeAll(list2);
        System.out.println("19. After removeAll: " + list);

        // 20. retainAll
        list.retainAll(Collections.singleton("Ashu"));
        System.out.println("20. After retainAll Ashu: " + list);

        // 21. clear
        list.clear();
        System.out.println("21. After clear: " + list);

        // Refill list
        Collections.addAll(list, "10", "20", "30", "40", "50");
        System.out.println("22. Refilled list: " + list);

        // 23. toArray
        Object[] arr = list.toArray();
        System.out.println("23. toArray: " + Arrays.toString(arr));

        // 24. toArray(T[])
        String[] arr2 = list.toArray(new String[0]);
        System.out.println("24. toArray(T[]): " + Arrays.toString(arr2));

        // 25. sort
        Collections.sort(list);
        System.out.println("25. After sort: " + list);

        // 26. reverse
        Collections.reverse(list);
        System.out.println("26. After reverse: " + list);

        // 27. shuffle
        Collections.shuffle(list);
        System.out.println("27. After shuffle: " + list);

        // 28. max
        System.out.println("28. Max: " + Collections.max(list));

        // 29. min
        System.out.println("29. Min: " + Collections.min(list));

        // 30. frequency
        System.out.println("30. Frequency of 20: " +
                Collections.frequency(list, "20"));

        // 31. binarySearch
        Collections.sort(list);
        System.out.println("31. Binary Search 30: " +
                Collections.binarySearch(list, "30"));

        // 32. replaceAll
        Collections.replaceAll(list, "20", "25");
        System.out.println("32. After replaceAll: " + list);

        // 33. subList
        List<String> sub = list.subList(1, 3);
        System.out.println("33. SubList (1,3): " + sub);

        // 34. equals
        System.out.println("34. Equals subList: " + list.equals(sub));

        // 35. hashCode
        System.out.println("35. HashCode: " + list.hashCode());

        // 36. ensureCapacity
        list.ensureCapacity(20);
        System.out.println("36. ensureCapacity(20)");

        // 37. trimToSize
        list.trimToSize();
        System.out.println("37. trimToSize()");

        // 38. clone
        ArrayList<String> clone =
                (ArrayList<String>) list.clone();
        System.out.println("38. Clone: " + clone);

        // 39. removeIf
        list.removeIf(s -> s.equals("10"));
        System.out.println("39. After removeIf: " + list);

        // 40. replaceAll (lambda)
        list.replaceAll(s -> s + "₹");
        System.out.println("40. After replaceAll lambda: " + list);

        // 41. forEach
        System.out.print("41. forEach: ");
        list.forEach(s -> System.out.print(s + " "));
        System.out.println();

        // 42. stream count
        System.out.println("42. Stream count: " +
                list.stream().count());

        // 43. stream filter
        System.out.print("43. Stream filter (startsWith 3): ");
        list.stream()
            .filter(s -> s.startsWith("3"))
            .forEach(System.out::print);
        System.out.println();

        // 44. stream map
        System.out.print("44. Stream map: ");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::print);
        System.out.println();

        // 45. stream sorted
        System.out.print("45. Stream sorted: ");
        list.stream().sorted().forEach(System.out::print);
        System.out.println();

        // 46. parallelStream
        System.out.print("46. ParallelStream: ");
        list.parallelStream().forEach(System.out::print);
        System.out.println();

        // 47. spliterator
        System.out.print("47. Spliterator: ");
        Spliterator<String> sp = list.spliterator();
        sp.forEachRemaining(System.out::print);
        System.out.println();

        // 48. listIterator
        System.out.print("48. ListIterator: ");
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
        System.out.println();

        // 49. subList clear
        list.subList(0, 1).clear();
        System.out.println("49. After subList clear: " + list);

        // 50. final list
        System.out.println("50. Final ArrayList: " + list);
    }
}
