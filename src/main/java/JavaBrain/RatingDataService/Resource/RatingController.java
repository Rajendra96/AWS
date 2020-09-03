package JavaBrain.RatingDataService.Resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JavaBrain.RatingDataService.Model.Rating;
import JavaBrain.RatingDataService.Model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@RequestMapping("/{movieId}")
	public Rating getRatingInfo(@PathVariable("movieId") String movieId){
		
		return new Rating(movieId, 5);
	}
	
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String movieId){
		
		List<Rating> ratings=Arrays.asList(
				new Rating("1234",1),
				new Rating("5678",2)
				);
		
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);		
		
		return userRating;
	}
	
}
