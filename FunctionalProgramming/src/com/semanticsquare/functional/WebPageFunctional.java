package com.semanticsquare.functional;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import org.htmlcleaner.HtmlCleaner;

public class WebPageFunctional {

	public List<String> documents;
	{
		String doc1 = "<html><body>One of the most common uses of <i>streams</i> is to represent queries over data in collections</body></html>";
		String doc2 = "<html><body>Information integration systems provide valuable services to users by integrating information from a number of autonomous, heterogeneous and distributed Web sources</body></html>";
		String doc3 = "<html><body>Solr is the popular, blazing fast open source enterprise search platform from the Apache Lucene</body></html>";
		String doc4 = "<html><body>Java 8 goes one more step ahead and has developed a streams API which lets us think about parallelism</body></html>";
		documents = new ArrayList<>(Arrays.asList(doc1, doc2, doc3, doc4));
	}

	public WebPageFunctional() {
		Collections.unmodifiableCollection(documents);
	}

	private List<String> getDocuments() {
		return this.documents;
	}

	boolean filter(String doc, Predicate<String> filter) {
		return filter.test(doc);
	}

	public String transform(String doc, Function<String, String> transformer) {
		return transformer.apply(doc);
	}

	/*
	 * static String transform(String doc, UnaryOperator<String> transformer) {
	 * return transformer.apply(doc); }
	 */

	public void logic() {
		for (String doc : getDocuments()) {
			//boolean isTargetDocument = filter(doc, d -> d.contains("streams"));
			BiFunction<String, String, Boolean> isTargetDocument = (x,y)->x.contains(y);
			
			//if (isTargetDocument) {
			if (isTargetDocument.apply(doc, "streams")) {
				Function<String, String> filter1 = (d) -> Indexer.stripHtmlTags(d);
				// doc = transform(doc, (d) -> Indexer.stripHtmlTags(d));

				doc = transform(doc, filter1);
				doc = transform(doc, (d) -> Indexer.removeStopwords(d));
				System.out.println(doc);
			}
		}

	}

	public void lambdaLogic() {
		getDocuments().stream().filter(doc -> filter(doc, d -> d.contains("streams")))
				.map(id -> transform(id, (d) -> Indexer.stripHtmlTags(d)))
				.map(x -> transform(x, (d) -> Indexer.removeStopwords(d))).forEach((y) -> System.out.println(y));
	}

	public void lambdaLogic2() {
		Function<String, String> transform1 = (d) -> Indexer.stripHtmlTags(d);
		Function<String, String> transform2 = (d) -> Indexer.removeStopwords(d);
		BiFunction<String,String, Boolean> isTarget = (x,y)->x.contains(y);

		getDocuments().stream().filter(doc -> isTarget.apply(doc, "streams")).map(transform1.andThen(transform2))
				.forEach((y) -> System.out.println(y));
	}

	public static void main(String[] args) {
		WebPageFunctional page = new WebPageFunctional();
		// System.out.println(page.getDocuments());
		page.logic();
		page.lambdaLogic();
		page.lambdaLogic2();
	}

}

class Indexer {

	private static List<String> stopWords = Arrays.asList("of", "the", "a", "is", "to", "in", "and");

	static String stripHtmlTags(String doc) {
		return new HtmlCleaner().clean(doc).getText().toString();
	}

	static String removeStopwords(String doc) {

		StringBuilder sb = new StringBuilder();
		for (String word : doc.split(" ")) {
			if (!stopWords.contains(word))
				sb.append(word).append(" ");
		}

		return sb.toString();
	}

}
