package no3;

public class LinkedMemoryCell extends MemoryCell{
    private int nextAddress;

    public LinkedMemoryCell(int address, double value, int nextAddress) {
        super(address, value);
        this.nextAddress = nextAddress;
    }


    public int getNextAddress() {
        return nextAddress;
    }

    @Override
    public void display() {
//        super.display();
        System.out.println("Address: " + this.address + ", Value: " + this.value + ", Next: " + this.nextAddress);
    }

    public double getReferenceValue(LinkedMemoryCell[] data) {
        for (LinkedMemoryCell i: data) {
            if (this.nextAddress == i.getAddress()) {
                return i.getValue();
            }
        }
        return 0.0;
    }

}
