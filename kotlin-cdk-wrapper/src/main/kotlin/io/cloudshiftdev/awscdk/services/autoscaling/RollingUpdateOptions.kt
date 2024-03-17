@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for customizing the rolling update.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * RollingUpdateOptions rollingUpdateOptions = RollingUpdateOptions.builder()
 * .maxBatchSize(123)
 * .minInstancesInService(123)
 * .minSuccessPercentage(123)
 * .pauseTime(Duration.minutes(30))
 * .suspendProcesses(List.of(ScalingProcess.LAUNCH))
 * .waitOnResourceSignals(false)
 * .build();
 * ```
 */
public interface RollingUpdateOptions {
  /**
   * The maximum number of instances that AWS CloudFormation updates at once.
   *
   * This number affects the speed of the replacement.
   *
   * Default: 1
   */
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * The minimum number of instances that must be in service before more instances are replaced.
   *
   * This number affects the speed of the replacement.
   *
   * Default: 0
   */
  public fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

  /**
   * The percentage of instances that must signal success for the update to succeed.
   *
   * Default: - The `minSuccessPercentage` configured for `signals` on the AutoScalingGroup
   */
  public fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

  /**
   * The pause time after making a change to a batch of instances.
   *
   * Default: - The `timeout` configured for `signals` on the AutoScalingGroup
   */
  public fun pauseTime(): Duration? = unwrap(this).getPauseTime()?.let(Duration::wrap)

  /**
   * Specifies the Auto Scaling processes to suspend during a stack update.
   *
   * Suspending processes prevents Auto Scaling from interfering with a stack
   * update.
   *
   * Default: HealthCheck, ReplaceUnhealthy, AZRebalance, AlarmNotification, ScheduledActions.
   */
  public fun suspendProcesses(): List<ScalingProcess> =
      unwrap(this).getSuspendProcesses()?.map(ScalingProcess::wrap) ?: emptyList()

  /**
   * Specifies whether the Auto Scaling group waits on signals from new instances during an update.
   *
   * Default: true if you configured `signals` on the AutoScalingGroup, false otherwise
   */
  public fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()

  /**
   * A builder for [RollingUpdateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxBatchSize The maximum number of instances that AWS CloudFormation updates at once.
     * This number affects the speed of the replacement.
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * @param minInstancesInService The minimum number of instances that must be in service before
     * more instances are replaced.
     * This number affects the speed of the replacement.
     */
    public fun minInstancesInService(minInstancesInService: Number)

    /**
     * @param minSuccessPercentage The percentage of instances that must signal success for the
     * update to succeed.
     */
    public fun minSuccessPercentage(minSuccessPercentage: Number)

    /**
     * @param pauseTime The pause time after making a change to a batch of instances.
     */
    public fun pauseTime(pauseTime: Duration)

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from interfering with a stack
     * update.
     */
    public fun suspendProcesses(suspendProcesses: List<ScalingProcess>)

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from interfering with a stack
     * update.
     */
    public fun suspendProcesses(vararg suspendProcesses: ScalingProcess)

    /**
     * @param waitOnResourceSignals Specifies whether the Auto Scaling group waits on signals from
     * new instances during an update.
     */
    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions.Builder
        = software.amazon.awscdk.services.autoscaling.RollingUpdateOptions.builder()

    /**
     * @param maxBatchSize The maximum number of instances that AWS CloudFormation updates at once.
     * This number affects the speed of the replacement.
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param minInstancesInService The minimum number of instances that must be in service before
     * more instances are replaced.
     * This number affects the speed of the replacement.
     */
    override fun minInstancesInService(minInstancesInService: Number) {
      cdkBuilder.minInstancesInService(minInstancesInService)
    }

    /**
     * @param minSuccessPercentage The percentage of instances that must signal success for the
     * update to succeed.
     */
    override fun minSuccessPercentage(minSuccessPercentage: Number) {
      cdkBuilder.minSuccessPercentage(minSuccessPercentage)
    }

    /**
     * @param pauseTime The pause time after making a change to a batch of instances.
     */
    override fun pauseTime(pauseTime: Duration) {
      cdkBuilder.pauseTime(pauseTime.let(Duration::unwrap))
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from interfering with a stack
     * update.
     */
    override fun suspendProcesses(suspendProcesses: List<ScalingProcess>) {
      cdkBuilder.suspendProcesses(suspendProcesses.map(ScalingProcess::unwrap))
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from interfering with a stack
     * update.
     */
    override fun suspendProcesses(vararg suspendProcesses: ScalingProcess): Unit =
        suspendProcesses(suspendProcesses.toList())

    /**
     * @param waitOnResourceSignals Specifies whether the Auto Scaling group waits on signals from
     * new instances during an update.
     */
    override fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
      cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.RollingUpdateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions,
  ) : CdkObject(cdkObject), RollingUpdateOptions {
    /**
     * The maximum number of instances that AWS CloudFormation updates at once.
     *
     * This number affects the speed of the replacement.
     *
     * Default: 1
     */
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    /**
     * The minimum number of instances that must be in service before more instances are replaced.
     *
     * This number affects the speed of the replacement.
     *
     * Default: 0
     */
    override fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

    /**
     * The percentage of instances that must signal success for the update to succeed.
     *
     * Default: - The `minSuccessPercentage` configured for `signals` on the AutoScalingGroup
     */
    override fun minSuccessPercentage(): Number? = unwrap(this).getMinSuccessPercentage()

    /**
     * The pause time after making a change to a batch of instances.
     *
     * Default: - The `timeout` configured for `signals` on the AutoScalingGroup
     */
    override fun pauseTime(): Duration? = unwrap(this).getPauseTime()?.let(Duration::wrap)

    /**
     * Specifies the Auto Scaling processes to suspend during a stack update.
     *
     * Suspending processes prevents Auto Scaling from interfering with a stack
     * update.
     *
     * Default: HealthCheck, ReplaceUnhealthy, AZRebalance, AlarmNotification, ScheduledActions.
     */
    override fun suspendProcesses(): List<ScalingProcess> =
        unwrap(this).getSuspendProcesses()?.map(ScalingProcess::wrap) ?: emptyList()

    /**
     * Specifies whether the Auto Scaling group waits on signals from new instances during an
     * update.
     *
     * Default: true if you configured `signals` on the AutoScalingGroup, false otherwise
     */
    override fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RollingUpdateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.RollingUpdateOptions):
        RollingUpdateOptions = CdkObjectWrappers.wrap(cdkObject) as? RollingUpdateOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RollingUpdateOptions):
        software.amazon.awscdk.services.autoscaling.RollingUpdateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.RollingUpdateOptions
  }
}
