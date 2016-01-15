/*
 * generated by Xtext
 */
package istic.idm.project.serializer;

import com.google.inject.Inject;
import istic.idm.project.services.VideoGenGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VideoGenSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VideoGenGrammarAccess grammarAccess;
	protected AbstractElementAlias match_mandatory_optional_MandatoryKeyword_0_or_OptionalKeyword_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VideoGenGrammarAccess) access;
		match_mandatory_optional_MandatoryKeyword_0_or_OptionalKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()), new TokenAlias(false, false, grammarAccess.getOptionalAccess().getOptionalKeyword_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_mandatory_optional_MandatoryKeyword_0_or_OptionalKeyword_0.equals(syntax))
				emit_mandatory_optional_MandatoryKeyword_0_or_OptionalKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'mandatory' | 'optional'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'videoseq' id=ID
	 *     (rule start) (ambiguity) 'videoseq' text=STRING
	 */
	protected void emit_mandatory_optional_MandatoryKeyword_0_or_OptionalKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
