public class genericarrys {
    public static <E> void printArray(E[] elements){
        for(E element:elements){
            System.out.println(element);}

            System.out.println();
    }
        public static void main(String[] args){
            Integer[] intArray={10,32,53,61,75,45};
            String[] names={"one","two","three","four","five"};
            Character[] leters={'A','B','C','D'};
            printArray(intArray);
            printArray(names);
            printArray(leters);
        }
    }


