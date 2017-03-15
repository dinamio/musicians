package service;

import dao.AreaDao;
import entity.Area;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by admin on 15.03.2017.
 */
public class AreaService {

    @Autowired
    AreaDao areaDao;

    public Area findById(Integer id) {
        return areaDao.findById(id);
    }

    public List<Area> findAll() {
        System.out.println("Amount of available addresses");
        return areaDao.findAll();
    }

    public void save(Area area) {
        areaDao.save(area);
    }

    public void delete(Integer id) {
        areaDao.delete(id);
    }
}
