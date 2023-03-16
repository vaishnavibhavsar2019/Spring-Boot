package com.anudip.calculater;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calc {
	

	 //http://localhost:8080/add
     @RequestMapping("/add")
     public String Addition(@RequestParam(name="num1",required=true,defaultValue="15")int num1,
    		 @RequestParam(name="num2",required=true,defaultValue ="10") int num2)
     {
         int ans = num1+num2;
         return "<body bgcolor='red' text='black'><h1>Addition is :-"+ans+"</h1></center></body>";
     }
     

 	 //http://localhost:8080/sub
     @RequestMapping("/sub")
     public String Subtration(@RequestParam(name="num1",required=true,defaultValue="15")int num1,
		 @RequestParam(name="num2",required=true,defaultValue ="10") int num2)
     
      {
      int ans= num1-num2;
      return "<body bgcolor='black' text='white'><h1>substraction is :-"+ans+"</h1></center></body>";
      }

	
     //http://localhost:8080/multi
     @RequestMapping("/multi")
     public String Multiplication(@RequestParam(name="num1",required=true,defaultValue="15")int num1,
		 @RequestParam(name="num2",required=true,defaultValue ="10") int num2)
     {
     int ans = num1 *num2;
     return "<body bgcolor='white' text='red'><h1>multipication is :-"+ans+"</h1></center></body>";
     }
    

 	 //http://localhost:8080/div
     @RequestMapping("/div")
     public String division(@RequestParam(name="num1",required=true,defaultValue="15")int num1,
		 @RequestParam(name="num2",required=true,defaultValue ="10") int num2)
     {
     int ans = num1 /num2;
     return "<body bgcolor='pink' text='blue'><h1>division is :-"+ans+"</h1></center></body>";
     }
    
}