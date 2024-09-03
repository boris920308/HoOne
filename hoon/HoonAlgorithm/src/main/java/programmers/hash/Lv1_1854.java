package programmers.hash;

import java.util.HashSet;

/**
 *
 * no.1845
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */

public class Lv1_1854 {

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 3};
        System.out.println(solution(array));
    }

    private static int solution(int[] nums) {
        System.out.println("- - - start solution - - - ");

        HashSet<Integer> myPokemon = new HashSet<>();
        int myPokemonSize = nums.length / 2;

        for (int element : nums) {
            myPokemon.add(element);

            if(myPokemon.size() >= myPokemonSize) {
                return myPokemon.size();
            }
        }

        return myPokemon.size();
    }
}
