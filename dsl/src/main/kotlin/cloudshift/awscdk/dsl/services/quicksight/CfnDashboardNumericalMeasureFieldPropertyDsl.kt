@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardNumericalMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.NumericalMeasureFieldProperty.Builder =
      CfnDashboard.NumericalMeasureFieldProperty.builder()

  public fun aggregationFunction(aggregationFunction: IResolvable) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public
      fun aggregationFunction(aggregationFunction: CfnDashboard.NumericalAggregationFunctionProperty) {
    cdkBuilder.aggregationFunction(aggregationFunction)
  }

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public
      fun formatConfiguration(formatConfiguration: CfnDashboard.NumberFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun build(): CfnDashboard.NumericalMeasureFieldProperty = cdkBuilder.build()
}
