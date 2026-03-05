package myspring.di.annot;

public class ConsolePrinter implements Printer {
	public void print(String message) {
		System.out.println(message);
	}
	
	public ConsolePrinter() {
		System.out.println(this.getClass().getName() + " 기본생성자 호출됨!");
	}
}

