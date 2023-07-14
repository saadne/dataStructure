public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);
        myArray.insert(4);
        myArray.insert(2);
        myArray.insert(3);
        myArray.insert(1);
        myArray.insert(8);
        myArray.insert(7);
        myArray.insert(9);
        //myArray.removeAt(3);
        System.out.println(myArray.indexOf(12));
        System.out.println("------------------");
        myArray.print();
    }
}
