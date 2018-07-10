package wsh.webapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import wsh.webapp.service.ICommentService;
import wsh.webapp.vo.CommentVO;
import wsh.webapp.vo.RespVO;

@Controller
@RequestMapping("/article")
public class CommentController {
	
	private static final Logger logger = Logger.getLogger(CommentController.class);
	
	@Autowired
	ICommentService cmService;

	@PostMapping("/comment/post")
	@ResponseBody
	String addComment(CommentVO comment) {
		logger.debug("POST: " + comment);
		cmService.addComment(comment);
		return "ok";
	}
	
	@GetMapping("/comment/list/{articleId}")
	@ResponseBody
	RespVO listComment(@PathVariable("articleId") String articleId) {
		logger.debug("GET: articleId=" + articleId);
		List<CommentVO> commentList = cmService.listAll(articleId);
		logger.debug("comment list: " + commentList);
		return new RespVO("200", "ok", commentList);
	}
}
