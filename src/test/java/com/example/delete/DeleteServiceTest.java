package com.example.delete;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.domain.kakeibo.Kakeibo;
import com.example.repository.kakeibo.KakeiboMapper;
import com.example.service.kakeibo.KakeiboService;

@SpringBootTest
public class DeleteServiceTest {
	
	@InjectMocks
	KakeiboService service;
	
	@Mock
	KakeiboMapper mapper;
	
	@Test
	@DisplayName("家計簿の削除テスト（正常）")
	void testKakeiboDelete() throws Exception{
		Kakeibo kakeibo = new Kakeibo();
		kakeibo.setId(1);
		
		
		when(mapper.delete(anyLong())).thenReturn(true);
		
		boolean actual = mapper.delete(kakeibo.getId());
		
		assertTrue(actual);
		

	}
	@Test
	@DisplayName("家計簿の削除テスト（異常）")
	void testKakeiboDeleteFalse() throws Exception{
		Kakeibo kakeibo = new Kakeibo();
		kakeibo.setId(1);
		
	when(mapper.delete(anyLong())).thenReturn(false);
		
		boolean actual = mapper.delete(kakeibo.getId());
		
		assertFalse(actual);
	}
}