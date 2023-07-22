@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardMaximumLabelTypePropertyDsl {
  private val cdkBuilder: CfnDashboard.MaximumLabelTypeProperty.Builder =
      CfnDashboard.MaximumLabelTypeProperty.builder()

  /**
   * @param visibility The visibility of the maximum label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.MaximumLabelTypeProperty = cdkBuilder.build()
}
