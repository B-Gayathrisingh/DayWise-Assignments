package JUnitDemo;

public class Course {

		private String title;
		private int durationInHours;
		public Course(String title, int durationInHours) {
			this.title = title;
			this.durationInHours = durationInHours;
		}
		
		public boolean isLongCourse() {
			return durationInHours > 40;
		}
		
		public String getTitle() {
			return title;
		}
	}
	

