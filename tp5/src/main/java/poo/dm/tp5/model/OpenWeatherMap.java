package poo.dm.tp5.model;


public class OpenWeatherMap {
	
	private float latitude;
	private float longitude;
	private String timezone;
	private Currently CurrentParametersObject;
	private float offset;
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public Currently getCurrentParametersObject() {
		return CurrentParametersObject;
	}
	public void setCurrentParametersObject(Currently currentParametersObject) {
		CurrentParametersObject = currentParametersObject;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}

}
