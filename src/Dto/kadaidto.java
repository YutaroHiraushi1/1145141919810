package Dto;

public class kadaidto {
	private int id;
	private String name;
	private String date;
	private int sid;
	private String result;

	public kadaidto(int id, String name, String date, int sid, String result) {
		this.id=id;
		this.name=name;
		this.date=date;
		this.sid=sid;
		this.result=result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


}
