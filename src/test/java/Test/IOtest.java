package Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.domain.Column;
import com.bw.service.ColumnService;
import com.lilong.util.DateUtil;
import com.lilong.util.NumberUtil;
import com.lilong.util.StreamUtil;
import com.lilong.util.StringUtil;

public class IOtest {

	@SuppressWarnings("resource")
	@Test
	public void test() throws UnsupportedEncodingException, ParseException {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-beans.xml");
		ColumnService service = ac.getBean(ColumnService.class);
		List<Column> list1 = new ArrayList<Column>();
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/test.txt"));
		String string2 = list.get(0);
		String substring = string2.substring(1);
		list.remove(0);
		list.add(substring);
		for (String string : list) {
			Column c = new Column();
			String[] split = string.split("	");
			if(NumberUtil.isNumber(split[0])) {
				if(StringUtil.hasText(split[1])) {
					if(StringUtil.hasText(split[2])) {
						if(StringUtil.hasText(split[3])) {
							if(StringUtil.hasText(split[4])) {
								if(StringUtil.hasText(split[5])) {
									if(StringUtil.hasText(split[6]) && NumberUtil.isNumber(split[6])) {
									}else {
										split[6]="0";
									}
									if(StringUtil.hasText(split[7])) {
										c.setId(new BigInteger(split[0]));
										c.setGjz(split[1]);
										c.setMs(split[2]);
										c.setName(split[3]);
										c.setCp(split[4]);
										c.setDz(split[5]);
										c.setZb(Double.parseDouble(split[6]));
										c.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(split[7]));
										c.setNdate(null);
										list1.add(c);
									}
								}
							}
						}
					}
				}
			}
		}
		service.insert(list1);
	}

}
