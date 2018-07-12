package wsh.webapp.vo;

import java.util.Date;

public class CommentVO {
	private String articleId;
	private String userid;
	private String comment;
	private Date date;

	public String getArticleId() {
		return articleId;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	@Override
	public String toString() {
		return "CommentVO [articleId=" + articleId + ", userid=" + userid + ", comment=" + comment + ", date=" + date
				+ "]";
	}

}
