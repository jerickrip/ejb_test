package com.app.ctrlr;

import com.app.mdl.mdl_item;
import com.app.repo.repo_item;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.srvc.srvc_item;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ctrlr_item {
    private final srvc_item srvc_item;

    public ctrlr_item(srvc_item srvc_item) {
    	this.srvc_item = srvc_item;
    }
    
    @PostMapping
    public ResponseEntity saveItem(@RequestBody mdl_item mdl_item){
        return new ResponseEntity(srvc_item.saveItem(mdl_item),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getItem(@PathVariable("id") Long idApplItem){
        return new ResponseEntity(srvc_item.getItem(idApplItem),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modifyItem(@PathVariable("id") Long idApplItem, @RequestBody mdl_item mdl_item){
        return new ResponseEntity(srvc_item.modifyItem(idApplItem,mdl_item),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity modifyItem(@PathVariable("id") Long idApplItem){
        boolean response = srvc_item.deleteItem(idApplItem);
        if(response == true){
            return new ResponseEntity(HttpStatus.OK);
        }
        else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
