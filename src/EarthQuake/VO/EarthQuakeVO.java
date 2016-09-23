/**
 * BotSturdy
 * EarthQuakeVO.java
 * 3574
 * 2016. 9. 21.
 */
package EarthQuake.VO;

import java.util.Date;

/**
 * @author 3574
 *
 */
public class EarthQuakeVO {
	
	private int num;							// ��ȣ(index)
	private Date earthQuakeTime;				// ���� �߻��ð�
	private double earthQuakeSacle;				// ���� �Ը�
	private double latitude;					// ����
	private double longitude;					// �浵
	private String earthQuakeArea;				// ���� �߻�����
	private String earthQuakeFullInfo;			// �ֱ� ���� ��ü ����
	
	// ������ ���� index ��
	private int lastCount;					// ���� �ֱٹ�ȣ

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Date getEarthQuakeTime() {
		return earthQuakeTime;
	}

	public void setEarthQuakeTime(Date earthQuakeTime) {
		this.earthQuakeTime = earthQuakeTime;
	}

	public double getEarthQuakeSacle() {
		return earthQuakeSacle;
	}

	public void setEarthQuakeSacle(double earthQuakeSacle) {
		this.earthQuakeSacle = earthQuakeSacle;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getEarthQuakeArea() {
		return earthQuakeArea;
	}

	public void setEarthQuakeArea(String earthQuakeArea) {
		this.earthQuakeArea = earthQuakeArea;
	}

	public String getEarthQuakeFullInfo() {
		return earthQuakeFullInfo;
	}

	public void setEarthQuakeFullInfo(String earthQuakeFullInfo) {
		this.earthQuakeFullInfo = earthQuakeFullInfo;
	}

	public int getLastCount() {
		return lastCount;
	}

	public void setLastCount(int lastCount) {
		this.lastCount = lastCount;
	}

	@Override
	public String toString() {
		return "EarthQuakeVO [num=" + num + ", earthQuakeTime=" + earthQuakeTime + ", earthQuakeSacle="
				+ earthQuakeSacle + ", latitude=" + latitude + ", longitude=" + longitude + ", earthQuakeArea="
				+ earthQuakeArea + ", earthQuakeFullInfo=" + earthQuakeFullInfo + ", lastCount=" + lastCount + "]";
	}
	
	
}
