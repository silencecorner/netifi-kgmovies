package io.github.conanchen.movies.graphql.model;

import java.util.Collection;

import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class MovieGQO implements NodeGQO{

    private String id;
    private String name;
    private String initial_release_date;
    private Collection<GenreGQO> genre;
    private Collection<PerformanceGQO> starring;

    public MovieGQO() {
    }

    public MovieGQO(String name, String initial_release_date, Collection<GenreGQO> genre, Collection<PerformanceGQO> starring) {
        this.name = name;
        this.initial_release_date = initial_release_date;
        this.genre = genre;
        this.starring = starring;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInitial_release_date() {
        return initial_release_date;
    }
    public void setInitial_release_date(String initial_release_date) {
        this.initial_release_date = initial_release_date;
    }

    public Collection<GenreGQO> getGenre() {
        return genre;
    }
    public void setGenre(Collection<GenreGQO> genre) {
        this.genre = genre;
    }

    public Collection<PerformanceGQO> getStarring() {
        return starring;
    }
    public void setStarring(Collection<PerformanceGQO> starring) {
        this.starring = starring;
    }

    @Override
	public String getId() {
		return id;
	}


}