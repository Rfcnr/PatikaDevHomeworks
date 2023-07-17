package com.patika.tourism.model;

import com.patika.tourism.helper.MyDbConnector;
import com.patika.tourism.helper.MyDbConstants;
import com.patika.tourism.helper.MyHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Season {
    private int id;
    private LocalDate startDate;
    private LocalDate endDate;

    public Season() {
    }

    public Season(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public static boolean add(LocalDate startDate, LocalDate endDate){
        boolean result = false;
        String query = "INSERT INTO " + MyDbConstants.DB_TN_SEASON + " (start_date, end_date) VALUES (?, ?)";

        try {
            PreparedStatement ps = MyDbConnector.getInstance().prepareStatement(query);
            ps.setString(1, startDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            ps.setString(2, endDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

            result = (ps.executeUpdate() > 0);

            ps.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        if(!result) MyHelper.showMessage("Operation failed! There was an error adding a season.", "Error");

        return result;
    }

    private static Season fetchSeasonFromDbByID(int seasonID){
        Season season = null;

        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ").append(MyDbConstants.DB_TN_SEASON).append(" WHERE id= ").append(seasonID);

        Statement statement = null;
        try {
            statement = MyDbConnector.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(query.toString());

            while (resultSet.next()){
                season = new Season();
                season.setId(resultSet.getInt("id"));

                DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                season.setStartDate(LocalDate.parse(resultSet.getString("start_date"), dtFormatter));
                season.setEndDate(LocalDate.parse(resultSet.getString("end_date"), dtFormatter));
            }
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.getMessage();
        }
        return season;
    }

    public static ArrayList<Season> fetchSeasonsFromDbByHotelID(int hotelID) {
        ArrayList<Season> hotelSeasons = new ArrayList<>();

        StringBuilder query = new StringBuilder();
        query.append("SELECT * FROM ").append(MyDbConstants.DB_TN_HOTEL_SEASON).append(" WHERE hotel_id= ").append(hotelID);

        ArrayList<Integer> seasonIdList = new ArrayList<>();

        try {
            Statement statement = MyDbConnector.getInstance().createStatement();
            ResultSet resultSet = statement.executeQuery(query.toString());

            while (resultSet.next()){
                seasonIdList.add(resultSet.getInt("season_id"));
            }
        } catch (SQLException e) {
            e.getMessage();
        }

        for (Integer id : seasonIdList){
            Season season = fetchSeasonFromDbByID(id);
            if(season != null) hotelSeasons.add(season);
        }
        return hotelSeasons;
    }

    public static Season fetchSeasonFromDbByStartAndEndDates(LocalDate startDate, LocalDate endDate){
        Season season = null;

        String query = "SELECT * FROM " + MyDbConstants.DB_TN_SEASON + " WHERE start_date = ? AND end_date = ?";

        try {
            PreparedStatement ps = MyDbConnector.getInstance().prepareStatement(query);
            ps.setString(1, startDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            ps.setString(2, endDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()){
                season = new Season();
                season.setId(resultSet.getInt("id"));

                DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                season.setStartDate(LocalDate.parse(resultSet.getString("start_date"), dtFormatter));
                season.setEndDate(LocalDate.parse(resultSet.getString("end_date"), dtFormatter));
            }
            ps.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return season;
    }

}
