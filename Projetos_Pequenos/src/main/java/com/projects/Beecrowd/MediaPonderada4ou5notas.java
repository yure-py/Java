package com.projects.Beecrowd;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaPonderada4ou5notas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        float n1, n2, n3, n4, n5, mediafinal, media1;

        n1 = leitor.nextFloat();
        n2 = leitor.nextFloat();
        n3 = leitor.nextFloat();
        n4 = leitor.nextFloat();

        media1 = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1))/10;
        System.out.println("Media: " + df.format(media1));

        if (media1 > 7.0) {
            System.out.println("Aluno aprovado.");
            return;
        }
        if (media1 < 5.0) {
            System.out.println("Aluno reprovado.");
            return;
        }

        mediafinal = 0f;
        if (media1 >= 5. && media1 <= 6.9) {
            System.out.println("Aluno em exame.");
            n5 = leitor.nextFloat();
            System.out.println("Nota do exame: " + df.format(n5));
            mediafinal = (media1+n5)/2f;
        }

        if (mediafinal >= 5.0)
            System.out.println("Aluno aprovado.");
        if (mediafinal < 5.0)
            System.out.println("Aluno reprovado.");

        System.out.println("Media final: " + df.format(mediafinal));
    }
}
