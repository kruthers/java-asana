package com.asana.models;

import com.google.gson.annotations.SerializedName;

import java.util.Collection;

public class CustomField extends ResourceWithSubtype {

    public static class EnumOption extends ResourceWithSubtype {
      public String name;
      public Boolean enabled;
      public String color;
    }

    public String name;
    public String description;
    public String type;
    @SerializedName("created_by")
    public User createdBy;
    @SerializedName("display_value")
    public String displayValue;
    public Boolean enabled;

    // Only for type "text"
    @SerializedName("text_value")
    public String textValue;

    // Only for type "number"
    public int precision;
    @SerializedName("number_value")
    public String numberValue;

    // Only for type "enum" (options are also used by "multi_enum_values")
    @SerializedName("enum_options")
    public Collection<EnumOption> enumOptions;
    @SerializedName("enum_value")
    public EnumOption enumValue;

    // Only for type "multi_enum_values"
    @SerializedName("multi_enum_values")
    public Collection<EnumOption> multiEnumValue;

    // Only for type "currency"
    @SerializedName("currency_code")
    public String currencyCode;

    // Only for type "date"
//    @SerializedName("date_value")
//    public Date customLabel; TODO

    // Only for type "people"
    @SerializedName("people_value")
    public Collection<User> peopleValue;

    // Only used for custom filed
    @SerializedName("custom_label")
    public String customLabel;
    @SerializedName("custom_label_position")
    public String customLabelPosition;
    public String format;
}
