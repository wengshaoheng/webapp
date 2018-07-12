package wsh.webapp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import wsh.webapp.dao.IArticleDao;
import wsh.webapp.vo.ArticleVO;
import wsh.webapp.vo.CommentVO;

@Repository
public class ArticleDaoImpl implements IArticleDao {
	
	@Autowired
	MongoTemplate mongo;

	@Override
	public void addComment(CommentVO comment) {
		mongo.save(comment);
	}

	@Override
	public void addArticle(ArticleVO article) {
		mongo.save(article);		
	}

	@Override
	public List<CommentVO> findAll(String articleId) {
		Query query = new Query();
		Criteria c = Criteria.where("articleId").is(articleId);
		query.addCriteria(c);
		return mongo.find(query, CommentVO.class);
	}

}
