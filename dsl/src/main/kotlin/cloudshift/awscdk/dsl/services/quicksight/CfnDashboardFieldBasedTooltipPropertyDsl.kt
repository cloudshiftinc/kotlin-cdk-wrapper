@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The setup for the detailed tooltip.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FieldBasedTooltipProperty fieldBasedTooltipProperty = FieldBasedTooltipProperty.builder()
 * .aggregationVisibility("aggregationVisibility")
 * .tooltipFields(List.of(TooltipItemProperty.builder()
 * .columnTooltipItem(ColumnTooltipItemProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * // the properties below are optional
 * .aggregation(AggregationFunctionProperty.builder()
 * .categoricalAggregationFunction("categoricalAggregationFunction")
 * .dateAggregationFunction("dateAggregationFunction")
 * .numericalAggregationFunction(NumericalAggregationFunctionProperty.builder()
 * .percentileAggregation(PercentileAggregationProperty.builder()
 * .percentileValue(123)
 * .build())
 * .simpleNumericalAggregation("simpleNumericalAggregation")
 * .build())
 * .build())
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .fieldTooltipItem(FieldTooltipItemProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .label("label")
 * .visibility("visibility")
 * .build())
 * .build()))
 * .tooltipTitleType("tooltipTitleType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-fieldbasedtooltip.html)
 */
@CdkDslMarker
public class CfnDashboardFieldBasedTooltipPropertyDsl {
  private val cdkBuilder: CfnDashboard.FieldBasedTooltipProperty.Builder =
      CfnDashboard.FieldBasedTooltipProperty.builder()

  private val _tooltipFields: MutableList<Any> = mutableListOf()

  /**
   * @param aggregationVisibility The visibility of `Show aggregations` .
   */
  public fun aggregationVisibility(aggregationVisibility: String) {
    cdkBuilder.aggregationVisibility(aggregationVisibility)
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(vararg tooltipFields: Any) {
    _tooltipFields.addAll(listOf(*tooltipFields))
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(tooltipFields: Collection<Any>) {
    _tooltipFields.addAll(tooltipFields)
  }

  /**
   * @param tooltipFields The fields configuration in the tooltip.
   */
  public fun tooltipFields(tooltipFields: IResolvable) {
    cdkBuilder.tooltipFields(tooltipFields)
  }

  /**
   * @param tooltipTitleType The type for the &gt;tooltip title. Choose one of the following
   * options:.
   * * `NONE` : Doesn't use the primary value as the title.
   * * `PRIMARY_VALUE` : Uses primary value as the title.
   */
  public fun tooltipTitleType(tooltipTitleType: String) {
    cdkBuilder.tooltipTitleType(tooltipTitleType)
  }

  public fun build(): CfnDashboard.FieldBasedTooltipProperty {
    if(_tooltipFields.isNotEmpty()) cdkBuilder.tooltipFields(_tooltipFields)
    return cdkBuilder.build()
  }
}
