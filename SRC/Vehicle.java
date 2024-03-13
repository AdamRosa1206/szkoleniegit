public interface Vehicle {

    // w interfejsie nie dajemy modyfikatora dostepu np. public bo dla interfejsu zawsze domyslne jest public
    void jazda(int speed);
    void stop();
    String info();
}
