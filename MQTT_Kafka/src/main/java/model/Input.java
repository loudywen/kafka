package model;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Generated("org.jsonschema2pojo")
public class Input implements java.io.Serializable{

	@SerializedName("d")
	@Expose
	private TempObject d;

	/**
	 * 
	 * @return The d
	 */
	public TempObject getD() {
		return d;
	}

	/**
	 * 
	 * @param d
	 *            The d
	 */
	public void setD(TempObject d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}