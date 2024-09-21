package paul.algorithmboard.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : paulkim
 * @description :
 * @packageName : paul.algorithmboard.controller
 * @fileName : MainController
 * @date : 2024-09-14
 */
@RestController
@AllArgsConstructor
@Slf4j
@Transactional(readOnly = true)
@RequestMapping(path ="/board")
public class MainController {
    @GetMapping("")
    public String hi(){
        return "안뇽";
    }
}
