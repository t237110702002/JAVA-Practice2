package javatest2;

public class ExtendDemo {

	public static void main(String[] args) {
		Chicken chicken1 = new Chicken("小奇雞", "紅色");
		Chicken chicken2 = new Chicken();

		System.out.println("小雞1 - 名稱: "+chicken1.getName()+", 雞冠是: "+ chicken1.getCrest());
		chicken1.wu();
		chicken1.walk();

		System.out.printf("小雞2 - 名稱 %s, 雞冠是 %s。 ", chicken2.getName(), chicken2.getCrest());
	} 

}
