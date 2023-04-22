package com.lixiang;

public class AdapterPattern {
    public static void main(String[] args) {
        String news = new Adapter(new NewsAnchor()).translate();
        System.out.println(news);
    }
}


/**
 * 新闻主持人
 */
class NewsAnchor {
    public String speak() {
        return "China No.1";
    }
}

/**
 * 手语老师
 */
interface Translator {
    String translate();
}


/**
 * 听力障碍人士
 */
class Adapter implements Translator {
    private NewsAnchor newsAnchor;

    public Adapter(NewsAnchor newsAnchor) {
        this.newsAnchor = newsAnchor;
    }

    @Override
    public String translate() {
        String news = newsAnchor.speak();
        String newsWithoutSound = "news without sound";
        return newsWithoutSound;
    }
}