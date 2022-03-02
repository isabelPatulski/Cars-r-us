package kea.sem3.jwtdemo.api;

import kea.sem3.jwtdemo.service.CarService;
import kea.sem3.jwtdemo.service.ReservationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

    @RequestMapping("api/reservation")
    public class ReservationController {

        ReservationService reservationService;

        public ReservationController(ReservationService reservationService) {
            this.reservationService = reservationService;
        }
}
