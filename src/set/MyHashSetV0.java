package set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData = new int[10];
    private int size=0;

    //O(n)
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        elementData[size]=value;
        size++;
        return true;

    }


    //O(n) 있는지 없는지 다 찾음 하나하나
    public boolean contains(int value) {
        for (int data : elementData) {
            if (data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    // Arrays.copyOf(elementData, size) elementData의 size까지만 출력 (아니면 빈 부분도 출력)
    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
