/**
 * BotSturdy
 * EarthQuakeEnum.java
 * 3574
 * 2016. 9. 21.
 */
package EarthQuake.VO;

/**
 * @author 3574
 *
 */
public enum EarthQuakeEnum {
	URL ("URL","http://necis.kma.go.kr/necis-dbf/user/earthquake/annual_earthquake.do"),
	LASTEARTHQUAKE_ELEMENTS ("LASTEARTHQUAKE_ELEMENTS","div.yearly_earthquake tbody tr"),
	GOOGLE_MAP ("GOOGLE_MAP","http://maps.google.com/maps?q="),
	//2.9�̸�
	LEVEL_1 ("LEVEL_1","�ؼҼ��� ����� �����ϰ�� ���� ���� �� ���� ����"),
	//3~4 ����
	LEVEL_2 ("LEVEL_2","�Ҽ��� �����, Ư�� �ǹ��� �� ���� �ִ� �Ҽ��� ����鸸 ���� �� �ִ� �������� �����ϰ� �Ŵ޸� ��ü ����"),
	//4~5 ����
	LEVEL_3 ("LEVEL_3","���� ��� ������� ������ ����\n�㿡 ���� ���� �׸�, â��, �� ���� �Ҷ��ϸ� ���� �������� �Ҹ��� ��. ���� Ʈ���� ���� �޴� ������ �ְ� �����ϰ� �ִ� �ڵ����� �������� �ѷ���"),
	//5~6 ����
	LEVEL_4 ("LEVEL_4","��� ������� ������ �پ� ������ ���� \n�� ����� �ǹ��� ���ذ� ���� �� ������ ���� ���๰���� �ణ�� ���ذ� ������, �ν��� ���๰���� ū ���ذ� �߻��ϰ� �����ڰ� ���� �� ����."),
	//6~7 ����
	LEVEL_5 ("LEVEL_5","â���� �������� ����, ���, ������ ������. ���ſ� ������ ������ ���� �𷡿� ������ �ھƳ�. �칰 ������ ���ϰ� �����ڰ� ���ظ� ����."),
	//7 ���� �̻�
	LEVEL_6 ("LEVEL_6","������ �μ����� ���� ���� �տ��� �߻��Ǹ�, ���� �������� ������ �ı���. ������ ���� ǫ ������ ������ ��߳���, �������ΰ� ���ϰ� �־���.\n��ǥ�鿡 �ĵ��� ���̰� �þ߿� ������� ��Ʋ���� ��ü�� �ϴ÷� ������."),
	
	LASTCOUNT_ELEMENTS ("LASTCOUNT_ELEMENTS","div.totalCount b");
 
    private String code;
    private String desc;
 
    EarthQuakeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    public String getCode() {
        return this.code;
    }
    public String getDesc() {
        return this.desc;
    }
}