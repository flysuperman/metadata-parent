package com.sailing.bdip.metadata.common.constants;

/**
 * 枚举常量
 */

public enum  EnumConstants {

    INFO("INFO","信息"),
    ERROR("ERROR","错误");

    private String key;
    private String value;

    /**
     * 构造器默认也只能是private, 从而保证构造函数只能在内部使用
     * @param key
     * @param value
     */
    private EnumConstants(String key,String value){
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 根据key获取value
     * @param key key
     * @return key对应的值
     */
    public static String getValue(String key){
        String result = "";
        EnumConstants[] allEnums = EnumConstants.values();
        for (EnumConstants enumValue:allEnums) {
            if(enumValue.value.equalsIgnoreCase(key)){
                result = enumValue.value;
                break;
            }
        }
        return  result;
    }

    /**
     * 根据value获取key
     * @param key key
     * @return key对应的值
     */
    public static String getKey(String value){
        String result = "";
        EnumConstants[] allEnums = EnumConstants.values();
        for (EnumConstants enumValue:allEnums) {
            if(enumValue.value.equalsIgnoreCase(value)){
                result = enumValue.key;
                break;
            }
        }
        return  result;
    }

    @Override
    public String toString() {
        return this.key + ":" + this.value;
    }
}
