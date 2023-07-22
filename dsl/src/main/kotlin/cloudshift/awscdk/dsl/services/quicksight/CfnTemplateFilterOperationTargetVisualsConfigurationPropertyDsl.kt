@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFilterOperationTargetVisualsConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FilterOperationTargetVisualsConfigurationProperty.Builder =
      CfnTemplate.FilterOperationTargetVisualsConfigurationProperty.builder()

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
      fun sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration: CfnTemplate.SameSheetTargetVisualConfigurationProperty) {
    cdkBuilder.sameSheetTargetVisualConfiguration(sameSheetTargetVisualConfiguration)
  }

  public fun build(): CfnTemplate.FilterOperationTargetVisualsConfigurationProperty =
      cdkBuilder.build()
}
