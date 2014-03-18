package dmk.springmvc.domain;

public class Document {

	private String contents;
	
	public Document(String contents){
		super();
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}