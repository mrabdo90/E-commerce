import com.ecommerce.ecommerce.api.Model.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    private List<Item> itemList;

    @GetMapping("/items")
    public List<Item> filterItems(
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {

        List<Item> filteredItems = itemList;
        if (type != null) {
            filteredItems = filteredItems.stream()
                    .filter(item -> item.getType().equals(type))
                    .collect(Collectors.toList());
        }

        if (category != null) {
            filteredItems = filteredItems.stream()
                    .filter(item -> item.getCategory().equals(category))
                    .collect(Collectors.toList());
        }

        if (minPrice != null) {
            filteredItems = filteredItems.stream()
                    .filter(item -> item.getPrice() >= minPrice)
                    .collect(Collectors.toList());
        }

        if (maxPrice != null) {
            filteredItems = filteredItems.stream()
                    .filter(item -> item.getPrice() <= maxPrice)
                    .collect(Collectors.toList());
        }

        return filteredItems;
    }

}
