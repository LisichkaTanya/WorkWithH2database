package DAO;

import java.sql.SQLException;
import java.util.List;

//Пример как можно создать одни интерфейс вместо 4, но не понятно как его использовать, так как вместо Object
//нужно передать классы Address, Employee ...
public interface CrudDAO<T, U> {

        void add(T object) throws SQLException;
        List<T> getAll() throws SQLException;
        T findById(U id) throws SQLException;
        void updateOne(T object) throws SQLException;
        void deleteOne(T object) throws SQLException;

}
