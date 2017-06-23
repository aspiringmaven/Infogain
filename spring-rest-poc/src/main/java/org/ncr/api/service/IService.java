package org.ncr.api.service;

import java.util.List;

/**
 * 
 * @author sumit.kawatra
 *
 * @param <K> key as an Primary key for Entity
 * @param <E> Entity Object/ Model Object
 */
public interface IService<K,E> {
	
	/**
	 * To fetch all Entity objects.
	 * @return List<E>
	 */
	public List<E> getAll();
	
	/**
	 * To get Entity object against key.
	 * @param key
	 * @return entity
	 */
	public E get(K key);
	
	/**
	 * To add new Entity in repository.
	 * @param entity
	 * @return entity
	 */
	public E add(E entity);
	
	/**
	 * To delete entity object against Key parameter.
	 * @param key
	 * @return entity
	 */
	public E delete(K key);
	
	/**
	 * To update entity.
	 * @param entity
	 * @return entity
	 */
	public E update(E entity);
	
}
