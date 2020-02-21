package dom;

import java.io.Serializable;

public class person implements Serializable {
	private static final long serialVersionUID = 3106955869776884687L;
private int id;
private String name;
public person(int id, String name) {
	this.id = id;
	this.name = name;
}
public String toString() {
	return "person [id=" + id + ", name=" + name + "]";
}

}
