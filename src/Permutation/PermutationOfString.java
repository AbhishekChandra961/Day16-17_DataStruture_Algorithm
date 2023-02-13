package Permutation;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
  public static void main(String[] args) {
    String s = "abc";
    List<String> iterativePermutations = getPermutationsIterative(s);
    List<String> recursivePermutations = getPermutationsRecursive(s);
    System.out.println("Iterative Permutations: " + iterativePermutations);
    System.out.println("Recursive Permutations: " + recursivePermutations);
    System.out.println("Are the arrays equal: " + iterativePermutations.equals(recursivePermutations));
  }
  
  private static List<String> getPermutationsIterative(String s) {
    List<String> permutations = new ArrayList<>();
    permutations.add("");
    for (int i = 0; i < s.length(); i++) {
      List<String> newPermutations = new ArrayList<>();
      char c = s.charAt(i);
      for (String permutation : permutations) {
        for (int j = 0; j <= permutation.length(); j++) {
          newPermutations.add(permutation.substring(0, j) + c + permutation.substring(j));
        }
      }
      permutations = newPermutations;
    }
    return permutations;
  }
  
  private static List<String> getPermutationsRecursive(String s) {
    List<String> permutations = new ArrayList<>();
    getPermutationsRecursiveHelper(s, "", permutations);
    return permutations;
  }
  
  private static void getPermutationsRecursiveHelper(String s, String prefix, List<String> permutations) {
    if (s.length() == 0) {
      permutations.add(prefix);
      return;
    }
    for (int i = 0; i < s.length(); i++) {
      String newString = s.substring(0, i) + s.substring(i + 1);
      getPermutationsRecursiveHelper(newString, prefix + s.charAt(i), permutations);
    }
  }
}
