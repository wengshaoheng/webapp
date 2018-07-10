package wsh.webapp.service;

import java.util.List;

import wsh.webapp.vo.CommentVO;

public interface ICommentService {
	void addComment(CommentVO comment);
	List<CommentVO> listAll(String articleId);
}
