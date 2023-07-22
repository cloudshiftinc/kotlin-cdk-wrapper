@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBinWidthOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.BinWidthOptionsProperty.Builder =
      CfnDashboard.BinWidthOptionsProperty.builder()

  /**
   * @param binCountLimit The options that determine the bin count limit.
   */
  public fun binCountLimit(binCountLimit: Number) {
    cdkBuilder.binCountLimit(binCountLimit)
  }

  /**
   * @param value The options that determine the bin width value.
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.BinWidthOptionsProperty = cdkBuilder.build()
}
