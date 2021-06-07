public class News {
    String news;
    NewsType newsType ;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}

enum NewsType{
    DELHI_NEWS, BIZ_NEWS, MUMBAI_NEWS;
}

