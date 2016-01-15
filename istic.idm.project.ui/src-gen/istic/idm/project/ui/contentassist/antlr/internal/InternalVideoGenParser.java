package istic.idm.project.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import istic.idm.project.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g"; }


     
     	private VideoGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVideoGen"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen61);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuletype"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:88:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:89:1: ( ruletype EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:90:1: ruletype EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruletype_in_entryRuletype121);
            ruletype();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuletype128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuletype"


    // $ANTLR start "ruletype"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:97:1: ruletype : ( ( rule__Type__Alternatives ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:101:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Type__Alternatives ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Type__Alternatives ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:103:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:104:1: ( rule__Type__Alternatives )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:104:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruletype154);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruletype"


    // $ANTLR start "entryRulemandatory"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRulemandatory : rulemandatory EOF ;
    public final void entryRulemandatory() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( rulemandatory EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: rulemandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_rulemandatory_in_entryRulemandatory181);
            rulemandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemandatory188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemandatory"


    // $ANTLR start "rulemandatory"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: rulemandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void rulemandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Mandatory__Group__0 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__Mandatory__Group__0 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_rulemandatory214);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemandatory"


    // $ANTLR start "entryRuleoptional"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleoptional : ruleoptional EOF ;
    public final void entryRuleoptional() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleoptional EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleoptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleoptional_in_entryRuleoptional241);
            ruleoptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoptional248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleoptional"


    // $ANTLR start "ruleoptional"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleoptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleoptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Optional__Group__0 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__Optional__Group__0 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleoptional274);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleoptional"


    // $ANTLR start "entryRulealternatives"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRulealternatives : rulealternatives EOF ;
    public final void entryRulealternatives() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( rulealternatives EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: rulealternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_rulealternatives_in_entryRulealternatives301);
            rulealternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulealternatives308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulealternatives"


    // $ANTLR start "rulealternatives"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: rulealternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void rulealternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Alternatives__Group__0 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__Alternatives__Group__0 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0_in_rulealternatives334);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulealternatives"


    // $ANTLR start "entryRulevideoseq"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRulevideoseq : rulevideoseq EOF ;
    public final void entryRulevideoseq() throws RecognitionException {
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( rulevideoseq EOF )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: rulevideoseq EOF
            {
             before(grammarAccess.getVideoseqRule()); 
            pushFollow(FOLLOW_rulevideoseq_in_entryRulevideoseq361);
            rulevideoseq();

            state._fsp--;

             after(grammarAccess.getVideoseqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevideoseq368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevideoseq"


    // $ANTLR start "rulevideoseq"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: rulevideoseq : ( ( rule__Videoseq__Group__0 ) ) ;
    public final void rulevideoseq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__Videoseq__Group__0 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Videoseq__Group__0 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Videoseq__Group__0 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__Videoseq__Group__0 )
            {
             before(grammarAccess.getVideoseqAccess().getGroup()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__Videoseq__Group__0 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__Videoseq__Group__0
            {
            pushFollow(FOLLOW_rule__Videoseq__Group__0_in_rulevideoseq394);
            rule__Videoseq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoseqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevideoseq"


    // $ANTLR start "rule__Type__Alternatives"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:228:1: rule__Type__Alternatives : ( ( rulemandatory ) | ( ruleoptional ) | ( rulealternatives ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:232:1: ( ( rulemandatory ) | ( ruleoptional ) | ( rulealternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( rulemandatory )
                    {
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( rulemandatory )
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: rulemandatory
                    {
                     before(grammarAccess.getTypeAccess().getMandatoryParserRuleCall_0()); 
                    pushFollow(FOLLOW_rulemandatory_in_rule__Type__Alternatives430);
                    rulemandatory();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getMandatoryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleoptional )
                    {
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:239:6: ( ruleoptional )
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:240:1: ruleoptional
                    {
                     before(grammarAccess.getTypeAccess().getOptionalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleoptional_in_rule__Type__Alternatives447);
                    ruleoptional();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getOptionalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( rulealternatives )
                    {
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:245:6: ( rulealternatives )
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:246:1: rulealternatives
                    {
                     before(grammarAccess.getTypeAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulealternatives_in_rule__Type__Alternatives464);
                    rulealternatives();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getAlternativesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:258:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:262:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:263:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:270:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen {' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:274:1: ( ( 'VideoGen {' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen {' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: ( 'VideoGen {' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:276:1: 'VideoGen {'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__VideoGen__Group__0__Impl525); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:289:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:293:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:294:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:301:1: rule__VideoGen__Group__1__Impl : ( ( rule__VideoGen__TypeAssignment_1 )* ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:305:1: ( ( ( rule__VideoGen__TypeAssignment_1 )* ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( ( rule__VideoGen__TypeAssignment_1 )* )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:306:1: ( ( rule__VideoGen__TypeAssignment_1 )* )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:307:1: ( rule__VideoGen__TypeAssignment_1 )*
            {
             before(grammarAccess.getVideoGenAccess().getTypeAssignment_1()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:308:1: ( rule__VideoGen__TypeAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=15)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:308:2: rule__VideoGen__TypeAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__TypeAssignment_1_in_rule__VideoGen__Group__1__Impl586);
            	    rule__VideoGen__TypeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:318:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:322:1: ( rule__VideoGen__Group__2__Impl )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:323:2: rule__VideoGen__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2617);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:329:1: rule__VideoGen__Group__2__Impl : ( '}' ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:333:1: ( ( '}' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:334:1: ( '}' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:334:1: ( '}' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:335:1: '}'
            {
             before(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__VideoGen__Group__2__Impl645); 
             after(grammarAccess.getVideoGenAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:354:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:358:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:359:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__0682);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__0685);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:366:1: rule__Mandatory__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:370:1: ( ( 'mandatory' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:371:1: ( 'mandatory' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:371:1: ( 'mandatory' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:372:1: 'mandatory'
            {
             before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Mandatory__Group__0__Impl713); 
             after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:385:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:389:1: ( rule__Mandatory__Group__1__Impl )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:390:2: rule__Mandatory__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__1744);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:396:1: rule__Mandatory__Group__1__Impl : ( rulevideoseq ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:400:1: ( ( rulevideoseq ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:401:1: ( rulevideoseq )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:401:1: ( rulevideoseq )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:402:1: rulevideoseq
            {
             before(grammarAccess.getMandatoryAccess().getVideoseqParserRuleCall_1()); 
            pushFollow(FOLLOW_rulevideoseq_in_rule__Mandatory__Group__1__Impl771);
            rulevideoseq();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getVideoseqParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:417:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:421:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:422:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__0804);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__0807);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:429:1: rule__Optional__Group__0__Impl : ( 'optional' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:433:1: ( ( 'optional' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:434:1: ( 'optional' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:434:1: ( 'optional' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:435:1: 'optional'
            {
             before(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Optional__Group__0__Impl835); 
             after(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:448:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:452:1: ( rule__Optional__Group__1__Impl )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:453:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__1866);
            rule__Optional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:459:1: rule__Optional__Group__1__Impl : ( rulevideoseq ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:463:1: ( ( rulevideoseq ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:464:1: ( rulevideoseq )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:464:1: ( rulevideoseq )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:465:1: rulevideoseq
            {
             before(grammarAccess.getOptionalAccess().getVideoseqParserRuleCall_1()); 
            pushFollow(FOLLOW_rulevideoseq_in_rule__Optional__Group__1__Impl893);
            rulevideoseq();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getVideoseqParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:480:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:484:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:485:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__0926);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__0929);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:492:1: rule__Alternatives__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:496:1: ( ( 'alternatives' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:497:1: ( 'alternatives' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:497:1: ( 'alternatives' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:498:1: 'alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Alternatives__Group__0__Impl957); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:511:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:515:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:516:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__1988);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__1991);
            rule__Alternatives__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:523:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__IdAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:527:1: ( ( ( rule__Alternatives__IdAssignment_1 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:528:1: ( ( rule__Alternatives__IdAssignment_1 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:528:1: ( ( rule__Alternatives__IdAssignment_1 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:529:1: ( rule__Alternatives__IdAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getIdAssignment_1()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:530:1: ( rule__Alternatives__IdAssignment_1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:530:2: rule__Alternatives__IdAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__IdAssignment_1_in_rule__Alternatives__Group__1__Impl1018);
            rule__Alternatives__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__2"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:540:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:544:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:545:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21048);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21051);
            rule__Alternatives__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2"


    // $ANTLR start "rule__Alternatives__Group__2__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:552:1: rule__Alternatives__Group__2__Impl : ( '{' ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:556:1: ( ( '{' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:557:1: ( '{' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:557:1: ( '{' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:558:1: '{'
            {
             before(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Alternatives__Group__2__Impl1079); 
             after(grammarAccess.getAlternativesAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group__3"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:571:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:575:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:576:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31110);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31113);
            rule__Alternatives__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3"


    // $ANTLR start "rule__Alternatives__Group__3__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:583:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__VideoseqAssignment_3 ) ) ( ( rule__Alternatives__VideoseqAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:587:1: ( ( ( ( rule__Alternatives__VideoseqAssignment_3 ) ) ( ( rule__Alternatives__VideoseqAssignment_3 )* ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:588:1: ( ( ( rule__Alternatives__VideoseqAssignment_3 ) ) ( ( rule__Alternatives__VideoseqAssignment_3 )* ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:588:1: ( ( ( rule__Alternatives__VideoseqAssignment_3 ) ) ( ( rule__Alternatives__VideoseqAssignment_3 )* ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:589:1: ( ( rule__Alternatives__VideoseqAssignment_3 ) ) ( ( rule__Alternatives__VideoseqAssignment_3 )* )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:589:1: ( ( rule__Alternatives__VideoseqAssignment_3 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:590:1: ( rule__Alternatives__VideoseqAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqAssignment_3()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:591:1: ( rule__Alternatives__VideoseqAssignment_3 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:591:2: rule__Alternatives__VideoseqAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__VideoseqAssignment_3_in_rule__Alternatives__Group__3__Impl1142);
            rule__Alternatives__VideoseqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getVideoseqAssignment_3()); 

            }

            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:594:1: ( ( rule__Alternatives__VideoseqAssignment_3 )* )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:595:1: ( rule__Alternatives__VideoseqAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqAssignment_3()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:596:1: ( rule__Alternatives__VideoseqAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:596:2: rule__Alternatives__VideoseqAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__VideoseqAssignment_3_in_rule__Alternatives__Group__3__Impl1154);
            	    rule__Alternatives__VideoseqAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getVideoseqAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3__Impl"


    // $ANTLR start "rule__Alternatives__Group__4"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:607:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:611:1: ( rule__Alternatives__Group__4__Impl )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:612:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41187);
            rule__Alternatives__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4"


    // $ANTLR start "rule__Alternatives__Group__4__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:618:1: rule__Alternatives__Group__4__Impl : ( '}' ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:622:1: ( ( '}' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:623:1: ( '}' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:623:1: ( '}' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:624:1: '}'
            {
             before(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_12_in_rule__Alternatives__Group__4__Impl1215); 
             after(grammarAccess.getAlternativesAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4__Impl"


    // $ANTLR start "rule__Videoseq__Group__0"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:647:1: rule__Videoseq__Group__0 : rule__Videoseq__Group__0__Impl rule__Videoseq__Group__1 ;
    public final void rule__Videoseq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:651:1: ( rule__Videoseq__Group__0__Impl rule__Videoseq__Group__1 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:652:2: rule__Videoseq__Group__0__Impl rule__Videoseq__Group__1
            {
            pushFollow(FOLLOW_rule__Videoseq__Group__0__Impl_in_rule__Videoseq__Group__01256);
            rule__Videoseq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videoseq__Group__1_in_rule__Videoseq__Group__01259);
            rule__Videoseq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__0"


    // $ANTLR start "rule__Videoseq__Group__0__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:659:1: rule__Videoseq__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__Videoseq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:663:1: ( ( 'videoseq' ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:664:1: ( 'videoseq' )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:664:1: ( 'videoseq' )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:665:1: 'videoseq'
            {
             before(grammarAccess.getVideoseqAccess().getVideoseqKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Videoseq__Group__0__Impl1287); 
             after(grammarAccess.getVideoseqAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__0__Impl"


    // $ANTLR start "rule__Videoseq__Group__1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:678:1: rule__Videoseq__Group__1 : rule__Videoseq__Group__1__Impl rule__Videoseq__Group__2 ;
    public final void rule__Videoseq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:682:1: ( rule__Videoseq__Group__1__Impl rule__Videoseq__Group__2 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:683:2: rule__Videoseq__Group__1__Impl rule__Videoseq__Group__2
            {
            pushFollow(FOLLOW_rule__Videoseq__Group__1__Impl_in_rule__Videoseq__Group__11318);
            rule__Videoseq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Videoseq__Group__2_in_rule__Videoseq__Group__11321);
            rule__Videoseq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__1"


    // $ANTLR start "rule__Videoseq__Group__1__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:690:1: rule__Videoseq__Group__1__Impl : ( ( rule__Videoseq__IdAssignment_1 )? ) ;
    public final void rule__Videoseq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:694:1: ( ( ( rule__Videoseq__IdAssignment_1 )? ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:695:1: ( ( rule__Videoseq__IdAssignment_1 )? )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:695:1: ( ( rule__Videoseq__IdAssignment_1 )? )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:696:1: ( rule__Videoseq__IdAssignment_1 )?
            {
             before(grammarAccess.getVideoseqAccess().getIdAssignment_1()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:697:1: ( rule__Videoseq__IdAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:697:2: rule__Videoseq__IdAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Videoseq__IdAssignment_1_in_rule__Videoseq__Group__1__Impl1348);
                    rule__Videoseq__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoseqAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__1__Impl"


    // $ANTLR start "rule__Videoseq__Group__2"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: rule__Videoseq__Group__2 : rule__Videoseq__Group__2__Impl ;
    public final void rule__Videoseq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:711:1: ( rule__Videoseq__Group__2__Impl )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:712:2: rule__Videoseq__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Videoseq__Group__2__Impl_in_rule__Videoseq__Group__21379);
            rule__Videoseq__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__2"


    // $ANTLR start "rule__Videoseq__Group__2__Impl"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:718:1: rule__Videoseq__Group__2__Impl : ( ( rule__Videoseq__TextAssignment_2 ) ) ;
    public final void rule__Videoseq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:722:1: ( ( ( rule__Videoseq__TextAssignment_2 ) ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:723:1: ( ( rule__Videoseq__TextAssignment_2 ) )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:723:1: ( ( rule__Videoseq__TextAssignment_2 ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:724:1: ( rule__Videoseq__TextAssignment_2 )
            {
             before(grammarAccess.getVideoseqAccess().getTextAssignment_2()); 
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:725:1: ( rule__Videoseq__TextAssignment_2 )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:725:2: rule__Videoseq__TextAssignment_2
            {
            pushFollow(FOLLOW_rule__Videoseq__TextAssignment_2_in_rule__Videoseq__Group__2__Impl1406);
            rule__Videoseq__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoseqAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__TypeAssignment_1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:742:1: rule__VideoGen__TypeAssignment_1 : ( ruletype ) ;
    public final void rule__VideoGen__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:746:1: ( ( ruletype ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:747:1: ( ruletype )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:747:1: ( ruletype )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:748:1: ruletype
            {
             before(grammarAccess.getVideoGenAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruletype_in_rule__VideoGen__TypeAssignment_11447);
            ruletype();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getTypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__TypeAssignment_1"


    // $ANTLR start "rule__Alternatives__IdAssignment_1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:757:1: rule__Alternatives__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:761:1: ( ( RULE_ID ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:762:1: ( RULE_ID )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:762:1: ( RULE_ID )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:763:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__IdAssignment_11478); 
             after(grammarAccess.getAlternativesAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__IdAssignment_1"


    // $ANTLR start "rule__Alternatives__VideoseqAssignment_3"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:772:1: rule__Alternatives__VideoseqAssignment_3 : ( rulevideoseq ) ;
    public final void rule__Alternatives__VideoseqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:776:1: ( ( rulevideoseq ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:777:1: ( rulevideoseq )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:777:1: ( rulevideoseq )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:778:1: rulevideoseq
            {
             before(grammarAccess.getAlternativesAccess().getVideoseqVideoseqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulevideoseq_in_rule__Alternatives__VideoseqAssignment_31509);
            rulevideoseq();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getVideoseqVideoseqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__VideoseqAssignment_3"


    // $ANTLR start "rule__Videoseq__IdAssignment_1"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:787:1: rule__Videoseq__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__Videoseq__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:791:1: ( ( RULE_ID ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:792:1: ( RULE_ID )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:792:1: ( RULE_ID )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:793:1: RULE_ID
            {
             before(grammarAccess.getVideoseqAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Videoseq__IdAssignment_11540); 
             after(grammarAccess.getVideoseqAccess().getIdIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__IdAssignment_1"


    // $ANTLR start "rule__Videoseq__TextAssignment_2"
    // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:802:1: rule__Videoseq__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Videoseq__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:806:1: ( ( RULE_STRING ) )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:807:1: ( RULE_STRING )
            {
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:807:1: ( RULE_STRING )
            // ../istic.idm.project.ui/src-gen/istic/idm/project/ui/contentassist/antlr/internal/InternalVideoGen.g:808:1: RULE_STRING
            {
             before(grammarAccess.getVideoseqAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Videoseq__TextAssignment_21571); 
             after(grammarAccess.getVideoseqAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Videoseq__TextAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruletype154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemandatory_in_entryRulemandatory181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemandatory188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_rulemandatory214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoptional_in_entryRuleoptional241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoptional248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleoptional274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealternatives_in_entryRulealternatives301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulealternatives308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0_in_rulealternatives334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevideoseq_in_entryRulevideoseq361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevideoseq368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__0_in_rulevideoseq394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemandatory_in_rule__Type__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoptional_in_rule__Type__Alternatives447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulealternatives_in_rule__Type__Alternatives464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0494 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__VideoGen__Group__0__Impl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1556 = new BitSet(new long[]{0x000000000000F000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__TypeAssignment_1_in_rule__VideoGen__Group__1__Impl586 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__VideoGen__Group__2__Impl645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__0682 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__0685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mandatory__Group__0__Impl713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__1744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevideoseq_in_rule__Mandatory__Group__1__Impl771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__0804 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__0807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Optional__Group__0__Impl835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevideoseq_in_rule__Optional__Group__1__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__0926 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__0929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Alternatives__Group__0__Impl957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__1988 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__IdAssignment_1_in_rule__Alternatives__Group__1__Impl1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21048 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Alternatives__Group__2__Impl1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__VideoseqAssignment_3_in_rule__Alternatives__Group__3__Impl1142 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Alternatives__VideoseqAssignment_3_in_rule__Alternatives__Group__3__Impl1154 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Alternatives__Group__4__Impl1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__0__Impl_in_rule__Videoseq__Group__01256 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__1_in_rule__Videoseq__Group__01259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Videoseq__Group__0__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__1__Impl_in_rule__Videoseq__Group__11318 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__2_in_rule__Videoseq__Group__11321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__IdAssignment_1_in_rule__Videoseq__Group__1__Impl1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__Group__2__Impl_in_rule__Videoseq__Group__21379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Videoseq__TextAssignment_2_in_rule__Videoseq__Group__2__Impl1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__VideoGen__TypeAssignment_11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__IdAssignment_11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevideoseq_in_rule__Alternatives__VideoseqAssignment_31509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Videoseq__IdAssignment_11540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Videoseq__TextAssignment_21571 = new BitSet(new long[]{0x0000000000000002L});

}