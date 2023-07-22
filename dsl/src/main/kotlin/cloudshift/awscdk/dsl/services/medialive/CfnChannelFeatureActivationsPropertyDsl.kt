@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFeatureActivationsPropertyDsl {
  private val cdkBuilder: CfnChannel.FeatureActivationsProperty.Builder =
      CfnChannel.FeatureActivationsProperty.builder()

  /**
   * @param inputPrepareScheduleActions Enables the Input Prepare feature.
   * You can create Input Prepare actions in the schedule only if this feature is enabled.
   * If you disable the feature on an existing schedule, make sure that you first delete all input
   * prepare actions from the schedule.
   */
  public fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
    cdkBuilder.inputPrepareScheduleActions(inputPrepareScheduleActions)
  }

  public fun build(): CfnChannel.FeatureActivationsProperty = cdkBuilder.build()
}
