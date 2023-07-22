@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Expiration
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
import software.amazon.awscdk.services.ec2.SpotInstanceInterruption
import software.amazon.awscdk.services.ec2.SpotRequestType

/**
 * Interface for the Spot market instance options provided in a LaunchTemplate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * Expiration expiration;
 * LaunchTemplateSpotOptions launchTemplateSpotOptions = LaunchTemplateSpotOptions.builder()
 * .blockDuration(Duration.minutes(30))
 * .interruptionBehavior(SpotInstanceInterruption.STOP)
 * .maxPrice(123)
 * .requestType(SpotRequestType.ONE_TIME)
 * .validUntil(expiration)
 * .build();
 * ```
 */
@CdkDslMarker
public class LaunchTemplateSpotOptionsDsl {
  private val cdkBuilder: LaunchTemplateSpotOptions.Builder = LaunchTemplateSpotOptions.builder()

  /**
   * @param blockDuration Spot Instances with a defined duration (also known as Spot blocks) are
   * designed not to be interrupted and will run continuously for the duration you select.
   * You can use a duration of 1, 2, 3, 4, 5, or 6 hours.
   */
  public fun blockDuration(blockDuration: Duration) {
    cdkBuilder.blockDuration(blockDuration)
  }

  /**
   * @param interruptionBehavior The behavior when a Spot Instance is interrupted.
   */
  public fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption) {
    cdkBuilder.interruptionBehavior(interruptionBehavior)
  }

  /**
   * @param maxPrice Maximum hourly price you're willing to pay for each Spot instance.
   * The value is given
   * in dollars. ex: 0.01 for 1 cent per hour, or 0.001 for one-tenth of a cent per hour.
   */
  public fun maxPrice(maxPrice: Number) {
    cdkBuilder.maxPrice(maxPrice)
  }

  /**
   * @param requestType The Spot Instance request type.
   * If you are using Spot Instances with an Auto Scaling group, use one-time requests, as the
   * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
   * below its desired capacity.
   */
  public fun requestType(requestType: SpotRequestType) {
    cdkBuilder.requestType(requestType)
  }

  /**
   * @param validUntil The end date of the request.
   * For a one-time request, the request remains active until all instances
   * launch, the request is canceled, or this date is reached. If the request is persistent, it
   * remains
   * active until it is canceled or this date and time is reached.
   */
  public fun validUntil(validUntil: Expiration) {
    cdkBuilder.validUntil(validUntil)
  }

  public fun build(): LaunchTemplateSpotOptions = cdkBuilder.build()
}
