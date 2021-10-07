public class MyArrayDataException extends RuntimeException {
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Неправильное значение. Строка: " + (i + 1) + ", Колонка " + (j + 1));
        this.i = i;
        this.j = j;
    }
}
