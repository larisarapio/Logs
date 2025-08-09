import entities.SumCourseStudents;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<SumCourseStudents> studentTeste =  new HashSet<>();

        System.out.println("how many students for course A? ");
        int qtA = sc.nextInt();
        for (int i = 0; i < qtA; i++) {
            int idStudant = sc.nextInt();
            studentTeste.add(new SumCourseStudents(idStudant));
        }

        System.out.println("how many students for course B? ");
        int qtB = sc.nextInt();
        for (int i = 0; i < qtB; i++) {
            int idStudant = sc.nextInt();
            studentTeste.add(new SumCourseStudents(idStudant));
        }

        System.out.println("how many students for course C? ");
        int qtC = sc.nextInt();
        for (int i = 0; i < qtC; i++) {
            int idStudant = sc.nextInt();
            studentTeste.add(new SumCourseStudents(idStudant));
        }

        System.out.println("O total de estudantes dos cursos A,B,C são: " + studentTeste.size());
        System.out.println("E seus ids são: " + studentTeste);








    }
}
