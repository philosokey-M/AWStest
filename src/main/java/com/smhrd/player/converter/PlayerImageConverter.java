package com.smhrd.player.converter;

import java.io.File;
import java.io.IOException;

public interface PlayerImageConverter<F, S> {

	// 이미지를 파일(F) 바이트 문자열(S) 형태로 변환할 때 해당 인터페이스를 상속받아서 
	// 정해진 틀대로 변환 할 수 있도록 진행
	
	
	// IoException : 입출력 관련한 예외처리
	public S convert(F f) throws IOException;
	
	
}
