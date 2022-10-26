package com.javarestassured.jsonObjects;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"idProduto",
"quantidade"
})
@Generated("jsonschema2pojo")
public class Items {

@JsonProperty("idProduto")
private String idProduto;
@JsonProperty("quantidade")
private Integer quantidade;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("idProduto")
public String getIdProduto() {
return idProduto;
}

@JsonProperty("idProduto")
public void setIdProduto(String idProduto) {
this.idProduto = idProduto;
}

@JsonProperty("quantidade")
public Integer getQuantidade() {
return quantidade;
}

@JsonProperty("quantidade")
public void setQuantidade(Integer quantidade) {
this.quantidade = quantidade;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}