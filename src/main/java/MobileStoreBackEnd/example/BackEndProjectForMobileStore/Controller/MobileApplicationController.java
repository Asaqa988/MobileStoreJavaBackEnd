package MobileStoreBackEnd.example.BackEndProjectForMobileStore.Controller;

import MobileStoreBackEnd.example.BackEndProjectForMobileStore.Model.ModelMobile;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/mobiles")
public class MobileApplicationController {

ModelMobile modelMobile ;

    @GetMapping("{mobileName}")

    public ModelMobile getModelMobile(String mobileName){

        return  modelMobile ;
    }

    @PostMapping

    public String create_New_Mobile(@RequestBody ModelMobile modelMobile ){

        this.modelMobile = modelMobile ;

        return  " the mobile has been added";
    }

//    @PutMapping
//
//    @DeleteMapping

}
