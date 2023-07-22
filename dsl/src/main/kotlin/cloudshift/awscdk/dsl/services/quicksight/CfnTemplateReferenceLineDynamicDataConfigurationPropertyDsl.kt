@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateReferenceLineDynamicDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ReferenceLineDynamicDataConfigurationProperty.Builder =
      CfnTemplate.ReferenceLineDynamicDataConfigurationProperty.builder()

  /**
   * @param calculation The calculation that is used in the dynamic data. 
   */
  public fun calculation(calculation: IResolvable) {
    cdkBuilder.calculation(calculation)
  }

  /**
   * @param calculation The calculation that is used in the dynamic data. 
   */
  public fun calculation(calculation: CfnTemplate.NumericalAggregationFunctionProperty) {
    cdkBuilder.calculation(calculation)
  }

  /**
   * @param column The column that the dynamic data targets. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the dynamic data targets. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param measureAggregationFunction The aggregation function that is used in the dynamic data.
   */
  public fun measureAggregationFunction(measureAggregationFunction: IResolvable) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  /**
   * @param measureAggregationFunction The aggregation function that is used in the dynamic data.
   */
  public
      fun measureAggregationFunction(measureAggregationFunction: CfnTemplate.AggregationFunctionProperty) {
    cdkBuilder.measureAggregationFunction(measureAggregationFunction)
  }

  public fun build(): CfnTemplate.ReferenceLineDynamicDataConfigurationProperty = cdkBuilder.build()
}
