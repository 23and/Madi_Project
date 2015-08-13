package KoreanAnalyzer;

import java.util.List;

import org.apache.lucene.analysis.ko.morph.AnalysisOutput;
import org.apache.lucene.analysis.ko.morph.MorphException;
import org.apache.lucene.analysis.ko.morph.WordSegmentAnalyzer;

public class WordSegmentAnalyze {

	 public StringBuilder segmented = new StringBuilder();//띄어쓰기 된 문장을 저장하기 위한 변수

	 public WordSegmentAnalyze(String source, boolean force) throws MorphException {
	       
	       
	        WordSegmentAnalyzer sss= new WordSegmentAnalyzer();
	        String s="";
	        if(force)
	            s = source.replace(" ", "");
	        else
	            s = source;
	        @SuppressWarnings("unchecked")
			List<List<AnalysisOutput>> outList = sss.analyze(s);
	    
	     
	        for(List<AnalysisOutput> o: outList) {
	        	for(AnalysisOutput a:o){
	        		
	        		segmented.append(a.getSource()).append(" ");
	        	//System.out.println(a.getSource());
	        	}
	        	
	        }

	        
	    }
	
}
