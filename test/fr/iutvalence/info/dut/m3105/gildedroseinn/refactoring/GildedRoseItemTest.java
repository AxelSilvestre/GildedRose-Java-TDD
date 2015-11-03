package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseItemTest {
	
	@Test
	public void testItem(){
		
		Item item = new Item("name", 1, 2);
		
		assertEquals(item.getName(), "name");
		assertEquals(item.getSellIn(), 1);
		assertEquals(item.getQuality(), 2);
		
		item.setName("name2");
		assertEquals(item.getName(), "name2");
		
		item.setQuality(3);
		assertEquals(item.getQuality(), 3);
		
		item.setSellIn(5);
		assertEquals(item.getSellIn(), 5);
		
	}

}
