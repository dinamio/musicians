package service;

import dao.ArtistDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by eugen on 3/10/17.
 */
public class ArtistService {

    @Autowired
    ArtistDao mongodbArtistDao;

    @Autowired
    ArtistDao mysqlArtistDao;

    public void printArtist() {
        System.out.println(mongodbArtistDao.findById(1));
        System.out.println(mysqlArtistDao.findById(1));
    }
}
