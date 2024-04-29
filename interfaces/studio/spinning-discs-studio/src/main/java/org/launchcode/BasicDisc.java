package org.launchcode;
import java.util.ArrayList;

public abstract class BasicDisc {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;

    public BasicDisc(String aName, int maxCapacity, String aType, int someUSedCapacity) {
        name=aName;
        storageCapacity = maxCapacity;
        diskType = aType;
        capacityUsed = checkCapacity(someUSedCapacity);
        remainingCapacity = spaceLeft();
    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;
    }
    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }
    public String diskInfo() {
        String output = String.format("\nDisk Name: %s\nMax Capacity: %d" +
                "\nSpace used: %d" +
                "\nAvailable space: %d\n", name, storageCapacity, capacityUsed, remainingCapacity);
        return output;
    }
    public String writeData(int dataSize) {
        if (dataSize > remainingCapacity) {
            return "Not enough disc space";
        }
        capacityUsed += dataSize;
        remainingCapacity -= dataSize;
        return "Data written to disc. Remaining space = " + remainingCapacity;
    }

}
