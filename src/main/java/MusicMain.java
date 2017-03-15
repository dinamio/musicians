import config.AppConfig;
import dao.ArtistDao;
import entity.Artist;
import entity.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AreaService;
import service.ArtistService;
import service.BandService;

/**
 * Created by eugen on 3/3/17.
 */
public class MusicMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ArtistService service = context.getBean(ArtistService.class);
        BandService bandService = context.getBean(BandService.class);
        AreaService areaService = context.getBean(AreaService.class);
        bandService.findById(1);
        areaService.findAll();
        service.printArtist();
    }

}

