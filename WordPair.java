public class WordPair {
    /** Constructs a WordPair object. */
    String first1 = "";
    String second2 = "";

    public WordPair(String first, String second) 
    {
        first1 = first;
        second2 = second;
        /* implementation not shown */ 
    }

    /** Returns the first string of this WordPair object. */
    public String getFirst() 
    {
        return first1;
        /* implementation not shown */ 
    }

    /** Returns the second string of this WordPair object. */
    public String getSecond() 
    {
        return second2;
        /* implementation not shown */ 
    }
    
    public String toString()
    {
        return "(\"" + first1 + "\", \"" + second2 + "\")";
    }

}
