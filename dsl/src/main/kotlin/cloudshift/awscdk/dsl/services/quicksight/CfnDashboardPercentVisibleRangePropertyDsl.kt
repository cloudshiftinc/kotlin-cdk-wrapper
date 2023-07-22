@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPercentVisibleRangePropertyDsl {
  private val cdkBuilder: CfnDashboard.PercentVisibleRangeProperty.Builder =
      CfnDashboard.PercentVisibleRangeProperty.builder()

  /**
   * @param from The lower bound of the range.
   */
  public fun from(from: Number) {
    cdkBuilder.from(from)
  }

  /**
   * @param to The top bound of the range.
   */
  public fun to(to: Number) {
    cdkBuilder.to(to)
  }

  public fun build(): CfnDashboard.PercentVisibleRangeProperty = cdkBuilder.build()
}
