package org.sid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ProduitTest {

	Produit p = new Produit(1, "produit 1");
	@Test
	void testToDh() {
		p.setPrixEuro(12);
		assertEquals(120, p.ToDh());
		
	}
	
	@Test
	void testIsExpensive() {
		p.setPrixEuro(70);
		assertFalse(p.isExpensive());
		
	}
	
	

}
