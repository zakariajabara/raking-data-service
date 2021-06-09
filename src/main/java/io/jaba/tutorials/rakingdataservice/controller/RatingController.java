package io.jaba.tutorials.rakingdataservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.jaba.tutorials.rakingdataservice.models.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@RequestMapping("/{bookId}")
	public Rating getRatting(@PathVariable("bookId") String bookId) {
		return new Rating(bookId, 4);
	}

}
