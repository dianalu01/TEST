package com.diana;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import com.diana.ItemModel;
import com.diana.ItemRepository;

public class ItemRepositoryImpl implements ItemRepository{

	@Override
	public List<ItemModel> getAll() {
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		List<ItemModel> items= null;
		try{
			Criteria cr = session.createCriteria(ItemModel.class);
			items = new  ArrayList<ItemModel>();
			items=cr.list();
			
		} catch (Exception e) {
            e.printStackTrace();
            transaction.rollback();
		} finally {
			if(session.isOpen())
				session.close();
		}
		return items;
	}

	@Override
	public boolean update(String id, String name, String description, BigInteger amount) {
		boolean success=false;
		if(exist (id)){
			hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
			Session session=myHibernateConfigurator.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{
				ItemModel item=getById(id);
				ItemModel itemLoaded =  (ItemModel) session.load(ItemModel.class, item.getIndexItem());
				itemLoaded.setIdItem(id);
				itemLoaded.setNameItem(name);
				itemLoaded.setDescriptionItem(description);
				itemLoaded.setAmountItem(amount);

				session.save(itemLoaded);
				session.getTransaction().commit();			
				session.flush();
		        session.clear();
		        success=true;
	
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		    }
		}
		else{
			System.out.println("DOES NOT EXIST");
		}
			
		return success;
	}

	@Override
	public boolean add(ItemModel item) {
		boolean success=false;
		if(!exist (item.getIdItem())){
			hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
			Session session=myHibernateConfigurator.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{							
				
			    success=session.save(item) != null;	
			    session.getTransaction().commit();	
				session.flush();
		        session.clear();		        
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
			} finally {
				if(session.isOpen())
					session.close();
		    }
		}		
		return success;
		
	}

	@Override
	public boolean delete(String id) {
		boolean success=false;
		if(exist (id)){
			ItemModel item=getById(id);
			hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
			Session session=myHibernateConfigurator.getSessionFactory().openSession();
			Transaction transaction=session.beginTransaction();
			try{							
				
				session.delete(item);
				session.getTransaction().commit();			
				session.flush();
		        session.clear();
		        success=true;
			} catch (Exception e) {
		            e.printStackTrace();
		            transaction.rollback();
		            success=false;
			} finally {
				if(session.isOpen())
					session.close();
		    }
		
		
		}		
		return success;
		
	}

	@Override
	public boolean exist(String id) {
		boolean exist=false;
		if(getById(id)!=null){
			exist=true;
		}
		return exist;
	}

	private ItemModel getById(String id){
		hibernateUtil myHibernateConfigurator= hibernateUtil.getHibernateConfigurator();				 
		Session session=myHibernateConfigurator.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		ItemModel item= null;
		try{
			Criteria cr = session.createCriteria(ItemModel.class);
			Criterion idItem = Restrictions.eq("idItem", id);
			cr.add( idItem );
			List<ItemModel> items = new  ArrayList<ItemModel>();
			
			items=cr.list();
			for(ItemModel i:items){
				item=i;
			}
			} catch (Exception e) {
	            e.printStackTrace();
	            transaction.rollback();
	            item=null;
			} finally {
				if(session.isOpen())
					session.close();
		}
		return item;
	}


	

}