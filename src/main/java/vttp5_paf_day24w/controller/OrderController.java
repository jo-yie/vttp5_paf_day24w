package vttp5_paf_day24w.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vttp5_paf_day24w.model.Order;
import vttp5_paf_day24w.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService; 

    @GetMapping("")
    public String getHome(Model model) { 

        Order order = new Order(); 
        model.addAttribute("order", order);

        return "home";

    } 

    @ResponseBody
    @PostMapping("/order")
    public ResponseEntity<Object> postOrder(@ModelAttribute Order order) {

        int isSuccess = orderService.insertOrder(order);

        return ResponseEntity.ok()
            .body(Map.of("order", order,
                "isSuccess", isSuccess));

    }
    
}
