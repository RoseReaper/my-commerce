package com.cgi.mycommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cgi.mycommerce.dao.CategoryDao;
import com.cgi.mycommerce.entity.Category;

public class JpaCategoryDao extends JpaDao<Category, Long> implements CategoryDao {

	@Override
	public void createCategory(Category category) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(category);
			em.getTransaction().commit();
		} 
		catch (RuntimeException re) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			throw re;
		}finally {
			em.close();
		}
	}

	@Override
	public Category findCategoryById(Long id) {
		EntityManager em = emf.createEntityManager();
		try {
			Category foundCategory = em.find(Category.class, id);
			return foundCategory;
		} finally {
			em.close();
		}
	}

	@Override
	public void updateCategory(Category category) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Query query = em.createQuery("UPDATE Category as c SET p.name = :name, WHERE c.id = :id");
			query.setParameter("name", category.getName());
			query.setParameter("id", category.getId());
			query.executeUpdate();
			em.getTransaction().commit();
		} catch (RuntimeException re) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			throw re;
		}finally {
			em.close();
		}
	}

	@Override
	public void removeCategory(Long id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Query query = em.createQuery("DELETE FROM Category as c WHERE c.id = :id");
			query.setParameter("id", id);
			query.executeUpdate();
			em.getTransaction().commit();
		} catch (RuntimeException re) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			throw re;
		}finally {
			em.close();
		}
	}

	@Override
	public List<Category> findAllCategories() {
		EntityManager em = emf.createEntityManager();
		try {
			List<Category> categories = em.createQuery("SELECT c FROM Category c", Category.class).getResultList();
			return categories;
		} finally {
			em.close();
		}
	}

}
