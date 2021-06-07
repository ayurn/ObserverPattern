import java.util.ArrayList;

public class CentralAajTak {

    ArrayList<IObserver> observerList = new ArrayList<IObserver>();

    public void register(IObserver instance) {
        observerList.add(instance);
    }

    public void update(News news) {
        observerList.stream().filter(observer -> observer.getNewsType().equals(news.newsType))
                    .forEach(object -> object.onUpdate(news));
    }
}
