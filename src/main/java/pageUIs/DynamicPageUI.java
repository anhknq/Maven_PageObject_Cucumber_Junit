package pageUIs;

public class DynamicPageUI {
	public static final String DYNAMIC_MENU_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_TEXTBOX = "//input[@name='%s']";
	public static final String DYNAMIC_TEXTAREA = "//textarea[@name='%s']";
	public static final String DYNAMIC_RADIO_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_BUTTON = "//input[@value='%s']";
	public static final String DYNAMIC_PAGE_HEADING = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_DATA_IN_TABLE = "//td[text()='%s']/following-sibling::td";
	public static final String DYNAMIC_DROPDOWNLIST = "//select[@name='%s']";
}
