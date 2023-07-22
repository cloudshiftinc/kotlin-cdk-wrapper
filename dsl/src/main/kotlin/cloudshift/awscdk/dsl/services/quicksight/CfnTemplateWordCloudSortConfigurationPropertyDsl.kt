@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The sort configuration of a word cloud visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * WordCloudSortConfigurationProperty wordCloudSortConfigurationProperty =
 * WordCloudSortConfigurationProperty.builder()
 * .categoryItemsLimit(ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build())
 * .categorySort(List.of(FieldSortOptionsProperty.builder()
 * .columnSort(ColumnSortProperty.builder()
 * .direction("direction")
 * .sortBy(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregationFunction(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .build())
 * .fieldSort(FieldSortProperty.builder()
 * .direction("direction")
 * .fieldId("fieldId")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-wordcloudsortconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateWordCloudSortConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.WordCloudSortConfigurationProperty.Builder =
      CfnTemplate.WordCloudSortConfigurationProperty.builder()

  private val _categorySort: MutableList<Any> = mutableListOf()

  /**
   * @param categoryItemsLimit The limit on the number of groups that are displayed in a word cloud.
   */
  public fun categoryItemsLimit(categoryItemsLimit: IResolvable) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categoryItemsLimit The limit on the number of groups that are displayed in a word cloud.
   */
  public fun categoryItemsLimit(categoryItemsLimit: CfnTemplate.ItemsLimitConfigurationProperty) {
    cdkBuilder.categoryItemsLimit(categoryItemsLimit)
  }

  /**
   * @param categorySort The sort configuration of group by fields.
   */
  public fun categorySort(vararg categorySort: Any) {
    _categorySort.addAll(listOf(*categorySort))
  }

  /**
   * @param categorySort The sort configuration of group by fields.
   */
  public fun categorySort(categorySort: Collection<Any>) {
    _categorySort.addAll(categorySort)
  }

  /**
   * @param categorySort The sort configuration of group by fields.
   */
  public fun categorySort(categorySort: IResolvable) {
    cdkBuilder.categorySort(categorySort)
  }

  public fun build(): CfnTemplate.WordCloudSortConfigurationProperty {
    if(_categorySort.isNotEmpty()) cdkBuilder.categorySort(_categorySort)
    return cdkBuilder.build()
  }
}
