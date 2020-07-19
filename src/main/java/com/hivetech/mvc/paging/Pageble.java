package com.hivetech.mvc.paging;


import com.hivetech.mvc.sort.Sorter;

public interface Pageble {
	Integer getPage();
	Integer getOffset();
	Integer getLimit();
	Sorter getSorter();
}
