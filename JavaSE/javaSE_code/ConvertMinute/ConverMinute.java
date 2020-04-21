class ConverMinute{
	public static void main(String[] args) {
		long minute = 3456789L;
		convert(minute);

	}

	static void convert(long minute){
		long days, years;
		long year_minutes, day_minutes;
		year_minutes = 365 * 24 * 60;
		day_minutes = 24 * 60;
		years = minute / year_minutes;
		days = (minute % year_minutes) / day_minutes;
		System.out.println(minute + "分钟是" + years + "年" + days + "天");
	}
}