package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
    public void customerSave(CustomerDTO customer) throws SQLException, ClassNotFoundException;
    public void customerUpdate(CustomerDTO customer) throws SQLException, ClassNotFoundException;
    public boolean exitCustomer(String id) throws SQLException, ClassNotFoundException;
    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

    public String newId() throws SQLException, ClassNotFoundException ;
    public String customerIds() throws SQLException, ClassNotFoundException ;
    public CustomerDTO findCustomer(String newValue) throws SQLException, ClassNotFoundException;
}
