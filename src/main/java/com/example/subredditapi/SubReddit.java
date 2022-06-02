package com.example.subredditapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subreddit")
public class SubReddit {

    private @Id @GeneratedValue
    int id;
    private String name;
    private String description;
    private int profilepicture;

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    private int followerCount;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(int profilepicture) {
        this.profilepicture = profilepicture;
    }
}
