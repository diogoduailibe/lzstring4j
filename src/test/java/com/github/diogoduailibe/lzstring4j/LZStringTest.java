package com.github.diogoduailibe.lzstring4j;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LZStringTest {

	Logger logger = Logger.getLogger(LZStringTest.class.getSimpleName());

	private static final String STRING_TO_COMPRESS = "Lets see how much we can compress this string!";

	@BeforeEach
	public void setUp() throws Exception {

	}

	@Test
	@DisplayName("Compressed string should be shorter than original string (String to compressed).")
	public void testNormalCompression() {
		String compressedString = LZString.compress(STRING_TO_COMPRESS);
		int stringToCompressLength = STRING_TO_COMPRESS.length();
		int compressedStringLength = compressedString.length();

		logger.info("String to compress length: " + stringToCompressLength);
		logger.info("Compressed String length: " + compressedStringLength);

		assertTrue(compressedStringLength < stringToCompressLength);
	}

	@Test
	@DisplayName("Decompressed string should be equal to Original String (String to Compress).")
	public void testNormalDeCompression() {
		String compressedString = LZString.compress(STRING_TO_COMPRESS);
		String decompressedString = LZString.decompress(compressedString);

		assertTrue(STRING_TO_COMPRESS.contentEquals(decompressedString));
	}
	
	@Test
	@DisplayName("Compressed UTF-16 string should be shorter than original string (String to compressed).")
	public void testUTF16Compression() {
		String compressedString = LZString.compressToUTF16(STRING_TO_COMPRESS);
		int stringToCompressLength = STRING_TO_COMPRESS.length();
		int compressedStringLength = compressedString.length();

		logger.info("String to compress length: " + stringToCompressLength);
		logger.info("Compressed String length: " + compressedStringLength);

		assertTrue(compressedStringLength < stringToCompressLength);
	}

	@Test
	@DisplayName("Decompressed UTF-16 string should be equal to Original String (String to Compress).")
	public void testUTF16DeCompression() {
		String compressedString = LZString.compressToUTF16(STRING_TO_COMPRESS);
		String decompressedString = LZString.decompressFromUTF16(compressedString);

		assertTrue(STRING_TO_COMPRESS.contentEquals(decompressedString));
	}

	@Test
	@DisplayName("Compressed string should be Base64 String")
	public void testBase64Compression() {
		String compressedString = LZString.compressToBase64(STRING_TO_COMPRESS);
		String pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)?$";
		
		int stringToCompressLength = STRING_TO_COMPRESS.length();
		int compressedStringLength = compressedString.length();
		
		logger.info("String to compress length: " + stringToCompressLength);
		logger.info("Compressed String length: " + compressedStringLength);

		assertTrue(compressedString.matches(pattern));
	}

	@Test
	@DisplayName("Decompressed Base64 string should be equal to Original String (String to Compress).")
	public void testBase64DeCompression() {
		String compressedString = LZString.compressToBase64(STRING_TO_COMPRESS);
		String decompressedString = LZString.decompressFromBase64(compressedString);

		assertTrue(STRING_TO_COMPRESS.contentEquals(decompressedString));
	}

}
