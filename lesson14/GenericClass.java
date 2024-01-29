package lesson14;

public class GenericClass <T>{
    private T genericField;

    public GenericClass(T genericFiled) {
    }

    public GenericClass<T> GenericClass(T genericField){
        this.genericField=genericField;
        return this;
    }
    public void printGenericField(){
        System.out.println("Generic Field: "+genericField);
    }
    public static void main(String[] args){
        GenericClass<String> stringGenericClass=new GenericClass<>("Hello");
        stringGenericClass.printGenericField();
    }
}
