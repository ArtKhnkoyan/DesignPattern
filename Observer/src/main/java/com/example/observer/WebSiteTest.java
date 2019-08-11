package com.example.observer;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class WebSiteTest {
    public static void main(String[] args) {
        WebSite webSite = new WebSite();
        Subscriber subscriberA = new Subscriber("A");
        Subscriber subscriberB = new Subscriber("B");
        webSite.addObservable(subscriberA);
        webSite.addObservable(subscriberB);
        webSite.addPosts(postBuilder("aaa", "aaaaa"));
        webSite.addPosts(postBuilder("bbb", "bbbbb"));

        webSite.removeObservable(subscriberB);
        webSite.addPosts(postBuilder("ccc", "ccccc"));
    }

    private static Post postBuilder(String title, String content) {
        return Post.builder()
                .title(title)
                .content(content)
                .createdDate(LocalDateTime.now())
                .build();
    }
}
