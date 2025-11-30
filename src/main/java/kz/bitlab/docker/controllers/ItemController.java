package kz.bitlab.docker.controllers;

import kz.bitlab.docker.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("items", itemService.getItems());
        return "index";
    }
    @PostMapping(value = "add")
    public String addItem(@RequestParam(value = "item_name") String itemName,
                          @RequestParam(value = "item_price") int itemPrice){
        itemService.addItem(itemName, itemPrice);
        return "redirect:/";
    }



}