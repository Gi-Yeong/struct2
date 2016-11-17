package test;

import com.hb.guest.model.GuestDao;
import com.hb.guest.model.GuestDto;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GuestDaoTest {
    @Test
    public void insertOne() throws Exception {
        GuestDao dao = new GuestDao();
        GuestDto dto = new GuestDto();
        dto.setSabun(0);
        dto.setName("test");
        dto.setPay(0);
        dao.insertOne(dto);
        dao = new GuestDao();
        assertEquals(dto, dao.selectOne(0));

    }

    @Test
    public void selectAll() throws Exception {
        GuestDao dao = new GuestDao();
        ArrayList list = dao.selectAll();
        assertNotNull(list);
        assertTrue(list.size() > 0);
//        assertEquals(3, list.size());
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
