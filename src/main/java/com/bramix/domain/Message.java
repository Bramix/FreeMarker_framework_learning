package com.bramix.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;
    private String text;
    private String tag;
    @ToString.Exclude
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "user_id")
    private User author;
    public Message (){
    }
    public Message(String text, String tag, User author) {
        this.text = text;
        this.tag = tag;
        this.author = author;
    }
    public String getAuthorName() {
        return author.getUsername();
    }
}
