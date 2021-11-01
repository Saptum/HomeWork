package HomeWork_3;

public class IntArrayList implements IntList {

    private int size = 10;
    private int[] array = new int[size];

    @Override
    public void add(int element) {

        for (int i = 0; i < array.length; i++) {
            array[i] = element;

        }
    }

    @Override
    public boolean add(int index, int element) {

        return true;
    }

    @Override
    public void clear() {
        System.out.println("All was clear");
    }

    @Override
    public int get(int index) {
        return index;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean remove(int index) {
        return true;
    }

    @Override
    public boolean removeByValue(int value) {
        return true;
    }

    @Override
    public boolean set(int index, int element) {
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int[] toArray() {
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = i;
        }
        return array2;
    }
}
