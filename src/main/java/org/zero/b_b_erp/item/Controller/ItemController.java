package org.zero.b_b_erp.item.Controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zero.b_b_erp.item.Item;
import org.zero.b_b_erp.item.ItemRepository;

import java.util.List;

@Controller
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository itemRepository;

    @GetMapping
    public String items(Model model) {

        List<Item> items = itemRepository.findAll();
        model.addAttribute("items", items);
        return "item/items";
    }

    /*
    * 테스트용 데이터 추가
    * */
    @PostConstruct
    public void init() {
        itemRepository.save(new Item("ItemA", 10000, 10));
        itemRepository.save(new Item("ItemB", 20000, 20));
        itemRepository.save(new Item("ItemC", 30000, 30));
        itemRepository.save(new Item("ItemD", 40000, 40));
        itemRepository.save(new Item("ItemE", 50000, 50));
    }
}
