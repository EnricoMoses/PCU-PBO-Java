package no3;

public class MemoryCell {
    protected int address;
    protected double value;

    public MemoryCell(int address, double value) {
        this.address = address;
        this.value = value;
    }

    public int getAddress() {
        return address;
    }

    public double getValue() {
        return value;
    }

    public void display() {
        System.out.println("Address: " + this.address + ", Value: " + this.value);
    }

    public static int getReferenceCount(LinkedMemoryCell[] data) {
        int count = 0;
        for (LinkedMemoryCell value: data) {
            if (value.getNextAddress() == -1) {
                continue;
            }
            count++;
        }
        return count;
    }

    public static LinkedMemoryCell search(LinkedMemoryCell[] data, int address) {
        for (LinkedMemoryCell i : data) {
            if (i.getAddress() == address) {
                return i;
            }
        }
        return null;
    }

    public static LinkedMemoryCell search(LinkedMemoryCell[] data, double value) {
        for (LinkedMemoryCell i : data) {
            if (i.getValue() == value) {
                return i;
            }
        }
        return null;
    }


}
