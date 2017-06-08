package javatest2;



//繼承父類別(Bird)
public class Chicken extends Bird{
	
	   private String crest; // 新增私有成員，雞冠描述

	    public Chicken() {
	        super();//指父類別
	    }

	    // 定義建構方法
	    public Chicken(String name, String crest) {
	        super(name);
	        this.crest = crest;
	    }

	    // 新增方法
	    public void setCrest(String crest) {
	        this.crest = crest;
	    }

	    public String getCrest() {
	        return crest;
	    }

	    public void wu() {
	       System.out.println("咕咕叫…");
	    }
	
	    
//	   @Override
//	    public String getName() {
//	        return name+"override";
//	    }

	    

}
