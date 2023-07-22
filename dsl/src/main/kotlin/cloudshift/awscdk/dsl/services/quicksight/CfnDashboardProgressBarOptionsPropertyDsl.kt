@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardProgressBarOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ProgressBarOptionsProperty.Builder =
      CfnDashboard.ProgressBarOptionsProperty.builder()

  /**
   * @param visibility The visibility of the progress bar.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.ProgressBarOptionsProperty = cdkBuilder.build()
}
