package dao.impl;

import dao.ArtistDao;
import entity.Artist;
import org.springframework.stereotype.Component;

/**
 * Created by eugen on 3/10/17.
 */
public class MysqlArtistDaoImpl implements ArtistDao {

    public Artist findById(Integer id) {

        return new Artist("Mysql_name","Mysql_surname");
    }
}
