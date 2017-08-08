package com.table.Order;

import java.sql.Date;

public class Order {

	private int id;
	private int clientId;// 客戶編號
	// public int orderContentId; // 訂單內容編號
	private Date createDate;// 創建時間
	private Date shipmentDate;// 出貨時間  *出貨前提醒
	private String note;// 備註
	private int status;// 狀態 剛建立0 出貨1 未收款2 完成10

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
