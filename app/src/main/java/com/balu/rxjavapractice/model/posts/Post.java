package com.balu.rxjavapractice.model.posts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

@SerializedName("userId")
@Expose
private Integer userId;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("title")
@Expose
private String title;
@SerializedName("body")
@Expose
private String body;


private List<Comment> comments;

public Post(int userId, int id, String title, String body, List<Comment> comments) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.comments = comments;
    }

public Integer getUserId() {
return userId;
}

public void setUserId(Integer userId) {
this.userId = userId;
}

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getTitle() {
return title;
}

public void setTitle(String title) {
this.title = title;
}

public String getBody() {
return body;
}

public void setBody(String body) {
this.body = body;
}

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
