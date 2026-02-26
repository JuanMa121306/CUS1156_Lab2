/*Lab 3: Git
 * Juan Alfaro
 * UniqueWords.java
 * Feb 25,2026
 * This program counts how many unique words are in an ArrayList
 *  by checking for duplicates and counting only the first occurrence
 *   of each word.It creates a sample list of words, calls the countUnique method, 
 *   and prints the total number of unique words.
 * 
 */
import java.util.ArrayList;

public class UniqueWords
{
   /**
      counts the number of unique strings in a list
      @param list ArrayList of strings to be examined
      @return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
      int count = 0;

      for (int i = 0; i < list.size(); i++)
      {
         boolean isDuplicate = false;

         for (int j = 0; j < i; j++)
         {
            if (list.get(i).equals(list.get(j)))
            {
               isDuplicate = true;
               break;
            }
         }

         if (!isDuplicate)
         {
            count++;
         }
      }

      return count;
   }

   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}