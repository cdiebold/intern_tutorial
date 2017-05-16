import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class MyArrayListTest {
	private MyArrayList list;
	@Before public void setup(){
		list = new MyArrayList();
	}
	
	@Test public void emptyListHasBracketsForToString() {
		System.out.println(list.toString());
		assertEquals("[ ]", list.toString());
	}

}
