package javatest2;


/* [ 泛型範例 ]
 * 由於 Java 有嚴格的型態限制，因此成員 (member) 宣告為那一種型態，
 * 就只能使用該種型態的資料，後來 Java 5.0 後加入了泛型 (generic) 
 * 的特性，使型態使用可以具有某種彈性。
 */
public class Generic {
	
	public static void main(String[] args) {
        Animal puppy1, puppy2; 
        puppy1 = new Animal(6, "70");
        puppy2 = new Animal("八十八", "五千");
         
        puppy1.speak();
        puppy2.speak();
    }

}
