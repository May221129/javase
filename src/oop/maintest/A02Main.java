package oop.maintest;
//main֪ʶ����ϰ
public class A02Main {
	public static void main(String[] args) {
		Main.main(new String[1000]);
	}
}
class Main{
	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			args[i] = "value_" + i;
			System.out.println(args[i]);
		}
	}
}