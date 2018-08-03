
public class SingletonClass {
private SingletonClass(){
}


private static SingletonClass sc=null;
public static SingletonClass getObj() {
if(sc==null)
	sc=new SingletonClass();
return sc;
}
}
