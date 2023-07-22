@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSpacingPropertyDsl {
  private val cdkBuilder: CfnDashboard.SpacingProperty.Builder =
      CfnDashboard.SpacingProperty.builder()

  /**
   * @param bottom Define the bottom spacing.
   */
  public fun bottom(bottom: String) {
    cdkBuilder.bottom(bottom)
  }

  /**
   * @param left Define the left spacing.
   */
  public fun left(left: String) {
    cdkBuilder.left(left)
  }

  /**
   * @param right Define the right spacing.
   */
  public fun right(right: String) {
    cdkBuilder.right(right)
  }

  /**
   * @param top Define the top spacing.
   */
  public fun top(top: String) {
    cdkBuilder.top(top)
  }

  public fun build(): CfnDashboard.SpacingProperty = cdkBuilder.build()
}
