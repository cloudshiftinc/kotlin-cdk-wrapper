@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings

@CdkDslMarker
public class CfnApplicationSettingsLimitsPropertyDsl {
  private val cdkBuilder: CfnApplicationSettings.LimitsProperty.Builder =
      CfnApplicationSettings.LimitsProperty.builder()

  /**
   * @param daily The maximum number of messages that a campaign can send to a single endpoint
   * during a 24-hour period.
   * The maximum value is 100.
   */
  public fun daily(daily: Number) {
    cdkBuilder.daily(daily)
  }

  /**
   * @param maximumDuration The maximum amount of time, in seconds, that a campaign can attempt to
   * deliver a message after the scheduled start time for the campaign.
   * The minimum value is 60 seconds.
   */
  public fun maximumDuration(maximumDuration: Number) {
    cdkBuilder.maximumDuration(maximumDuration)
  }

  /**
   * @param messagesPerSecond The maximum number of messages that a campaign can send each second.
   * The minimum value is 1. The maximum value is 20,000.
   */
  public fun messagesPerSecond(messagesPerSecond: Number) {
    cdkBuilder.messagesPerSecond(messagesPerSecond)
  }

  /**
   * @param total The maximum number of messages that a campaign can send to a single endpoint
   * during the course of the campaign.
   * The maximum value is 100.
   */
  public fun total(total: Number) {
    cdkBuilder.total(total)
  }

  public fun build(): CfnApplicationSettings.LimitsProperty = cdkBuilder.build()
}
