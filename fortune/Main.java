package com.fortune;

import java.util.Random;

public class Main {

        static String[] fortune = {"A juventude não é uma época da vida, é um estado de espírito.",
        "Demonstre amor e alegria em todas as oportunidades e verá que a paz nasce dentro de si.",
        "Não compense na ira o que lhe falta na razão.",
        "A vida trará coisas boas se tiver paciência.",
        "Defeitos e virtudes são apenas dois lados da mesma moeda.",
        "Não há que ser forte. Há que ser flexível.",
        "Todos os dias organiza os seus cabelos, por que não faz o mesmo com o coração?",
        "Há três coisas que jamais voltam; a flecha lançada, a palavra dita e a oportunidade perdida.",
        "Podemos escolher o que semear, mas somos obrigados a colher o que plantamos."};
        public static void main(String[] args) {
        Random rand = new Random();
        int r = rand.nextInt(fortune.length);
        System.out.println(fortune[r]);
    }

} 