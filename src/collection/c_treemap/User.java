package collection.c_treemap;

/**
 * ���User�༴������Ȼ����Ҳ���Ƕ������򣬾���һ����ͨ���࣬��ôput��TreeMap���ǰ���ʲô�����������ģ�
 * �ܽ��TestTreeMap-�ܽ�2.4
 */
public class User {
	
	private String name;
	private int age;
	
	public User() {
		super();
	}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}