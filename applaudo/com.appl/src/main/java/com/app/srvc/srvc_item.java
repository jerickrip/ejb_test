package com.app.srvc;

import com.app.mdl.mdl_item;

import java.util.Optional;

public interface srvc_item {
    mdl_item saveItem(mdl_item appl_item);
    //Optional<mdl_item> getItem(Long idApplItem);
    mdl_item getItem(Long idApplItem);
    mdl_item modifyItem(Long Id, mdl_item modifyItem);
    Boolean deleteItem(Long Id);
}
