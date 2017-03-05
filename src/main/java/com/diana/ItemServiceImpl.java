package com.diana;

import java.math.BigInteger;
import java.util.List;

import com.diana.ItemModel;
import com.diana.ItemRepository;
import com.diana.ItemService;
import com.diana.ItemRepositoryImpl;

public class ItemServiceImpl implements ItemService {
	
	private ItemRepository itemRepository = new ItemRepositoryImpl();
	
	@Override
	public List<ItemModel> getAll() {
		List<ItemModel> preferences=itemRepository.getAll();
		return preferences;

	}

	@Override
	public boolean update(String id, String name, String description, BigInteger amount) {
		boolean result=false;
		result=itemRepository.update(id, name, description, amount);
		return result;
	}

	@Override
	public boolean add(ItemModel item) {
		boolean result=false;
		System.out.println("H");
		result=itemRepository.add(item);
		System.out.println("I");
		return result;
	}

	@Override
	public boolean delete(String id) {
		boolean result=false;
		result=itemRepository.delete(id);
		return result;
	}

}
