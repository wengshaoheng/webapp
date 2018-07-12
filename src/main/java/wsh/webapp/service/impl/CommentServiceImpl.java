package wsh.webapp.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import wsh.webapp.dao.IArticleDao;
import wsh.webapp.service.ICommentService;
import wsh.webapp.vo.CommentVO;

@Service
public class CommentServiceImpl implements ICommentService {

	@Autowired
	IArticleDao articleDao;
	
	@Transactional
	@Override
	public void addComment(CommentVO comment) {
		comment.setDate(new Date());
		articleDao.addComment(comment);
	}

	@Override
	public List<CommentVO> listAll(String articleId) {
		return articleDao.findAll(articleId);
	}
}
