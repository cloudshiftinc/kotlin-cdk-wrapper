@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a calculated field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicCalculatedFieldProperty topicCalculatedFieldProperty =
 * TopicCalculatedFieldProperty.builder()
 * .calculatedFieldName("calculatedFieldName")
 * .expression("expression")
 * // the properties below are optional
 * .aggregation("aggregation")
 * .allowedAggregations(List.of("allowedAggregations"))
 * .calculatedFieldDescription("calculatedFieldDescription")
 * .calculatedFieldSynonyms(List.of("calculatedFieldSynonyms"))
 * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
 * .cellValue("cellValue")
 * .synonyms(List.of("synonyms"))
 * .build()))
 * .columnDataRole("columnDataRole")
 * .comparativeOrder(ComparativeOrderProperty.builder()
 * .specifedOrder(List.of("specifedOrder"))
 * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
 * .useOrdering("useOrdering")
 * .build())
 * .defaultFormatting(DefaultFormattingProperty.builder()
 * .displayFormat("displayFormat")
 * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
 * .blankCellFormat("blankCellFormat")
 * .currencySymbol("currencySymbol")
 * .dateFormat("dateFormat")
 * .decimalSeparator("decimalSeparator")
 * .fractionDigits(123)
 * .groupingSeparator("groupingSeparator")
 * .negativeFormat(NegativeFormatProperty.builder()
 * .prefix("prefix")
 * .suffix("suffix")
 * .build())
 * .prefix("prefix")
 * .suffix("suffix")
 * .unitScaler("unitScaler")
 * .useBlankCellFormat(false)
 * .useGrouping(false)
 * .build())
 * .build())
 * .isIncludedInTopic(false)
 * .neverAggregateInFilter(false)
 * .nonAdditive(false)
 * .notAllowedAggregations(List.of("notAllowedAggregations"))
 * .semanticType(SemanticTypeProperty.builder()
 * .falseyCellValue("falseyCellValue")
 * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
 * .subTypeName("subTypeName")
 * .truthyCellValue("truthyCellValue")
 * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build())
 * .timeGranularity("timeGranularity")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html)
 */
@CdkDslMarker
public class CfnTopicTopicCalculatedFieldPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicCalculatedFieldProperty.Builder =
        CfnTopic.TopicCalculatedFieldProperty.builder()

    private val _allowedAggregations: MutableList<String> = mutableListOf()

    private val _calculatedFieldSynonyms: MutableList<String> = mutableListOf()

    private val _cellValueSynonyms: MutableList<Any> = mutableListOf()

    private val _notAllowedAggregations: MutableList<String> = mutableListOf()

    /**
     * @param aggregation The default aggregation. Valid values for this structure are `SUM` , `MAX`
     *   , `MIN` , `COUNT` , `DISTINCT_COUNT` , and `AVERAGE` .
     */
    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    /**
     * @param allowedAggregations The list of aggregation types that are allowed for the calculated
     *   field. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` ,
     *   `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun allowedAggregations(vararg allowedAggregations: String) {
        _allowedAggregations.addAll(listOf(*allowedAggregations))
    }

    /**
     * @param allowedAggregations The list of aggregation types that are allowed for the calculated
     *   field. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` ,
     *   `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun allowedAggregations(allowedAggregations: Collection<String>) {
        _allowedAggregations.addAll(allowedAggregations)
    }

    /** @param calculatedFieldDescription The calculated field description. */
    public fun calculatedFieldDescription(calculatedFieldDescription: String) {
        cdkBuilder.calculatedFieldDescription(calculatedFieldDescription)
    }

    /** @param calculatedFieldName The calculated field name. */
    public fun calculatedFieldName(calculatedFieldName: String) {
        cdkBuilder.calculatedFieldName(calculatedFieldName)
    }

    /** @param calculatedFieldSynonyms The other names or aliases for the calculated field. */
    public fun calculatedFieldSynonyms(vararg calculatedFieldSynonyms: String) {
        _calculatedFieldSynonyms.addAll(listOf(*calculatedFieldSynonyms))
    }

    /** @param calculatedFieldSynonyms The other names or aliases for the calculated field. */
    public fun calculatedFieldSynonyms(calculatedFieldSynonyms: Collection<String>) {
        _calculatedFieldSynonyms.addAll(calculatedFieldSynonyms)
    }

    /** @param cellValueSynonyms The other names or aliases for the calculated field cell value. */
    public fun cellValueSynonyms(vararg cellValueSynonyms: Any) {
        _cellValueSynonyms.addAll(listOf(*cellValueSynonyms))
    }

    /** @param cellValueSynonyms The other names or aliases for the calculated field cell value. */
    public fun cellValueSynonyms(cellValueSynonyms: Collection<Any>) {
        _cellValueSynonyms.addAll(cellValueSynonyms)
    }

    /** @param cellValueSynonyms The other names or aliases for the calculated field cell value. */
    public fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms)
    }

    /**
     * @param columnDataRole The column data role for a calculated field. Valid values for this
     *   structure are `DIMENSION` and `MEASURE` .
     */
    public fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
    }

    /**
     * @param comparativeOrder The order in which data is displayed for the calculated field when
     *   it's used in a comparative context.
     */
    public fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    /**
     * @param comparativeOrder The order in which data is displayed for the calculated field when
     *   it's used in a comparative context.
     */
    public fun comparativeOrder(comparativeOrder: CfnTopic.ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    /** @param defaultFormatting The default formatting definition. */
    public fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    /** @param defaultFormatting The default formatting definition. */
    public fun defaultFormatting(defaultFormatting: CfnTopic.DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    /** @param expression The calculated field expression. */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param isIncludedInTopic A boolean value that indicates if a calculated field is included in
     *   the topic.
     */
    public fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    /**
     * @param isIncludedInTopic A boolean value that indicates if a calculated field is included in
     *   the topic.
     */
    public fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    /**
     * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
     *   calculated field in filters.
     */
    public fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    /**
     * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
     *   calculated field in filters.
     */
    public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    /** @param nonAdditive The non additive for the table style target. */
    public fun nonAdditive(nonAdditive: Boolean) {
        cdkBuilder.nonAdditive(nonAdditive)
    }

    /** @param nonAdditive The non additive for the table style target. */
    public fun nonAdditive(nonAdditive: IResolvable) {
        cdkBuilder.nonAdditive(nonAdditive)
    }

    /**
     * @param notAllowedAggregations The list of aggregation types that are not allowed for the
     *   calculated field. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` ,
     *   `MAX` , `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and
     *   `PERCENTILE` .
     */
    public fun notAllowedAggregations(vararg notAllowedAggregations: String) {
        _notAllowedAggregations.addAll(listOf(*notAllowedAggregations))
    }

    /**
     * @param notAllowedAggregations The list of aggregation types that are not allowed for the
     *   calculated field. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` ,
     *   `MAX` , `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and
     *   `PERCENTILE` .
     */
    public fun notAllowedAggregations(notAllowedAggregations: Collection<String>) {
        _notAllowedAggregations.addAll(notAllowedAggregations)
    }

    /** @param semanticType The semantic type. */
    public fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType)
    }

    /** @param semanticType The semantic type. */
    public fun semanticType(semanticType: CfnTopic.SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType)
    }

    /**
     * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
     *   values.
     */
    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    public fun build(): CfnTopic.TopicCalculatedFieldProperty {
        if (_allowedAggregations.isNotEmpty()) cdkBuilder.allowedAggregations(_allowedAggregations)
        if (_calculatedFieldSynonyms.isNotEmpty())
            cdkBuilder.calculatedFieldSynonyms(_calculatedFieldSynonyms)
        if (_cellValueSynonyms.isNotEmpty()) cdkBuilder.cellValueSynonyms(_cellValueSynonyms)
        if (_notAllowedAggregations.isNotEmpty())
            cdkBuilder.notAllowedAggregations(_notAllowedAggregations)
        return cdkBuilder.build()
    }
}
