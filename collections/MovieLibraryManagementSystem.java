package collections;

import java.util.*;

// Searchable interface
interface Searchable {
    boolean searchByKeyword(String keyword);
}

// Abstract class
abstract class MediaItem implements Searchable {
    protected String title;
    protected String releaseDate;
    protected double rating;

    public MediaItem(String title, String releaseDate, double rating) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getRating() {
        return rating;
    }
}

// Movie class
class Movie extends MediaItem {

    private String director;
    private List<String> cast;
    private int duration;

    public Movie(String title, String releaseDate, double rating,
                 String director, int duration, List<String> cast) {
        super(title, releaseDate, rating);
        this.director = director;
        this.duration = duration;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    // Search logic
    @Override
    public boolean searchByKeyword(String keyword) {
        keyword = keyword.toLowerCase();

        if (title.toLowerCase().contains(keyword)) return true;
        if (director.toLowerCase().contains(keyword)) return true;

        for (String c : cast) {
            if (c.trim().toLowerCase().contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}

public class MovieLibraryManagementSystem {

    // Sort logic
    public static void sortByAttribute(List<Movie> movies, String attribute, String order) {

        Comparator<Movie> comparator = null;
        attribute = attribute.toLowerCase();

        switch (attribute) {
            case "title":
                comparator = Comparator.comparing(m -> m.getTitle().toLowerCase());
                break;

            case "release date":
            case "releasedate":
                comparator = Comparator.comparing(Movie::getReleaseDate);
                break;

            case "director":
                comparator = Comparator.comparing(m -> m.getDirector().toLowerCase());
                break;

            case "duration":
                comparator = Comparator.comparingInt(Movie::getDuration);
                break;
        }

        if (order.equalsIgnoreCase("desc")) {
            comparator = comparator.reversed();
        }

        Collections.sort(movies, comparator);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Movie> movies = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String title = sc.nextLine();
            String releaseDate = sc.nextLine();
            double rating = Double.parseDouble(sc.nextLine());
            String director = sc.nextLine();
            int duration = Integer.parseInt(sc.nextLine());
            String castInput = sc.nextLine();

            List<String> cast = Arrays.asList(castInput.split(","));

            movies.add(new Movie(title, releaseDate, rating, director, duration, cast));
        }

        String sortAttribute = sc.nextLine();
        String sortOrder = sc.nextLine();
        String keyword = sc.nextLine();

        // Search result
        for (Movie m : movies) {
            if (m.searchByKeyword(keyword)) {
                System.out.println(m.getTitle());
            }
        }

        // Sort and display
        sortByAttribute(movies, sortAttribute, sortOrder);
        for (Movie m : movies) {
            System.out.println(m.getTitle());
        }

        sc.close();
    }
}





/*
enter input:
2
Inception
2010-07-16
8.8
Christopher Nolan
148
Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page
The Prestige
2006-10-20
8.5
Christopher Nolan
130
Christian Bale, Hugh Jackman, Scarlett Johansson
director
desc
Nolan

output:
Inception
The Prestige
Inception
The Prestige
*/
/*Description
Movie Library Management System

Develop a robust system capable of managing a collection of movies with functionalities for searching, sorting, and displaying movies based on various attributes like title, release date, director, duration, and more. The system should allow users to search for movies by any keyword present in the movie's title, director's name, or cast members' names, and sort the entire collection based on specified attributes in either ascending or descending order.

Function Description:

Create a Searchable interface with searchByKeyword().

Create an abstract class MediaItem which should inherit Searchable interface and having title(string), releaseDate(string) and rating(double) with constructor accepting all three attributes and there must be getter methods for all the three attributes.

Implement the Movie class that extends the abstract class MediaItem and defines searchByKeyword method.

Movie class should have director(string), cast(list of string) and duration(int) as private attributes with constructor accepting all these attributes.

searchByKeyword(): Returns true if the keyword appears in the movie's director, title, or any of the cast members' names.

You need to define sortByAttribute(): Sorts the list of movies based on the given attribute (title, release date, director, or duration) and order (asc or desc).

You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”. There will be multiple test cases running so the Input and Output should match exactly as provided.

Constraints:

1 ≤ N ≤ 100

Movie durations are given in whole minutes.

Ratings are provided as doubles.

Titles, directors, and cast members are non-empty strings without special formatting requirements.

The program should handle input in lowercase or uppercase letters interchangeably.

The search and sort operations should be case-insensitive.

Input Format:

The first input line contains the number of movies, N.

For each movie, the following details are entered in sequence:

* Movie Title

* Release Date

* Rating

* Director

* Duration (in minutes)

* Cast (comma-separated list)

After the movies are input, the next two lines specify the attribute to sort by and the order (asc for ascending, desc for descending).

The last input line is the keyword for searching movies.

Output Format:

Return the titles of movies that match the search keyword.

After performing the sort operation, return the titles of all movies in the sorted order.

Sample Input 1:

2

Inception

2010-07-16

8.8

Christopher Nolan

148

Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page

The Prestige

2006-10-20

8.5

Christopher Nolan

130

Christian Bale, Hugh Jackman, Scarlett Johansson

director

desc

Nolan

Sample Output 1:

Inception

The Prestige

Inception

The Prestige

Explanation 1:

The input consists of details for two movies followed by sorting instructions (director, desc) and a search keyword (Nolan).

The output first lists movies matching the keyword "Nolan" in the director's name.

Then, it lists all movies sorted by director in descending order. Sorting by director in descending order does not change the order in this case since both movies have the same director.

Sample Input 2:

3

Interstellar

2014-11-07

8.6

Christopher Nolan

169

Matthew McConaughey, Anne Hathaway

Inception

2010-07-16

8.8

Christopher Nolan

148

Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page

Arrival

2016-11-11

7.9

Denis Villeneuve

116

Amy Adams, Jeremy Renner

title

asc

Nolan

Sample Output 2:

Interstellar

Inception

Arrival

Inception

Interstellar

Explanation 2:

The input consists of details for three movies followed by sorting instructions (title, asc) and a search keyword (Nolan).

First, the titles of the movies matching the search keyword "Nolan" are returned:

Interstellar

Inception

Then, the system prints all movies sorted by their titles. Despite Arrival not matching the keyword Nolan, it appears in the sorted list because the sort operation applies to all movies:

Arrival

Inception

Interstellar

NOTE:

*You are free to add any other methods or classes as needed.

* Ensure that the search and sort operations are case-insensitive.

* Implement appropriate error handling for invalid input or operations.

*/




