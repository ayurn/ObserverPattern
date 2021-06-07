public class MainClass {
    public  static void main(String[] args) {
        CentralAajTak centralAajTak = new CentralAajTak();

        BizAajTak bizAajTak = new BizAajTak();
        MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
        DelhiAajTak delhiAajTak = new DelhiAajTak();

        News delhiNews = new News();
        delhiNews.setNews("Delhi had power cut yesterday");
        delhiNews.newsType = NewsType.DELHI_NEWS;

        News mumbaiNews = new News();
        mumbaiNews.setNews("Mumbai had rain today earlier in the morning");
        mumbaiNews.newsType = NewsType.MUMBAI_NEWS;

        centralAajTak.register(bizAajTak);
        centralAajTak.register(mumbaiAajTak);
        centralAajTak.register(delhiAajTak);

        centralAajTak.update(delhiNews);
        centralAajTak.update(mumbaiNews);
    }
}
