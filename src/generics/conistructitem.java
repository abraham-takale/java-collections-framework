 class homee<T,K> {
    T name;
    K age;
    //conistructor
    homee(T name,K age){
        this.name=name;
        this.age=age;
    }
    public void setName(T name,K age){
        this.name=name;
        this.age=age;
    }
    public T getName(){
        return this.name;
    }
    public K getAge(){
        return this.age;
    }

}
public class conistructitem {
    public static void main(String[] arg){
        homee<String,Integer> bakka=new homee <> ("abi",22);
        System.out.println(bakka.getName());
        System.out.println(bakka.getAge());
    }
}
