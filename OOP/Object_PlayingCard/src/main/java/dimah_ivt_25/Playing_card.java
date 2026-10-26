package dimah_ivt_25;
// Класс -- структурный ссылочный тип данных
import java.lang.String;

// Игральная карта
public class Playing_card {

    private int Suit_cart, Cart_power;   // Масть и мощность карты

    // Конструктор
    /// Метод инициализирует объект с переданными данными
    /// @param suit_cart1 - переданная масть карты
    /// @param cart_power1 - переданная мощность карты
    public Playing_card(int suit_cart1, int cart_power1){
        setSuit_cart(suit_cart1);
        setCart_power(cart_power1);
    }
    // Конструктор
    /// Метод инициализирует обЪект без переданных данных
    public Playing_card(){
        Suit_cart = 1;
        Cart_power = 6;
    }
    // Сеттер для масти карты
    /// Метод записывает данные о масти в объект если данные переданы корректно
    /// Метод может кинуть исключение если переданное значение будет 4 </> 1
    /// @param Suit_card1 - переданные данный о масти карты
    public void setSuit_cart(int Suit_card1){
        if ((Suit_card1 < 1) || (Suit_card1 > 4)){
            throw new IllegalArgumentException("Ошибка: Масть карты должна быть от 1 до 4");
        }
        this.Suit_cart = Suit_card1;
    }
    // Геттер для мощности карты
    /// Метод записывает данные о мощности карты в объект, если данные переданы корректно
    /// Метод может кинуть исключение если переданные данные 14 </> 6
    /// @param Cart_power1 - переданные данные о мощности карты
    public void setCart_power(int Cart_power1){
        if ((Cart_power1 < 6) || (Cart_power1 > 14)){
            throw new IllegalArgumentException("Ошибка: Мощность карты должна быть от 6 до 14 ");
        }
        this.Cart_power = Cart_power1;
    }
    // Геттер для масти карты
    /// Метод при вызове возвращает значение масти карты (полезно для копирования данных)
    public int getSuit_cart(){ return Suit_cart;}
    // Геттер для мощности карты
    /// Метод при вызове возвращает значение мощности карты
    public int getCart_power(){
        return Cart_power;
    }
    // Геттер для цвета масти карты
    /// Метод при вызове возращает цвет масти карты
    public String getCart_color(){
        // Если пики или крести, то черный
        if (Suit_cart == 1 || Suit_cart == 2){
            return  "Черный";
        }
        // Иначе красный
        else{
            return  "Красный";
        }
    }
    // Преобразование данных в строку для чтения данных в строковом виде
    /// Метод при вызове возвращает строку с данными о карте
    public String toString(){

        String Suit_cart1 = "";
        switch (this.Suit_cart){
            case 1: Suit_cart1 = "Крести";break;
            case 2: Suit_cart1 = "Пики";  break;
            case 3: Suit_cart1 = "Черви"; break;
            case 4: Suit_cart1 = "Бубны"; break;
        }

        String Color1 = getCart_color();

        String Cart_power1 = String.format("%d",Cart_power);
        switch (this.Cart_power){
            case 11: Cart_power1 = "Валет"; break;
            case 12: Cart_power1 = "Дама";  break;
            case 13: Cart_power1 = "Король";break;
            case 14: Cart_power1 = "Туз";   break;
        }

        return String.format("Цвет %s; Масть %s; Карта %s", Color1, Suit_cart1, Cart_power1);
    }
}
