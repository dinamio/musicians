package config;

import dao.AreaDao;
import dao.BandDao;
import dao.impl.BandDaoImpl;
import dao.impl.AreaDaoImpl;
import dao.impl.MongodbArtistDaoImpl;
import dao.impl.MysqlArtistDaoImpl;
import entity.Artist;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.AreaService;
import service.ArtistService;
import service.BandService;

/**
 * Created by eugen on 3/10/17.
 */
@Configuration
public class AppConfig {

    @Bean
    public Artist getArtist() {
        Artist artist = new Artist();
        artist.setName("Sviatoslav");
        artist.setSurname("Vakarchuk");
        return artist;
    }

    @Bean
    public MongodbArtistDaoImpl mongodbArtistDao() {
        return new MongodbArtistDaoImpl();
    }

    @Bean
    public MysqlArtistDaoImpl mysqlArtistDao() {
        return new MysqlArtistDaoImpl();
    }

    @Bean
    public BandDao bandDao() {
        return new BandDaoImpl();
    }

    @Bean
    public ArtistService artistService() {
        return new ArtistService();
    }

    @Bean
    public BandService bandService() {
        return new BandService();
    }

    @Bean
    public AreaDao areaDao() { return new AreaDaoImpl(); }

    @Bean
    public AreaService areaService() { return new AreaService(); }

}
