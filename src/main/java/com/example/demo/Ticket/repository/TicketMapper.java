package com.example.demo.Ticket.repository;

import java.util.List;

//import org.apache.ibatis.annotations.Delete;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Param;
//import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;


public interface TicketMapper {
    //@Select("select park_price1 from park_name = {name}")
    public List<TicketModel> findPrice1(int ticket_price1);
}
