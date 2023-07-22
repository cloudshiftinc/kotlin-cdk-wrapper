@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardLoadingAnimationPropertyDsl {
  private val cdkBuilder: CfnDashboard.LoadingAnimationProperty.Builder =
      CfnDashboard.LoadingAnimationProperty.builder()

  /**
   * @param visibility The visibility configuration of `LoadingAnimation` .
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.LoadingAnimationProperty = cdkBuilder.build()
}
