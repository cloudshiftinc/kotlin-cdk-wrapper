@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration of the search options in a list control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ListControlSearchOptionsProperty listControlSearchOptionsProperty =
 * ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-listcontrolsearchoptions.html)
 */
@CdkDslMarker
public class CfnDashboardListControlSearchOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.ListControlSearchOptionsProperty.Builder =
      CfnDashboard.ListControlSearchOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the search options in a list control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.ListControlSearchOptionsProperty = cdkBuilder.build()
}
