package collection.c_hashmap;

/**
 * 探究：HashMap.hash()方法中，代码的执行顺序。
 * 
 * @author May
 * 2019年7月25日
 */
public class A02Method_Hash {
	public static void main(String[] args) {
		System.out.println(A02Method_Hash.show(18));//18
		System.out.println(A02Method_Hash.hash(18));
		
		System.out.println("-------------------------");
		A02Method_Hash.weiYi();
	}
	
	/**
	 * ①h = key.hashCode();                        h=18
	 * ②“h >> 1”的计算结果会先赋值给一个临时变量；         temp=9
	 * ③异或预算；                                                                     27
	 */
	static final int hash(Object key) {//该hash()方法是我为了方便测试改写了的，并发HashMap的源码。
        int h;
        return (h = key.hashCode()) ^ (h >> 1);
    }
	
	static int show(Object i) {
		return i.hashCode();
	}
	
	/**
	 * ①newCap = oldCap;
	 * ②newCap << 1;
	 */
	static void weiYi() {
		int oldcap = 2;
		int newCap;
		System.out.println(newCap = oldcap << 1);//4
		System.out.println("newCap = "  + newCap);//4
		System.out.println("oldcap = " + oldcap);//2
	}
}
