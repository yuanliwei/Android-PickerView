package com.contrarywind.adapter;


public abstract class WheelAdapter<T> {
	/**
	 * Gets items count
	 * @return the count of wheel items
	 */
	public abstract int getItemsCount();
	
	/**
	 * Gets a wheel item by index.
	 * @param index the item index
	 * @return the wheel item text or null
	 */
	public abstract T getItem(int index);
	
	/**
	 * Gets maximum item length. It is used to determine the wheel width.
	 * If -1 is returned there will be used the default wheel width.
	 * @param o  the item object
	 * @return the maximum item length or -1
     */
	public abstract int indexOf(T o);

	public T getItemCenter(int index){
		return getItem(index);
	}
}
