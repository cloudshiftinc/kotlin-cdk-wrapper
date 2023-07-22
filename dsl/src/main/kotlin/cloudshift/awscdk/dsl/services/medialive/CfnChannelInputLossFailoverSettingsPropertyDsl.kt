@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputLossFailoverSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.InputLossFailoverSettingsProperty.Builder =
      CfnChannel.InputLossFailoverSettingsProperty.builder()

  /**
   * @param inputLossThresholdMsec The amount of time (in milliseconds) that no input is detected.
   * After that time, an input failover will occur.
   */
  public fun inputLossThresholdMsec(inputLossThresholdMsec: Number) {
    cdkBuilder.inputLossThresholdMsec(inputLossThresholdMsec)
  }

  public fun build(): CfnChannel.InputLossFailoverSettingsProperty = cdkBuilder.build()
}
