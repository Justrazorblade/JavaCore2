public class Main {
    public static void main (String[] args) {
        String[][] newArr1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String[][] newArr2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "aaa", "3", "4"}
        };
        String[][] newArr3 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        int secondSum = 0;
        try {

            secondSum += sumOrException(newArr1);
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
        catch (MyArrayDataException e1){
            e1.printStackTrace();
        }
        System.out.println("Сумма равна: " + secondSum);
        secondSum = 0;
        try {

            secondSum += sumOrException(newArr2);
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
        catch (MyArrayDataException e1){
            e1.printStackTrace();
        }
        System.out.println("Сумма равна: " + secondSum);
        secondSum = 0;
        try {
            secondSum += sumOrException(newArr3);
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
        catch (MyArrayDataException e1){
            e1.printStackTrace();
        }
        System.out.println("Сумма равна: " + secondSum);

    }
    private static int sumOrException(String[][] array) {
        int firstSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[j].length != 4) throw new MyArraySizeException();
                try {
                    firstSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return firstSum;
    }
}
