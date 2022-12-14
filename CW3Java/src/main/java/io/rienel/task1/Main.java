package io.rienel.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class Main {

	// region
	private static final List<String> maleSurnameList = List.of("Иванов", "Петров", "Сидоров", "Михайлов", "Белоусов", "Козлов", "Мотозов", "Мельников");
	private static final List<String> maleNameList = List.of("Иван", "Петр", "Артем", "Михаил", "Илья", "Алексей", "Александр", "Сергей", "Кирилл");
	private static final List<String> malePatronymicList = List.of("Иванович", "Петрович", "Артемович", "Михайлович", "Ильич", "Алексеевич", "Александрович", "Сергеевич", "Кириллович");
	private static final List<String> femaleSurnameList = List.of("Иванова", "Петрова", "Сидорова", "Михайлова", "Белоусова", "Козлова", "Мотозова", "Мельникова");
	private static final List<String> femaleNameList = List.of("Алена", "Александра", "Влада", "Екатерина", "Елизовета", "Дарья", "Анастасия", "Любовь");
	private static final List<String> femalePatronymicList = List.of("Ивановна", "Петровна", "Артемовна", "Михайловна", "Андреевна", "Алексеевна", "Александровна", "Сергеевна", "Кирилловна");
	private static final DateTimeFormatter isoFormat = DateTimeFormatter.ISO_DATE;

	public static int getRandomNumber(int min, int max) {
		return (int)((Math.random() * (max - min)) + min);
	}

	public static void generateNewStuffData() {
		//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while(true) {
//            String readedLine = reader.readLine();
//            System.out.println(readedLine);
//            if (readedLine.equals("exit")) {
//                break;
//            }
//        }
//        reader.close();
		boolean sex = false; // мужской false, женский true
		Random ran = new Random();
		try (FileWriter outputStream = new FileWriter("Stuff.csv", StandardCharsets.UTF_8)) {
			outputStream.write("id,surname,name,patronymic,sex,birthDate,salary\n");
			for (int i = 0; i < 10_000; i++) {
				outputStream.write(UUID.randomUUID() + ",");
				if (!sex) {
					outputStream.write(maleSurnameList.get(ran.nextInt(maleSurnameList.size())) + ",");
					outputStream.write(maleNameList.get(ran.nextInt(maleNameList.size())) + ",");
					outputStream.write(malePatronymicList.get(ran.nextInt(malePatronymicList.size())) + ",");
					outputStream.write(sex + ",");
					outputStream.write(isoFormat.format(LocalDate.of(getRandomNumber(1970, 2001), getRandomNumber(1, 13), getRandomNumber(1, 29))) + ",");
					outputStream.write(String.format("%d", getRandomNumber(20000, 100_000)));
					sex = true;
				} else {
					outputStream.write(femaleSurnameList.get(ran.nextInt(femaleSurnameList.size())) + ",");
					outputStream.write(femaleNameList.get(ran.nextInt(femaleNameList.size())) + ",");
					outputStream.write(femalePatronymicList.get(ran.nextInt(femalePatronymicList.size())) + ",");
					outputStream.write(sex + ",");
					outputStream.write(isoFormat.format(LocalDate.of(getRandomNumber(1970, 2001), getRandomNumber(1, 13), getRandomNumber(1, 29))) + ",");
					outputStream.write(String.format("%d", getRandomNumber(20000, 100_000)));
					sex = false;
				}
				outputStream.write("\n");
			}
		} catch (IOException e) {

		}
	}
	//endregion

	public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
		LocalDateTime december152022_18_00_00 = LocalDateTime.of(2022, Month.DECEMBER, 15, 18, 0, 0);
		System.out.println(december152022_18_00_00);
		ZonedDateTime december121984_15_12_13_UTC = ZonedDateTime.of(1984, Month.DECEMBER.getValue(), 12,
				15, 12, 13, 0, ZoneOffset.UTC);
		System.out.println(december121984_15_12_13_UTC);
		ZonedDateTime december152022_18_00_00_UTC = ZonedDateTime.of(december152022_18_00_00, ZoneOffset.UTC);
		System.out.println(december152022_18_00_00_UTC);
//		OfferService service = LeasingOfferService.getInstance();
//		Client client = new Client.Builder()
//				.setId(UUID.randomUUID())
//				.setSurname("Мотозов")
//				.setName("Артем")
//				.setPatronymic("Владимирович")
//				.setPhone("88005553535")
//				.setSex(false)
//				.setPassportSerial("8888444444")
//				.setBirthDate(LocalDate.of(1998, 2, 24))
//				.build();
//		Stuff stuff = new Stuff.Builder()
//				.setId(UUID.randomUUID())
//				.setSex(false)
//				.setSurname("Иванов")
//				.setName("Иван")
//				.setPatronymic("Иванович")
//				.setSalaryMultiplier(1.00)
//				.setPosition(new Position(UUID.randomUUID(), "Менеджер", 100000))
//				.build();
//		Offer offer = service.signNewOffer(LocalDate.now(), LocalDate.now().plusYears(1L), client, stuff);
//		System.out.println(offer);
	}
}