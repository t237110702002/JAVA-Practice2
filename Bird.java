package javatest2;
//類別比較算是一個範本，裡面定義好該有的屬性(和方法，其中方法又大概可以分為一般的方法、類別方法和建構子。
public class Bird {

	
	   protected String name;

	    public Bird() {
	    }

	    public Bird(String name) {
	        this.name = name;
	    }

	    public void walk() {
	        System.out.println("走路");
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
}
