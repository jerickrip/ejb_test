package com.app.srvc;

import com.app.mdl.mdl_item;
import com.app.repo.repo_item;
import lombok.*;
import org.springframework.stereotype.Service;
import com.app.repo.repo_item;

import java.util.Optional;

@Service
public class srvc_itemImpl implements srvc_item {
    private final repo_item repo_item ;

    public srvc_itemImpl(repo_item repo_item) {
    	this.repo_item = repo_item;
    }
    
    @Override
    public mdl_item saveItem(mdl_item mdl_item) {
        return repo_item.save(mdl_item);
    }

    @Override
    public mdl_item getItem(Long idApplItem) {
        return repo_item.findById(idApplItem).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public mdl_item modifyItem(Long Id, mdl_item modifyItem) {
    	mdl_item searchedItem = repo_item.findById(Id).get();
    	//searchedItem.setItemName(modifyItem.getItemName());
        //searchedItem.setItemEnteredByUser(modifyItem.getItemEnteredByUser());
        repo_item.save(searchedItem);
        return null;
    }

    @Override
    public Boolean deleteItem(Long Id) {
        try {
            repo_item.deleteById(Id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }
}
