package io.onedev.server.model.support.pullrequest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReviewResult implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static final String PROP_APPROVED = "approved";
	
	private String commit;
	
	private Boolean approved = false;
	
	@Column(length=15000)
	private String comment;
	
	public String getCommit() {
		return commit;
	}

	public void setCommit(String commit) {
		this.commit = commit;
	}

	public Boolean isApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
