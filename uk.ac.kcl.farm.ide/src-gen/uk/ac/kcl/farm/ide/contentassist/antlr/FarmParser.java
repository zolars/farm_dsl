/*
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import uk.ac.kcl.farm.ide.contentassist.antlr.internal.InternalFarmParser;
import uk.ac.kcl.farm.services.FarmGrammarAccess;

public class FarmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FarmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FarmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFarmProgramAccess().getStatementsAlternatives_0(), "rule__FarmProgram__StatementsAlternatives_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getExpressionOrCallAccess().getAlternatives(), "rule__ExpressionOrCall__Alternatives");
			builder.put(grammarAccess.getCallAccess().getAlternatives_1(), "rule__Call__Alternatives_1");
			builder.put(grammarAccess.getBuiltinFunctionAccess().getAlternatives(), "rule__BuiltinFunction__Alternatives");
			builder.put(grammarAccess.getInstanceAccess().getAlternatives(), "rule__Instance__Alternatives");
			builder.put(grammarAccess.getCallFunctionAccess().getAlternatives(), "rule__CallFunction__Alternatives");
			builder.put(grammarAccess.getGetStageFunctionAccess().getAttributeAlternatives_2_1_0(), "rule__GetStageFunction__AttributeAlternatives_2_1_0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getAlternatives_1_0_0(), "rule__RelationOrExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0(), "rule__AdditionExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0(), "rule__MultiplicationExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
			builder.put(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getAlternatives(), "rule__UnaryExpressionNotPlusMinus__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getFieldAccess().getFieldTypeAlternatives_11_0(), "rule__Field__FieldTypeAlternatives_11_0");
			builder.put(grammarAccess.getFieldAccess().getFieldLightAlternatives_14_0(), "rule__Field__FieldLightAlternatives_14_0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getCallAccess().getGroup(), "rule__Call__Group__0");
			builder.put(grammarAccess.getCallAccess().getGroup_1_0(), "rule__Call__Group_1_0__0");
			builder.put(grammarAccess.getCallAccess().getGroup_1_1(), "rule__Call__Group_1_1__0");
			builder.put(grammarAccess.getLoopStatementAccess().getGroup(), "rule__LoopStatement__Group__0");
			builder.put(grammarAccess.getJudgeStatementAccess().getGroup(), "rule__JudgeStatement__Group__0");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getGroup(), "rule__ElseJudgeStatement__Group__0");
			builder.put(grammarAccess.getElseStatementAccess().getGroup(), "rule__ElseStatement__Group__0");
			builder.put(grammarAccess.getReportFunctionAccess().getGroup(), "rule__ReportFunction__Group__0");
			builder.put(grammarAccess.getMoveFunctionAccess().getGroup(), "rule__MoveFunction__Group__0");
			builder.put(grammarAccess.getWaitFunctionAccess().getGroup(), "rule__WaitFunction__Group__0");
			builder.put(grammarAccess.getHarvestFunctionAccess().getGroup(), "rule__HarvestFunction__Group__0");
			builder.put(grammarAccess.getGetStageFunctionAccess().getGroup(), "rule__GetStageFunction__Group__0");
			builder.put(grammarAccess.getGetStageFunctionAccess().getGroup_2(), "rule__GetStageFunction__Group_2__0");
			builder.put(grammarAccess.getFieldSetFunctionAccess().getGroup(), "rule__FieldSetFunction__Group__0");
			builder.put(grammarAccess.getPlantFunctionAccess().getGroup(), "rule__PlantFunction__Group__0");
			builder.put(grammarAccess.getIsEmptyFunctionAccess().getGroup(), "rule__IsEmptyFunction__Group__0");
			builder.put(grammarAccess.getConditionOrExpressionAccess().getGroup(), "rule__ConditionOrExpression__Group__0");
			builder.put(grammarAccess.getConditionOrExpressionAccess().getGroup_1(), "rule__ConditionOrExpression__Group_1__0");
			builder.put(grammarAccess.getConditionOrExpressionAccess().getGroup_1_0(), "rule__ConditionOrExpression__Group_1_0__0");
			builder.put(grammarAccess.getConditionAndExpressionAccess().getGroup(), "rule__ConditionAndExpression__Group__0");
			builder.put(grammarAccess.getConditionAndExpressionAccess().getGroup_1(), "rule__ConditionAndExpression__Group_1__0");
			builder.put(grammarAccess.getConditionAndExpressionAccess().getGroup_1_0(), "rule__ConditionAndExpression__Group_1_0__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup(), "rule__RelationOrExpression__Group__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1(), "rule__RelationOrExpression__Group_1__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0(), "rule__RelationOrExpression__Group_1_0__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_0(), "rule__RelationOrExpression__Group_1_0_0_0__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_1(), "rule__RelationOrExpression__Group_1_0_0_1__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_2(), "rule__RelationOrExpression__Group_1_0_0_2__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_3(), "rule__RelationOrExpression__Group_1_0_0_3__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_4(), "rule__RelationOrExpression__Group_1_0_0_4__0");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getGroup_1_0_0_5(), "rule__RelationOrExpression__Group_1_0_0_5__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup(), "rule__AdditionExpression__Group__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup_1(), "rule__AdditionExpression__Group_1__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup_1_0(), "rule__AdditionExpression__Group_1_0__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_0(), "rule__AdditionExpression__Group_1_0_0_0__0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getGroup_1_0_0_1(), "rule__AdditionExpression__Group_1_0_0_1__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup(), "rule__MultiplicationExpression__Group__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1(), "rule__MultiplicationExpression__Group_1__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0(), "rule__MultiplicationExpression__Group_1_0__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_0(), "rule__MultiplicationExpression__Group_1_0_0_0__0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_0_0_1(), "rule__MultiplicationExpression__Group_1_0_0_1__0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getGroup_1(), "rule__UnaryExpression__Group_1__0");
			builder.put(grammarAccess.getNotBooleanExpressionAccess().getGroup(), "rule__NotBooleanExpression__Group__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_2(), "rule__PrimaryExpression__Group_2__0");
			builder.put(grammarAccess.getTrueLiteralAccess().getGroup(), "rule__TrueLiteral__Group__0");
			builder.put(grammarAccess.getFalseLiteralAccess().getGroup(), "rule__FalseLiteral__Group__0");
			builder.put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getCropAccess().getGroup(), "rule__Crop__Group__0");
			builder.put(grammarAccess.getCropStagesAccess().getGroup(), "rule__CropStages__Group__0");
			builder.put(grammarAccess.getCropStagesAccess().getGroup_1(), "rule__CropStages__Group_1__0");
			builder.put(grammarAccess.getCropStageAccess().getGroup(), "rule__CropStage__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getCallAttributesAccess().getGroup(), "rule__CallAttributes__Group__0");
			builder.put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
			builder.put(grammarAccess.getFarmProgramAccess().getStatementsAssignment(), "rule__FarmProgram__StatementsAssignment");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_3(), "rule__Variable__ExpressionAssignment_3");
			builder.put(grammarAccess.getVarExpressionAccess().getVarAssignment(), "rule__VarExpression__VarAssignment");
			builder.put(grammarAccess.getAssignmentAccess().getVarAssignment_0(), "rule__Assignment__VarAssignment_0");
			builder.put(grammarAccess.getAssignmentAccess().getExpressionAssignment_2(), "rule__Assignment__ExpressionAssignment_2");
			builder.put(grammarAccess.getCallAccess().getInstanceAssignment_0(), "rule__Call__InstanceAssignment_0");
			builder.put(grammarAccess.getCallAccess().getAttributesAssignment_1_0_1(), "rule__Call__AttributesAssignment_1_0_1");
			builder.put(grammarAccess.getCallAccess().getFunctionsAssignment_1_1_1(), "rule__Call__FunctionsAssignment_1_1_1");
			builder.put(grammarAccess.getLoopStatementAccess().getConditionAssignment_2(), "rule__LoopStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getLoopStatementAccess().getLoopStatementsAssignment_5(), "rule__LoopStatement__LoopStatementsAssignment_5");
			builder.put(grammarAccess.getJudgeStatementAccess().getConditionAssignment_2(), "rule__JudgeStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getJudgeStatementAccess().getJudgeStatementsAssignment_5(), "rule__JudgeStatement__JudgeStatementsAssignment_5");
			builder.put(grammarAccess.getJudgeStatementAccess().getElseJudgeStatementsAssignment_7(), "rule__JudgeStatement__ElseJudgeStatementsAssignment_7");
			builder.put(grammarAccess.getJudgeStatementAccess().getElseStatementAssignment_8(), "rule__JudgeStatement__ElseStatementAssignment_8");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getConditionAssignment_2(), "rule__ElseJudgeStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getElseJudgeStatementsAssignment_5(), "rule__ElseJudgeStatement__ElseJudgeStatementsAssignment_5");
			builder.put(grammarAccess.getElseStatementAccess().getElseStatementsAssignment_3(), "rule__ElseStatement__ElseStatementsAssignment_3");
			builder.put(grammarAccess.getReportFunctionAccess().getInstanceAssignment_1(), "rule__ReportFunction__InstanceAssignment_1");
			builder.put(grammarAccess.getMoveFunctionAccess().getMoveFromFieldAssignment_1(), "rule__MoveFunction__MoveFromFieldAssignment_1");
			builder.put(grammarAccess.getMoveFunctionAccess().getMoveToFieldAssignment_3(), "rule__MoveFunction__MoveToFieldAssignment_3");
			builder.put(grammarAccess.getWaitFunctionAccess().getValueAssignment_1(), "rule__WaitFunction__ValueAssignment_1");
			builder.put(grammarAccess.getHarvestFunctionAccess().getCropAssignment_1(), "rule__HarvestFunction__CropAssignment_1");
			builder.put(grammarAccess.getGetStageFunctionAccess().getIdAssignment_1(), "rule__GetStageFunction__IdAssignment_1");
			builder.put(grammarAccess.getGetStageFunctionAccess().getAttributeAssignment_2_1(), "rule__GetStageFunction__AttributeAssignment_2_1");
			builder.put(grammarAccess.getFieldSetFunctionAccess().getAttributeAssignment_1(), "rule__FieldSetFunction__AttributeAssignment_1");
			builder.put(grammarAccess.getFieldSetFunctionAccess().getValueAssignment_3(), "rule__FieldSetFunction__ValueAssignment_3");
			builder.put(grammarAccess.getPlantFunctionAccess().getPlantCropAssignment_1(), "rule__PlantFunction__PlantCropAssignment_1");
			builder.put(grammarAccess.getIsEmptyFunctionAccess().getLeftAssignment_1(), "rule__IsEmptyFunction__LeftAssignment_1");
			builder.put(grammarAccess.getConditionOrExpressionAccess().getRightAssignment_1_0_2(), "rule__ConditionOrExpression__RightAssignment_1_0_2");
			builder.put(grammarAccess.getConditionAndExpressionAccess().getRightAssignment_1_0_2(), "rule__ConditionAndExpression__RightAssignment_1_0_2");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getRightAssignment_1_1(), "rule__RelationOrExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1(), "rule__AdditionExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicationExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getUnaryExpressionAccess().getExpAssignment_1_2(), "rule__UnaryExpression__ExpAssignment_1_2");
			builder.put(grammarAccess.getNotBooleanExpressionAccess().getExpAssignment_1(), "rule__NotBooleanExpression__ExpAssignment_1");
			builder.put(grammarAccess.getTrueLiteralAccess().getValueAssignment_1(), "rule__TrueLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getFalseLiteralAccess().getValueAssignment_1(), "rule__FalseLiteral__ValueAssignment_1");
			builder.put(grammarAccess.getRealLiteralAccess().getNumAssignment_1(), "rule__RealLiteral__NumAssignment_1");
			builder.put(grammarAccess.getCropAccess().getNameAssignment_1(), "rule__Crop__NameAssignment_1");
			builder.put(grammarAccess.getCropAccess().getCropNameAssignment_5(), "rule__Crop__CropNameAssignment_5");
			builder.put(grammarAccess.getCropAccess().getCropStagesAssignment_9(), "rule__Crop__CropStagesAssignment_9");
			builder.put(grammarAccess.getCropStagesAccess().getElementsAssignment_0(), "rule__CropStages__ElementsAssignment_0");
			builder.put(grammarAccess.getCropStagesAccess().getElementsAssignment_1_1(), "rule__CropStages__ElementsAssignment_1_1");
			builder.put(grammarAccess.getCropStageAccess().getNameAssignment_3(), "rule__CropStage__NameAssignment_3");
			builder.put(grammarAccess.getCropStageAccess().getTimeAssignment_6(), "rule__CropStage__TimeAssignment_6");
			builder.put(grammarAccess.getCropStageAccess().getTimeoverAssignment_9(), "rule__CropStage__TimeoverAssignment_9");
			builder.put(grammarAccess.getCropStageAccess().getAttributesAssignment_10(), "rule__CropStage__AttributesAssignment_10");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getFieldNameAssignment_5(), "rule__Field__FieldNameAssignment_5");
			builder.put(grammarAccess.getFieldAccess().getFieldIPAssignment_8(), "rule__Field__FieldIPAssignment_8");
			builder.put(grammarAccess.getFieldAccess().getFieldTypeAssignment_11(), "rule__Field__FieldTypeAssignment_11");
			builder.put(grammarAccess.getFieldAccess().getFieldLightAssignment_14(), "rule__Field__FieldLightAssignment_14");
			builder.put(grammarAccess.getFieldAccess().getAttributesAssignment_15(), "rule__Field__AttributesAssignment_15");
			builder.put(grammarAccess.getCallAttributesAccess().getTypeAssignment_0(), "rule__CallAttributes__TypeAssignment_0");
			builder.put(grammarAccess.getCallAttributesAccess().getValueAssignment_2(), "rule__CallAttributes__ValueAssignment_2");
			builder.put(grammarAccess.getMissionAccess().getMissionStatementsAssignment_2(), "rule__Mission__MissionStatementsAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FarmGrammarAccess grammarAccess;

	@Override
	protected InternalFarmParser createParser() {
		InternalFarmParser result = new InternalFarmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FarmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FarmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
