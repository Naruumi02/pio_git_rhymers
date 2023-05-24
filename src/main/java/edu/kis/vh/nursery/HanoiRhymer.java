package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po klasie DefaultCountingOutRhymer.
 * Klasa służy do wynzaczania ilości odrzuconych wartości.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer
{

    /**
     * Zmienna opisująca ilość liczb wyrzuconych z tablicy.
     */
    private int totalRejected = 0;

    /**
     * Metoda ma zadanie zwrócić użytkownikowi ilość odrzucoonych wartości.
     * Nie potrzebuje ona żadnych parametrów.
     *
     * @return liczba odrzuconych elementów
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Metoda sprawdza czy elementy są ułożone w poprawnej kolejności i w
     * przypadku braku zwiększa prywatną wartość odrzuconych wartości.
     *
     * @param in wartość, która powinna nastąpić jako kolejna
     */
    @Override
    public void countIn(int in)
    {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
