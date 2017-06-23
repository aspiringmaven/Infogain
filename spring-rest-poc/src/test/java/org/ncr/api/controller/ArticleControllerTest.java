/**
 * 
 */
package org.ncr.api.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.ncr.api.domain.Article;
import org.ncr.api.repository.ArticleRepository;
import org.ncr.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ArticleController.class, ArticleService.class, ArticleRepository.class })
@WebAppConfiguration
public class ArticleControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Mock public ArticleService articleService;
	 
	 
	
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		MockitoAnnotations.initMocks(this);
		
		when(articleService.getAll()).thenReturn(Arrays.asList(
				 new Article(1, "Spring Rest", "This is Spring MVC", "Sumit Kawatra"),
				 new Article(2, ".Net tehnologies", "Microsoft Developer Manual", "Kartar yadav")
				));
		
		
		when(articleService.get(12L)).thenReturn(new Article(1, "Spring Rest", "This is Spring MVC", "Sumit Kawatra"));
	}

	@Test
	public void testGetAllArticleRequest() {
		try {
			MvcResult result = mockMvc
					.perform(
							get("/articles/12")							
							)
					.andReturn();
			
			System.out.println("result " + result.getResponse().getStatus());
			System.out.println("result " + result.getResponse().getContentAsByteArray());
			System.out.println("result " + result.getResponse().getContentAsString());
			result.getResponse().getWriter().println();

		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	
	
	@After
	public void tearDown() throws Exception {
	}

}
