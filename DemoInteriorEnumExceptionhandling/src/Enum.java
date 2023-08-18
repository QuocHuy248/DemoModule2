public class Enum {

    // Định nghĩa enum cho loại các ngày trong tuần
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        // Sử dụng enum trong ví dụ
        DayOfWeek today = DayOfWeek.MONDAY;

        // In ra ngày trong tuần hiện tại
        System.out.println("Hôm nay là: " + today);

        // Kiểm tra xem hôm nay có phải là thứ bảy hay chủ nhật không
        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("Hôm nay là ngày nghỉ cuối tuần!");
        } else {
            System.out.println("Hôm nay là ngày làm việc.");
        }

        // Duyệt qua tất cả các ngày trong tuần
        System.out.println("Các ngày trong tuần:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
        System.out.println(Situation.maintenace);


    }
}
