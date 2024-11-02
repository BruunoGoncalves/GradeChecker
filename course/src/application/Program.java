/**
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Studentpara
 * resolver este problema.
 * */

package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        s.name = sc.nextLine();
        s.a = sc.nextDouble();
        s.b = sc.nextDouble();
        s.c = sc.nextDouble();

        System.out.println(s);

        sc.close();
    }
}
