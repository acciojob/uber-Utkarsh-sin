package com.driver.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.driver.model.TripBooking;
import org.springframework.stereotype.Repository;

@Repository
public interface TripBookingRepository extends JpaRepository<TripBooking, Integer>{

}
