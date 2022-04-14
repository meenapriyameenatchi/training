package com.training.ifaces;
@FunctionalInterface

public interface Convereter <T,R>{
	public R convert(T value);

}
