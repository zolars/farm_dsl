package uk.ac.kcl.farm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.farm.services.FarmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFarmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'crop'", "'machine'", "'field'", "'mission'", "'real'", "'string'", "'null'", "'boolean'", "'var'", "'='", "'while'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'.'", "'||'", "'&&'", "'<'", "'<='", "'=='", "'>='", "'>'", "'['", "']'", "'true'", "'false'", "'define'", "'name'", "':'", "'stage'", "','", "'timeConsumed'", "'ip'", "'task'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalFarmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFarmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFarmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFarm.g"; }



     	private FarmGrammarAccess grammarAccess;

        public InternalFarmParser(TokenStream input, FarmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "FarmProgram";
       	}

       	@Override
       	protected FarmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFarmProgram"
    // InternalFarm.g:64:1: entryRuleFarmProgram returns [EObject current=null] : iv_ruleFarmProgram= ruleFarmProgram EOF ;
    public final EObject entryRuleFarmProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFarmProgram = null;


        try {
            // InternalFarm.g:64:52: (iv_ruleFarmProgram= ruleFarmProgram EOF )
            // InternalFarm.g:65:2: iv_ruleFarmProgram= ruleFarmProgram EOF
            {
             newCompositeNode(grammarAccess.getFarmProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFarmProgram=ruleFarmProgram();

            state._fsp--;

             current =iv_ruleFarmProgram; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFarmProgram"


    // $ANTLR start "ruleFarmProgram"
    // InternalFarm.g:71:1: ruleFarmProgram returns [EObject current=null] : ( ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) ) )* ;
    public final EObject ruleFarmProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_1 = null;

        EObject lv_statements_0_2 = null;



        	enterRule();

        try {
            // InternalFarm.g:77:2: ( ( ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) ) )* )
            // InternalFarm.g:78:2: ( ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) ) )*
            {
            // InternalFarm.g:78:2: ( ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=11 && LA2_0<=14)||LA2_0==42) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFarm.g:79:3: ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) )
            	    {
            	    // InternalFarm.g:79:3: ( (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration ) )
            	    // InternalFarm.g:80:4: (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration )
            	    {
            	    // InternalFarm.g:80:4: (lv_statements_0_1= ruleClass | lv_statements_0_2= ruleAttributeDeclaration )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=11 && LA1_0<=14)) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==42) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalFarm.g:81:5: lv_statements_0_1= ruleClass
            	            {

            	            					newCompositeNode(grammarAccess.getFarmProgramAccess().getStatementsClassParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_statements_0_1=ruleClass();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getFarmProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"statements",
            	            						lv_statements_0_1,
            	            						"uk.ac.kcl.farm.Farm.Class");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalFarm.g:97:5: lv_statements_0_2= ruleAttributeDeclaration
            	            {

            	            					newCompositeNode(grammarAccess.getFarmProgramAccess().getStatementsAttributeDeclarationParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_statements_0_2=ruleAttributeDeclaration();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getFarmProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"statements",
            	            						lv_statements_0_2,
            	            						"uk.ac.kcl.farm.Farm.AttributeDeclaration");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleFarmProgram"


    // $ANTLR start "entryRuleClass"
    // InternalFarm.g:118:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalFarm.g:118:46: (iv_ruleClass= ruleClass EOF )
            // InternalFarm.g:119:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalFarm.g:125:1: ruleClass returns [EObject current=null] : (this_Crop_0= ruleCrop | this_Machine_1= ruleMachine | this_Field_2= ruleField | this_Mission_3= ruleMission ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        EObject this_Crop_0 = null;

        EObject this_Machine_1 = null;

        EObject this_Field_2 = null;

        EObject this_Mission_3 = null;



        	enterRule();

        try {
            // InternalFarm.g:131:2: ( (this_Crop_0= ruleCrop | this_Machine_1= ruleMachine | this_Field_2= ruleField | this_Mission_3= ruleMission ) )
            // InternalFarm.g:132:2: (this_Crop_0= ruleCrop | this_Machine_1= ruleMachine | this_Field_2= ruleField | this_Mission_3= ruleMission )
            {
            // InternalFarm.g:132:2: (this_Crop_0= ruleCrop | this_Machine_1= ruleMachine | this_Field_2= ruleField | this_Mission_3= ruleMission )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFarm.g:133:3: this_Crop_0= ruleCrop
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getCropParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Crop_0=ruleCrop();

                    state._fsp--;


                    			current = this_Crop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:142:3: this_Machine_1= ruleMachine
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getMachineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Machine_1=ruleMachine();

                    state._fsp--;


                    			current = this_Machine_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFarm.g:151:3: this_Field_2= ruleField
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getFieldParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Field_2=ruleField();

                    state._fsp--;


                    			current = this_Field_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalFarm.g:160:3: this_Mission_3= ruleMission
                    {

                    			newCompositeNode(grammarAccess.getClassAccess().getMissionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mission_3=ruleMission();

                    state._fsp--;


                    			current = this_Mission_3;
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleParam"
    // InternalFarm.g:172:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalFarm.g:172:46: (iv_ruleParam= ruleParam EOF )
            // InternalFarm.g:173:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalFarm.g:179:1: ruleParam returns [EObject current=null] : ( (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) ) | (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) ) | (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) ) | (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) ) | (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) ) | (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) ) ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_param_1_0=null;
        Token otherlv_2=null;
        Token lv_param_3_0=null;
        Token otherlv_4=null;
        Token lv_param_5_0=null;
        Token otherlv_6=null;
        Token lv_param_7_0=null;
        Token otherlv_8=null;
        Token lv_param_9_0=null;
        Token otherlv_10=null;
        Token lv_param_11_0=null;


        	enterRule();

        try {
            // InternalFarm.g:185:2: ( ( (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) ) | (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) ) | (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) ) | (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) ) | (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) ) | (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) ) ) )
            // InternalFarm.g:186:2: ( (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) ) | (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) ) | (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) ) | (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) ) | (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) ) | (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) ) )
            {
            // InternalFarm.g:186:2: ( (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) ) | (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) ) | (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) ) | (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) ) | (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) ) | (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalFarm.g:187:3: (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:187:3: (otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) ) )
                    // InternalFarm.g:188:4: otherlv_0= 'crop' ( (lv_param_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getParamAccess().getCropKeyword_0_0());
                    			
                    // InternalFarm.g:192:4: ( (lv_param_1_0= RULE_ID ) )
                    // InternalFarm.g:193:5: (lv_param_1_0= RULE_ID )
                    {
                    // InternalFarm.g:193:5: (lv_param_1_0= RULE_ID )
                    // InternalFarm.g:194:6: lv_param_1_0= RULE_ID
                    {
                    lv_param_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_1_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFarm.g:212:3: (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:212:3: (otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) ) )
                    // InternalFarm.g:213:4: otherlv_2= 'machine' ( (lv_param_3_0= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getParamAccess().getMachineKeyword_1_0());
                    			
                    // InternalFarm.g:217:4: ( (lv_param_3_0= RULE_ID ) )
                    // InternalFarm.g:218:5: (lv_param_3_0= RULE_ID )
                    {
                    // InternalFarm.g:218:5: (lv_param_3_0= RULE_ID )
                    // InternalFarm.g:219:6: lv_param_3_0= RULE_ID
                    {
                    lv_param_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_3_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalFarm.g:237:3: (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:237:3: (otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) ) )
                    // InternalFarm.g:238:4: otherlv_4= 'field' ( (lv_param_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getParamAccess().getFieldKeyword_2_0());
                    			
                    // InternalFarm.g:242:4: ( (lv_param_5_0= RULE_ID ) )
                    // InternalFarm.g:243:5: (lv_param_5_0= RULE_ID )
                    {
                    // InternalFarm.g:243:5: (lv_param_5_0= RULE_ID )
                    // InternalFarm.g:244:6: lv_param_5_0= RULE_ID
                    {
                    lv_param_5_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_5_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_5_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalFarm.g:262:3: (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:262:3: (otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) ) )
                    // InternalFarm.g:263:4: otherlv_6= 'mission' ( (lv_param_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getParamAccess().getMissionKeyword_3_0());
                    			
                    // InternalFarm.g:267:4: ( (lv_param_7_0= RULE_ID ) )
                    // InternalFarm.g:268:5: (lv_param_7_0= RULE_ID )
                    {
                    // InternalFarm.g:268:5: (lv_param_7_0= RULE_ID )
                    // InternalFarm.g:269:6: lv_param_7_0= RULE_ID
                    {
                    lv_param_7_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_7_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalFarm.g:287:3: (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:287:3: (otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) ) )
                    // InternalFarm.g:288:4: otherlv_8= 'real' ( (lv_param_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getParamAccess().getRealKeyword_4_0());
                    			
                    // InternalFarm.g:292:4: ( (lv_param_9_0= RULE_ID ) )
                    // InternalFarm.g:293:5: (lv_param_9_0= RULE_ID )
                    {
                    // InternalFarm.g:293:5: (lv_param_9_0= RULE_ID )
                    // InternalFarm.g:294:6: lv_param_9_0= RULE_ID
                    {
                    lv_param_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_9_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalFarm.g:312:3: (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) )
                    {
                    // InternalFarm.g:312:3: (otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) ) )
                    // InternalFarm.g:313:4: otherlv_10= 'string' ( (lv_param_11_0= RULE_ID ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getParamAccess().getStringKeyword_5_0());
                    			
                    // InternalFarm.g:317:4: ( (lv_param_11_0= RULE_ID ) )
                    // InternalFarm.g:318:5: (lv_param_11_0= RULE_ID )
                    {
                    // InternalFarm.g:318:5: (lv_param_11_0= RULE_ID )
                    // InternalFarm.g:319:6: lv_param_11_0= RULE_ID
                    {
                    lv_param_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_param_11_0, grammarAccess.getParamAccess().getParamIDTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"param",
                    							lv_param_11_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleTypeName"
    // InternalFarm.g:340:1: entryRuleTypeName returns [String current=null] : iv_ruleTypeName= ruleTypeName EOF ;
    public final String entryRuleTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTypeName = null;


        try {
            // InternalFarm.g:340:48: (iv_ruleTypeName= ruleTypeName EOF )
            // InternalFarm.g:341:2: iv_ruleTypeName= ruleTypeName EOF
            {
             newCompositeNode(grammarAccess.getTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeName=ruleTypeName();

            state._fsp--;

             current =iv_ruleTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTypeName"


    // $ANTLR start "ruleTypeName"
    // InternalFarm.g:347:1: ruleTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'null' | kw= 'real' | kw= 'boolean' | kw= 'string' ) ;
    public final AntlrDatatypeRuleToken ruleTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalFarm.g:353:2: ( (kw= 'null' | kw= 'real' | kw= 'boolean' | kw= 'string' ) )
            // InternalFarm.g:354:2: (kw= 'null' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            {
            // InternalFarm.g:354:2: (kw= 'null' | kw= 'real' | kw= 'boolean' | kw= 'string' )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalFarm.g:355:3: kw= 'null'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeNameAccess().getNullKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:361:3: kw= 'real'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeNameAccess().getRealKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalFarm.g:367:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeNameAccess().getBooleanKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalFarm.g:373:3: kw= 'string'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeNameAccess().getStringKeyword_3());
                    		

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
    // $ANTLR end "ruleTypeName"


    // $ANTLR start "entryRuleStatement"
    // InternalFarm.g:382:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalFarm.g:382:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalFarm.g:383:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalFarm.g:389:1: ruleStatement returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_LoopStatement_1= ruleLoopStatement ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_LoopStatement_1 = null;



        	enterRule();

        try {
            // InternalFarm.g:395:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_LoopStatement_1= ruleLoopStatement ) )
            // InternalFarm.g:396:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_LoopStatement_1= ruleLoopStatement )
            {
            // InternalFarm.g:396:2: (this_VariableDeclaration_0= ruleVariableDeclaration | this_LoopStatement_1= ruleLoopStatement )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalFarm.g:397:3: this_VariableDeclaration_0= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_0=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:406:3: this_LoopStatement_1= ruleLoopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LoopStatement_1=ruleLoopStatement();

                    state._fsp--;


                    			current = this_LoopStatement_1;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalFarm.g:418:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalFarm.g:418:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalFarm.g:419:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalFarm.g:425:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleVariableExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:431:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleVariableExpression ) ) ) )
            // InternalFarm.g:432:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleVariableExpression ) ) )
            {
            // InternalFarm.g:432:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleVariableExpression ) ) )
            // InternalFarm.g:433:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleVariableExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalFarm.g:437:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:438:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:438:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:439:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalFarm.g:459:3: ( (lv_value_3_0= ruleVariableExpression ) )
            // InternalFarm.g:460:4: (lv_value_3_0= ruleVariableExpression )
            {
            // InternalFarm.g:460:4: (lv_value_3_0= ruleVariableExpression )
            // InternalFarm.g:461:5: lv_value_3_0= ruleVariableExpression
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValueVariableExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleVariableExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"uk.ac.kcl.farm.Farm.VariableExpression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleVariableExpression"
    // InternalFarm.g:482:1: entryRuleVariableExpression returns [EObject current=null] : iv_ruleVariableExpression= ruleVariableExpression EOF ;
    public final EObject entryRuleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableExpression = null;


        try {
            // InternalFarm.g:482:59: (iv_ruleVariableExpression= ruleVariableExpression EOF )
            // InternalFarm.g:483:2: iv_ruleVariableExpression= ruleVariableExpression EOF
            {
             newCompositeNode(grammarAccess.getVariableExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableExpression=ruleVariableExpression();

            state._fsp--;

             current =iv_ruleVariableExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariableExpression"


    // $ANTLR start "ruleVariableExpression"
    // InternalFarm.g:489:1: ruleVariableExpression returns [EObject current=null] : (this_RealExpression_0= ruleRealExpression | this_ConditionExpression_1= ruleConditionExpression ) ;
    public final EObject ruleVariableExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RealExpression_0 = null;

        EObject this_ConditionExpression_1 = null;



        	enterRule();

        try {
            // InternalFarm.g:495:2: ( (this_RealExpression_0= ruleRealExpression | this_ConditionExpression_1= ruleConditionExpression ) )
            // InternalFarm.g:496:2: (this_RealExpression_0= ruleRealExpression | this_ConditionExpression_1= ruleConditionExpression )
            {
            // InternalFarm.g:496:2: (this_RealExpression_0= ruleRealExpression | this_ConditionExpression_1= ruleConditionExpression )
            int alt7=2;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 30:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
            case 22:
                {
                alt7=1;
                }
                break;
            case 38:
            case 40:
            case 41:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalFarm.g:497:3: this_RealExpression_0= ruleRealExpression
                    {

                    			newCompositeNode(grammarAccess.getVariableExpressionAccess().getRealExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealExpression_0=ruleRealExpression();

                    state._fsp--;


                    			current = this_RealExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:506:3: this_ConditionExpression_1= ruleConditionExpression
                    {

                    			newCompositeNode(grammarAccess.getVariableExpressionAccess().getConditionExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionExpression_1=ruleConditionExpression();

                    state._fsp--;


                    			current = this_ConditionExpression_1;
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
    // $ANTLR end "ruleVariableExpression"


    // $ANTLR start "entryRuleLoopStatement"
    // InternalFarm.g:518:1: entryRuleLoopStatement returns [EObject current=null] : iv_ruleLoopStatement= ruleLoopStatement EOF ;
    public final EObject entryRuleLoopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopStatement = null;


        try {
            // InternalFarm.g:518:54: (iv_ruleLoopStatement= ruleLoopStatement EOF )
            // InternalFarm.g:519:2: iv_ruleLoopStatement= ruleLoopStatement EOF
            {
             newCompositeNode(grammarAccess.getLoopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoopStatement=ruleLoopStatement();

            state._fsp--;

             current =iv_ruleLoopStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLoopStatement"


    // $ANTLR start "ruleLoopStatement"
    // InternalFarm.g:525:1: ruleLoopStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )+ otherlv_6= '}' ) ;
    public final EObject ruleLoopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:531:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )+ otherlv_6= '}' ) )
            // InternalFarm.g:532:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )+ otherlv_6= '}' )
            {
            // InternalFarm.g:532:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )+ otherlv_6= '}' )
            // InternalFarm.g:533:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_condition_2_0= ruleConditionExpression ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopStatementAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalFarm.g:541:3: ( (lv_condition_2_0= ruleConditionExpression ) )
            // InternalFarm.g:542:4: (lv_condition_2_0= ruleConditionExpression )
            {
            // InternalFarm.g:542:4: (lv_condition_2_0= ruleConditionExpression )
            // InternalFarm.g:543:5: lv_condition_2_0= ruleConditionExpression
            {

            					newCompositeNode(grammarAccess.getLoopStatementAccess().getConditionConditionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_condition_2_0=ruleConditionExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"uk.ac.kcl.farm.Farm.ConditionExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getLoopStatementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getLoopStatementAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalFarm.g:568:3: ( (lv_statements_5_0= ruleStatement ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19||LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalFarm.g:569:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalFarm.g:569:4: (lv_statements_5_0= ruleStatement )
            	    // InternalFarm.g:570:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getLoopStatementAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLoopStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"uk.ac.kcl.farm.Farm.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLoopStatementAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLoopStatement"


    // $ANTLR start "entryRuleRealExpression"
    // InternalFarm.g:595:1: entryRuleRealExpression returns [EObject current=null] : iv_ruleRealExpression= ruleRealExpression EOF ;
    public final EObject entryRuleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealExpression = null;


        try {
            // InternalFarm.g:595:55: (iv_ruleRealExpression= ruleRealExpression EOF )
            // InternalFarm.g:596:2: iv_ruleRealExpression= ruleRealExpression EOF
            {
             newCompositeNode(grammarAccess.getRealExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealExpression=ruleRealExpression();

            state._fsp--;

             current =iv_ruleRealExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealExpression"


    // $ANTLR start "ruleRealExpression"
    // InternalFarm.g:602:1: ruleRealExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleRealExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:608:2: (this_Addition_0= ruleAddition )
            // InternalFarm.g:609:2: this_Addition_0= ruleAddition
            {

            		newCompositeNode(grammarAccess.getRealExpressionAccess().getAdditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Addition_0=ruleAddition();

            state._fsp--;


            		current = this_Addition_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleRealExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalFarm.g:620:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalFarm.g:620:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalFarm.g:621:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalFarm.g:627:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:633:2: ( (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* ) )
            // InternalFarm.g:634:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            {
            // InternalFarm.g:634:2: (this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )* )
            // InternalFarm.g:635:3: this_Multiplication_0= ruleMultiplication ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;


            			current = this_Multiplication_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFarm.g:643:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFarm.g:644:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultiplication ) )
            	    {
            	    // InternalFarm.g:644:4: ()
            	    // InternalFarm.g:645:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFarm.g:651:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalFarm.g:652:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalFarm.g:652:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalFarm.g:653:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalFarm.g:653:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==26) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==27) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalFarm.g:654:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,26,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFarm.g:665:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,27,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getAdditionRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalFarm.g:678:4: ( (lv_right_3_0= ruleMultiplication ) )
            	    // InternalFarm.g:679:5: (lv_right_3_0= ruleMultiplication )
            	    {
            	    // InternalFarm.g:679:5: (lv_right_3_0= ruleMultiplication )
            	    // InternalFarm.g:680:6: lv_right_3_0= ruleMultiplication
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=ruleMultiplication();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.farm.Farm.Multiplication");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalFarm.g:702:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // InternalFarm.g:702:55: (iv_ruleMultiplication= ruleMultiplication EOF )
            // InternalFarm.g:703:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             newCompositeNode(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalFarm.g:709:1: ruleMultiplication returns [EObject current=null] : (this_RealPrimary_0= ruleRealPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_RealPrimary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:715:2: ( (this_RealPrimary_0= ruleRealPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )* ) )
            // InternalFarm.g:716:2: (this_RealPrimary_0= ruleRealPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )* )
            {
            // InternalFarm.g:716:2: (this_RealPrimary_0= ruleRealPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )* )
            // InternalFarm.g:717:3: this_RealPrimary_0= ruleRealPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplicationAccess().getRealPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_RealPrimary_0=ruleRealPrimary();

            state._fsp--;


            			current = this_RealPrimary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFarm.g:725:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=28 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalFarm.g:726:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_right_3_0= ruleRealPrimary ) )
            	    {
            	    // InternalFarm.g:726:4: ()
            	    // InternalFarm.g:727:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultiplicationAccess().getMultiplicationLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFarm.g:733:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalFarm.g:734:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalFarm.g:734:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalFarm.g:735:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalFarm.g:735:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==28) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==29) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalFarm.g:736:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,28,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getMultiplicationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFarm.g:747:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,29,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getMultiplicationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultiplicationRule());
            	            							}
            	            							addWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalFarm.g:760:4: ( (lv_right_3_0= ruleRealPrimary ) )
            	    // InternalFarm.g:761:5: (lv_right_3_0= ruleRealPrimary )
            	    {
            	    // InternalFarm.g:761:5: (lv_right_3_0= ruleRealPrimary )
            	    // InternalFarm.g:762:6: lv_right_3_0= ruleRealPrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultiplicationAccess().getRightRealPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=ruleRealPrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.farm.Farm.RealPrimary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRuleRealPrimary"
    // InternalFarm.g:784:1: entryRuleRealPrimary returns [EObject current=null] : iv_ruleRealPrimary= ruleRealPrimary EOF ;
    public final EObject entryRuleRealPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealPrimary = null;


        try {
            // InternalFarm.g:784:52: (iv_ruleRealPrimary= ruleRealPrimary EOF )
            // InternalFarm.g:785:2: iv_ruleRealPrimary= ruleRealPrimary EOF
            {
             newCompositeNode(grammarAccess.getRealPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealPrimary=ruleRealPrimary();

            state._fsp--;

             current =iv_ruleRealPrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealPrimary"


    // $ANTLR start "ruleRealPrimary"
    // InternalFarm.g:791:1: ruleRealPrimary returns [EObject current=null] : (this_RealLiteral_0= ruleRealLiteral | this_RealVarExpression_1= ruleRealVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject ruleRealPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_RealLiteral_0 = null;

        EObject this_RealVarExpression_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalFarm.g:797:2: ( (this_RealLiteral_0= ruleRealLiteral | this_RealVarExpression_1= ruleRealVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalFarm.g:798:2: (this_RealLiteral_0= ruleRealLiteral | this_RealVarExpression_1= ruleRealVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalFarm.g:798:2: (this_RealLiteral_0= ruleRealLiteral | this_RealVarExpression_1= ruleRealVarExpression | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 30:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalFarm.g:799:3: this_RealLiteral_0= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getRealPrimaryAccess().getRealLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_0=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:808:3: this_RealVarExpression_1= ruleRealVarExpression
                    {

                    			newCompositeNode(grammarAccess.getRealPrimaryAccess().getRealVarExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealVarExpression_1=ruleRealVarExpression();

                    state._fsp--;


                    			current = this_RealVarExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalFarm.g:817:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalFarm.g:817:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalFarm.g:818:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getRealPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getRealPrimaryAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getRealPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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
    // $ANTLR end "ruleRealPrimary"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalFarm.g:839:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalFarm.g:839:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalFarm.g:840:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalFarm.g:846:1: ruleRealLiteral returns [EObject current=null] : ( (lv_val_0_0= ruleREAL ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_val_0_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:852:2: ( ( (lv_val_0_0= ruleREAL ) ) )
            // InternalFarm.g:853:2: ( (lv_val_0_0= ruleREAL ) )
            {
            // InternalFarm.g:853:2: ( (lv_val_0_0= ruleREAL ) )
            // InternalFarm.g:854:3: (lv_val_0_0= ruleREAL )
            {
            // InternalFarm.g:854:3: (lv_val_0_0= ruleREAL )
            // InternalFarm.g:855:4: lv_val_0_0= ruleREAL
            {

            				newCompositeNode(grammarAccess.getRealLiteralAccess().getValREALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_val_0_0=ruleREAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            				}
            				set(
            					current,
            					"val",
            					lv_val_0_0,
            					"uk.ac.kcl.farm.Farm.REAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "entryRuleRealVarExpression"
    // InternalFarm.g:875:1: entryRuleRealVarExpression returns [EObject current=null] : iv_ruleRealVarExpression= ruleRealVarExpression EOF ;
    public final EObject entryRuleRealVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealVarExpression = null;


        try {
            // InternalFarm.g:875:58: (iv_ruleRealVarExpression= ruleRealVarExpression EOF )
            // InternalFarm.g:876:2: iv_ruleRealVarExpression= ruleRealVarExpression EOF
            {
             newCompositeNode(grammarAccess.getRealVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealVarExpression=ruleRealVarExpression();

            state._fsp--;

             current =iv_ruleRealVarExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRealVarExpression"


    // $ANTLR start "ruleRealVarExpression"
    // InternalFarm.g:882:1: ruleRealVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRealVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFarm.g:888:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFarm.g:889:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFarm.g:889:2: ( (otherlv_0= RULE_ID ) )
            // InternalFarm.g:890:3: (otherlv_0= RULE_ID )
            {
            // InternalFarm.g:890:3: (otherlv_0= RULE_ID )
            // InternalFarm.g:891:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRealVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRealVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleRealVarExpression"


    // $ANTLR start "entryRuleREAL"
    // InternalFarm.g:905:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFarm.g:907:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalFarm.g:908:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalFarm.g:917:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalFarm.g:924:2: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // InternalFarm.g:925:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFarm.g:925:2: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // InternalFarm.g:926:3: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // InternalFarm.g:926:3: (this_INT_0= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalFarm.g:927:4: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,30,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleConditionExpression"
    // InternalFarm.g:954:1: entryRuleConditionExpression returns [EObject current=null] : iv_ruleConditionExpression= ruleConditionExpression EOF ;
    public final EObject entryRuleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpression = null;


        try {
            // InternalFarm.g:954:60: (iv_ruleConditionExpression= ruleConditionExpression EOF )
            // InternalFarm.g:955:2: iv_ruleConditionExpression= ruleConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionExpression=ruleConditionExpression();

            state._fsp--;

             current =iv_ruleConditionExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConditionExpression"


    // $ANTLR start "ruleConditionExpression"
    // InternalFarm.g:961:1: ruleConditionExpression returns [EObject current=null] : this_OrExpression_0= ruleOrExpression ;
    public final EObject ruleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpression_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:967:2: (this_OrExpression_0= ruleOrExpression )
            // InternalFarm.g:968:2: this_OrExpression_0= ruleOrExpression
            {

            		newCompositeNode(grammarAccess.getConditionExpressionAccess().getOrExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;


            		current = this_OrExpression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleConditionExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalFarm.g:979:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // InternalFarm.g:979:53: (iv_ruleOrExpression= ruleOrExpression EOF )
            // InternalFarm.g:980:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
             newCompositeNode(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;

             current =iv_ruleOrExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalFarm.g:986:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:992:2: ( (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalFarm.g:993:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalFarm.g:993:2: (this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalFarm.g:994:3: this_AndExpression_0= ruleAndExpression ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFarm.g:1002:3: ( () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalFarm.g:1003:4: () ( (lv_operator_2_0= '||' ) ) ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalFarm.g:1003:4: ()
            	    // InternalFarm.g:1004:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrExpressionAccess().getOrExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFarm.g:1010:4: ( (lv_operator_2_0= '||' ) )
            	    // InternalFarm.g:1011:5: (lv_operator_2_0= '||' )
            	    {
            	    // InternalFarm.g:1011:5: (lv_operator_2_0= '||' )
            	    // InternalFarm.g:1012:6: lv_operator_2_0= '||'
            	    {
            	    lv_operator_2_0=(Token)match(input,31,FOLLOW_6); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getOrExpressionAccess().getOperatorVerticalLineVerticalLineKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrExpressionRule());
            	    						}
            	    						addWithLastConsumed(current, "operator", lv_operator_2_0, "||");
            	    					

            	    }


            	    }

            	    // InternalFarm.g:1024:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalFarm.g:1025:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalFarm.g:1025:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalFarm.g:1026:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getOrExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.farm.Farm.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalFarm.g:1048:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalFarm.g:1048:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalFarm.g:1049:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalFarm.g:1055:1: ruleAndExpression returns [EObject current=null] : (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_ComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1061:2: ( (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* ) )
            // InternalFarm.g:1062:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            {
            // InternalFarm.g:1062:2: (this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )* )
            // InternalFarm.g:1063:3: this_ComparisonExpression_0= ruleComparisonExpression ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getComparisonExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_18);
            this_ComparisonExpression_0=ruleComparisonExpression();

            state._fsp--;


            			current = this_ComparisonExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFarm.g:1071:3: ( () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFarm.g:1072:4: () ( (lv_operator_2_0= '&&' ) ) ( (lv_right_3_0= ruleComparisonExpression ) )
            	    {
            	    // InternalFarm.g:1072:4: ()
            	    // InternalFarm.g:1073:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFarm.g:1079:4: ( (lv_operator_2_0= '&&' ) )
            	    // InternalFarm.g:1080:5: (lv_operator_2_0= '&&' )
            	    {
            	    // InternalFarm.g:1080:5: (lv_operator_2_0= '&&' )
            	    // InternalFarm.g:1081:6: lv_operator_2_0= '&&'
            	    {
            	    lv_operator_2_0=(Token)match(input,32,FOLLOW_6); 

            	    						newLeafNode(lv_operator_2_0, grammarAccess.getAndExpressionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndExpressionRule());
            	    						}
            	    						addWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
            	    					

            	    }


            	    }

            	    // InternalFarm.g:1093:4: ( (lv_right_3_0= ruleComparisonExpression ) )
            	    // InternalFarm.g:1094:5: (lv_right_3_0= ruleComparisonExpression )
            	    {
            	    // InternalFarm.g:1094:5: (lv_right_3_0= ruleComparisonExpression )
            	    // InternalFarm.g:1095:6: lv_right_3_0= ruleComparisonExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightComparisonExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_right_3_0=ruleComparisonExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.farm.Farm.ComparisonExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalFarm.g:1117:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalFarm.g:1117:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalFarm.g:1118:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;

             current =iv_ruleComparisonExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalFarm.g:1124:1: ruleComparisonExpression returns [EObject current=null] : (this_BooleanPrimary_0= ruleBooleanPrimary ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )* ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        Token lv_operator_2_3=null;
        Token lv_operator_2_4=null;
        Token lv_operator_2_5=null;
        EObject this_BooleanPrimary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1130:2: ( (this_BooleanPrimary_0= ruleBooleanPrimary ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )* ) )
            // InternalFarm.g:1131:2: (this_BooleanPrimary_0= ruleBooleanPrimary ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )* )
            {
            // InternalFarm.g:1131:2: (this_BooleanPrimary_0= ruleBooleanPrimary ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )* )
            // InternalFarm.g:1132:3: this_BooleanPrimary_0= ruleBooleanPrimary ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonExpressionAccess().getBooleanPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_BooleanPrimary_0=ruleBooleanPrimary();

            state._fsp--;


            			current = this_BooleanPrimary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalFarm.g:1140:3: ( () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=33 && LA18_0<=37)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalFarm.g:1141:4: () ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) ) ( (lv_right_3_0= ruleBooleanPrimary ) )
            	    {
            	    // InternalFarm.g:1141:4: ()
            	    // InternalFarm.g:1142:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalFarm.g:1148:4: ( ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) ) )
            	    // InternalFarm.g:1149:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    {
            	    // InternalFarm.g:1149:5: ( (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' ) )
            	    // InternalFarm.g:1150:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    {
            	    // InternalFarm.g:1150:6: (lv_operator_2_1= '<' | lv_operator_2_2= '<=' | lv_operator_2_3= '==' | lv_operator_2_4= '>=' | lv_operator_2_5= '>' )
            	    int alt17=5;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // InternalFarm.g:1151:7: lv_operator_2_1= '<'
            	            {
            	            lv_operator_2_1=(Token)match(input,33,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalFarm.g:1162:7: lv_operator_2_2= '<='
            	            {
            	            lv_operator_2_2=(Token)match(input,34,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getComparisonExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalFarm.g:1173:7: lv_operator_2_3= '=='
            	            {
            	            lv_operator_2_3=(Token)match(input,35,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_3, grammarAccess.getComparisonExpressionAccess().getOperatorEqualsSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalFarm.g:1184:7: lv_operator_2_4= '>='
            	            {
            	            lv_operator_2_4=(Token)match(input,36,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_4, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_4, null);
            	            						

            	            }
            	            break;
            	        case 5 :
            	            // InternalFarm.g:1195:7: lv_operator_2_5= '>'
            	            {
            	            lv_operator_2_5=(Token)match(input,37,FOLLOW_6); 

            	            							newLeafNode(lv_operator_2_5, grammarAccess.getComparisonExpressionAccess().getOperatorGreaterThanSignKeyword_1_1_0_4());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonExpressionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_5, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalFarm.g:1208:4: ( (lv_right_3_0= ruleBooleanPrimary ) )
            	    // InternalFarm.g:1209:5: (lv_right_3_0= ruleBooleanPrimary )
            	    {
            	    // InternalFarm.g:1209:5: (lv_right_3_0= ruleBooleanPrimary )
            	    // InternalFarm.g:1210:6: lv_right_3_0= ruleBooleanPrimary
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightBooleanPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleBooleanPrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.farm.Farm.BooleanPrimary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanPrimary"
    // InternalFarm.g:1232:1: entryRuleBooleanPrimary returns [EObject current=null] : iv_ruleBooleanPrimary= ruleBooleanPrimary EOF ;
    public final EObject entryRuleBooleanPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanPrimary = null;


        try {
            // InternalFarm.g:1232:55: (iv_ruleBooleanPrimary= ruleBooleanPrimary EOF )
            // InternalFarm.g:1233:2: iv_ruleBooleanPrimary= ruleBooleanPrimary EOF
            {
             newCompositeNode(grammarAccess.getBooleanPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanPrimary=ruleBooleanPrimary();

            state._fsp--;

             current =iv_ruleBooleanPrimary; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanPrimary"


    // $ANTLR start "ruleBooleanPrimary"
    // InternalFarm.g:1239:1: ruleBooleanPrimary returns [EObject current=null] : (this_BooleanLiteral_0= ruleBooleanLiteral | (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' ) | this_BooleanVarExpression_4= ruleBooleanVarExpression ) ;
    public final EObject ruleBooleanPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_BooleanLiteral_0 = null;

        EObject this_OrExpression_2 = null;

        EObject this_BooleanVarExpression_4 = null;



        	enterRule();

        try {
            // InternalFarm.g:1245:2: ( (this_BooleanLiteral_0= ruleBooleanLiteral | (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' ) | this_BooleanVarExpression_4= ruleBooleanVarExpression ) )
            // InternalFarm.g:1246:2: (this_BooleanLiteral_0= ruleBooleanLiteral | (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' ) | this_BooleanVarExpression_4= ruleBooleanVarExpression )
            {
            // InternalFarm.g:1246:2: (this_BooleanLiteral_0= ruleBooleanLiteral | (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' ) | this_BooleanVarExpression_4= ruleBooleanVarExpression )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
                {
                alt19=1;
                }
                break;
            case 38:
                {
                alt19=2;
                }
                break;
            case RULE_ID:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalFarm.g:1247:3: this_BooleanLiteral_0= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getBooleanPrimaryAccess().getBooleanLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_0=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFarm.g:1256:3: (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' )
                    {
                    // InternalFarm.g:1256:3: (otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']' )
                    // InternalFarm.g:1257:4: otherlv_1= '[' this_OrExpression_2= ruleOrExpression otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getBooleanPrimaryAccess().getLeftSquareBracketKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getBooleanPrimaryAccess().getOrExpressionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_OrExpression_2=ruleOrExpression();

                    state._fsp--;


                    				current = this_OrExpression_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,39,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getBooleanPrimaryAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalFarm.g:1275:3: this_BooleanVarExpression_4= ruleBooleanVarExpression
                    {

                    			newCompositeNode(grammarAccess.getBooleanPrimaryAccess().getBooleanVarExpressionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanVarExpression_4=ruleBooleanVarExpression();

                    state._fsp--;


                    			current = this_BooleanVarExpression_4;
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
    // $ANTLR end "ruleBooleanPrimary"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalFarm.g:1287:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalFarm.g:1287:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalFarm.g:1288:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalFarm.g:1294:1: ruleBooleanLiteral returns [EObject current=null] : ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFarm.g:1300:2: ( ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' ) )
            // InternalFarm.g:1301:2: ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' )
            {
            // InternalFarm.g:1301:2: ( ( (lv_val_0_0= 'true' ) ) | otherlv_1= 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalFarm.g:1302:3: ( (lv_val_0_0= 'true' ) )
                    {
                    // InternalFarm.g:1302:3: ( (lv_val_0_0= 'true' ) )
                    // InternalFarm.g:1303:4: (lv_val_0_0= 'true' )
                    {
                    // InternalFarm.g:1303:4: (lv_val_0_0= 'true' )
                    // InternalFarm.g:1304:5: lv_val_0_0= 'true'
                    {
                    lv_val_0_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_val_0_0, grammarAccess.getBooleanLiteralAccess().getValTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    					}
                    					setWithLastConsumed(current, "val", lv_val_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalFarm.g:1317:3: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleBooleanVarExpression"
    // InternalFarm.g:1325:1: entryRuleBooleanVarExpression returns [EObject current=null] : iv_ruleBooleanVarExpression= ruleBooleanVarExpression EOF ;
    public final EObject entryRuleBooleanVarExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanVarExpression = null;


        try {
            // InternalFarm.g:1325:61: (iv_ruleBooleanVarExpression= ruleBooleanVarExpression EOF )
            // InternalFarm.g:1326:2: iv_ruleBooleanVarExpression= ruleBooleanVarExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanVarExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanVarExpression=ruleBooleanVarExpression();

            state._fsp--;

             current =iv_ruleBooleanVarExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBooleanVarExpression"


    // $ANTLR start "ruleBooleanVarExpression"
    // InternalFarm.g:1332:1: ruleBooleanVarExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleBooleanVarExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalFarm.g:1338:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalFarm.g:1339:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalFarm.g:1339:2: ( (otherlv_0= RULE_ID ) )
            // InternalFarm.g:1340:3: (otherlv_0= RULE_ID )
            {
            // InternalFarm.g:1340:3: (otherlv_0= RULE_ID )
            // InternalFarm.g:1341:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanVarExpressionRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getBooleanVarExpressionAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleBooleanVarExpression"


    // $ANTLR start "entryRuleAttributeDeclaration"
    // InternalFarm.g:1355:1: entryRuleAttributeDeclaration returns [EObject current=null] : iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF ;
    public final EObject entryRuleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDeclaration = null;


        try {
            // InternalFarm.g:1355:61: (iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF )
            // InternalFarm.g:1356:2: iv_ruleAttributeDeclaration= ruleAttributeDeclaration EOF
            {
             newCompositeNode(grammarAccess.getAttributeDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeDeclaration=ruleAttributeDeclaration();

            state._fsp--;

             current =iv_ruleAttributeDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeDeclaration"


    // $ANTLR start "ruleAttributeDeclaration"
    // InternalFarm.g:1362:1: ruleAttributeDeclaration returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAttributeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalFarm.g:1368:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalFarm.g:1369:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalFarm.g:1369:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalFarm.g:1370:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeDeclarationAccess().getDefineKeyword_0());
            		
            // InternalFarm.g:1374:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:1375:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:1375:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:1376:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleAttributeDeclaration"


    // $ANTLR start "entryRuleCrop"
    // InternalFarm.g:1396:1: entryRuleCrop returns [EObject current=null] : iv_ruleCrop= ruleCrop EOF ;
    public final EObject entryRuleCrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCrop = null;


        try {
            // InternalFarm.g:1396:45: (iv_ruleCrop= ruleCrop EOF )
            // InternalFarm.g:1397:2: iv_ruleCrop= ruleCrop EOF
            {
             newCompositeNode(grammarAccess.getCropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCrop=ruleCrop();

            state._fsp--;

             current =iv_ruleCrop; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCrop"


    // $ANTLR start "ruleCrop"
    // InternalFarm.g:1403:1: ruleCrop returns [EObject current=null] : (otherlv_0= 'crop' ( (lv_crop_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_cropName_5_0= RULE_STRING ) ) otherlv_6= 'stage' otherlv_7= ':' otherlv_8= '[' ( (lv_statements_9_0= ruleCropStages ) ) otherlv_10= ']' otherlv_11= '}' ) ;
    public final EObject ruleCrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_crop_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_cropName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_statements_9_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1409:2: ( (otherlv_0= 'crop' ( (lv_crop_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_cropName_5_0= RULE_STRING ) ) otherlv_6= 'stage' otherlv_7= ':' otherlv_8= '[' ( (lv_statements_9_0= ruleCropStages ) ) otherlv_10= ']' otherlv_11= '}' ) )
            // InternalFarm.g:1410:2: (otherlv_0= 'crop' ( (lv_crop_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_cropName_5_0= RULE_STRING ) ) otherlv_6= 'stage' otherlv_7= ':' otherlv_8= '[' ( (lv_statements_9_0= ruleCropStages ) ) otherlv_10= ']' otherlv_11= '}' )
            {
            // InternalFarm.g:1410:2: (otherlv_0= 'crop' ( (lv_crop_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_cropName_5_0= RULE_STRING ) ) otherlv_6= 'stage' otherlv_7= ':' otherlv_8= '[' ( (lv_statements_9_0= ruleCropStages ) ) otherlv_10= ']' otherlv_11= '}' )
            // InternalFarm.g:1411:3: otherlv_0= 'crop' ( (lv_crop_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_cropName_5_0= RULE_STRING ) ) otherlv_6= 'stage' otherlv_7= ':' otherlv_8= '[' ( (lv_statements_9_0= ruleCropStages ) ) otherlv_10= ']' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCropAccess().getCropKeyword_0());
            		
            // InternalFarm.g:1415:3: ( (lv_crop_1_0= RULE_ID ) )
            // InternalFarm.g:1416:4: (lv_crop_1_0= RULE_ID )
            {
            // InternalFarm.g:1416:4: (lv_crop_1_0= RULE_ID )
            // InternalFarm.g:1417:5: lv_crop_1_0= RULE_ID
            {
            lv_crop_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_crop_1_0, grammarAccess.getCropAccess().getCropIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"crop",
            						lv_crop_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getCropAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCropAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getCropAccess().getColonKeyword_4());
            		
            // InternalFarm.g:1445:3: ( (lv_cropName_5_0= RULE_STRING ) )
            // InternalFarm.g:1446:4: (lv_cropName_5_0= RULE_STRING )
            {
            // InternalFarm.g:1446:4: (lv_cropName_5_0= RULE_STRING )
            // InternalFarm.g:1447:5: lv_cropName_5_0= RULE_STRING
            {
            lv_cropName_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_cropName_5_0, grammarAccess.getCropAccess().getCropNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCropRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cropName",
            						lv_cropName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,45,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getCropAccess().getStageKeyword_6());
            		
            otherlv_7=(Token)match(input,44,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getCropAccess().getColonKeyword_7());
            		
            otherlv_8=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getCropAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalFarm.g:1475:3: ( (lv_statements_9_0= ruleCropStages ) )
            // InternalFarm.g:1476:4: (lv_statements_9_0= ruleCropStages )
            {
            // InternalFarm.g:1476:4: (lv_statements_9_0= ruleCropStages )
            // InternalFarm.g:1477:5: lv_statements_9_0= ruleCropStages
            {

            					newCompositeNode(grammarAccess.getCropAccess().getStatementsCropStagesParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_20);
            lv_statements_9_0=ruleCropStages();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropRule());
            					}
            					add(
            						current,
            						"statements",
            						lv_statements_9_0,
            						"uk.ac.kcl.farm.Farm.CropStages");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getCropAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCropAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCrop"


    // $ANTLR start "entryRuleCropStages"
    // InternalFarm.g:1506:1: entryRuleCropStages returns [EObject current=null] : iv_ruleCropStages= ruleCropStages EOF ;
    public final EObject entryRuleCropStages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCropStages = null;


        try {
            // InternalFarm.g:1506:51: (iv_ruleCropStages= ruleCropStages EOF )
            // InternalFarm.g:1507:2: iv_ruleCropStages= ruleCropStages EOF
            {
             newCompositeNode(grammarAccess.getCropStagesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCropStages=ruleCropStages();

            state._fsp--;

             current =iv_ruleCropStages; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCropStages"


    // $ANTLR start "ruleCropStages"
    // InternalFarm.g:1513:1: ruleCropStages returns [EObject current=null] : ( ( (lv_elements_0_0= ruleCropStage ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )* ) ;
    public final EObject ruleCropStages() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1519:2: ( ( ( (lv_elements_0_0= ruleCropStage ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )* ) )
            // InternalFarm.g:1520:2: ( ( (lv_elements_0_0= ruleCropStage ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )* )
            {
            // InternalFarm.g:1520:2: ( ( (lv_elements_0_0= ruleCropStage ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )* )
            // InternalFarm.g:1521:3: ( (lv_elements_0_0= ruleCropStage ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )*
            {
            // InternalFarm.g:1521:3: ( (lv_elements_0_0= ruleCropStage ) )
            // InternalFarm.g:1522:4: (lv_elements_0_0= ruleCropStage )
            {
            // InternalFarm.g:1522:4: (lv_elements_0_0= ruleCropStage )
            // InternalFarm.g:1523:5: lv_elements_0_0= ruleCropStage
            {

            					newCompositeNode(grammarAccess.getCropStagesAccess().getElementsCropStageParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_elements_0_0=ruleCropStage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropStagesRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"uk.ac.kcl.farm.Farm.CropStage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFarm.g:1540:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalFarm.g:1541:4: otherlv_1= ',' ( (lv_elements_2_0= ruleCropStage ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCropStagesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalFarm.g:1545:4: ( (lv_elements_2_0= ruleCropStage ) )
            	    // InternalFarm.g:1546:5: (lv_elements_2_0= ruleCropStage )
            	    {
            	    // InternalFarm.g:1546:5: (lv_elements_2_0= ruleCropStage )
            	    // InternalFarm.g:1547:6: lv_elements_2_0= ruleCropStage
            	    {

            	    						newCompositeNode(grammarAccess.getCropStagesAccess().getElementsCropStageParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_elements_2_0=ruleCropStage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCropStagesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"uk.ac.kcl.farm.Farm.CropStage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "ruleCropStages"


    // $ANTLR start "entryRuleCropStage"
    // InternalFarm.g:1569:1: entryRuleCropStage returns [EObject current=null] : iv_ruleCropStage= ruleCropStage EOF ;
    public final EObject entryRuleCropStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCropStage = null;


        try {
            // InternalFarm.g:1569:50: (iv_ruleCropStage= ruleCropStage EOF )
            // InternalFarm.g:1570:2: iv_ruleCropStage= ruleCropStage EOF
            {
             newCompositeNode(grammarAccess.getCropStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCropStage=ruleCropStage();

            state._fsp--;

             current =iv_ruleCropStage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCropStage"


    // $ANTLR start "ruleCropStage"
    // InternalFarm.g:1576:1: ruleCropStage returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'timeConsumed' otherlv_5= ':' ( (lv_timeConsumend_6_0= ruleRealExpression ) ) ( (lv_elements_7_0= ruleCropAttributes ) )* otherlv_8= '}' ) ;
    public final EObject ruleCropStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_timeConsumend_6_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1582:2: ( (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'timeConsumed' otherlv_5= ':' ( (lv_timeConsumend_6_0= ruleRealExpression ) ) ( (lv_elements_7_0= ruleCropAttributes ) )* otherlv_8= '}' ) )
            // InternalFarm.g:1583:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'timeConsumed' otherlv_5= ':' ( (lv_timeConsumend_6_0= ruleRealExpression ) ) ( (lv_elements_7_0= ruleCropAttributes ) )* otherlv_8= '}' )
            {
            // InternalFarm.g:1583:2: (otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'timeConsumed' otherlv_5= ':' ( (lv_timeConsumend_6_0= ruleRealExpression ) ) ( (lv_elements_7_0= ruleCropAttributes ) )* otherlv_8= '}' )
            // InternalFarm.g:1584:3: otherlv_0= '{' otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= 'timeConsumed' otherlv_5= ':' ( (lv_timeConsumend_6_0= ruleRealExpression ) ) ( (lv_elements_7_0= ruleCropAttributes ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getCropStageAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getCropStageAccess().getNameKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getCropStageAccess().getColonKeyword_2());
            		
            // InternalFarm.g:1596:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalFarm.g:1597:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalFarm.g:1597:4: (lv_name_3_0= RULE_STRING )
            // InternalFarm.g:1598:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCropStageAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCropStageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getCropStageAccess().getTimeConsumedKeyword_4());
            		
            otherlv_5=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getCropStageAccess().getColonKeyword_5());
            		
            // InternalFarm.g:1622:3: ( (lv_timeConsumend_6_0= ruleRealExpression ) )
            // InternalFarm.g:1623:4: (lv_timeConsumend_6_0= ruleRealExpression )
            {
            // InternalFarm.g:1623:4: (lv_timeConsumend_6_0= ruleRealExpression )
            // InternalFarm.g:1624:5: lv_timeConsumend_6_0= ruleRealExpression
            {

            					newCompositeNode(grammarAccess.getCropStageAccess().getTimeConsumendRealExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_29);
            lv_timeConsumend_6_0=ruleRealExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropStageRule());
            					}
            					set(
            						current,
            						"timeConsumend",
            						lv_timeConsumend_6_0,
            						"uk.ac.kcl.farm.Farm.RealExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFarm.g:1641:3: ( (lv_elements_7_0= ruleCropAttributes ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFarm.g:1642:4: (lv_elements_7_0= ruleCropAttributes )
            	    {
            	    // InternalFarm.g:1642:4: (lv_elements_7_0= ruleCropAttributes )
            	    // InternalFarm.g:1643:5: lv_elements_7_0= ruleCropAttributes
            	    {

            	    					newCompositeNode(grammarAccess.getCropStageAccess().getElementsCropAttributesParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_elements_7_0=ruleCropAttributes();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCropStageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_7_0,
            	    						"uk.ac.kcl.farm.Farm.CropAttributes");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getCropStageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleCropStage"


    // $ANTLR start "entryRuleCropAttributes"
    // InternalFarm.g:1668:1: entryRuleCropAttributes returns [EObject current=null] : iv_ruleCropAttributes= ruleCropAttributes EOF ;
    public final EObject entryRuleCropAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCropAttributes = null;


        try {
            // InternalFarm.g:1668:55: (iv_ruleCropAttributes= ruleCropAttributes EOF )
            // InternalFarm.g:1669:2: iv_ruleCropAttributes= ruleCropAttributes EOF
            {
             newCompositeNode(grammarAccess.getCropAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCropAttributes=ruleCropAttributes();

            state._fsp--;

             current =iv_ruleCropAttributes; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCropAttributes"


    // $ANTLR start "ruleCropAttributes"
    // InternalFarm.g:1675:1: ruleCropAttributes returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleRealExpression ) ) ) ;
    public final EObject ruleCropAttributes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1681:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleRealExpression ) ) ) )
            // InternalFarm.g:1682:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleRealExpression ) ) )
            {
            // InternalFarm.g:1682:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleRealExpression ) ) )
            // InternalFarm.g:1683:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleRealExpression ) )
            {
            // InternalFarm.g:1683:3: ( (otherlv_0= RULE_ID ) )
            // InternalFarm.g:1684:4: (otherlv_0= RULE_ID )
            {
            // InternalFarm.g:1684:4: (otherlv_0= RULE_ID )
            // InternalFarm.g:1685:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCropAttributesRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getCropAttributesAccess().getTypeAttributeDeclarationCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCropAttributesAccess().getColonKeyword_1());
            		
            // InternalFarm.g:1700:3: ( (lv_value_2_0= ruleRealExpression ) )
            // InternalFarm.g:1701:4: (lv_value_2_0= ruleRealExpression )
            {
            // InternalFarm.g:1701:4: (lv_value_2_0= ruleRealExpression )
            // InternalFarm.g:1702:5: lv_value_2_0= ruleRealExpression
            {

            					newCompositeNode(grammarAccess.getCropAttributesAccess().getValueRealExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleRealExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCropAttributesRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"uk.ac.kcl.farm.Farm.RealExpression");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleCropAttributes"


    // $ANTLR start "entryRuleMachine"
    // InternalFarm.g:1723:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalFarm.g:1723:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalFarm.g:1724:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalFarm.g:1730:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_machineName_5_0= RULE_STRING ) ) otherlv_6= 'ip' otherlv_7= ':' ( (lv_ip_8_0= ruleIP ) ) ( (lv_statements_9_0= ruleTask ) )+ otherlv_10= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_machineName_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_ip_8_0 = null;

        EObject lv_statements_9_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:1736:2: ( (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_machineName_5_0= RULE_STRING ) ) otherlv_6= 'ip' otherlv_7= ':' ( (lv_ip_8_0= ruleIP ) ) ( (lv_statements_9_0= ruleTask ) )+ otherlv_10= '}' ) )
            // InternalFarm.g:1737:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_machineName_5_0= RULE_STRING ) ) otherlv_6= 'ip' otherlv_7= ':' ( (lv_ip_8_0= ruleIP ) ) ( (lv_statements_9_0= ruleTask ) )+ otherlv_10= '}' )
            {
            // InternalFarm.g:1737:2: (otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_machineName_5_0= RULE_STRING ) ) otherlv_6= 'ip' otherlv_7= ':' ( (lv_ip_8_0= ruleIP ) ) ( (lv_statements_9_0= ruleTask ) )+ otherlv_10= '}' )
            // InternalFarm.g:1738:3: otherlv_0= 'machine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_machineName_5_0= RULE_STRING ) ) otherlv_6= 'ip' otherlv_7= ':' ( (lv_ip_8_0= ruleIP ) ) ( (lv_statements_9_0= ruleTask ) )+ otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
            		
            // InternalFarm.g:1742:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:1743:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:1743:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:1744:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMachineAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getColonKeyword_4());
            		
            // InternalFarm.g:1772:3: ( (lv_machineName_5_0= RULE_STRING ) )
            // InternalFarm.g:1773:4: (lv_machineName_5_0= RULE_STRING )
            {
            // InternalFarm.g:1773:4: (lv_machineName_5_0= RULE_STRING )
            // InternalFarm.g:1774:5: lv_machineName_5_0= RULE_STRING
            {
            lv_machineName_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_machineName_5_0, grammarAccess.getMachineAccess().getMachineNameSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"machineName",
            						lv_machineName_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,48,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getMachineAccess().getIpKeyword_6());
            		
            otherlv_7=(Token)match(input,44,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getColonKeyword_7());
            		
            // InternalFarm.g:1798:3: ( (lv_ip_8_0= ruleIP ) )
            // InternalFarm.g:1799:4: (lv_ip_8_0= ruleIP )
            {
            // InternalFarm.g:1799:4: (lv_ip_8_0= ruleIP )
            // InternalFarm.g:1800:5: lv_ip_8_0= ruleIP
            {

            					newCompositeNode(grammarAccess.getMachineAccess().getIpIPParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_31);
            lv_ip_8_0=ruleIP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMachineRule());
            					}
            					set(
            						current,
            						"ip",
            						lv_ip_8_0,
            						"uk.ac.kcl.farm.Farm.IP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFarm.g:1817:3: ( (lv_statements_9_0= ruleTask ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==49) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalFarm.g:1818:4: (lv_statements_9_0= ruleTask )
            	    {
            	    // InternalFarm.g:1818:4: (lv_statements_9_0= ruleTask )
            	    // InternalFarm.g:1819:5: lv_statements_9_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getMachineAccess().getStatementsTaskParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_statements_9_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_9_0,
            	    						"uk.ac.kcl.farm.Farm.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleIP"
    // InternalFarm.g:1844:1: entryRuleIP returns [String current=null] : iv_ruleIP= ruleIP EOF ;
    public final String entryRuleIP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIP = null;


        try {
            // InternalFarm.g:1844:42: (iv_ruleIP= ruleIP EOF )
            // InternalFarm.g:1845:2: iv_ruleIP= ruleIP EOF
            {
             newCompositeNode(grammarAccess.getIPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIP=ruleIP();

            state._fsp--;

             current =iv_ruleIP.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIP"


    // $ANTLR start "ruleIP"
    // InternalFarm.g:1851:1: ruleIP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ) ) ;
    public final AntlrDatatypeRuleToken ruleIP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalFarm.g:1857:2: ( (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ) ) )
            // InternalFarm.g:1858:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ) )
            {
            // InternalFarm.g:1858:2: (this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ) )
            // InternalFarm.g:1859:3: this_INT_0= RULE_INT kw= '.' (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getIPAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,30,FOLLOW_16); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIPAccess().getFullStopKeyword_1());
            		
            // InternalFarm.g:1871:3: (this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) )
            // InternalFarm.g:1872:4: this_INT_2= RULE_INT kw= '.' (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            {
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_15); 

            				current.merge(this_INT_2);
            			

            				newLeafNode(this_INT_2, grammarAccess.getIPAccess().getINTTerminalRuleCall_2_0());
            			
            kw=(Token)match(input,30,FOLLOW_16); 

            				current.merge(kw);
            				newLeafNode(kw, grammarAccess.getIPAccess().getFullStopKeyword_2_1());
            			
            // InternalFarm.g:1884:4: (this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            // InternalFarm.g:1885:5: this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT
            {
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_15); 

            					current.merge(this_INT_4);
            				

            					newLeafNode(this_INT_4, grammarAccess.getIPAccess().getINTTerminalRuleCall_2_2_0());
            				
            kw=(Token)match(input,30,FOLLOW_16); 

            					current.merge(kw);
            					newLeafNode(kw, grammarAccess.getIPAccess().getFullStopKeyword_2_2_1());
            				
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

            					current.merge(this_INT_6);
            				

            					newLeafNode(this_INT_6, grammarAccess.getIPAccess().getINTTerminalRuleCall_2_2_2());
            				

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
    // $ANTLR end "ruleIP"


    // $ANTLR start "entryRuleField"
    // InternalFarm.g:1910:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalFarm.g:1910:46: (iv_ruleField= ruleField EOF )
            // InternalFarm.g:1911:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalFarm.g:1917:1: ruleField returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'field' otherlv_4= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalFarm.g:1923:2: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'field' otherlv_4= '}' ) )
            // InternalFarm.g:1924:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'field' otherlv_4= '}' )
            {
            // InternalFarm.g:1924:2: (otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'field' otherlv_4= '}' )
            // InternalFarm.g:1925:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'field' otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getFieldKeyword_0());
            		
            // InternalFarm.g:1929:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:1930:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:1930:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:1931:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getFieldKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleMission"
    // InternalFarm.g:1963:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalFarm.g:1963:48: (iv_ruleMission= ruleMission EOF )
            // InternalFarm.g:1964:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalFarm.g:1970:1: ruleMission returns [EObject current=null] : (otherlv_0= 'mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+ otherlv_4= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_1 = null;

        EObject lv_statements_3_2 = null;



        	enterRule();

        try {
            // InternalFarm.g:1976:2: ( (otherlv_0= 'mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+ otherlv_4= '}' ) )
            // InternalFarm.g:1977:2: (otherlv_0= 'mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+ otherlv_4= '}' )
            {
            // InternalFarm.g:1977:2: (otherlv_0= 'mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+ otherlv_4= '}' )
            // InternalFarm.g:1978:3: otherlv_0= 'mission' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalFarm.g:1982:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:1983:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:1983:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:1984:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMissionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_34); 

            			newLeafNode(otherlv_2, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFarm.g:2004:3: ( ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==19||LA25_0==21||LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalFarm.g:2005:4: ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) )
            	    {
            	    // InternalFarm.g:2005:4: ( (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask ) )
            	    // InternalFarm.g:2006:5: (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask )
            	    {
            	    // InternalFarm.g:2006:5: (lv_statements_3_1= ruleStatement | lv_statements_3_2= ruleTask )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==19||LA24_0==21) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==49) ) {
            	        alt24=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalFarm.g:2007:6: lv_statements_3_1= ruleStatement
            	            {

            	            						newCompositeNode(grammarAccess.getMissionAccess().getStatementsStatementParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_statements_3_1=ruleStatement();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMissionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_3_1,
            	            							"uk.ac.kcl.farm.Farm.Statement");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalFarm.g:2023:6: lv_statements_3_2= ruleTask
            	            {

            	            						newCompositeNode(grammarAccess.getMissionAccess().getStatementsTaskParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_35);
            	            lv_statements_3_2=ruleTask();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMissionRule());
            	            						}
            	            						add(
            	            							current,
            	            							"statements",
            	            							lv_statements_3_2,
            	            							"uk.ac.kcl.farm.Farm.Task");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalFarm.g:2049:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalFarm.g:2049:45: (iv_ruleTask= ruleTask EOF )
            // InternalFarm.g:2050:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalFarm.g:2056:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeName_8_0= ruleTypeName ) ) otherlv_9= '{' ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_parmas_3_0 = null;

        EObject lv_parmas_5_0 = null;

        AntlrDatatypeRuleToken lv_typeName_8_0 = null;

        EObject lv_statements_10_0 = null;



        	enterRule();

        try {
            // InternalFarm.g:2062:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeName_8_0= ruleTypeName ) ) otherlv_9= '{' ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= '}' ) )
            // InternalFarm.g:2063:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeName_8_0= ruleTypeName ) ) otherlv_9= '{' ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= '}' )
            {
            // InternalFarm.g:2063:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeName_8_0= ruleTypeName ) ) otherlv_9= '{' ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= '}' )
            // InternalFarm.g:2064:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_typeName_8_0= ruleTypeName ) ) otherlv_9= '{' ( (lv_statements_10_0= ruleStatement ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalFarm.g:2068:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalFarm.g:2069:4: (lv_name_1_0= RULE_ID )
            {
            // InternalFarm.g:2069:4: (lv_name_1_0= RULE_ID )
            // InternalFarm.g:2070:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2());
            		
            // InternalFarm.g:2090:3: ( ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=11 && LA27_0<=16)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalFarm.g:2091:4: ( (lv_parmas_3_0= ruleParam ) ) (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )*
                    {
                    // InternalFarm.g:2091:4: ( (lv_parmas_3_0= ruleParam ) )
                    // InternalFarm.g:2092:5: (lv_parmas_3_0= ruleParam )
                    {
                    // InternalFarm.g:2092:5: (lv_parmas_3_0= ruleParam )
                    // InternalFarm.g:2093:6: lv_parmas_3_0= ruleParam
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getParmasParamParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_parmas_3_0=ruleParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						add(
                    							current,
                    							"parmas",
                    							lv_parmas_3_0,
                    							"uk.ac.kcl.farm.Farm.Param");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalFarm.g:2110:4: (otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==46) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalFarm.g:2111:5: otherlv_4= ',' ( (lv_parmas_5_0= ruleParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,46,FOLLOW_38); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalFarm.g:2115:5: ( (lv_parmas_5_0= ruleParam ) )
                    	    // InternalFarm.g:2116:6: (lv_parmas_5_0= ruleParam )
                    	    {
                    	    // InternalFarm.g:2116:6: (lv_parmas_5_0= ruleParam )
                    	    // InternalFarm.g:2117:7: lv_parmas_5_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskAccess().getParmasParamParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_parmas_5_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parmas",
                    	    								lv_parmas_5_0,
                    	    								"uk.ac.kcl.farm.Farm.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,44,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getColonKeyword_5());
            		
            // InternalFarm.g:2144:3: ( (lv_typeName_8_0= ruleTypeName ) )
            // InternalFarm.g:2145:4: (lv_typeName_8_0= ruleTypeName )
            {
            // InternalFarm.g:2145:4: (lv_typeName_8_0= ruleTypeName )
            // InternalFarm.g:2146:5: lv_typeName_8_0= ruleTypeName
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getTypeNameTypeNameParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_typeName_8_0=ruleTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_8_0,
            						"uk.ac.kcl.farm.Farm.TypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalFarm.g:2167:3: ( (lv_statements_10_0= ruleStatement ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19||LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalFarm.g:2168:4: (lv_statements_10_0= ruleStatement )
            	    {
            	    // InternalFarm.g:2168:4: (lv_statements_10_0= ruleStatement )
            	    // InternalFarm.g:2169:5: lv_statements_10_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTaskAccess().getStatementsStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_10_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_10_0,
            	    						"uk.ac.kcl.farm.Farm.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_11=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTask"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000007802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000034040400030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002280000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040400030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003E00000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000280000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000002280000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000081F800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000078000L});

}