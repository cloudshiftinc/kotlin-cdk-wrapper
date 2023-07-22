@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTimeRangeDrillDownFilterPropertyDsl {
  private val cdkBuilder: CfnTemplate.TimeRangeDrillDownFilterProperty.Builder =
      CfnTemplate.TimeRangeDrillDownFilterProperty.builder()

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  /**
   * @param column The column that the filter is applied to. 
   */
  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  /**
   * @param rangeMaximum The maximum value for the filter value range. 
   */
  public fun rangeMaximum(rangeMaximum: String) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  /**
   * @param rangeMinimum The minimum value for the filter value range. 
   */
  public fun rangeMinimum(rangeMinimum: String) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  /**
   * @param timeGranularity The level of time precision that is used to aggregate `DateTime` values.
   * 
   */
  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.TimeRangeDrillDownFilterProperty = cdkBuilder.build()
}
