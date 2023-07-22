@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The tooltip.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TooltipItemProperty tooltipItemProperty = TooltipItemProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tooltipitem.html)
 */
@CdkDslMarker
public class CfnTemplateTooltipItemPropertyDsl {
  private val cdkBuilder: CfnTemplate.TooltipItemProperty.Builder =
      CfnTemplate.TooltipItemProperty.builder()

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: IResolvable) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  /**
   * @param columnTooltipItem The tooltip item for the columns that are not part of a field well.
   */
  public fun columnTooltipItem(columnTooltipItem: CfnTemplate.ColumnTooltipItemProperty) {
    cdkBuilder.columnTooltipItem(columnTooltipItem)
  }

  /**
   * @param fieldTooltipItem The tooltip item for the fields.
   */
  public fun fieldTooltipItem(fieldTooltipItem: IResolvable) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  /**
   * @param fieldTooltipItem The tooltip item for the fields.
   */
  public fun fieldTooltipItem(fieldTooltipItem: CfnTemplate.FieldTooltipItemProperty) {
    cdkBuilder.fieldTooltipItem(fieldTooltipItem)
  }

  public fun build(): CfnTemplate.TooltipItemProperty = cdkBuilder.build()
}
