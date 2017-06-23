package org.ncr.api.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ncr.api.domain.Article;
import org.ncr.api.util.SequenceRunner;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository implements IRepository<Long, Article>{
	
	private static Map<Long, Article> inMemDB = new HashMap<Long, Article>();

	public ArticleRepository() {
		super();
	}

	@Override
	public List<Article> getAll() {
		return new ArrayList<>(inMemDB.values());
	}

	@Override
	public Article get(Long key) {
		return inMemDB.get(key);
	}

	@Override
	public Article add(Article entity) {
		entity.setId(SequenceRunner.getNewId());
		inMemDB.put(entity.getId(), entity);
		return entity;
	}

	@Override
	public Article delete(Long key) {
		Article entity = inMemDB.get(key);
		inMemDB.remove(key);
		return entity;
	}

	@Override
	public Article update(Article entity) {
		if(entity.getId() == 0 ) throw new RuntimeException("invalid update request");
		inMemDB.put(entity.getId(), entity);
		return entity;
	}	

}
