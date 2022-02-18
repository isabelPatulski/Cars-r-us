package kea.sem3.jwtdemo.entity;

import kea.sem3.jwtdemo.dto.MemberRequest;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;



@Entity (name = "Reservation")
@DiscriminatorValue("RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @CreationTimestamp
    private LocalDateTime reservationDate;


    private LocalDate rentalDate;

    @ManyToOne
    Car rentedCar;

    @ManyToOne
    Member reservedBy;

    public Reservation(LocalDate date, Car rentedCar, Member reservedBy) {
        this.rentalDate = date;
        this.rentedCar = rentedCar;
        this.reservedBy = reservedBy;
        rentedCar.addReservation(this);
        reservedBy.addReservation(this);
    }


    @Column(name = "memberUserName", length = 45, nullable = false)
    private String memberUserName;

    public Reservation(LocalDateTime reservationDate, LocalDate rentalDate) {
        this.reservationDate = reservationDate;
        this.rentalDate = rentalDate;

    }

    public Reservation() {

    }




    public LocalDateTime getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDateTime reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(LocalDate rentalDate) {
        this.rentalDate = rentalDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
