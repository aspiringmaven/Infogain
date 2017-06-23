package org.ncr.api.controller;

import java.util.List;

import org.ncr.api.domain.Article;
import org.ncr.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	public ArticleController() {
		super();
	}
	
	@RequestMapping(value="articles", method=RequestMethod.GET)
	@ResponseBody
	public List<Article> getAllArticle() {
		return articleService.getAll();
	}
	
	@RequestMapping(value="articles/{articleId}", method=RequestMethod.GET)
	@ResponseBody
	public Article getArticle(@PathVariable("articleId") Long articleId) {
		System.out.println("Called by someone " + articleId);
		return articleService.get(articleId);	
	}
	
	@RequestMapping(value="articles", method=RequestMethod.POST)
	@ResponseBody
	public Article saveArticle(@RequestBody Article article) {
		System.out.println("add " + article);
		return articleService.add(article);
	}
	
	@RequestMapping(value="articles/{articleId}", method=RequestMethod.DELETE)
	@ResponseBody
	public Article deleteArticle(@PathVariable("articleId") Long articleId) {
		return articleService.delete(articleId);	
	}
	
	@RequestMapping(value="articles/{articleId}", method=RequestMethod.PUT)
	@ResponseBody
	public Article updateArticle(@PathVariable("articleId") Long articleId, @RequestBody Article article) {
		article.setId(articleId);
		return articleService.update(article);	
	}
	
	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

}
