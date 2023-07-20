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

  public fun column(column: IResolvable) {
    cdkBuilder.column(column)
  }

  public fun column(column: CfnTemplate.ColumnIdentifierProperty) {
    cdkBuilder.column(column)
  }

  public fun rangeMaximum(rangeMaximum: String) {
    cdkBuilder.rangeMaximum(rangeMaximum)
  }

  public fun rangeMinimum(rangeMinimum: String) {
    cdkBuilder.rangeMinimum(rangeMinimum)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnTemplate.TimeRangeDrillDownFilterProperty = cdkBuilder.build()
}
