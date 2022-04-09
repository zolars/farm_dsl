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
			builder.put(grammarAccess.getClassAccess().getAlternatives(), "rule__Class__Alternatives");
			builder.put(grammarAccess.getParamAccess().getAlternatives(), "rule__Param__Alternatives");
			builder.put(grammarAccess.getTypeNameAccess().getAlternatives(), "rule__TypeName__Alternatives");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getBuiltinFunctionAccess().getAlternatives(), "rule__BuiltinFunction__Alternatives");
			builder.put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getAlternatives_1_0_0(), "rule__RelationOrExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getAdditionExpressionAccess().getAlternatives_1_0_0(), "rule__AdditionExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getAlternatives_1_0_0(), "rule__MultiplicationExpression__Alternatives_1_0_0");
			builder.put(grammarAccess.getUnaryExpressionAccess().getAlternatives(), "rule__UnaryExpression__Alternatives");
			builder.put(grammarAccess.getUnaryExpressionNotPlusMinusAccess().getAlternatives(), "rule__UnaryExpressionNotPlusMinus__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives(), "rule__Literal__Alternatives");
			builder.put(grammarAccess.getFieldAccess().getFieldTypeAlternatives_11_0(), "rule__Field__FieldTypeAlternatives_11_0");
			builder.put(grammarAccess.getFieldAccess().getFieldLightAlternatives_14_0(), "rule__Field__FieldLightAlternatives_14_0");
			builder.put(grammarAccess.getMissionAccess().getStatementsAlternatives_3_0(), "rule__Mission__StatementsAlternatives_3_0");
			builder.put(grammarAccess.getTaskStatementAccess().getStatementsAlternatives_8_0(), "rule__TaskStatement__StatementsAlternatives_8_0");
			builder.put(grammarAccess.getParamAccess().getGroup_0(), "rule__Param__Group_0__0");
			builder.put(grammarAccess.getParamAccess().getGroup_1(), "rule__Param__Group_1__0");
			builder.put(grammarAccess.getParamAccess().getGroup_2(), "rule__Param__Group_2__0");
			builder.put(grammarAccess.getParamAccess().getGroup_3(), "rule__Param__Group_3__0");
			builder.put(grammarAccess.getParamAccess().getGroup_4(), "rule__Param__Group_4__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getLoopStatementAccess().getGroup(), "rule__LoopStatement__Group__0");
			builder.put(grammarAccess.getJudgeStatementAccess().getGroup(), "rule__JudgeStatement__Group__0");
			builder.put(grammarAccess.getJudgeStatementAccess().getGroup_8(), "rule__JudgeStatement__Group_8__0");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getGroup(), "rule__ElseJudgeStatement__Group__0");
			builder.put(grammarAccess.getReportFunctionAccess().getGroup(), "rule__ReportFunction__Group__0");
			builder.put(grammarAccess.getGetStageFunctionAccess().getGroup(), "rule__GetStageFunction__Group__0");
			builder.put(grammarAccess.getCountStageFunctionAccess().getGroup(), "rule__CountStageFunction__Group__0");
			builder.put(grammarAccess.getGetValueFunctionAccess().getGroup(), "rule__GetValueFunction__Group__0");
			builder.put(grammarAccess.getSetFieldValueFunctionAccess().getGroup(), "rule__SetFieldValueFunction__Group__0");
			builder.put(grammarAccess.getPlantFunctionAccess().getGroup(), "rule__PlantFunction__Group__0");
			builder.put(grammarAccess.getMoveFunctionAccess().getGroup(), "rule__MoveFunction__Group__0");
			builder.put(grammarAccess.getWaitFunctionAccess().getGroup(), "rule__WaitFunction__Group__0");
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
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getRealLiteralAccess().getGroup(), "rule__RealLiteral__Group__0");
			builder.put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getCropAccess().getGroup(), "rule__Crop__Group__0");
			builder.put(grammarAccess.getCropStagesAccess().getGroup(), "rule__CropStages__Group__0");
			builder.put(grammarAccess.getCropStagesAccess().getGroup_1(), "rule__CropStages__Group_1__0");
			builder.put(grammarAccess.getCropStageAccess().getGroup(), "rule__CropStage__Group__0");
			builder.put(grammarAccess.getCropAttributesAccess().getGroup(), "rule__CropAttributes__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
			builder.put(grammarAccess.getFieldAccess().getGroup_19(), "rule__Field__Group_19__0");
			builder.put(grammarAccess.getIPAccess().getGroup(), "rule__IP__Group__0");
			builder.put(grammarAccess.getIPAccess().getGroup_2(), "rule__IP__Group_2__0");
			builder.put(grammarAccess.getIPAccess().getGroup_2_2(), "rule__IP__Group_2_2__0");
			builder.put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
			builder.put(grammarAccess.getTaskStatementAccess().getGroup(), "rule__TaskStatement__Group__0");
			builder.put(grammarAccess.getTaskStatementAccess().getGroup_3(), "rule__TaskStatement__Group_3__0");
			builder.put(grammarAccess.getTaskStatementAccess().getGroup_3_1(), "rule__TaskStatement__Group_3_1__0");
			builder.put(grammarAccess.getReturnStatementAccess().getGroup(), "rule__ReturnStatement__Group__0");
			builder.put(grammarAccess.getExecuteStatementAccess().getGroup(), "rule__ExecuteStatement__Group__0");
			builder.put(grammarAccess.getFarmProgramAccess().getStatementsAssignment(), "rule__FarmProgram__StatementsAssignment");
			builder.put(grammarAccess.getParamAccess().getParamAssignment_0_1(), "rule__Param__ParamAssignment_0_1");
			builder.put(grammarAccess.getParamAccess().getParamAssignment_1_1(), "rule__Param__ParamAssignment_1_1");
			builder.put(grammarAccess.getParamAccess().getParamAssignment_2_1(), "rule__Param__ParamAssignment_2_1");
			builder.put(grammarAccess.getParamAccess().getParamAssignment_3_1(), "rule__Param__ParamAssignment_3_1");
			builder.put(grammarAccess.getParamAccess().getParamAssignment_4_1(), "rule__Param__ParamAssignment_4_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
			builder.put(grammarAccess.getVariableAccess().getValueAssignment_3(), "rule__Variable__ValueAssignment_3");
			builder.put(grammarAccess.getLoopStatementAccess().getConditionAssignment_2(), "rule__LoopStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getLoopStatementAccess().getStatementsAssignment_5(), "rule__LoopStatement__StatementsAssignment_5");
			builder.put(grammarAccess.getJudgeStatementAccess().getConditionAssignment_2(), "rule__JudgeStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getJudgeStatementAccess().getStatementsAssignment_5(), "rule__JudgeStatement__StatementsAssignment_5");
			builder.put(grammarAccess.getJudgeStatementAccess().getElseifAssignment_7(), "rule__JudgeStatement__ElseifAssignment_7");
			builder.put(grammarAccess.getJudgeStatementAccess().getElseStatementAssignment_8_2(), "rule__JudgeStatement__ElseStatementAssignment_8_2");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getConditionAssignment_2(), "rule__ElseJudgeStatement__ConditionAssignment_2");
			builder.put(grammarAccess.getElseJudgeStatementAccess().getStatementsAssignment_5(), "rule__ElseJudgeStatement__StatementsAssignment_5");
			builder.put(grammarAccess.getReportFunctionAccess().getEntityAssignment_1(), "rule__ReportFunction__EntityAssignment_1");
			builder.put(grammarAccess.getGetStageFunctionAccess().getGetStageCropAssignment_0(), "rule__GetStageFunction__GetStageCropAssignment_0");
			builder.put(grammarAccess.getGetStageFunctionAccess().getStageNumberAssignment_2(), "rule__GetStageFunction__StageNumberAssignment_2");
			builder.put(grammarAccess.getCountStageFunctionAccess().getCountStageCropAssignment_0(), "rule__CountStageFunction__CountStageCropAssignment_0");
			builder.put(grammarAccess.getGetValueFunctionAccess().getEntityAssignment_0(), "rule__GetValueFunction__EntityAssignment_0");
			builder.put(grammarAccess.getGetValueFunctionAccess().getAttributeAssignment_2(), "rule__GetValueFunction__AttributeAssignment_2");
			builder.put(grammarAccess.getSetFieldValueFunctionAccess().getSetValueFieldAssignment_0(), "rule__SetFieldValueFunction__SetValueFieldAssignment_0");
			builder.put(grammarAccess.getSetFieldValueFunctionAccess().getSetFieldAttributeAssignment_2(), "rule__SetFieldValueFunction__SetFieldAttributeAssignment_2");
			builder.put(grammarAccess.getSetFieldValueFunctionAccess().getSetFieldValueAssignment_4(), "rule__SetFieldValueFunction__SetFieldValueAssignment_4");
			builder.put(grammarAccess.getPlantFunctionAccess().getPlantInFieldAssignment_0(), "rule__PlantFunction__PlantInFieldAssignment_0");
			builder.put(grammarAccess.getPlantFunctionAccess().getPlantCropAssignment_2(), "rule__PlantFunction__PlantCropAssignment_2");
			builder.put(grammarAccess.getMoveFunctionAccess().getMoveFromFieldAssignment_1(), "rule__MoveFunction__MoveFromFieldAssignment_1");
			builder.put(grammarAccess.getMoveFunctionAccess().getMoveToFieldAssignment_3(), "rule__MoveFunction__MoveToFieldAssignment_3");
			builder.put(grammarAccess.getWaitFunctionAccess().getValueAssignment_1(), "rule__WaitFunction__ValueAssignment_1");
			builder.put(grammarAccess.getConditionOrExpressionAccess().getRightAssignment_1_0_2(), "rule__ConditionOrExpression__RightAssignment_1_0_2");
			builder.put(grammarAccess.getConditionAndExpressionAccess().getRightAssignment_1_0_2(), "rule__ConditionAndExpression__RightAssignment_1_0_2");
			builder.put(grammarAccess.getRelationOrExpressionAccess().getRightAssignment_1_1(), "rule__RelationOrExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getAdditionExpressionAccess().getRightAssignment_1_1(), "rule__AdditionExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getMultiplicationExpressionAccess().getRightAssignment_1_1(), "rule__MultiplicationExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getUnaryExpressionAccess().getExpAssignment_1_2(), "rule__UnaryExpression__ExpAssignment_1_2");
			builder.put(grammarAccess.getNotBooleanExpressionAccess().getExpAssignment_1(), "rule__NotBooleanExpression__ExpAssignment_1");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getVarAssignment_1(), "rule__PrimaryExpression__VarAssignment_1");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValAssignment_1(), "rule__BooleanLiteral__ValAssignment_1");
			builder.put(grammarAccess.getRealLiteralAccess().getValAssignment_1(), "rule__RealLiteral__ValAssignment_1");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
			builder.put(grammarAccess.getCropAccess().getNameAssignment_1(), "rule__Crop__NameAssignment_1");
			builder.put(grammarAccess.getCropAccess().getCropNameAssignment_5(), "rule__Crop__CropNameAssignment_5");
			builder.put(grammarAccess.getCropAccess().getStatementsAssignment_9(), "rule__Crop__StatementsAssignment_9");
			builder.put(grammarAccess.getCropStagesAccess().getElementsAssignment_0(), "rule__CropStages__ElementsAssignment_0");
			builder.put(grammarAccess.getCropStagesAccess().getElementsAssignment_1_1(), "rule__CropStages__ElementsAssignment_1_1");
			builder.put(grammarAccess.getCropStageAccess().getNameAssignment_3(), "rule__CropStage__NameAssignment_3");
			builder.put(grammarAccess.getCropStageAccess().getTimeConsumendAssignment_6(), "rule__CropStage__TimeConsumendAssignment_6");
			builder.put(grammarAccess.getCropStageAccess().getElementsAssignment_7(), "rule__CropStage__ElementsAssignment_7");
			builder.put(grammarAccess.getCropAttributesAccess().getTypeAssignment_0(), "rule__CropAttributes__TypeAssignment_0");
			builder.put(grammarAccess.getCropAttributesAccess().getValueAssignment_2(), "rule__CropAttributes__ValueAssignment_2");
			builder.put(grammarAccess.getFieldAccess().getNameAssignment_1(), "rule__Field__NameAssignment_1");
			builder.put(grammarAccess.getFieldAccess().getFieldNameAssignment_5(), "rule__Field__FieldNameAssignment_5");
			builder.put(grammarAccess.getFieldAccess().getIpAssignment_8(), "rule__Field__IpAssignment_8");
			builder.put(grammarAccess.getFieldAccess().getFieldTypeAssignment_11(), "rule__Field__FieldTypeAssignment_11");
			builder.put(grammarAccess.getFieldAccess().getFieldLightAssignment_14(), "rule__Field__FieldLightAssignment_14");
			builder.put(grammarAccess.getFieldAccess().getFieldMonitorsAssignment_18(), "rule__Field__FieldMonitorsAssignment_18");
			builder.put(grammarAccess.getFieldAccess().getFieldMonitorsAssignment_19_1(), "rule__Field__FieldMonitorsAssignment_19_1");
			builder.put(grammarAccess.getFieldMonitorAccess().getMonitorAssignment(), "rule__FieldMonitor__MonitorAssignment");
			builder.put(grammarAccess.getMissionAccess().getNameAssignment_1(), "rule__Mission__NameAssignment_1");
			builder.put(grammarAccess.getMissionAccess().getStatementsAssignment_3(), "rule__Mission__StatementsAssignment_3");
			builder.put(grammarAccess.getTaskStatementAccess().getNameAssignment_1(), "rule__TaskStatement__NameAssignment_1");
			builder.put(grammarAccess.getTaskStatementAccess().getParmasAssignment_3_0(), "rule__TaskStatement__ParmasAssignment_3_0");
			builder.put(grammarAccess.getTaskStatementAccess().getParmasAssignment_3_1_1(), "rule__TaskStatement__ParmasAssignment_3_1_1");
			builder.put(grammarAccess.getTaskStatementAccess().getTypeNameAssignment_6(), "rule__TaskStatement__TypeNameAssignment_6");
			builder.put(grammarAccess.getTaskStatementAccess().getStatementsAssignment_8(), "rule__TaskStatement__StatementsAssignment_8");
			builder.put(grammarAccess.getReturnStatementAccess().getValueAssignment_2(), "rule__ReturnStatement__ValueAssignment_2");
			builder.put(grammarAccess.getExecuteStatementAccess().getStatementsAssignment_2(), "rule__ExecuteStatement__StatementsAssignment_2");
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
