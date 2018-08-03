
public class CreateSingleObject {
public static void main(String[] args) {
	SingletonClass s1= SingletonClass.getObj();
	SingletonClass s2= SingletonClass.getObj();
	System.out.println(s1);
	System.out.println(s2);
}
}
