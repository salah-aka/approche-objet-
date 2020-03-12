package fr.diginamic.testexceptions;

public class TestRuntimeException {

	public static void main(String[] args) {
		double oper = Operation.diviserRuntime(200, 4);
		System.out.println(oper);

		System.out.println("---------------");
		try {
			oper = Operation.diviserRuntime(200, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
}
