package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	@Test
	public void test() {
		Tour tourvide = new Tour(3);
		Tour tourgrand = new Tour(3);
		Tour tourpetit = new Tour(3);
		Disque disquepetit = new Disque(1);
		Disque disquemoyen = new Disque(2);
		Disque disquegrand = new Disque(3);
		tourpetit.empiler(disquepetit);
		tourgrand.empiler(disquegrand);
		assertEquals(true, tourvide.empiler(disquegrand));
		assertEquals(true, tourgrand.empiler(disquepetit));
		assertEquals(false, tourpetit.empiler(disquemoyen));
		assertEquals(disquegrand, tourgrand.depiler());
	}

}
