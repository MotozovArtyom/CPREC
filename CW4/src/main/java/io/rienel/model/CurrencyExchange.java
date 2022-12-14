package io.rienel.model;

import java.time.LocalDate;

import org.jetbrains.annotations.NotNull;

public class CurrencyExchange {

	public static final String TABLE_NAME = "currency_exchange";
	public static final String COLUMN_ID = "id";
	public static final String COLUMN_VALUE = "value";
	public static final String COLUMN_NOMINAL = "nominal";
	public static final String COLUMN_CURRENCY_NAME = "currency_name";
	public static final String COLUMN_CURRENCY_CODE = "currency_code";
	public static final String COLUMN_DATE = "date";

	@NotNull
	private Integer id;

	@NotNull
	private Double value;

	@NotNull
	private Integer nominal;

	@NotNull
	private String currencyName;

	@NotNull
	private String currencyCode;

	@NotNull
	private LocalDate date;

	public CurrencyExchange() {
	}

	public CurrencyExchange(@NotNull Integer id,
	                        @NotNull Double value,
	                        @NotNull Integer nominal,
	                        @NotNull String currencyName,
	                        @NotNull String currencyCode,
	                        @NotNull LocalDate date) {
		this.id = id;
		this.value = value;
		this.nominal = nominal;
		this.currencyName = currencyName;
		this.currencyCode = currencyCode;
		this.date = date;
	}

	public @NotNull Integer getId() {
		return id;
	}

	public void setId(@NotNull Integer id) {
		this.id = id;
	}

	public @NotNull Double getValue() {
		return value;
	}

	public void setValue(@NotNull Double value) {
		this.value = value;
	}

	public @NotNull Integer getNominal() {
		return nominal;
	}

	public void setNominal(@NotNull Integer nominal) {
		this.nominal = nominal;
	}

	public @NotNull String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(@NotNull String currencyName) {
		this.currencyName = currencyName;
	}

	public @NotNull String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(@NotNull String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public @NotNull LocalDate getDate() {
		return date;
	}

	public void setDate(@NotNull LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("CurrencyExchange{");
		sb.append("id=").append(id);
		sb.append(", value=").append(value);
		sb.append(", nominal=").append(nominal);
		sb.append(", currencyName='").append(currencyName).append('\'');
		sb.append(", currencyCode='").append(currencyCode).append('\'');
		sb.append(", date=").append(date);
		sb.append('}');
		return sb.toString();
	}
}
