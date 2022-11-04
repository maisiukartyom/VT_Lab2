package by.moyart.services.ServiceImpl;

import by.moyart.services.Service.ItemService;
import by.moyart.dao.ItemDAO;
import by.moyart.daoImpl.ItemDAOImpl;
import by.moyart.entity.Fridge;
import by.moyart.entity.Kettle;
import by.moyart.entity.TV;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    ItemDAO itemDAO = new ItemDAOImpl();

    @Override
    public List<Kettle> getKettles() {
        return itemDAO.getKettles();
    }

    @Override
    public List<TV> getTVs() {
        return itemDAO.getTVs();
    }

    @Override
    public List<Fridge> getFridges() {
        return itemDAO.getFridges();
    }
}
