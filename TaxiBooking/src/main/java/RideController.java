

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ride")
public class RideController {
	
	@Autowired
    private RideRepository rideRespository;
	
	@GetMapping("/all")
    public List<Ride> getAllride() {
        return (List<Ride>) rideRespository.findAll();
    }
	
	@PostMapping("/add-course")
    public Ride addRide(@RequestBody Ride ride) {
        return rideRespository.save(ride);
    }
	
	
	@GetMapping("/ride/{id}")
    public Ride getRideById(@PathVariable String id) {
        Optional<Ride> rideOptional = rideRespository.findById(id);
        return rideOptional.orElse(null);
    }

}
