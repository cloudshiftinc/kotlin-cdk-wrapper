@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardVisualAxisSortOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.VisualAxisSortOptionProperty.Builder =
      CfnDashboard.VisualAxisSortOptionProperty.builder()

  /**
   * @param availabilityStatus The availaiblity status of a visual's axis sort options.
   */
  public fun availabilityStatus(availabilityStatus: String) {
    cdkBuilder.availabilityStatus(availabilityStatus)
  }

  public fun build(): CfnDashboard.VisualAxisSortOptionProperty = cdkBuilder.build()
}
