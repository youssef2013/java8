package fr.ybf.ocpjp.model;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Person {

	private int age;

	private String name;

	private String country;

	public boolean equals(Object obj) {
		// return EqualsBuilder.reflectionEquals(this, obj);
		if (!(obj instanceof Person)) {
			return false;
		}
		Person p = (Person) obj;
		StringUtils.isNotBlank("");
		return new EqualsBuilder()
				.appendSuper(super.equals(obj))
				.append(age, p.age)
				.append(name, p.name)
				.isEquals();
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	
}
