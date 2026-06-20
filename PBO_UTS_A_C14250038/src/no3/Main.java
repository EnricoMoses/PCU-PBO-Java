package no3;

public class Main {
    public static void main(String[] args) {
        LinkedMemoryCell linkedMemoryCell1 = new LinkedMemoryCell(100, 10.0, 104);
        LinkedMemoryCell linkedMemoryCell2 = new LinkedMemoryCell(104, 20.0, 108);
        LinkedMemoryCell linkedMemoryCell3 = new LinkedMemoryCell(108, 30.0, -1);

        System.out.println("=== Simulasi Memory ===");
        linkedMemoryCell1.display();
        linkedMemoryCell2.display();
        linkedMemoryCell3.display();

        LinkedMemoryCell[] data = {linkedMemoryCell1, linkedMemoryCell2, linkedMemoryCell3};
        System.out.println("Jumlah cell yang memiliki reference: " + LinkedMemoryCell.getReferenceCount(data));

        System.out.println("=== Pencarian ===");
        int searchAddress = 104;
        LinkedMemoryCell hasilSearchByAddress =  LinkedMemoryCell.search(data, searchAddress);
        hasilSearchByAddress.display();

        double searchValue = 30;
        LinkedMemoryCell hasilSearchByValue = LinkedMemoryCell.search(data, searchValue);
        hasilSearchByValue.display();

        System.out.println("Get Reference Value untuk 3 object:");
        System.out.println(linkedMemoryCell1.getReferenceValue(data));
        System.out.println(linkedMemoryCell2.getReferenceValue(data));
        System.out.println(linkedMemoryCell3.getReferenceValue(data));

    }
}
