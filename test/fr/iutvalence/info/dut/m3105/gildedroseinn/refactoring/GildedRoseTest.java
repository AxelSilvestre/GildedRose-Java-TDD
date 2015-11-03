package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void testQualitySellIn()
	{

		ArrayList<Item> items = new ArrayList<Item>(); 

		items.add(new Item("MyItem1", 10, 20));
		items.add(new Item("MyItem2", 10, 20));
		items.add(new Item("MyItem3", 10, 20));
		items.add(new Item("MyItem4", 10, 20));


		for(int i=1; i<4; i++){
			GildedRose.updateItems(items);
			for(Item item : items){
				assertEquals(item.getSellIn(), 10-i);
				assertEquals(item.getQuality(), 20-i);
			}
		}

	}

	@Test
	public void testUnderSellIn(){		
		
		ArrayList<Item> items = new ArrayList<Item>(); 

		items.add(new Item("MyItem1-2", 0, 20));


		for(int i=2; i<8; i+=2){
			GildedRose.updateItems(items);
			for(Item item : items){
				assertEquals(item.getQuality(), 20-i);
			}
		}
		
	}

	@Test
	public void testEmptyList(){
		ArrayList<Item> items = new ArrayList<Item>(); 

		GildedRose.updateItems(items);

		assertEquals(items.size(), 0);
	}

}