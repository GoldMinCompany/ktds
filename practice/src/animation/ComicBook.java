package animation;
/**
 * - 멤버 변수
 * 1. 만화책 이름 : String
 * 2. 만화책 대여 상태 : boolean
 * 3. 만화책 대여비 : int
 * 4. 소지금 : int
 * 
 * - 기능
 * 1. 모든 만화책 목록을 출력
 * 2. 만화책 대여
 * 		- 이미 대여 중인 만화책은 대여할 수 없다
 * 		- 대여할 때, 만화책 대여비를 지급해야 한다.
 * 3. 만화책 반남
 */

public class ComicBook {
	
	private String bookName; // 만화책 이름
	private boolean state; // 만화책 대여 상태
	private int bookPrice; // 만화책 대여비
	
	
	public ComicBook(String bookName, boolean state, int bookPrice) {
		
		this.bookName = bookName;
		this.state = state;
		this.bookPrice = bookPrice;
		
	}
	
	public String getBookName() {
		
		return this.bookName;
	}
	
	public boolean getState() {
		
		return this.state;
		
	}
	
	public int bookPrice() {
		
		return this.bookPrice;
	}
	
	public boolean rentalBook() {
		
		return false;
	}
	
}
