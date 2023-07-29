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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTopicProps

/**
 * Properties for defining a `CfnTopic`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CfnTopicProps cfnTopicProps = CfnTopicProps.builder()
 * .awsAccountId("awsAccountId")
 * .dataSets(List.of(DatasetMetadataProperty.builder()
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
 * .build()))
 * .description("description")
 * .name("name")
 * .topicId("topicId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html)
 */
@CdkDslMarker
public class CfnTopicPropsDsl {
    private val cdkBuilder: CfnTopicProps.Builder = CfnTopicProps.builder()

    private val _dataSets: MutableList<Any> = mutableListOf()

    /** @param awsAccountId The ID of the AWS account that you want to create a topic in. */
    public fun awsAccountId(awsAccountId: String) {
        cdkBuilder.awsAccountId(awsAccountId)
    }

    /** @param dataSets The data sets that the topic is associated with. */
    public fun dataSets(vararg dataSets: Any) {
        _dataSets.addAll(listOf(*dataSets))
    }

    /** @param dataSets The data sets that the topic is associated with. */
    public fun dataSets(dataSets: Collection<Any>) {
        _dataSets.addAll(dataSets)
    }

    /** @param dataSets The data sets that the topic is associated with. */
    public fun dataSets(dataSets: IResolvable) {
        cdkBuilder.dataSets(dataSets)
    }

    /** @param description The description of the topic. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the topic. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param topicId The ID for the topic. This ID is unique per AWS Region for each AWS account.
     */
    public fun topicId(topicId: String) {
        cdkBuilder.topicId(topicId)
    }

    public fun build(): CfnTopicProps {
        if (_dataSets.isNotEmpty()) cdkBuilder.dataSets(_dataSets)
        return cdkBuilder.build()
    }
}
