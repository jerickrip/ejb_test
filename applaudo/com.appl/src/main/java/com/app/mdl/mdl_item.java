package com.app.mdl;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class mdl_item implements Serializable {
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long itemId;
	    private String itemName;
	    private String itemEnteredByUser;
	    private String itemEnteredDate;
	    private Double itemBuyingPrice;
	    private Double itemSellingPrice;
	    private String itemLastModifiedDate;
	    private String itemLastModifiedByUser;
	    private String itemStatus;
		public Long getItemId() {
			return itemId;
		}
		public void setItemId(Long itemId) {
			this.itemId = itemId;
		}
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemEnteredByUser() {
			return itemEnteredByUser;
		}
		public void setItemEnteredByUser(String itemEnteredByUser) {
			this.itemEnteredByUser = itemEnteredByUser;
		}
		public String getItemEnteredDate() {
			return itemEnteredDate;
		}
		public void setItemEnteredDate(String itemEnteredDate) {
			this.itemEnteredDate = itemEnteredDate;
		}
		public Double getItemBuyingPrice() {
			return itemBuyingPrice;
		}
		public void setItemBuyingPrice(Double itemBuyingPrice) {
			this.itemBuyingPrice = itemBuyingPrice;
		}
		public Double getItemSellingPrice() {
			return itemSellingPrice;
		}
		public void setItemSellingPrice(Double itemSellingPrice) {
			this.itemSellingPrice = itemSellingPrice;
		}
		public String getItemLastModifiedDate() {
			return itemLastModifiedDate;
		}
		public void setItemLastModifiedDate(String itemLastModifiedDate) {
			this.itemLastModifiedDate = itemLastModifiedDate;
		}
		public String getItemLastModifiedByUser() {
			return itemLastModifiedByUser;
		}
		public void setItemLastModifiedByUser(String itemLastModifiedByUser) {
			this.itemLastModifiedByUser = itemLastModifiedByUser;
		}
		public String getItemStatus() {
			return itemStatus;
		}
		public void setItemStatus(String itemStatus) {
			this.itemStatus = itemStatus;
		}
		public mdl_item(Long itemId, String itemName, String itemEnteredByUser, String itemEnteredDate,
				Double itemBuyingPrice, Double itemSellingPrice, String itemLastModifiedDate,
				String itemLastModifiedByUser, String itemStatus) {
			super();
			this.itemId = itemId;
			this.itemName = itemName;
			this.itemEnteredByUser = itemEnteredByUser;
			this.itemEnteredDate = itemEnteredDate;
			this.itemBuyingPrice = itemBuyingPrice;
			this.itemSellingPrice = itemSellingPrice;
			this.itemLastModifiedDate = itemLastModifiedDate;
			this.itemLastModifiedByUser = itemLastModifiedByUser;
			this.itemStatus = itemStatus;
		}
		public mdl_item() {
			super();
			// TODO Auto-generated constructor stub
		}
	   
}
