package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";
		// qcn=qualified class name

		// manually loading the class
		Class custClass = Class.forName(qcn);

		// getting the parameterized constructor
		Constructor custConst = custClass.getConstructor(String.class);

		// instantiating with parameterized constructor
		Object obj = custConst.newInstance("mohini");
		System.out.println(obj);

		// getting private method of class with name and parameter types
		Method printMethod = custClass.getDeclaredMethod("print", null);

		// calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}
}
