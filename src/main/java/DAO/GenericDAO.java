package DAO;

import java.sql.SQLException;
import java.util.List;

//Пример как можно создать одни интерфейс вместо 4, но не понятно как его использовать, так как вместо Object
//нужно передать классы Address, Employee ...
public interface GenericDAO<T, U> {

        void add(T object) throws SQLException;
        List<T> getAll() throws SQLException;
        T getById(U id) throws SQLException;
        void update(T object) throws SQLException;
        void remove(T object) throws SQLException;

}
