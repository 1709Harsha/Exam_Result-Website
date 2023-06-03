package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Marks_Dto;

public class Marks_Dao {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager =entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction =entityManager.getTransaction();
	
	public String insert(Marks_Dto d1)
	{
		entityTransaction.begin();
		entityManager.persist(d1);
		entityTransaction.commit();
		return "data inserted";
	}

	public String remove(int usn)
	{
     Marks_Dto dto=entityManager.find(Marks_Dto.class,usn);
     if(dto!=null)
     {
    	 entityTransaction.begin();
    	 entityManager.remove(dto);
    	 entityTransaction.commit();
    	 return "<h1>Data Deleted Successfully</h1>";
 	}else {
 		return "<h1>Data Not Found</h1>";
 	     }
     

		
	
	}
	
	
	public Object update(int usn,int knd,int eng,int hin,int math,int ss,int sci,int tm,int sm,String p1)
	{
		Marks_Dto dto=entityManager.find(Marks_Dto.class,usn);
				if(dto!=null)
				{
					dto.setUNIVERSITY_SEAT_NUMBER(usn);
					dto.setKannada(knd);
					dto.setEnglish(eng);
					dto.setHindi(hin);
					dto.setMathmatics(math);
					dto.setSocial_Science(ss);
					dto.setScience(sci);
					dto.setTotal_marks(tm);
					dto.setSecured_marks(sm);
					dto.setPercentage(p1);
					entityTransaction.begin();
					entityManager.merge(dto);
					entityTransaction.commit();
					
					return "<h1>Data Updated Successfully</h1>";
				}else {
					return "<h1>Data Not Found</h1>";
				}

				}
	
	
	
	  public List<Marks_Dto> fetch ()
	     {
	    	 Query q1= entityManager.createQuery("select data from Marks_Dto data");
	    	 List<Marks_Dto> list=q1.getResultList();
	 		return list;

	    	 
	     }
	
	



	  public  Marks_Dto fetchbyid(int usn) {
  		Marks_Dto m1=entityManager.find(Marks_Dto.class, usn);
  			return m1;
  	}



}

