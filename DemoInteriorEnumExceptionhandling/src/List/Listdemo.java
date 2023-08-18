package List;

import java.util.ArrayList;
import java.util.List;

public class Listdemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Thêm phần tử vào danh sách
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Truy xuất phần tử trong danh sách
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

        // Duyệt qua danh sách
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Xóa phần tử khỏi danh sách
        fruits.remove("Banana");

        // Kiểm tra phần tử có tồn tại trong danh sách
        boolean containsOrange = fruits.contains("Orange");
        System.out.println("Contains Orange: " + containsOrange);

        // Số lượng phần tử trong danh sách
        int size = fruits.size();
        System.out.println("Size of list: " + size);
    }
}

