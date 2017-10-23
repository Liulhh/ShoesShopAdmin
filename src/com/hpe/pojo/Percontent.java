package com.hpe.pojo;

public class Percontent {
	private int pcid;
	private int pc_perid;
	private String pcitems;
	private String pcmenu;
	public int getPcid() {
		return pcid;
	}
	public void setPcid(int pcid) {
		this.pcid = pcid;
	}
	public int getPc_perid() {
		return pc_perid;
	}
	public void setPc_perid(int pc_perid) {
		this.pc_perid = pc_perid;
	}
	public String getPcitems() {
		return pcitems;
	}
	public void setPcitems(String pcitems) {
		this.pcitems = pcitems;
	}
	public String getPcmenu() {
		return pcmenu;
	}
	public void setPcmenu(String pcmenu) {
		this.pcmenu = pcmenu;
	}
	public Percontent(int pcid, int pc_perid, String pcitems, String pcmenu) {
		super();
		this.pcid = pcid;
		this.pc_perid = pc_perid;
		this.pcitems = pcitems;
		this.pcmenu = pcmenu;
	}
	public Percontent() {
	}
	
	
}
