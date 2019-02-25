package exe05;

import java.util.List;

public class Movie {
    private String title;
    private List<String> genres;
    private Long revenue;
    private Integer runtime;


    public Movie(String title, List<String> genres, Long revenue, Integer runtime) {
        this.title = title;
        this.genres = genres;
        this.revenue = revenue;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getGenres() {
        return genres;
    }

    public Long getRevenue() {
        return revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }
}
