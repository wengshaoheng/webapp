package wsh.webapp.vo;

import java.util.Date;

public class ArticleVO {
	private String author;
	private String title;
	private String content;
	private Date createDate;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "ArticleVO [author=" + author + ", title=" + title + ", content=" + content + ", createDate="
				+ createDate + "]";
	}

}
