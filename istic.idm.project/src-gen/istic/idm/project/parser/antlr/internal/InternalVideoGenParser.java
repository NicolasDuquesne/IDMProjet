package istic.idm.project.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import istic.idm.project.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen {'", "'}'", "'mandatory'", "'optional'", "'alternatives'", "'{'", "'videoseq'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;
     	
        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:67:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:68:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:69:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:76:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen {' ( (lv_type_1_0= ruletype ) )* otherlv_2= '}' ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;


         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:79:28: ( (otherlv_0= 'VideoGen {' ( (lv_type_1_0= ruletype ) )* otherlv_2= '}' ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen {' ( (lv_type_1_0= ruletype ) )* otherlv_2= '}' )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:80:1: (otherlv_0= 'VideoGen {' ( (lv_type_1_0= ruletype ) )* otherlv_2= '}' )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:80:3: otherlv_0= 'VideoGen {' ( (lv_type_1_0= ruletype ) )* otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:84:1: ( (lv_type_1_0= ruletype ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:85:1: (lv_type_1_0= ruletype )
            	    {
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:85:1: (lv_type_1_0= ruletype )
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:86:3: lv_type_1_0= ruletype
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getTypeTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruletype_in_ruleVideoGen143);
            	    lv_type_1_0=ruletype();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"type",
            	            		lv_type_1_0, 
            	            		"type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleVideoGen156); 

                	newLeafNode(otherlv_2, grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuletype"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:114:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:115:2: (iv_ruletype= ruletype EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:116:2: iv_ruletype= ruletype EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype192);
            iv_ruletype=ruletype();

            state._fsp--;

             current =iv_ruletype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:123:1: ruletype returns [EObject current=null] : (this_mandatory_0= rulemandatory | this_optional_1= ruleoptional | this_alternatives_2= rulealternatives ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        EObject this_mandatory_0 = null;

        EObject this_optional_1 = null;

        EObject this_alternatives_2 = null;


         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:126:28: ( (this_mandatory_0= rulemandatory | this_optional_1= ruleoptional | this_alternatives_2= rulealternatives ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:127:1: (this_mandatory_0= rulemandatory | this_optional_1= ruleoptional | this_alternatives_2= rulealternatives )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:127:1: (this_mandatory_0= rulemandatory | this_optional_1= ruleoptional | this_alternatives_2= rulealternatives )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:128:5: this_mandatory_0= rulemandatory
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getMandatoryParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulemandatory_in_ruletype249);
                    this_mandatory_0=rulemandatory();

                    state._fsp--;

                     
                            current = this_mandatory_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:138:5: this_optional_1= ruleoptional
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getOptionalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleoptional_in_ruletype276);
                    this_optional_1=ruleoptional();

                    state._fsp--;

                     
                            current = this_optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:148:5: this_alternatives_2= rulealternatives
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getAlternativesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulealternatives_in_ruletype303);
                    this_alternatives_2=rulealternatives();

                    state._fsp--;

                     
                            current = this_alternatives_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulemandatory"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:164:1: entryRulemandatory returns [EObject current=null] : iv_rulemandatory= rulemandatory EOF ;
    public final EObject entryRulemandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemandatory = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:165:2: (iv_rulemandatory= rulemandatory EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:166:2: iv_rulemandatory= rulemandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_rulemandatory_in_entryRulemandatory338);
            iv_rulemandatory=rulemandatory();

            state._fsp--;

             current =iv_rulemandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRulemandatory348); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemandatory"


    // $ANTLR start "rulemandatory"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:173:1: rulemandatory returns [EObject current=null] : (otherlv_0= 'mandatory' this_videoseq_1= rulevideoseq ) ;
    public final EObject rulemandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_videoseq_1 = null;


         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:176:28: ( (otherlv_0= 'mandatory' this_videoseq_1= rulevideoseq ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:177:1: (otherlv_0= 'mandatory' this_videoseq_1= rulevideoseq )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:177:1: (otherlv_0= 'mandatory' this_videoseq_1= rulevideoseq )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:177:3: otherlv_0= 'mandatory' this_videoseq_1= rulevideoseq
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_rulemandatory385); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getMandatoryAccess().getVideoseqParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevideoseq_in_rulemandatory407);
            this_videoseq_1=rulevideoseq();

            state._fsp--;

             
                    current = this_videoseq_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemandatory"


    // $ANTLR start "entryRuleoptional"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:198:1: entryRuleoptional returns [EObject current=null] : iv_ruleoptional= ruleoptional EOF ;
    public final EObject entryRuleoptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoptional = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:199:2: (iv_ruleoptional= ruleoptional EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:200:2: iv_ruleoptional= ruleoptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleoptional_in_entryRuleoptional442);
            iv_ruleoptional=ruleoptional();

            state._fsp--;

             current =iv_ruleoptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoptional452); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleoptional"


    // $ANTLR start "ruleoptional"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:207:1: ruleoptional returns [EObject current=null] : (otherlv_0= 'optional' this_videoseq_1= rulevideoseq ) ;
    public final EObject ruleoptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_videoseq_1 = null;


         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:210:28: ( (otherlv_0= 'optional' this_videoseq_1= rulevideoseq ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:211:1: (otherlv_0= 'optional' this_videoseq_1= rulevideoseq )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:211:1: (otherlv_0= 'optional' this_videoseq_1= rulevideoseq )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:211:3: otherlv_0= 'optional' this_videoseq_1= rulevideoseq
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleoptional489); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getOptionalAccess().getVideoseqParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulevideoseq_in_ruleoptional511);
            this_videoseq_1=rulevideoseq();

            state._fsp--;

             
                    current = this_videoseq_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleoptional"


    // $ANTLR start "entryRulealternatives"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:232:1: entryRulealternatives returns [EObject current=null] : iv_rulealternatives= rulealternatives EOF ;
    public final EObject entryRulealternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_rulealternatives = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:233:2: (iv_rulealternatives= rulealternatives EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:234:2: iv_rulealternatives= rulealternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_rulealternatives_in_entryRulealternatives546);
            iv_rulealternatives=rulealternatives();

            state._fsp--;

             current =iv_rulealternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRulealternatives556); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulealternatives"


    // $ANTLR start "rulealternatives"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:241:1: rulealternatives returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseq_3_0= rulevideoseq ) )+ otherlv_4= '}' ) ;
    public final EObject rulealternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_videoseq_3_0 = null;


         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:244:28: ( (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseq_3_0= rulevideoseq ) )+ otherlv_4= '}' ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:245:1: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseq_3_0= rulevideoseq ) )+ otherlv_4= '}' )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:245:1: (otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseq_3_0= rulevideoseq ) )+ otherlv_4= '}' )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:245:3: otherlv_0= 'alternatives' ( (lv_id_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_videoseq_3_0= rulevideoseq ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_rulealternatives593); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
                
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:249:1: ( (lv_id_1_0= RULE_ID ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:250:1: (lv_id_1_0= RULE_ID )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:250:1: (lv_id_1_0= RULE_ID )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:251:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulealternatives610); 

            			newLeafNode(lv_id_1_0, grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulealternatives627); 

                	newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2());
                
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:271:1: ( (lv_videoseq_3_0= rulevideoseq ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_videoseq_3_0= rulevideoseq )
            	    {
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:272:1: (lv_videoseq_3_0= rulevideoseq )
            	    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:273:3: lv_videoseq_3_0= rulevideoseq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getVideoseqVideoseqParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulevideoseq_in_rulealternatives648);
            	    lv_videoseq_3_0=rulevideoseq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"videoseq",
            	            		lv_videoseq_3_0, 
            	            		"videoseq");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_rulealternatives661); 

                	newLeafNode(otherlv_4, grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulealternatives"


    // $ANTLR start "entryRulevideoseq"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:301:1: entryRulevideoseq returns [EObject current=null] : iv_rulevideoseq= rulevideoseq EOF ;
    public final EObject entryRulevideoseq() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevideoseq = null;


        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:302:2: (iv_rulevideoseq= rulevideoseq EOF )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:303:2: iv_rulevideoseq= rulevideoseq EOF
            {
             newCompositeNode(grammarAccess.getVideoseqRule()); 
            pushFollow(FOLLOW_rulevideoseq_in_entryRulevideoseq697);
            iv_rulevideoseq=rulevideoseq();

            state._fsp--;

             current =iv_rulevideoseq; 
            match(input,EOF,FOLLOW_EOF_in_entryRulevideoseq707); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevideoseq"


    // $ANTLR start "rulevideoseq"
    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:310:1: rulevideoseq returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject rulevideoseq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:313:28: ( (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:314:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:314:1: (otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:314:3: otherlv_0= 'videoseq' ( (lv_id_1_0= RULE_ID ) )? ( (lv_text_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_rulevideoseq744); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoseqAccess().getVideoseqKeyword_0());
                
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:318:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:319:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:319:1: (lv_id_1_0= RULE_ID )
                    // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:320:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulevideoseq761); 

                    			newLeafNode(lv_id_1_0, grammarAccess.getVideoseqAccess().getIdIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVideoseqRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:336:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:337:1: (lv_text_2_0= RULE_STRING )
            {
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:337:1: (lv_text_2_0= RULE_STRING )
            // ../istic.idm.project/src-gen/istic/idm/project/parser/antlr/internal/InternalVideoGen.g:338:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulevideoseq784); 

            			newLeafNode(lv_text_2_0, grammarAccess.getVideoseqAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVideoseqRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevideoseq"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleVideoGen122 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_ruletype_in_ruleVideoGen143 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_12_in_ruleVideoGen156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemandatory_in_ruletype249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoptional_in_ruletype276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealternatives_in_ruletype303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemandatory_in_entryRulemandatory338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemandatory348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rulemandatory385 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulevideoseq_in_rulemandatory407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoptional_in_entryRuleoptional442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoptional452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleoptional489 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulevideoseq_in_ruleoptional511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealternatives_in_entryRulealternatives546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulealternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulealternatives593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulealternatives610 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulealternatives627 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rulevideoseq_in_rulealternatives648 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_rulealternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevideoseq_in_entryRulevideoseq697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevideoseq707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rulevideoseq744 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_rulevideoseq761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulevideoseq784 = new BitSet(new long[]{0x0000000000000002L});

}