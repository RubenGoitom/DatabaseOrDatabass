package com.work.chinoog.helper;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class ChunkRequest implements Pageable {

    // offset is the starting point of the data to be retrieved
    private final int offset;
    // limit is the number of data to be retrieved
    private final int limit;

    // this attribute can be let out if you don't need it
    private Sort sort;

    // constructor to set the offset and limit, and sort if provided
    public ChunkRequest(int offset, int limit, Sort sort) {
        // check if offset is less than zero, throw an error
        if (offset < 0)
            throw new IllegalArgumentException("Offset must not be less than zero!");

        // check if limit is less than zero, throw an error
        if (limit < 0)
            throw new IllegalArgumentException("Limit must not be less than zero!");

        // set the offset and limit
        this.offset = offset;
        this.limit = limit;

        // set the sort if provided
        if (sort != null) {
            this.sort = sort;
        }
    }


    // constructor to set the offset and limit without sort
    public ChunkRequest(int offset, int limit) {
        this(offset, limit, null);
    }

    // implementation of Pageable interface
    @Override
    public int getPageNumber() { return 0; }

    @Override
    public int getPageSize() { return limit; }

    @Override
    public long getOffset() { return offset; }

    @Override
    public Sort getSort() { return this.sort; }

    @Override
    public Pageable next() { return null; }

    @Override
    public Pageable previousOrFirst() { return this; }

    @Override
    public Pageable first() { return this; }

    @Override
    public Pageable withPage(int pageNumber) { return null; }

    @Override
    public boolean hasPrevious() { return false; }
}