package com.spring.guru.jokes.controller;


  import org.springframework.stereotype.Controller; 
  import org.springframework.ui.Model;
  import org.springframework.web.bind.annotation.GetMapping;

 
  
  @Controller public class JokeController {
  
  
  private final com.spring.guru.jokes.service.JokeService service;
  
  
  public JokeController() {
	  this.service = new com.spring.guru.jokes.service.JokeServiceImpl();
	  }
  
  
  
  @GetMapping("/")
  
  public String getmsg(Model model) {
  model.addAttribute("joke",service.getQuote());
  return "hello"; }
  
  }
 





/*
 * import org.springframework.stereotype.Controller; import
 * org.springframework.ui.Model; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestParam;
 * 
 * @Controller public class JokeController {
 * 
 * @GetMapping({ "/", "/hello" }) public String hello(@RequestParam(value =
 * "name", defaultValue = "World", required = true) String name, Model model) {
 * model.addAttribute("name", name); return "hello"; } }
 */