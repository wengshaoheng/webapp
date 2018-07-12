package wsh.webapp.dao;

import java.util.List;

import wsh.webapp.vo.ArticleVO;
import wsh.webapp.vo.CommentVO;

public interface IArticleDao {
	void addArticle(ArticleVO article);
	void addComment(CommentVO comment);
	List<CommentVO> findAll(String articleId);
}
