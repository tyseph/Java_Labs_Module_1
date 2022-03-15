package lab4;

import java.util.UUID;

//ITEMS ABSTRACT CLASS

abstract class Item {

	private UUID id;
	private String title;
	private int copies;

	public Item(UUID id, String title, int copies) {
		super();
		this.id = UUID.randomUUID();
		this.title = title;
		this.copies = copies;
	}

	void getTitle() {

	}

	void checkIn() {

	}

	void checkOut() {

	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}

}

abstract class MediaItems extends Item {

	private int runTime;

	public MediaItems(UUID id, String title, int copies, int runTime) {
		super(id, title, copies);
		this.runTime = runTime;
	}

	@Override
	void getTitle() {

	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	void getRunTime() {
		System.out.println(this.runTime);
	}
}

class Video extends MediaItems {

	private String director;
	private String genre;
	private int releaseyear;

	public Video(UUID id, String title, int copies, int runTime, String director, String genre, int releaseYear) {
		super(id, title, copies, runTime);
		this.director = director;
		this.genre = genre;
		this.releaseyear = releaseYear;

	}

	@Override
	void getTitle() {

	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	@Override
	void getRunTime() {

	}

	void getDirector() {
		System.out.println(this.director);
	}

	void getGenre() {
		System.out.println(this.genre);
	}

	void getReleaseYear() {
		System.out.println(this.releaseyear);
	}

}

class CDs extends MediaItems {

	private String artist;
	private String genre;
	String title;

	public CDs(UUID id, String title, int copies, int runTime, String artist, String genre) {
		super(id, title, copies, runTime);
		this.artist = artist;
		this.genre = genre;
		this.title = title;

	}

	@Override
	void getTitle() {
		System.out.println(title);
	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	@Override
	void getRunTime() {

	}

	@Override
	public String toString() {
		return "CDs [artist=" + artist + ", genre=" + genre + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}

abstract class WrittenItems extends Item {

	private String author;

	public WrittenItems(UUID id, String title, int copies, String author) {
		super(id, title, copies);
		this.author = author;
	}

	@Override
	void getTitle() {

	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	void getAuthor() {

	}

	@Override
	public String toString() {
		return "WrittenItems [author=" + author + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

class Book extends WrittenItems {

	public Book(UUID id, String title, int copies, String author) {
		super(id, title, copies, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getTitle() {

	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	@Override
	void getAuthor() {

	}

	@Override
	public String toString() {
		return "Book [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}

class JournalPaper extends WrittenItems {

	private int pubYear;

	public JournalPaper(UUID id, String title, int copies, String author, int pubYear) {
		super(id, title, copies, author);
		this.pubYear = pubYear;
	}

	@Override
	void getTitle() {

	}

	@Override
	void checkIn() {

	}

	@Override
	void checkOut() {

	}

	@Override
	void getAuthor() {

	}

	@Override
	public String toString() {
		return "JournalPaper [pubYear=" + pubYear + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}

public class Ex3 {

	public static void main(String[] args) {

		Item cd = new CDs(UUID.randomUUID(), "Spiderman", 5, 2, "Sam Rami", "Action");
		cd.getTitle();

	}
}
