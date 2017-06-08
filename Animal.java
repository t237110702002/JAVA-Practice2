package javatest2;

public class Animal<T> {
	
	private T age;
    private T weight;
     
    public Animal(T a, T w) {
        setAge(a);
        setWeight(w);
    }
     
    public T getAge() {
        return age;
    }
 
    public void setAge(T n) {
        age = n;
    }
     
    public T getWeight() {
        return weight;
    }
     
    public void setWeight(T n) {
        weight = n;
    }
     
    public void speak() {
        System.out.println("哈囉，我已經" + getAge() + "歲，有" + getWeight() + "公斤重");
    }

}
