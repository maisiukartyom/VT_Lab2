package by.moyart.services.Service;

import by.moyart.entity.Fridge;
import by.moyart.entity.Kettle;
import by.moyart.entity.TV;

import java.util.List;

public interface ItemService {
    /**
     * @return возвращает список объектов типа Kettle
     */
    List<Kettle> getKettles();
    /**
     * @return возвращает список объектов типа TV
     */
    List<TV> getTVs();
    /**
     * @return возвращает список объектов типа Fridge
     */
    List<Fridge> getFridges();
}
