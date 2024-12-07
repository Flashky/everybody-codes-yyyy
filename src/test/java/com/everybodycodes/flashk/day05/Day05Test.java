package com.everybodycodes.flashk.day05;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.everybodycodes.flashk.common.test.constants.TestDisplayName;
import com.everybodycodes.flashk.common.test.constants.TestFilename;
import com.everybodycodes.flashk.common.test.constants.TestFolder;
import com.everybodycodes.flashk.common.test.constants.TestTag;
import com.everybodycodes.flashk.common.test.utils.PuzzleTest;
import com.everybodycodes.flashk.common.test.utils.Input;

@DisplayName(TestDisplayName.DAY_05)
@TestMethodOrder(OrderAnnotation.class)
@Disabled // TODO Remove comment when implemented
public class Day05Test extends PuzzleTest {

	private static final String INPUT_FOLDER = TestFolder.DAY_05;

	@Test
	@Order(1)
	@Tag(TestTag.PART_1)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_1_SAMPLE)
	public void testSolvePart1Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_1);

	}

	@Test
	@Order(2)
	@Tag(TestTag.PART_1)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_1_INPUT)
	public void testSolvePart1Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_1);

	}

	@Test
	@Order(3)
	@Tag(TestTag.PART_2)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_2_SAMPLE)
	public void testSolvePart2Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_2);

	}

	@Test
	@Order(4)
	@Tag(TestTag.PART_2)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_2_INPUT)
	public void testSolvePart2Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_2);

	}

	@Test
	@Order(5)
	@Tag(TestTag.PART_3)
	@Tag(TestTag.SAMPLE)
	@DisplayName(TestDisplayName.PART_3_SAMPLE)
	public void testSolvePart3Sample() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_SAMPLE_PART_3);
	}

	@Test
	@Order(6)
	@Tag(TestTag.PART_3)
	@Tag(TestTag.INPUT)
	@DisplayName(TestDisplayName.PART_3_INPUT)
	public void testSolvePart3Input() {

		// Read input file
		List<String> inputs = Input.readStringLines(INPUT_FOLDER, TestFilename.INPUT_FILE_PART_3);
	}

}
