package dimah_ivt_25;

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
            Playing_card card3 = new Playing_card(3,13);
            card3.setCart_power(12);
            IO.println(card3.getSuit_cart());
            IO.println(card3.getCart_power());
            IO.println(card3);
        } catch (IllegalArgumentException e){
            IO.println(e.toString());
        }

        Playing_card[] deck = new Playing_card[36];

        IO.println("Вся колода:");
        int ind = 0;    // Переменная для указания индекса массива
        for (int suit = 1; suit <= 4; suit++) {          // Цикл по 4 мастям
            for (int power = 6; power <= 14; power++) {  // Цикл по мощности от 6 до Туза (14)
                deck[ind] = new Playing_card();          // Создаем объект
                deck[ind].setSuit_cart(suit);            // Заполняем поле масти нашей карты
                deck[ind].setCart_power(power);          // Заполняем поле мощности нашей карты
                ind++;  // Увеличиваем индекс массива на 1
            }
        }
        // Вывод массива
        for (int i = 0; i < 36; i++) {
            IO.println(deck[i].toString());
        }
    }
}
