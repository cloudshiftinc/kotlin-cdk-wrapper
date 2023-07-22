@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

@CdkDslMarker
public class CfnCampaignSignalInformationPropertyDsl {
  private val cdkBuilder: CfnCampaign.SignalInformationProperty.Builder =
      CfnCampaign.SignalInformationProperty.builder()

  /**
   * @param maxSampleCount (Optional) The maximum number of samples to collect.
   */
  public fun maxSampleCount(maxSampleCount: Number) {
    cdkBuilder.maxSampleCount(maxSampleCount)
  }

  /**
   * @param minimumSamplingIntervalMs (Optional) The minimum duration of time (in milliseconds)
   * between two triggering events to collect data.
   *
   * If a signal changes often, you might want to collect data at a slower rate.
   */
  public fun minimumSamplingIntervalMs(minimumSamplingIntervalMs: Number) {
    cdkBuilder.minimumSamplingIntervalMs(minimumSamplingIntervalMs)
  }

  /**
   * @param name The name of the signal. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnCampaign.SignalInformationProperty = cdkBuilder.build()
}
