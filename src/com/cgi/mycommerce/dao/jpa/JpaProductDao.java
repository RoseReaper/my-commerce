package com.cgi.mycommerce.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cgi.mycommerce.dao.ProductDao;
import com.cgi.mycommerce.entity.Product;

public class JpaProductDao extends JpaDao<Product, Long> implements ProductDao {

	@Override
	public void createProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(product);
			em.getTransaction().commit();
		} catch (RuntimeException re) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
			throw re;
		} finally {
			em.close();
		}
	}

	@Override
	public Product findProductById(Long id) {
		EntityManager em = emf.createEntityManager();
		try {
			Product foundProduct = em.find(Product.class, id);
			return foundProduct;
		} finally {
			em.close();
		}
	}

	@Override
	public void updateProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Query query = em.createQuery("UPDATE Product as p SET p.name = :name, p.content = :content, p.price = :price WHERE p.id = :id");
			query.setParameter("name", product.getName());
			query.setParameter("content", product.getContent());
			query.setParameter("price", product.getPrice());
			query.setParameter("id", product.getId());
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
	public void removeProduct(Long id) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			Query query = em.createQuery("DELETE FROM Product as p WHERE p.id = :id");
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
	public List<Product> findAllProducts() {
		EntityManager em = emf.createEntityManager();
		try {
			List<Product> products = em.createQuery("SELECT p FROM Product p", Product.class).getResultList();
			return products;
		} finally {
			em.close();
		}
	}

}
