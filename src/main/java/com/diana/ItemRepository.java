package com.diana;

import java.math.BigInteger;
import java.util.List;

import com.diana.ItemModel;
public interface ItemRepository {
	List<ItemModel> getAll();
	boolean update(String id,String name,String description,BigInteger amount);
	boolean add(ItemModel item);
	boolean delete(String id);
	boolean exist(String id);
}
