
public class Test {

	public static void main(String[] args) {
		
		Person taro = new Person(); //コンストラクタ①を使ったインスタンス化
		
		taro.name = "taro" ;
		
		taro.age = 18 ;
		
		System.out.println(taro.name);
		
		System.out.println(taro.age);
		
		
		Person jiro = new Person("jiro" , 20); //コンストラクタ②を使ったインスタンス化
		
		System.out.println(jiro.name);
		
		System.out.println(jiro.age);
		
		
		Person saburo = new Person("saburo"); //コンストラクタ③を使ったインスタンス化
		
		System.out.println(saburo.name);
		
		System.out.println(saburo.age);
		
		
		Person nanasi = new Person(25); //コンストラクタ④を使ったインスタンス化
		
		System.out.println(nanasi.name);
		
		System.out.println(nanasi.age);
		
		
		Person hanako = new Person(17 , "hanako"); //コンストラクタ⑤を使ったインスタンス化
		
		System.out.println(hanako.name);
		
		System.out.println(hanako.age);

	}

}
