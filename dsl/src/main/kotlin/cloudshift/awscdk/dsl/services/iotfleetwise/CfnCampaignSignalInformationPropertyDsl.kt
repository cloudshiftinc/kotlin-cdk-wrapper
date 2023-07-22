@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnCampaign

/**
 * Information about a signal.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * SignalInformationProperty signalInformationProperty = SignalInformationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .maxSampleCount(123)
 * .minimumSamplingIntervalMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-campaign-signalinformation.html)
 */
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
