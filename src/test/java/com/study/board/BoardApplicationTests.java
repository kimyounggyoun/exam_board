package com.study.board;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardApplicationTests {
	@Autowired
	private BoardRepository boardRepository;
	@Test
	void contextLoads() {
		for (int i = 0 ; i < 200 ; i++){
				Board temp = new Board();
				temp.setId(i);
				temp.setTitle("Test_Title_"+i);
				temp.setContent("Test_Content_"+i);
				boardRepository.save(temp);
		}
	}

}
