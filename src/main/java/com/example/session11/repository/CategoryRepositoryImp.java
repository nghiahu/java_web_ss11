package com.example.session11.repository;

import com.example.session11.config.ConnectionDB;
import com.example.session11.dto.CategoryDTO;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImp implements CategoryRepository {
    @Override
    public List<CategoryDTO> getAllCatalog() {
        Connection conn = null;
        CallableStatement callSt = null;
        List<CategoryDTO> categories = new ArrayList<CategoryDTO>();
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllCatalog()}");
            callSt.execute();
            ResultSet rs = callSt.getResultSet();
            while (rs.next()) {
                CategoryDTO categoryDTO = new CategoryDTO();
                categoryDTO.setId(rs.getInt("id"));
                categoryDTO.setCategoryName(rs.getString("category_name"));
                categoryDTO.setStatus(rs.getBoolean("status"));
                categories.add(categoryDTO);
            }
            return categories;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return categories;
    }

    @Override
    public CategoryDTO searchByCategoryName(String categoryName) {
        Connection conn = null;
        CallableStatement callSt = null;
        CategoryDTO categoryDTO = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call searchCatalogByName(?)}");
            callSt.setString(1, categoryName);
            callSt.execute();
            ResultSet rs = callSt.getResultSet();
            if (rs.next()) {
                categoryDTO = new CategoryDTO();
                categoryDTO.setId(rs.getInt("id"));
                categoryDTO.setCategoryName(rs.getString("category_name"));
                categoryDTO.setStatus(rs.getBoolean("status"));
                return categoryDTO;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return categoryDTO;
    }

    @Override
    public boolean addNewCategory(CategoryDTO categoryDTO) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call addCatalog(?,?)}");
            callSt.setString(1, categoryDTO.getCategoryName());
            callSt.setBoolean(2, categoryDTO.isStatus());
            callSt.execute();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return false;
    }

    @Override
    public boolean updateCategory(CategoryDTO categoryDTO) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call updateCatalog(?,?,?)}");
            callSt.setInt(1, categoryDTO.getId());
            callSt.setString(2, categoryDTO.getCategoryName());
            callSt.setBoolean(3, categoryDTO.isStatus());
            callSt.execute();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return false;
    }

    @Override
    public boolean deleteCategory(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call deleteCatalog(?)}");
            callSt.setInt(1, id);
            callSt.execute();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return false;
    }

    @Override
    public CategoryDTO getCategoryById(int id) {
        Connection conn = null;
        CallableStatement callSt = null;
        CategoryDTO categoryDTO = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getCataById(?)}");
            callSt.setInt(1, id);
            callSt.execute();
            ResultSet rs = callSt.getResultSet();
            if (rs.next()) {
                categoryDTO = new CategoryDTO();
                categoryDTO.setId(rs.getInt("id"));
                categoryDTO.setCategoryName(rs.getString("category_name"));
                categoryDTO.setStatus(rs.getBoolean("status"));
                return categoryDTO;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return categoryDTO;
    }
}
