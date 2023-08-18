package List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        // Thêm phần tử vào danh sách
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Truy xuất phần tử trong danh sách
        System.out.println("First fruit: " + linkedList.get(0));
        System.out.println("Second fruit: " + linkedList.get(1));

        // Duyệt qua danh sách
        System.out.println("All fruits:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Xóa phần tử khỏi danh sách
        linkedList.remove("Banana");

        // Kiểm tra phần tử có tồn tại trong danh sách
        boolean containsOrange = linkedList.contains("Orange");
        System.out.println("Contains Orange: " + containsOrange);

        // Số lượng phần tử trong danh sách
        int size = linkedList.size();
        System.out.println("Size of list: " + size);
    }
}

