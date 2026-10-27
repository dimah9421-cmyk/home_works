package dimah_ivt_25;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        // card1 -- ссылка на объект
        Playing_card card1;
        // card2 -- ссылка на объект (объектов пока нет)
        Playing_card card2 = null;

        // Создаем объект (new), инициализируем объект (Playing_card)
        card1 = new Playing_card();
        card2 = new Playing_card(2, 14);

        try {
            // Создаем объект (карта король черви)
            Playing_card card3 = new Playing_card(3,13);
            // Переназначаем поле мощности объекта (с короля на даму)
            card3.setCart_power(12);
            // Вывод сеттера масти карты (черви/3)
            IO.println(card3.getSuit_cart());
            // Вывод сеттера мощности карты (дама/12)
            IO.println(card3.getCart_power());
            IO.println(card3);  // Вывод строки
        } catch (IllegalArgumentException e){   // Проверка исключения неверных данных
            IO.println(e.toString());
        }
        // Создаем динамический массив типа Playing_card
        ArrayList<Playing_card> deck = new ArrayList<Playing_card>();

        for (int suit = 1; suit <= 4; suit++) {          // Цикл по 4 мастям
            for (int power = 6; power <= 14; power++) {  // Цикл по мощности от 6 до Туза (14)
                Playing_card card = new Playing_card();  // Создаем объект
                card.setSuit_cart(suit);                 // Заполняем поле масти нашей карты
                card.setCart_power(power);               // Заполняем поле мощности нашей карты
                deck.add(card);  // Добавляем в конец списка значения переменной card
            }
        }

        IO.println("Вся колода:");
        // Вывод массива
        for (int i = 0; i < 36; i++) {
            // get() - метод для поссылочнму обращению к элементу динамического списка ArrayList
            IO.println(deck.get(i).toString());
        }
    }
}
