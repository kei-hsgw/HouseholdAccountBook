package com.example.form;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.domain.ExpenseItem;
import com.example.domain.Settlement;

public class EditKakeiboForm {

	/** 家計簿Id */
	private long id;
	/** ユーザーId */
	private Integer userId;
	/** 決済日付 */
	@NotNull(message = "日付を指定してください")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate settlementDate;
	/** 費目Id */
	@NotNull(message = "費目を選択してください")
	private Integer expenseItemId;
	/** 支出金額 */
	@PositiveOrZero(message = "数値を0か整数で入力してください")
	@Range(min = 0, max = 99999999, message = "数値は8桁(0~99999999)まで入力できます")
	@Digits(integer = 8, fraction = 0, message = "小数点以下は入力できません")
	private String expenditureAmount;
	/** 収入金額 */
	@PositiveOrZero(message = "数値を0か整数で入力してください")
	@Range(min = 0, max = 99999999, message = "数値は8桁(0~99999999)まで入力できます")
	@Digits(integer = 8, fraction = 0, message = "小数点以下は入力できません")
	private String incomeAmount;
	/** 決済Id */
	private Integer settlementId;
	/** 利用店舗 */
	private String usedStore;
	/** 備考 */
	private String remarks;
	/** 更新日 */
	private Timestamp updateAt;
	/** 費目 */
	private ExpenseItem expenseItem;
	/** 決済 */
	private Settlement settlement;

	public EditKakeiboForm() {
	}

	/**
	 * 編集の際にデフォルトで表示するコンストラクタを準備
	 * 
	 * @param id
	 * @param userId
	 * @param settlementDate
	 * @param expenseItemId
	 * @param expenditureAmount
	 * @param incomeAmount
	 * @param settlementId
	 * @param usedStore
	 * @param remarks
	 * @param updateAt
	 * @param expenseItem
	 * @param settlement
	 */
	public EditKakeiboForm(long id, Integer userId, @NotNull(message = "日付を指定してください") LocalDate settlementDate,
			@NotNull(message = "費目を選択してください") Integer expenseItemId,
			@PositiveOrZero(message = "数値を0か整数で入力してください") @Range(min = 0, max = 99999999, message = "数値は8桁(0~99999999)まで入力できます") @Digits(integer = 8, fraction = 0, message = "小数点以下は入力できません") String expenditureAmount,
			@PositiveOrZero(message = "数値を0か整数で入力してください") @Range(min = 0, max = 99999999, message = "数値は8桁(0~99999999)まで入力できます") @Digits(integer = 8, fraction = 0, message = "小数点以下は入力できません") String incomeAmount,
			Integer settlementId, String usedStore, String remarks, Timestamp updateAt, ExpenseItem expenseItem,
			Settlement settlement) {
		super();
		this.id = id;
		this.userId = userId;
		this.settlementDate = settlementDate;
		this.expenseItemId = expenseItemId;
		this.expenditureAmount = expenditureAmount;
		this.incomeAmount = incomeAmount;
		this.settlementId = settlementId;
		this.usedStore = usedStore;
		this.remarks = remarks;
		this.updateAt = updateAt;
		this.expenseItem = expenseItem;
		this.settlement = settlement;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public LocalDate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(LocalDate settlementDate) {
		this.settlementDate = settlementDate;
	}

	public Integer getExpenseItemId() {
		return expenseItemId;
	}

	public void setExpenseItemId(Integer expenseItemId) {
		this.expenseItemId = expenseItemId;
	}

	public String getExpenditureAmount() {
		return expenditureAmount;
	}

	public void setExpenditureAmount(String expenditureAmount) {
		this.expenditureAmount = expenditureAmount;
	}

	public String getIncomeAmount() {
		return incomeAmount;
	}

	public void setIncomeAmount(String incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public Integer getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Integer settlementId) {
		this.settlementId = settlementId;
	}

	public String getUsedStore() {
		return usedStore;
	}

	public void setUsedStore(String usedStore) {
		this.usedStore = usedStore;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Timestamp getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Timestamp updateAt) {
		this.updateAt = updateAt;
	}

	public ExpenseItem getExpenseItem() {
		return expenseItem;
	}

	public void setExpenseItem(ExpenseItem expenseItem) {
		this.expenseItem = expenseItem;
	}

	public Settlement getSettlement() {
		return settlement;
	}

	public void setSettlement(Settlement settlement) {
		this.settlement = settlement;
	}

	@Override
	public String toString() {
		return "EditKakeibo [id=" + id + ", userId=" + userId + ", settlementDate=" + settlementDate
				+ ", expenseItemId=" + expenseItemId + ", expenditureAmount=" + expenditureAmount + ", incomeAmount="
				+ incomeAmount + ", settlementId=" + settlementId + ", usedStore=" + usedStore + ", remarks=" + remarks
				+ ", updateAt=" + updateAt + ", expenseItem=" + expenseItem + ", settlement=" + settlement + "]";
	}

}
