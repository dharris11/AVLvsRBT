package AVLvsRBT;

import it.unimi.dsi.fastutil.ints.IntAVLTreeSet;
import it.unimi.dsi.fastutil.objects.ObjectAVLTreeSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class MyAvl {

  public void AVLTree() throws FileNotFoundException {

    IntAVLTreeSet rand = new IntAVLTreeSet();
    IntAVLTreeSet seq = new IntAVLTreeSet();

    // Reads random.txt and adds to AddListR
    File random = new File("E:/VS Code/Java/AVLvsRBT/random.txt"); // one million records
    Scanner addR = new Scanner(random);
    List<Integer> AddListR = new ArrayList();
    while (addR.hasNextInt())
      AddListR.add(addR.nextInt());

    // Reads sequential.txt and adds to AddListS
    File sequential = new File("E:/VS Code/Java/AVLvsRBT/sequential.txt");
    Scanner addS = new Scanner(sequential);
    List<Integer> AddListS = new ArrayList();
    while (addS.hasNextInt())
      AddListS.add(addS.nextInt());
    // Reads search.txt and adds them to ArrayList to later be used
    File filesearch = new File("E:/VS Code/Java/AVLvsRBT/search.txt"); // one thousand records
    Scanner scs = new Scanner(filesearch);
    List<Integer> SearchList = new ArrayList();
    while (scs.hasNextInt())
      SearchList.add(scs.nextInt());

    // Reads delete.txt and adds them to ArrayList to later be used
    File filedelete = new File("E:/VS Code/Java/AVLvsRBT/delete.txt");
    Scanner scd = new Scanner(filedelete);
    List<Integer> DeleteList = new ArrayList();
    while (scd.hasNextInt())
      DeleteList.add(scd.nextInt());

    System.out.println("AVL TREE (INTEGERS)");

    // Builds the AVL tree using the AddListR
    long start1 = System.currentTimeMillis(); // start time
    rand.addAll(AddListR); // adding to AVLTree
    long end1 = System.currentTimeMillis(); // end time
    long elapsed1 = end1 - start1; // calculate time taken
    System.out.println("Building AVL tree randomly took: " + elapsed1 + " milliseconds");

    // Builds the AVL tree using the AddListS
    long start2 = System.currentTimeMillis(); // start time
    seq.addAll(AddListS); // adding to AVLTree
    long end2 = System.currentTimeMillis(); // end time
    long elapsed2 = end2 - start2; // calculate time taken
    System.out.println("Building AVL tree sequentially took: " + elapsed2 + " milliseconds");

    // Searches AVL tree for 1000 entries
    long searchstart = System.nanoTime();
    rand.containsAll(SearchList);
    long searchend = System.nanoTime();
    long searchElapsed = searchend - searchstart;
    System.out.println("Searching took: " + searchElapsed + " nanoseconds");

    // Deletes 1000 entries from AVL tree
    long deletestart = System.currentTimeMillis();
    rand.removeAll(DeleteList);
    long deleteend = System.currentTimeMillis();
    long deleteElapsed = deleteend - deletestart;
    System.out.println("Deleting took: " + deleteElapsed + " milliseconds");

    rand.clear();
    seq.clear();
    addR.close();
    addS.close();
    scs.close();
    scd.close();
  }

  public void RBTree() throws FileNotFoundException {
    TreeSet<Integer> rand = new TreeSet<>();
    TreeSet<Integer> seq = new TreeSet<>();

    // Reads random.txt and adds to AddListR
    File random = new File("E:/VS Code/Java/AVLvsRBT/random.txt");
    Scanner addR = new Scanner(random);
    List<Integer> AddListR = new ArrayList();
    while (addR.hasNextInt())
      AddListR.add(addR.nextInt());

    // Reads sequential.txt and adds to AddListS
    File sequential = new File("E:/VS Code/Java/AVLvsRBT/sequential.txt");
    Scanner addS = new Scanner(sequential);
    List<Integer> AddListS = new ArrayList();
    while (addS.hasNextInt())
      AddListS.add(addS.nextInt());

    // Reads search.txt and adds to filesearch
    File filesearch = new File("E:/VS Code/Java/AVLvsRBT/search.txt");
    Scanner scs = new Scanner(filesearch);
    List<Integer> SearchList = new ArrayList();
    while (scs.hasNextInt())
      SearchList.add(scs.nextInt());

    // Reads delete.txt and adds to filedelete
    File filedelete = new File("E:/VS Code/Java/AVLvsRBT/delete.txt");
    Scanner scd = new Scanner(filedelete);
    List<Integer> DeleteList = new ArrayList();
    while (scd.hasNextInt())
      DeleteList.add(scd.nextInt());

    System.out.println("\nRBT TREE (INTEGERS)");

    // Builds the AVL tree using AddListR
    long start1 = System.currentTimeMillis();
    rand.addAll(AddListR);
    long end1 = System.currentTimeMillis(); // end time
    long elapsedTime1 = end1 - start1; // calculate time taken
    System.out.println("Building RBT tree randomly took: " + elapsedTime1 + " milliseconds");

    // Builds the AVL tree using AddListS
    long start2 = System.currentTimeMillis();
    seq.addAll(AddListS);
    long end2 = System.currentTimeMillis(); // end time
    long elapsedTime2 = end2 - start2; // calculate time taken
    System.out.println("Building RBT tree sequentially took: " + elapsedTime2 + " milliseconds");

    // Searches RBT for 1000 entries
    long searchstart = System.nanoTime();
    rand.containsAll(SearchList);
    long searchend = System.nanoTime();
    long searchelapsed = searchend - searchstart;
    System.out.println("Searching took: " + searchelapsed + " nanoseconds");

    long deletestart = System.currentTimeMillis();
    rand.removeAll(DeleteList);
    long deleteend = System.currentTimeMillis();
    long deleteelapsed = deleteend - deletestart;
    System.out.println("Deleting took: " + deleteelapsed + " milliseconds");

    rand.clear();
    seq.clear();
    addR.close();
    addS.close();
    scs.close();
    scd.close();

  }

  public void AVLTree_String() throws FileNotFoundException {
    ObjectAVLTreeSet<String> rand = new ObjectAVLTreeSet<String>();
    ObjectAVLTreeSet<String> seq = new ObjectAVLTreeSet<String>();

    // Reads random.txt and adds to AddListR
    File random = new File("E:/VS Code/Java/AVLvsRBT/strings.txt"); // one million records
    Scanner addR = new Scanner(random);
    List<String> AddListR = new ArrayList();
    while (addR.hasNext())
      AddListR.add(addR.next());

    // Reads sequential.txt and adds to AddListS
    File sequential = new File("E:/VS Code/Java/AVLvsRBT/sequentialstrings.txt");
    Scanner addS = new Scanner(sequential);
    List<String> AddListS = new ArrayList();
    while (addS.hasNext())
      AddListS.add(addS.next());
    java.util.Collections.sort(AddListS);// sorts the sequentialstrings.txt

    // Reads search.txt and adds them to ArrayList to later be used
    File filesearch = new File("E:/VS Code/Java/AVLvsRBT/searchstring.txt"); // one thousand records
    Scanner scs = new Scanner(filesearch);
    List<String> SearchList = new ArrayList();
    while (scs.hasNext())
      SearchList.add(scs.next());

    // Reads delete.txt and adds them to ArrayList to later be used
    File filedelete = new File("E:/VS Code/Java/AVLvsRBT/deletestring.txt");
    Scanner scd = new Scanner(filedelete);
    List<String> DeleteList = new ArrayList();
    while (scd.hasNext())
      DeleteList.add(scd.next());

    System.out.println("\nAVL TREE (STRINGS)");

    // Builds the AVL tree using the AddListR
    long addstart = System.currentTimeMillis(); // start time
    rand.addAll(AddListR); // adding to AVLTree
    long addend = System.currentTimeMillis(); // end time
    long addElapsed = addend - addstart; // calculate time taken
    System.out.println("Building AVL tree randomly took: " + addElapsed + " milliseconds");

    // Builds the AVL tree using the AddListS
    long start = System.currentTimeMillis(); // start time
    seq.addAll(AddListS); // adding to AVLTree
    long end = System.currentTimeMillis(); // end time
    long Elapsed = end - start; // calculate time taken
    System.out.println("Building AVL tree sequentially took: " + Elapsed + " milliseconds");

    // Searches AVL tree for 1000 entries
    long searchstart = System.nanoTime();
    rand.containsAll(SearchList);
    long searchend = System.nanoTime();
    long searchElapsed = searchend - searchstart;
    System.out.println("Searching took: " + searchElapsed + " nanoseconds");

    // Deletes 1000 entries from AVL tree
    long deletestart = System.currentTimeMillis();
    rand.removeAll(DeleteList);
    long deleteend = System.currentTimeMillis();
    long deleteElapsed = deleteend - deletestart;
    System.out.println("Deleting took: " + deleteElapsed + " milliseconds");

    rand.clear();
    seq.clear();
    addR.close();
    addS.close();
    scs.close();
    scd.close();
  }

  public void RBTree_String() throws FileNotFoundException {
    TreeSet<String> rand = new TreeSet<>();
    TreeSet<String> seq = new TreeSet<>();

    // Reads random.txt and adds to AddListR
    File random = new File("E:/VS Code/Java/AVLvsRBT/strings.txt");
    Scanner addR = new Scanner(random);
    List<String> AddListR = new ArrayList();
    while (addR.hasNext())
      AddListR.add(addR.next());

    // Reads sequential.txt and adds to AddListS
    File sequential = new File("E:/VS Code/Java/AVLvsRBT/sequentialstrings.txt");
    Scanner addS = new Scanner(sequential);
    List<String> AddListS = new ArrayList();
    while (addS.hasNext())
      AddListS.add(addS.next());
    java.util.Collections.sort(AddListS);

    // Reads search.txt and adds to filesearch
    File filesearch = new File("E:/VS Code/Java/AVLvsRBT/searchstring.txt");
    Scanner scs = new Scanner(filesearch);
    List<String> SearchList = new ArrayList();
    while (scs.hasNext())
      SearchList.add(scs.next());

    // Reads delete.txt and adds to filedelete
    File filedelete = new File("E:/VS Code/Java/AVLvsRBT/deletestring.txt");
    Scanner scd = new Scanner(filedelete);
    List<String> DeleteList = new ArrayList();
    while (scd.hasNext())
      DeleteList.add(scd.next());

    System.out.println("\nRBT TREE (STRINGS)");

    // Builds the AVL tree using AddListR
    long start1 = System.currentTimeMillis();
    rand.addAll(AddListR);
    long end1 = System.currentTimeMillis(); // end time
    long elapsedTime1 = end1 - start1; // calculate time taken
    System.out.println("Building RBT tree randomly took: " + elapsedTime1 + " milliseconds");

    // Builds the AVL tree using AddListS
    long start2 = System.currentTimeMillis();
    seq.addAll(AddListS);
    long end2 = System.currentTimeMillis(); // end time
    long elapsedTime2 = end2 - start2; // calculate time taken
    System.out.println("Building RBT tree sequentially took: " + elapsedTime2 + " milliseconds");

    // Searches RBT for 1000 entries
    long searchstart = System.nanoTime();
    rand.containsAll(SearchList);
    long searchend = System.nanoTime();
    long searchelapsed = searchend - searchstart;
    System.out.println("Searching took: " + searchelapsed + " nanoseconds");

    long deletestart = System.currentTimeMillis();
    rand.removeAll(DeleteList);
    long deleteend = System.currentTimeMillis();
    long deleteelapsed = deleteend - deletestart;
    System.out.println("Deleting took: " + deleteelapsed + " milliseconds");

    rand.clear();
    seq.clear();
    addR.close();
    addS.close();
    scs.close();
    scd.close();
  }

  public static void main(String[] args) throws FileNotFoundException {
    MyAvl avl = new MyAvl() {
    };

    avl.AVLTree();
    avl.RBTree();

    avl.AVLTree_String();
    avl.RBTree_String();

  }

}