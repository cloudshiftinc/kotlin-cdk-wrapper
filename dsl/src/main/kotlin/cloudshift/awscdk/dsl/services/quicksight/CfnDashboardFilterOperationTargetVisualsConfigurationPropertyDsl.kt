@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFilterOperationTargetVisualsConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FilterOperationTargetVisualsConfigurationProperty.Builder =
      CfnDashboard.FilterOperationTargetVisualsConfigurationProperty.builder()

  /**
   * @param sameSheetTargetVisualConfiguration The configuration of the same-sheet target visuals
   * that you want to be filtered.
   */
  public fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: IResolvable) {
    cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
  }

  /**
   * @param sameSheetTargetVisualConfiguration The configuration of the same-sheet target visuals
   * that you want to be filtered.
   */
  public
      fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: CfnDashboard.SameSheetTargetVisualConfigurationProperty) {
    cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
  }

  public fun build(): CfnDashboard.FilterOperationTargetVisualsConfigurationProperty =
      cdkBuilder.build()
}
