public class Array1 {
    public static void main(String[] args){
Array();
    }
    public static void Array() {
        int a[] = {1, 3, 5, 2, 6, 15, 19, 21, 24, 26, 28, 29};
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 != 1)
            System.out.println(a[i]);
        }
    }
}
