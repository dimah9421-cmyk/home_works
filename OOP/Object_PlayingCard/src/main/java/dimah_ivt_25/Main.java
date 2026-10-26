package dimah_ivt_25;

public class Main {
    static void main() {

        // card1 -- ссылка на объект
        Playing_card card1;
        // card2 -- ссылка на объект (объектов пока нет)
        Playing_card card2 = null;

        // Создаем объект (new), инициализируем объект (Playing_card)
        card1 = new Playing_card();
        card2 = new Playing_card(2, 14);

        String str = card1.toString();
        IO.println(str);
        IO.println(card2.toString());
    }
}
