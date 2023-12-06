package petla_while;

import java.io.*;
public class PetlaWhile {

    public static void main(String[] args)
        throws IOException
    {
        try
        {
            int x, y = 0, i = 0;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj wartosc x: ");
            x = Integer.parseInt(br.readLine());
            System.out.println("petla wyswietla wartosc funkcji y = 4 * x (dla i<8)");

            while (i < 8) {
                y = 4 * x;
                System.out.println("x = " + x + '\t' + "y = " + y + '\t');
                i++;
                x++;
            }
        }
        catch(NumberFormatException exception)
        {
            System.out.println("niepoprawne dane, podaj liczbe");
        }

    }
}
