package org.ncr.api.service;

import java.util.List;

import org.ncr.api.domain.Article;
import org.ncr.api.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService implements IService<Long, Article> {

	@Autowired
	private ArticleRepository repository;

	public ArticleService() {
		super();
	}

	public ArticleRepository getRepository() {
		return repository;
	}

	public void setRepository(ArticleRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Article> getAll() {
		return repository.getAll();
	}

	@Override
	public Article get(Long key) {
		System.out.println("Service Call " + key);
		return repository.get(key);
	}

	@Override
	public Article add(Article entity) {
		return repository.add(entity);
	}

	@Override
	public Article delete(Long key) {
		return repository.delete(key);
	}

	@Override
	public Article update(Article entity) {
		return repository.update(entity);
	}

}
