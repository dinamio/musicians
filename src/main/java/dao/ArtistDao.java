package dao;

import entity.Artist;

/**
 * Created by eugen on 3/10/17.
 */
public interface ArtistDao {

    Artist findById(Integer id);
}
