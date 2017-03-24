package dao.impl;

import dao.ArtistDao;
import entity.Artist;
import org.springframework.stereotype.Component;

/**
 * Created by eugen on 3/10/17.
 */
public class MongodbArtistDaoImpl implements ArtistDao {

    public Artist findById(Integer id) {
        return new Artist("mongo name", "mongo surname");
    }
}
