package br.com.abruzzo.Challenges_DIO_LeetCode_Among_Others;

import java.util.*;
import java.util.stream.Stream;

/**
 * In a project, you have a list of required skills req_skills, and a list of people. The ith person people[i] contains a list of skills that the person has.
 *
 * Consider a sufficient team: a set of people such that for every required skill in req_skills, there is at least one person in the team who has that skill. We can represent these teams by the index of each person.
 *
 * For example, team = [0, 1, 3] represents the people with skills people[0], people[1], and people[3].
 * Return any sufficient team of the smallest possible size, represented by the index of each person. You may return the answer in any order.
 *
 * It is guaranteed an answer exists.
 *
 *
 *      req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
 *     Output: [0,2]
 *     Example 2:
 *
 *     Input: req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
 *
 *
 * @link https://leetcode.com/problems/smallest-sufficient-team/
 *
 * TRATA-SE DE UM PROBLEMA DE OTIMIZAÇÃO --> PESQUISA OPERACIONAL
 *
 * USAR BITMASKING E DYNAMIC PROGRAMMING:
 *
 * @ https://www.geeksforgeeks.org/bitmasking-and-dynamic-programming-set-1-count-ways-to-assign-unique-cap-to-every-person/
 *
 * SOLUÇÃO COM EXPLICAÇÃO: @ https://leetcode.com/problems/smallest-sufficient-team/discuss/1583288/JavaScript-Solution-with-explanation
 *
 *
 *
 * @author Emmanuel Abruzzo
 * @date 15/01/2022
 */
public class SmallestSufficientTeam {


    public static void main(String[] args) {

        String[] req_skills_1 = new String[]{"java","nodejs","reactjs"};
        String[][] people1 = new String[][]{{"java"},{"nodejs"},{"nodejs","reactjs"}};

        List<List<String>> listSkilledPeople = new ArrayList<>();

        List<String> listaSkillsPessoa1 = new ArrayList<>();
        listaSkillsPessoa1.add("java");

        List<String> listaSkillsPessoa2 = new ArrayList<>();
        listaSkillsPessoa2.add("nodejs");

        List<String> listaSkillsPessoa3 = new ArrayList<>();
        listaSkillsPessoa3.add("nodejs");
        listaSkillsPessoa3.add("reactjs");

        listSkilledPeople.add(listaSkillsPessoa1);
        listSkilledPeople.add(listaSkillsPessoa2);
        listSkilledPeople.add(listaSkillsPessoa3);


        int[] team = smallestSufficientTeam(req_skills_1, listSkilledPeople);
        Arrays.stream(team).forEach(System.out::println);


    }

    public static int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {

        ArrayList<Integer> listaIndicesPessoas = new ArrayList<>();

        Map<String, Boolean> mapSkillsNeeded = new HashMap<>();

        Arrays.stream(req_skills).forEach(

                skillNeeded -> {

                    for(int i=0; i< people.size(); i++){

                        if(people.get(i).stream().anyMatch(skill -> Objects.equals(skill,skillNeeded))){
                            mapSkillsNeeded.put(skillNeeded,Boolean.TRUE);
                            listaIndicesPessoas.add(i);

                        }


                    }

                }

        );

        int[] team = new int[listaIndicesPessoas.size()];

        for(int i = 0; i < listaIndicesPessoas.size(); i++)
            team[i] = listaIndicesPessoas.get(i);

        return team;

    }





}
