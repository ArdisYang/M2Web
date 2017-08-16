package com.table.Personnel;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import com.table.BasicAccount.BasicAccount;
import com.table.PositionType.PositionType;


@Entity
@Table(name = "Personnel")
// @SecondaryTable(name = "PositionType")
// @SecondaryTables({
// @SecondaryTable(name = "PositionType", pkJoinColumns = {
// @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "positionTypeID")
// }),
// @SecondaryTable(name = "BasicAccount", pkJoinColumns = {
// @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "basicAccountID")
// }) })
public class Personnel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "positionType_id")
	private PositionType positionType;
//	@Column(name = "positionTypeID")
//	private int positionTypeID; // 職務PositionTypeid
	
	@OneToOne(cascade = CascadeType.ALL)
	private BasicAccount basicAccount;// 帳號
	
//	@Column(name = "basicAccountID")
//	private int basicAccountID;
	
	private String name;
	private int[] permissions;// 權限 如: 剛創建=0 最低 一般員工=1~3 會計(帳務操作)4 出納5 或是說 "角色"
								// 會對應到開放的功能
	private String nationality;// 國籍
	private Date birthday;
	private int gender;// 性別
	private String telephone;// 電話
	private String phone;// 手機
	private String emergentContactPerson;// 緊急聯絡人
	private String emergentContactNumber;// 緊急連絡電話
	private String note;// 備註
	private int status;// 狀態 離職0/在職1
	private String paySystem;// 薪制
	private Date dateOfWork;// 上班日
	private Date lastModifiedDate;// 最後修改日期
	private Date createDate;// 創建時間

	public Personnel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BasicAccount getBasicAccount() {
		return basicAccount;
	}

	public void setBasicAccount(BasicAccount basicAccount) {
		this.basicAccount = basicAccount;
	}

//	public int getBasicAccountID() {
//		return basicAccountID;
//	}
//
//	public void setBasicAccountID(int basicAccountID) {
//		this.basicAccountID = basicAccountID;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PositionType getPositionType() {
		return positionType;
	}

	public void setPositionType(PositionType positionType) {
		this.positionType = positionType;
	}

//	public int getPositionTypeID() {
//		return positionTypeID;
//	}
//
//	public void setPositionTypeID(int positionTypeID) {
//		this.positionTypeID = positionTypeID;
//	}

	public int[] getPermissions() {
		return permissions;
	}

	public void setPermissions(int[] permissions) {
		this.permissions = permissions;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmergentContactPerson() {
		return emergentContactPerson;
	}

	public void setEmergentContactPerson(String emergentContactPerson) {
		this.emergentContactPerson = emergentContactPerson;
	}

	public String getEmergentContactNumber() {
		return emergentContactNumber;
	}

	public void setEmergentContactNumber(String emergentContactNumber) {
		this.emergentContactNumber = emergentContactNumber;
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

	public String getPaySystem() {
		return paySystem;
	}

	public void setPaySystem(String paySystem) {
		this.paySystem = paySystem;
	}

	public Date getDateOfWork() {
		return dateOfWork;
	}

	public void setDateOfWork(Date dateOfWork) {
		this.dateOfWork = dateOfWork;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
