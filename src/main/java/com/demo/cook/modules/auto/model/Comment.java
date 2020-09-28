package com.demo.cook.modules.auto.model;

import java.util.Date;

public class Comment {
    private String commentId;

    private String targetId;

    private String parentId;

    private String content;

    private String replyId;

    private Date createTime;

    private String commentUser;

    public Comment(String commentId, String targetId, String parentId, String content, String replyId, Date createTime, String commentUser) {
        this.commentId = commentId;
        this.targetId = targetId;
        this.parentId = parentId;
        this.content = content;
        this.replyId = replyId;
        this.createTime = createTime;
        this.commentUser = commentUser;
    }

    public Comment() {
        super();
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId == null ? null : commentId.trim();
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId == null ? null : targetId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId == null ? null : replyId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser == null ? null : commentUser.trim();
    }
}