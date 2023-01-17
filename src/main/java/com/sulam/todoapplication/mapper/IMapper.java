package com.sulam.todoapplication.mapper;

public interface IMapper<I, O >{
    public O map(I in);
}
