package com.diana;

import java.math.BigInteger;
import java.util.List;


import com.diana.StockManagementPortType;
import com.diana.ItemModel;


public class stockManagementImpl implements StockManagementPortType {
	
	private ItemService itemService = new ItemServiceImpl();
	static BigInteger currentIndexItem=BigInteger.valueOf(0);
	
	public stockManagementImpl() {
	}

	public void init() {
	}
	
	@Override
	public UpdateItemResponse updateItem(UpdateItemRequest parameters) {
		UpdateItemResponse response = new UpdateItemResponse();
		String id= parameters.getIdItem();
		String name= parameters.getNameItem();
		String description= parameters.getDescriptionItem();
		BigInteger amount= parameters.getAmountItem();
				
		boolean result=itemService.update(id, name, description, amount);
		response.setResult(result);
		return response;		
		
	}

	@Override
	public InsertItemResponse insertItem(InsertItemRequest parameters) {
		InsertItemResponse response = new InsertItemResponse();
		ItemModel item=new ItemModel();		
		item.setIdItem(parameters.getIdItem());
		item.setDescriptionItem(parameters.getDescriptionItem());
		item.setNameItem(parameters.getNameItem());
		item.setAmountItem(parameters.getAmountItem());
		System.out.println("F");
		boolean result=itemService.add(item);
		System.out.println("G");
		response.setResult(result);
		return response;			
	}

	@Override
	public GetAllItemsResponse getAllItems(GetAllItemsRequest parameters) {
		GetAllItemsResponse response = new GetAllItemsResponse();
		List<ItemModel> items=itemService.getAll();
		List<ItemModel> responseItems = response.getItem();
		if(items!=null){
			for (ItemModel item : items) {
				responseItems.add(item);
			}
		}
		return response; 
	}

	@Override
	public DeleteItemResponse deleteItem(DeleteItemRequest parameters) {
		DeleteItemResponse response = new DeleteItemResponse();
		String idItem= parameters.getIdItem();
		boolean result=itemService.delete(idItem);
		response.setResult(result);
		return response;		
	}
}
