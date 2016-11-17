package test;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GuestDaoTest {
    @Test
    public void insertOne() throws Exception {

    }

    @Test
    public void selectAll() throws Exception {
        GuestDao dao = new GuestDao();
        ArrayList list = dao.selectAll();
        assertNotNull(list);
        assertEquals(3, list.size());
    }

    @Test
    public void selectOne() throws Exception {
        int sabun = 1111;
        GuestDao dao = new GuestDao();
        GuestDto dto = dao.selectOne(sabun);
        assertNotNull(dto);
        assertEquals(1111, dto.getSabun());
        assertEquals("aaaa", dto.getName());

    }
}
