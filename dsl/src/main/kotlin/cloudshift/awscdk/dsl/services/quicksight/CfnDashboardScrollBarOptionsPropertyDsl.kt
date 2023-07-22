@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardScrollBarOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ScrollBarOptionsProperty.Builder =
      CfnDashboard.ScrollBarOptionsProperty.builder()

  /**
   * @param visibility The visibility of the data zoom scroll bar.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  /**
   * @param visibleRange The visibility range for the data zoom scroll bar.
   */
  public fun visibleRange(visibleRange: IResolvable) {
    cdkBuilder.visibleRange(visibleRange)
  }

  /**
   * @param visibleRange The visibility range for the data zoom scroll bar.
   */
  public fun visibleRange(visibleRange: CfnDashboard.VisibleRangeOptionsProperty) {
    cdkBuilder.visibleRange(visibleRange)
  }

  public fun build(): CfnDashboard.ScrollBarOptionsProperty = cdkBuilder.build()
}
