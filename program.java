import Class.PhoneBook;
import Class.Names;
import Class.HeapSort;

class program {

    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        book.add("Андрей", "+888");
        book.add("Николай", new String[] { "+555", "+678", "+444" });
        book.add("Андрей", "+887");
        book.add("Николай", "+887");
        System.out.println(book.get("Андрей"));
        System.out.println(book.get("Николай"));

        Names empl = new Names();
        empl.findDoubleName();

        int[] array = { 0, 5, 7, 1, 4 };
        HeapSort.print(array);
        HeapSort.HeapSort(array);
        HeapSort.print(array);

    }

}