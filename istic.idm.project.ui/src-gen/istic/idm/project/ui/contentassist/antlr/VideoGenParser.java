/*
 * generated by Xtext
 */
package istic.idm.project.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import istic.idm.project.services.VideoGenGrammarAccess;

public class VideoGenParser extends AbstractContentAssistParser {
	
	@Inject
	private VideoGenGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected istic.idm.project.ui.contentassist.antlr.internal.InternalVideoGenParser createParser() {
		istic.idm.project.ui.contentassist.antlr.internal.InternalVideoGenParser result = new istic.idm.project.ui.contentassist.antlr.internal.InternalVideoGenParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getVideoGenAccess().getGroup(), "rule__VideoGen__Group__0");
					put(grammarAccess.getMandatoryAccess().getGroup(), "rule__Mandatory__Group__0");
					put(grammarAccess.getOptionalAccess().getGroup(), "rule__Optional__Group__0");
					put(grammarAccess.getAlternativesAccess().getGroup(), "rule__Alternatives__Group__0");
					put(grammarAccess.getVideoseqAccess().getGroup(), "rule__Videoseq__Group__0");
					put(grammarAccess.getVideoGenAccess().getTypeAssignment_1(), "rule__VideoGen__TypeAssignment_1");
					put(grammarAccess.getAlternativesAccess().getIdAssignment_1(), "rule__Alternatives__IdAssignment_1");
					put(grammarAccess.getAlternativesAccess().getVideoseqAssignment_3(), "rule__Alternatives__VideoseqAssignment_3");
					put(grammarAccess.getVideoseqAccess().getIdAssignment_1(), "rule__Videoseq__IdAssignment_1");
					put(grammarAccess.getVideoseqAccess().getTextAssignment_2(), "rule__Videoseq__TextAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			istic.idm.project.ui.contentassist.antlr.internal.InternalVideoGenParser typedParser = (istic.idm.project.ui.contentassist.antlr.internal.InternalVideoGenParser) parser;
			typedParser.entryRuleVideoGen();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VideoGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}