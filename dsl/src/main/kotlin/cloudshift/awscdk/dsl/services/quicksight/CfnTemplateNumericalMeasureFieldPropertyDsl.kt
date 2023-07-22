@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNumericalMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnTemplate.NumericalMeasureFieldProperty.Builder =
      CfnTemplate.NumericalMeasureFieldProperty.builder()

  /**
   * @param aggregationFunction The aggregation function of the measure field.
   */
  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param aggregationFunction The aggregation function of the measure field.
   */
  public
      fun aggregationFunction(aggregationFunction: CfnTemplate.NumericalAggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  /**
   * @param column The column that is used in the `NumericalMeasureField` . 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that is used in the `NumericalMeasureField` . 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param fieldId The custom field ID. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param formatConfiguration The format configuration of the field.
   */
  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  /**
   * @param formatConfiguration The format configuration of the field.
   */
  public
      fun formatConfiguration(formatConfiguration: CfnTemplate.NumberFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun build(): CfnTemplate.NumericalMeasureFieldProperty = cdkBuilder.build()
}
