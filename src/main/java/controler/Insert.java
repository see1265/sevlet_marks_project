package controler;

import java.io.IOException;
import dao.Dao;
import dto.DtoStd;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insert")
public class Insert extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	
	String usnno=req.getParameter("usn");
	long usn=Long.parseLong(usnno);
    String mon=req.getParameter("mon");
 
     String medium=req.getParameter("medium");
     String type= req.getParameter("type");
     
     String name=req.getParameter("name");
     String fname=req.getParameter("fname");
     String mname=req.getParameter("mname");
     
     String dob=req.getParameter("dob");
     String gender= req.getParameter("gender");
     
     String kan=req.getParameter("kan");
     int a= Integer.parseInt(kan);
     String kmin=req.getParameter("kmin");
     int aa=Integer.parseInt(kmin);
     String ktotal=req.getParameter("ktotal");
     int aaa=Integer.parseInt(ktotal);
    
     
     String eng=req.getParameter("eng");
     int b= Integer.parseInt(eng);
     String emin=req.getParameter("emin");
     int bb=Integer.parseInt(emin);
     String etotal=req.getParameter("etotal");
     int bbb=Integer.parseInt(etotal);
    
     
     String hin=req.getParameter("hin");
     int c= Integer.parseInt(hin);
     String hmin=req.getParameter("hmin");
     int cc=Integer.parseInt(hmin);
     String htotal=req.getParameter("htotal");
     int ccc=Integer.parseInt(htotal);
    
     
     String mat=req.getParameter("mat");
     int d= Integer.parseInt(mat);
     String mmin=req.getParameter("mmin");
     int dd=Integer.parseInt(mmin);
     String mtotal=req.getParameter("mtotal");
     int ddd=Integer.parseInt(mtotal);
    
     
     String sci=req.getParameter("sci");
     int e= Integer.parseInt(sci);
     String smin=req.getParameter("smin");
     int ee=Integer.parseInt(smin);
     String stotal=req.getParameter("stotal");
     int eee=Integer.parseInt(stotal);
     
     
     String soc=req.getParameter("soc");
     int f= Integer.parseInt(soc);
     String ssmin=req.getParameter("ssmin");
     int ff=Integer.parseInt(ssmin);
     String sstotal=req.getParameter("sstotal");
     int fff=Integer.parseInt(stotal);
     
    
     int maxtotal=a+b+c+d+e+f;
     int mintotal=aa+bb+cc+dd+ee+ff;
     int total=aaa+bbb+ccc+ddd+eee+fff;
    
     
     String phygrd=req.getParameter("words");
     String workgrd=req.getParameter("words");
     String attgrd=req.getParameter("words");
     String artgrd=req.getParameter("words");
     
     DtoStd d1=new DtoStd();
     d1.setUsn(usn);
     d1.setMon(mon);
     
     d1.setMedium(medium);
     d1.setType(type);
     
     d1.setName(name);
     d1.setFname(fname);
     d1.setMname(mname);
     
     d1.setDob(dob);
     d1.setGender(gender);
     
     d1.setKan(a);
     d1.setKmin(aa);
     d1.setKtotal(aaa);
    d1.setKgrad(gradecalc(aaa));
     
     d1.setEng(b);
     d1.setEmin(bb);
     d1.setEtotal(bbb);
     d1.setEgrad(gradecalc(bbb));
     
     d1.setHin(c);
     d1.setHmin(cc);
     d1.setTotal(ccc);
    d1.setHgrad(gradecalc(ccc));
     
     d1.setHin(d);
     d1.setHmin(dd);
     d1.setHtotal(ddd);
     d1.setMgrad(gradecalc(ddd));
     
     d1.setSci(e);
     d1.setSmin(ee);
     d1.setStotal(eee);
     d1.setSgrad(gradecalc(eee));
     
     d1.setSoc(f);
     d1.setSsmin(ff);
     d1.setSstotal(fff);
     d1.setSsgrad(gradecalc(fff));
     
     d1.setPhygrd(phygrd);
     d1.setWorkgrd(workgrd);
     d1.setAttgrd(attgrd);
     d1.setArtgrd(artgrd);
     
    Dao d2=new Dao();
    String x1=d2.insert(d1);
    resp.getWriter().print(d2.insert(d1));  
}
static String gradecalc(int m) {
	if(m<35) {
		return "fail";
	}else if(m>=86)
		return "A+";
	else
		return "A";
}
}
