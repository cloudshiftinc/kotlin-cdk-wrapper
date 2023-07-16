@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFeatureActivationsPropertyDsl {
  private val cdkBuilder: CfnChannel.FeatureActivationsProperty.Builder =
      CfnChannel.FeatureActivationsProperty.builder()

  public fun inputPrepareScheduleActions(inputPrepareScheduleActions: String) {
    cdkBuilder.inputPrepareScheduleActions(inputPrepareScheduleActions)
  }

  public fun build(): CfnChannel.FeatureActivationsProperty = cdkBuilder.build()
}
