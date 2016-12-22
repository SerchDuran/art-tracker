package com.sduran.api.web.resource;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressResource {
    public String address;
}

