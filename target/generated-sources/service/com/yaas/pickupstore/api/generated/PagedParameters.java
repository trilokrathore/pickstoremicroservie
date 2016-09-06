package com.yaas.pickupstore.api.generated;

/**
 * Generated parameter dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Sat Sep 03 23:00:21 IST 2016")
public class PagedParameters
{
	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.DefaultValue("1")	@javax.ws.rs.QueryParam("pageNumber")
	private java.lang.Integer pageNumber;

	@javax.validation.constraints.DecimalMin(value="1")
	@javax.ws.rs.DefaultValue("16")	@javax.ws.rs.QueryParam("pageSize")
	private java.lang.Integer pageSize;

	public java.lang.Integer getPageNumber()
	{
		return pageNumber;
	}

	public java.lang.Integer getPageSize()
	{
		return pageSize;
	}

	public void setPageNumber(final java.lang.Integer pageNumber)
	{
		this.pageNumber = pageNumber;
	}

	public void setPageSize(final java.lang.Integer pageSize)
	{
		this.pageSize = pageSize;
	}

}
