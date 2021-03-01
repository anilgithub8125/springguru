package service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class JokeServiceImpl implements JokeService {

	private ChuckNorrisQuotes quotes;

	public JokeServiceImpl() {
		this.quotes = new ChuckNorrisQuotes();
	}
	

	public String getQuote() {
		return quotes.getRandomQuote();
	}
	
}
