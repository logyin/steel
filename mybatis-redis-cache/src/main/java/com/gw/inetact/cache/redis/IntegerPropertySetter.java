package com.gw.inetact.cache.redis;

public class IntegerPropertySetter<B> extends AbstractPropertySetter<Integer, B> {

	public IntegerPropertySetter(String propertyKey, String propertyName,
			Integer defaultValue) {
		super(propertyKey, propertyName, defaultValue);		
	}

	@Override
	protected Integer convert(String value) throws Throwable {
		return Integer.valueOf(value);
	}

	
}
