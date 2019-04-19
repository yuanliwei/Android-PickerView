package com.bigkoo.pickerview.adapter;

import com.contrarywind.adapter.WheelAdapter;
import com.contrarywind.interfaces.IPickerViewData;

import java.util.List;

/**
 * The simple Array wheel adapter
 *
 * @param <T> the element type
 */
public class ArrayWheelAdapter<T> extends WheelAdapter {


    // items
    private List<T> items;

    /**
     * Constructor
     *
     * @param items the items
     */
    public ArrayWheelAdapter(List<T> items) {
        this.items = items;

    }

    @Override
    public Object getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return "";
    }

    @Override
    public Object getItemCenter(int index) {
        if (index >= 0 && index < items.size()) {
            return "#" + getContentText(items.get(index)) + "#" + getContentText(items.get(index));
        }
        return "";
    }

    private String getContentText(Object item) {
        if (item == null) {
            return "";
        } else if (item instanceof IPickerViewData) {
            return ((IPickerViewData) item).getPickerViewText();
        } else if (item instanceof Integer) {
            //如果为整形则最少保留两位数.
            return getFixNum((int) item);
        }
        return item.toString();
    }

    private static final String[] TIME_NUM = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09"};

    private String getFixNum(int timeNum) {
        return timeNum >= 0 && timeNum < 10 ? TIME_NUM[timeNum] : String.valueOf(timeNum);
    }

    @Override
    public int getItemsCount() {
        return items.size();
    }

    @Override
    public int indexOf(Object o) {
        return items.indexOf(o);
    }

}
