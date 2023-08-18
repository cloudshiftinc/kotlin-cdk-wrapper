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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopic

/**
 * A structure that represents a dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DatasetMetadataProperty datasetMetadataProperty = DatasetMetadataProperty.builder()
 * .datasetArn("datasetArn")
 * // the properties below are optional
 * .calculatedFields(List.of(TopicCalculatedFieldProperty.builder()
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
 * .build()))
 * .columns(List.of(TopicColumnProperty.builder()
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
 * .build()))
 * .dataAggregation(DataAggregationProperty.builder()
 * .datasetRowDateGranularity("datasetRowDateGranularity")
 * .defaultDateColumnName("defaultDateColumnName")
 * .build())
 * .datasetDescription("datasetDescription")
 * .datasetName("datasetName")
 * .filters(List.of(TopicFilterProperty.builder()
 * .filterName("filterName")
 * .operandFieldName("operandFieldName")
 * // the properties below are optional
 * .categoryFilter(TopicCategoryFilterProperty.builder()
 * .categoryFilterFunction("categoryFilterFunction")
 * .categoryFilterType("categoryFilterType")
 * .constant(TopicCategoryFilterConstantProperty.builder()
 * .collectiveConstant(CollectiveConstantProperty.builder()
 * .valueList(List.of("valueList"))
 * .build())
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .inverse(false)
 * .build())
 * .dateRangeFilter(TopicDateRangeFilterProperty.builder()
 * .constant(TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build())
 * .inclusive(false)
 * .build())
 * .filterClass("filterClass")
 * .filterDescription("filterDescription")
 * .filterSynonyms(List.of("filterSynonyms"))
 * .filterType("filterType")
 * .numericEqualityFilter(TopicNumericEqualityFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .build())
 * .numericRangeFilter(TopicNumericRangeFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build())
 * .inclusive(false)
 * .build())
 * .relativeDateFilter(TopicRelativeDateFilterProperty.builder()
 * .constant(TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .relativeDateFilterFunction("relativeDateFilterFunction")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .namedEntities(List.of(TopicNamedEntityProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .definition(List.of(NamedEntityDefinitionProperty.builder()
 * .fieldName("fieldName")
 * .metric(NamedEntityDefinitionMetricProperty.builder()
 * .aggregation("aggregation")
 * .aggregationFunctionParameters(Map.of(
 * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
 * .build())
 * .propertyName("propertyName")
 * .propertyRole("propertyRole")
 * .propertyUsage("propertyUsage")
 * .build()))
 * .entityDescription("entityDescription")
 * .entitySynonyms(List.of("entitySynonyms"))
 * .semanticEntityType(SemanticEntityTypeProperty.builder()
 * .subTypeName("subTypeName")
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html)
 */
@CdkDslMarker
public class CfnTopicDatasetMetadataPropertyDsl {
    private val cdkBuilder: CfnTopic.DatasetMetadataProperty.Builder =
        CfnTopic.DatasetMetadataProperty.builder()

    private val _calculatedFields: MutableList<Any> = mutableListOf()

    private val _columns: MutableList<Any> = mutableListOf()

    private val _filters: MutableList<Any> = mutableListOf()

    private val _namedEntities: MutableList<Any> = mutableListOf()

    /** @param calculatedFields The list of calculated field definitions. */
    public fun calculatedFields(vararg calculatedFields: Any) {
        _calculatedFields.addAll(listOf(*calculatedFields))
    }

    /** @param calculatedFields The list of calculated field definitions. */
    public fun calculatedFields(calculatedFields: Collection<Any>) {
        _calculatedFields.addAll(calculatedFields)
    }

    /** @param calculatedFields The list of calculated field definitions. */
    public fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields)
    }

    /** @param columns The list of column definitions. */
    public fun columns(vararg columns: Any) {
        _columns.addAll(listOf(*columns))
    }

    /** @param columns The list of column definitions. */
    public fun columns(columns: Collection<Any>) {
        _columns.addAll(columns)
    }

    /** @param columns The list of column definitions. */
    public fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns)
    }

    /** @param dataAggregation The definition of a data aggregation. */
    public fun dataAggregation(dataAggregation: IResolvable) {
        cdkBuilder.dataAggregation(dataAggregation)
    }

    /** @param dataAggregation The definition of a data aggregation. */
    public fun dataAggregation(dataAggregation: CfnTopic.DataAggregationProperty) {
        cdkBuilder.dataAggregation(dataAggregation)
    }

    /** @param datasetArn The Amazon Resource Name (ARN) of the dataset. */
    public fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
    }

    /** @param datasetDescription The description of the dataset. */
    public fun datasetDescription(datasetDescription: String) {
        cdkBuilder.datasetDescription(datasetDescription)
    }

    /** @param datasetName The name of the dataset. */
    public fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
    }

    /** @param filters The list of filter definitions. */
    public fun filters(vararg filters: Any) {
        _filters.addAll(listOf(*filters))
    }

    /** @param filters The list of filter definitions. */
    public fun filters(filters: Collection<Any>) {
        _filters.addAll(filters)
    }

    /** @param filters The list of filter definitions. */
    public fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters)
    }

    /** @param namedEntities The list of named entities definitions. */
    public fun namedEntities(vararg namedEntities: Any) {
        _namedEntities.addAll(listOf(*namedEntities))
    }

    /** @param namedEntities The list of named entities definitions. */
    public fun namedEntities(namedEntities: Collection<Any>) {
        _namedEntities.addAll(namedEntities)
    }

    /** @param namedEntities The list of named entities definitions. */
    public fun namedEntities(namedEntities: IResolvable) {
        cdkBuilder.namedEntities(namedEntities)
    }

    public fun build(): CfnTopic.DatasetMetadataProperty {
        if (_calculatedFields.isNotEmpty()) cdkBuilder.calculatedFields(_calculatedFields)
        if (_columns.isNotEmpty()) cdkBuilder.columns(_columns)
        if (_filters.isNotEmpty()) cdkBuilder.filters(_filters)
        if (_namedEntities.isNotEmpty()) cdkBuilder.namedEntities(_namedEntities)
        return cdkBuilder.build()
    }
}
