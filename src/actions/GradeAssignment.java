package actions;

import domain.Researcher;
import domain.Article;
import domain.Grade;

public class GradeAssignment {

	public GradeAssignment(int value, Researcher reviewer, Article article) {
		storeNewGrade(value, reviewer, article);
	}

	private void storeNewGrade(int grade, Researcher reviewer, Article article) {
		Grade gradeObj = new Grade(grade, reviewer);
		article.saveGrade(gradeObj);
	}

}
