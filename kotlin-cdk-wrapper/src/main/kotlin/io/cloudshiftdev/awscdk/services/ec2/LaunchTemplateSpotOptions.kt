@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Interface for the Spot market instance options provided in a LaunchTemplate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public interface LaunchTemplateSpotOptions {
  /**
   * Spot Instances with a defined duration (also known as Spot blocks) are designed not to be
   * interrupted and will run continuously for the duration you select.
   *
   * You can use a duration of 1, 2, 3, 4, 5, or 6 hours.
   *
   * Default: Requested spot instances do not have a pre-defined duration.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#fixed-duration-spot-instances)
   */
  public fun blockDuration(): Duration? = unwrap(this).getBlockDuration()?.let(Duration::wrap)

  /**
   * The behavior when a Spot Instance is interrupted.
   *
   * Default: Spot instances will terminate when interrupted.
   */
  public fun interruptionBehavior(): SpotInstanceInterruption? =
      unwrap(this).getInterruptionBehavior()?.let(SpotInstanceInterruption::wrap)

  /**
   * Maximum hourly price you're willing to pay for each Spot instance.
   *
   * The value is given
   * in dollars. ex: 0.01 for 1 cent per hour, or 0.001 for one-tenth of a cent per hour.
   *
   * Default: Maximum hourly price will default to the on-demand price for the instance type.
   */
  public fun maxPrice(): Number? = unwrap(this).getMaxPrice()

  /**
   * The Spot Instance request type.
   *
   * If you are using Spot Instances with an Auto Scaling group, use one-time requests, as the
   * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
   * below its desired capacity.
   *
   * Default: One-time spot request.
   */
  public fun requestType(): SpotRequestType? =
      unwrap(this).getRequestType()?.let(SpotRequestType::wrap)

  /**
   * The end date of the request.
   *
   * For a one-time request, the request remains active until all instances
   * launch, the request is canceled, or this date is reached. If the request is persistent, it
   * remains
   * active until it is canceled or this date and time is reached.
   *
   * Default: The default end date is 7 days from the current date.
   */
  public fun validUntil(): Expiration? = unwrap(this).getValidUntil()?.let(Expiration::wrap)

  /**
   * A builder for [LaunchTemplateSpotOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param blockDuration Spot Instances with a defined duration (also known as Spot blocks) are
     * designed not to be interrupted and will run continuously for the duration you select.
     * You can use a duration of 1, 2, 3, 4, 5, or 6 hours.
     */
    public fun blockDuration(blockDuration: Duration)

    /**
     * @param interruptionBehavior The behavior when a Spot Instance is interrupted.
     */
    public fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption)

    /**
     * @param maxPrice Maximum hourly price you're willing to pay for each Spot instance.
     * The value is given
     * in dollars. ex: 0.01 for 1 cent per hour, or 0.001 for one-tenth of a cent per hour.
     */
    public fun maxPrice(maxPrice: Number)

    /**
     * @param requestType The Spot Instance request type.
     * If you are using Spot Instances with an Auto Scaling group, use one-time requests, as the
     * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
     * below its desired capacity.
     */
    public fun requestType(requestType: SpotRequestType)

    /**
     * @param validUntil The end date of the request.
     * For a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains
     * active until it is canceled or this date and time is reached.
     */
    public fun validUntil(validUntil: Expiration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions.Builder =
        software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions.builder()

    /**
     * @param blockDuration Spot Instances with a defined duration (also known as Spot blocks) are
     * designed not to be interrupted and will run continuously for the duration you select.
     * You can use a duration of 1, 2, 3, 4, 5, or 6 hours.
     */
    override fun blockDuration(blockDuration: Duration) {
      cdkBuilder.blockDuration(blockDuration.let(Duration::unwrap))
    }

    /**
     * @param interruptionBehavior The behavior when a Spot Instance is interrupted.
     */
    override fun interruptionBehavior(interruptionBehavior: SpotInstanceInterruption) {
      cdkBuilder.interruptionBehavior(interruptionBehavior.let(SpotInstanceInterruption::unwrap))
    }

    /**
     * @param maxPrice Maximum hourly price you're willing to pay for each Spot instance.
     * The value is given
     * in dollars. ex: 0.01 for 1 cent per hour, or 0.001 for one-tenth of a cent per hour.
     */
    override fun maxPrice(maxPrice: Number) {
      cdkBuilder.maxPrice(maxPrice)
    }

    /**
     * @param requestType The Spot Instance request type.
     * If you are using Spot Instances with an Auto Scaling group, use one-time requests, as the
     * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
     * below its desired capacity.
     */
    override fun requestType(requestType: SpotRequestType) {
      cdkBuilder.requestType(requestType.let(SpotRequestType::unwrap))
    }

    /**
     * @param validUntil The end date of the request.
     * For a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains
     * active until it is canceled or this date and time is reached.
     */
    override fun validUntil(validUntil: Expiration) {
      cdkBuilder.validUntil(validUntil.let(Expiration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions,
  ) : CdkObject(cdkObject), LaunchTemplateSpotOptions {
    /**
     * Spot Instances with a defined duration (also known as Spot blocks) are designed not to be
     * interrupted and will run continuously for the duration you select.
     *
     * You can use a duration of 1, 2, 3, 4, 5, or 6 hours.
     *
     * Default: Requested spot instances do not have a pre-defined duration.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-requests.html#fixed-duration-spot-instances)
     */
    override fun blockDuration(): Duration? = unwrap(this).getBlockDuration()?.let(Duration::wrap)

    /**
     * The behavior when a Spot Instance is interrupted.
     *
     * Default: Spot instances will terminate when interrupted.
     */
    override fun interruptionBehavior(): SpotInstanceInterruption? =
        unwrap(this).getInterruptionBehavior()?.let(SpotInstanceInterruption::wrap)

    /**
     * Maximum hourly price you're willing to pay for each Spot instance.
     *
     * The value is given
     * in dollars. ex: 0.01 for 1 cent per hour, or 0.001 for one-tenth of a cent per hour.
     *
     * Default: Maximum hourly price will default to the on-demand price for the instance type.
     */
    override fun maxPrice(): Number? = unwrap(this).getMaxPrice()

    /**
     * The Spot Instance request type.
     *
     * If you are using Spot Instances with an Auto Scaling group, use one-time requests, as the
     * Amazon EC2 Auto Scaling service handles requesting new Spot Instances whenever the group is
     * below its desired capacity.
     *
     * Default: One-time spot request.
     */
    override fun requestType(): SpotRequestType? =
        unwrap(this).getRequestType()?.let(SpotRequestType::wrap)

    /**
     * The end date of the request.
     *
     * For a one-time request, the request remains active until all instances
     * launch, the request is canceled, or this date is reached. If the request is persistent, it
     * remains
     * active until it is canceled or this date and time is reached.
     *
     * Default: The default end date is 7 days from the current date.
     */
    override fun validUntil(): Expiration? = unwrap(this).getValidUntil()?.let(Expiration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LaunchTemplateSpotOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions):
        LaunchTemplateSpotOptions = CdkObjectWrappers.wrap(cdkObject) as LaunchTemplateSpotOptions

    internal fun unwrap(wrapped: LaunchTemplateSpotOptions):
        software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions
  }
}
