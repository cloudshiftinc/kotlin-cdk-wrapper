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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * Represents a column in a dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TopicColumnProperty topicColumnProperty = TopicColumnProperty.builder()
 * .columnName("columnName")
 * // the properties below are optional
 * .aggregation("aggregation")
 * .allowedAggregations(List.of("allowedAggregations"))
 * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
 * .cellValue("cellValue")
 * .synonyms(List.of("synonyms"))
 * .build()))
 * .columnDataRole("columnDataRole")
 * .columnDescription("columnDescription")
 * .columnFriendlyName("columnFriendlyName")
 * .columnSynonyms(List.of("columnSynonyms"))
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html)
 */
@CdkDslMarker
public class CfnTopicTopicColumnPropertyDsl {
    private val cdkBuilder: CfnTopic.TopicColumnProperty.Builder =
        CfnTopic.TopicColumnProperty.builder()

    private val _allowedAggregations: MutableList<String> = mutableListOf()

    private val _cellValueSynonyms: MutableList<Any> = mutableListOf()

    private val _columnSynonyms: MutableList<String> = mutableListOf()

    private val _notAllowedAggregations: MutableList<String> = mutableListOf()

    /**
     * @param aggregation The type of aggregation that is performed on the column data when it's
     *   queried. Valid values for this structure are `SUM` , `MAX` , `MIN` , `COUNT` ,
     *   `DISTINCT_COUNT` , and `AVERAGE` .
     */
    public fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
    }

    /**
     * @param allowedAggregations The list of aggregation types that are allowed for the column.
     *   Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     *   `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun allowedAggregations(vararg allowedAggregations: String) {
        _allowedAggregations.addAll(listOf(*allowedAggregations))
    }

    /**
     * @param allowedAggregations The list of aggregation types that are allowed for the column.
     *   Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     *   `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun allowedAggregations(allowedAggregations: Collection<String>) {
        _allowedAggregations.addAll(allowedAggregations)
    }

    /** @param cellValueSynonyms The other names or aliases for the column cell value. */
    public fun cellValueSynonyms(vararg cellValueSynonyms: Any) {
        _cellValueSynonyms.addAll(listOf(*cellValueSynonyms))
    }

    /** @param cellValueSynonyms The other names or aliases for the column cell value. */
    public fun cellValueSynonyms(cellValueSynonyms: Collection<Any>) {
        _cellValueSynonyms.addAll(cellValueSynonyms)
    }

    /** @param cellValueSynonyms The other names or aliases for the column cell value. */
    public fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms)
    }

    /**
     * @param columnDataRole The role of the column in the data. Valid values are `DIMENSION` and
     *   `MEASURE` .
     */
    public fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
    }

    /** @param columnDescription A description of the column and its contents. */
    public fun columnDescription(columnDescription: String) {
        cdkBuilder.columnDescription(columnDescription)
    }

    /** @param columnFriendlyName A user-friendly name for the column. */
    public fun columnFriendlyName(columnFriendlyName: String) {
        cdkBuilder.columnFriendlyName(columnFriendlyName)
    }

    /** @param columnName The name of the column. */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /** @param columnSynonyms The other names or aliases for the column. */
    public fun columnSynonyms(vararg columnSynonyms: String) {
        _columnSynonyms.addAll(listOf(*columnSynonyms))
    }

    /** @param columnSynonyms The other names or aliases for the column. */
    public fun columnSynonyms(columnSynonyms: Collection<String>) {
        _columnSynonyms.addAll(columnSynonyms)
    }

    /**
     * @param comparativeOrder The order in which data is displayed for the column when it's used in
     *   a comparative context.
     */
    public fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    /**
     * @param comparativeOrder The order in which data is displayed for the column when it's used in
     *   a comparative context.
     */
    public fun comparativeOrder(comparativeOrder: CfnTopic.ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder)
    }

    /** @param defaultFormatting The default formatting used for values in the column. */
    public fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    /** @param defaultFormatting The default formatting used for values in the column. */
    public fun defaultFormatting(defaultFormatting: CfnTopic.DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting)
    }

    /**
     * @param isIncludedInTopic A Boolean value that indicates whether the column is included in the
     *   query results.
     */
    public fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    /**
     * @param isIncludedInTopic A Boolean value that indicates whether the column is included in the
     *   query results.
     */
    public fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
    }

    /**
     * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the column
     *   data when it's used in a filter context.
     */
    public fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    /**
     * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the column
     *   data when it's used in a filter context.
     */
    public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
    }

    /**
     * @param notAllowedAggregations The list of aggregation types that are not allowed for the
     *   column. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` ,
     *   `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun notAllowedAggregations(vararg notAllowedAggregations: String) {
        _notAllowedAggregations.addAll(listOf(*notAllowedAggregations))
    }

    /**
     * @param notAllowedAggregations The list of aggregation types that are not allowed for the
     *   column. Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` ,
     *   `MEDIAN` , `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     */
    public fun notAllowedAggregations(notAllowedAggregations: Collection<String>) {
        _notAllowedAggregations.addAll(notAllowedAggregations)
    }

    /** @param semanticType The semantic type of data contained in the column. */
    public fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType)
    }

    /** @param semanticType The semantic type of data contained in the column. */
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

    public fun build(): CfnTopic.TopicColumnProperty {
        if (_allowedAggregations.isNotEmpty()) cdkBuilder.allowedAggregations(_allowedAggregations)
        if (_cellValueSynonyms.isNotEmpty()) cdkBuilder.cellValueSynonyms(_cellValueSynonyms)
        if (_columnSynonyms.isNotEmpty()) cdkBuilder.columnSynonyms(_columnSynonyms)
        if (_notAllowedAggregations.isNotEmpty())
            cdkBuilder.notAllowedAggregations(_notAllowedAggregations)
        return cdkBuilder.build()
    }
}
