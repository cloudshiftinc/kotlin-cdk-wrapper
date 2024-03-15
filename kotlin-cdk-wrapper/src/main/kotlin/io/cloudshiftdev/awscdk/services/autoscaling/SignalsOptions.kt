@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Customization options for Signal handling.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
 * during instance startup")))
 * .signals(Signals.waitForAll(SignalsOptions.builder()
 * .timeout(Duration.minutes(10))
 * .build()))
 * .build();
 * ```
 */
public interface SignalsOptions {
  /**
   * The percentage of signals that need to be successful.
   *
   * If this number is less than 100, a percentage of signals may be failure
   * signals while still succeeding the creation or update in CloudFormation.
   *
   * Default: 100
   */
  public fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

  /**
   * How long to wait for the signals to be sent.
   *
   * This should reflect how long it takes your instances to start up
   * (including instance start time and instance initialization time).
   *
   * Default: Duration.minutes(5)
   */
  public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * A builder for [SignalsOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param minSuccessPercentage The percentage of signals that need to be successful.
     * If this number is less than 100, a percentage of signals may be failure
     * signals while still succeeding the creation or update in CloudFormation.
     */
    public fun minSuccessPercentage(minSuccessPercentage: Number)

    /**
     * @param timeout How long to wait for the signals to be sent.
     * This should reflect how long it takes your instances to start up
     * (including instance start time and instance initialization time).
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.SignalsOptions.Builder =
        software.amazon.awscdk.services.autoscaling.SignalsOptions.builder()

    /**
     * @param minSuccessPercentage The percentage of signals that need to be successful.
     * If this number is less than 100, a percentage of signals may be failure
     * signals while still succeeding the creation or update in CloudFormation.
     */
    override fun minSuccessPercentage(minSuccessPercentage: Number) {
      cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    /**
     * @param timeout How long to wait for the signals to be sent.
     * This should reflect how long it takes your instances to start up
     * (including instance start time and instance initialization time).
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.SignalsOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.SignalsOptions,
  ) : CdkObject(cdkObject), SignalsOptions {
    /**
     * The percentage of signals that need to be successful.
     *
     * If this number is less than 100, a percentage of signals may be failure
     * signals while still succeeding the creation or update in CloudFormation.
     *
     * Default: 100
     */
    override fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

    /**
     * How long to wait for the signals to be sent.
     *
     * This should reflect how long it takes your instances to start up
     * (including instance start time and instance initialization time).
     *
     * Default: Duration.minutes(5)
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SignalsOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.SignalsOptions):
        SignalsOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignalsOptions):
        software.amazon.awscdk.services.autoscaling.SignalsOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.SignalsOptions
  }
}
