import config.AppConfig;
import dao.ArtistDao;
import entity.Area;
import entity.Artist;
import entity.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.AreaService;
import service.ArtistService;
import service.BandService;
import service.EventService;

/**
 * Created by eugen on 3/3/17.
 */
public class MusicMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AreaService areaService = context.getBean(AreaService.class);
        System.out.println(areaService.findAll());
        /*areaService.save(generateArea());
        System.out.println(areaService.findAll());*/
        System.out.println(areaService.getAreaByName("Jazz*"));
    }

    private static Area generateArea() {
        Area area = new Area();
        area.setName("Jazzter");
        area.setAddress("Poetry square");
        area.setNumOfPlaces(100);
        return area;
    }

}

