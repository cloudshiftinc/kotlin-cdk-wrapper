@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * To specify how AWS CloudFormation handles rolling updates for an Auto Scaling group, use the
 * AutoScalingRollingUpdate policy.
 *
 * Rolling updates enable you to specify whether AWS CloudFormation updates instances that are in an
 * Auto Scaling
 * group in batches or all at once.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnAutoScalingRollingUpdate cfnAutoScalingRollingUpdate = CfnAutoScalingRollingUpdate.builder()
 * .maxBatchSize(123)
 * .minInstancesInService(123)
 * .minSuccessfulInstancesPercent(123)
 * .pauseTime("pauseTime")
 * .suspendProcesses(List.of("suspendProcesses"))
 * .waitOnResourceSignals(false)
 * .build();
 * ```
 */
public interface CfnAutoScalingRollingUpdate {
  /**
   * Specifies the maximum number of instances that AWS CloudFormation updates.
   */
  public fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

  /**
   * Specifies the minimum number of instances that must be in service within the Auto Scaling group
   * while AWS CloudFormation updates old instances.
   */
  public fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

  /**
   * Specifies the percentage of instances in an Auto Scaling rolling update that must signal
   * success for an update to succeed.
   *
   * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
   * percent. For example, if you
   * update five instances with a minimum successful percentage of 50, three instances must signal
   * success.
   *
   * If an instance doesn't send a signal within the time specified in the PauseTime property, AWS
   * CloudFormation assumes
   * that the instance wasn't updated.
   *
   * If you specify this property, you must also enable the WaitOnResourceSignals and PauseTime
   * properties.
   */
  public fun minSuccessfulInstancesPercent(): Number? =
      unwrap(this).getMinSuccessfulInstancesPercent()

  /**
   * The amount of time that AWS CloudFormation pauses after making a change to a batch of instances
   * to give those instances time to start software applications.
   *
   * For example, you might need to specify PauseTime when scaling up the number of
   * instances in an Auto Scaling group.
   *
   * If you enable the WaitOnResourceSignals property, PauseTime is the amount of time that AWS
   * CloudFormation should wait
   * for the Auto Scaling group to receive the required number of valid signals from added or
   * replaced instances. If the
   * PauseTime is exceeded before the Auto Scaling group receives the required number of signals,
   * the update fails. For best
   * results, specify a time period that gives your applications sufficient time to get started. If
   * the update needs to be
   * rolled back, a short PauseTime can cause the rollback to fail.
   *
   * Specify PauseTime in the ISO8601 duration format (in the format PT#H#M#S, where each # is the
   * number of hours, minutes,
   * and seconds, respectively). The maximum PauseTime is one hour (PT1H).
   */
  public fun pauseTime(): String? = unwrap(this).getPauseTime()

  /**
   * Specifies the Auto Scaling processes to suspend during a stack update.
   *
   * Suspending processes prevents Auto Scaling from
   * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
   * doesn't execute scaling
   * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
   * parameter for the SuspendProcesses
   * action in the Auto Scaling API Reference.
   */
  public fun suspendProcesses(): List<String> = unwrap(this).getSuspendProcesses() ?: emptyList()

  /**
   * Specifies whether the Auto Scaling group waits on signals from new instances during an update.
   *
   * Use this property to
   * ensure that instances have completed installing and configuring applications before the Auto
   * Scaling group update proceeds.
   * AWS CloudFormation suspends the update of an Auto Scaling group after new EC2 instances are
   * launched into the group.
   * AWS CloudFormation must receive a signal from each new instance within the specified PauseTime
   * before continuing the update.
   * To signal the Auto Scaling group, use the cfn-signal helper script or SignalResource API.
   *
   * To have instances wait for an Elastic Load Balancing health check before they signal success,
   * add a health-check
   * verification by using the cfn-init helper script. For an example, see the
   * verify_instance_health command in the Auto Scaling
   * rolling updates sample template.
   */
  public fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()

  /**
   * A builder for [CfnAutoScalingRollingUpdate]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxBatchSize Specifies the maximum number of instances that AWS CloudFormation
     * updates.
     */
    public fun maxBatchSize(maxBatchSize: Number)

    /**
     * @param minInstancesInService Specifies the minimum number of instances that must be in
     * service within the Auto Scaling group while AWS CloudFormation updates old instances.
     */
    public fun minInstancesInService(minInstancesInService: Number)

    /**
     * @param minSuccessfulInstancesPercent Specifies the percentage of instances in an Auto Scaling
     * rolling update that must signal success for an update to succeed.
     * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
     * percent. For example, if you
     * update five instances with a minimum successful percentage of 50, three instances must signal
     * success.
     *
     * If an instance doesn't send a signal within the time specified in the PauseTime property, AWS
     * CloudFormation assumes
     * that the instance wasn't updated.
     *
     * If you specify this property, you must also enable the WaitOnResourceSignals and PauseTime
     * properties.
     */
    public fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number)

    /**
     * @param pauseTime The amount of time that AWS CloudFormation pauses after making a change to a
     * batch of instances to give those instances time to start software applications.
     * For example, you might need to specify PauseTime when scaling up the number of
     * instances in an Auto Scaling group.
     *
     * If you enable the WaitOnResourceSignals property, PauseTime is the amount of time that AWS
     * CloudFormation should wait
     * for the Auto Scaling group to receive the required number of valid signals from added or
     * replaced instances. If the
     * PauseTime is exceeded before the Auto Scaling group receives the required number of signals,
     * the update fails. For best
     * results, specify a time period that gives your applications sufficient time to get started.
     * If the update needs to be
     * rolled back, a short PauseTime can cause the rollback to fail.
     *
     * Specify PauseTime in the ISO8601 duration format (in the format PT#H#M#S, where each # is the
     * number of hours, minutes,
     * and seconds, respectively). The maximum PauseTime is one hour (PT1H).
     */
    public fun pauseTime(pauseTime: String)

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from
     * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
     * doesn't execute scaling
     * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
     * parameter for the SuspendProcesses
     * action in the Auto Scaling API Reference.
     */
    public fun suspendProcesses(suspendProcesses: List<String>)

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from
     * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
     * doesn't execute scaling
     * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
     * parameter for the SuspendProcesses
     * action in the Auto Scaling API Reference.
     */
    public fun suspendProcesses(vararg suspendProcesses: String)

    /**
     * @param waitOnResourceSignals Specifies whether the Auto Scaling group waits on signals from
     * new instances during an update.
     * Use this property to
     * ensure that instances have completed installing and configuring applications before the Auto
     * Scaling group update proceeds.
     * AWS CloudFormation suspends the update of an Auto Scaling group after new EC2 instances are
     * launched into the group.
     * AWS CloudFormation must receive a signal from each new instance within the specified
     * PauseTime before continuing the update.
     * To signal the Auto Scaling group, use the cfn-signal helper script or SignalResource API.
     *
     * To have instances wait for an Elastic Load Balancing health check before they signal success,
     * add a health-check
     * verification by using the cfn-init helper script. For an example, see the
     * verify_instance_health command in the Auto Scaling
     * rolling updates sample template.
     */
    public fun waitOnResourceSignals(waitOnResourceSignals: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnAutoScalingRollingUpdate.Builder =
        software.amazon.awscdk.CfnAutoScalingRollingUpdate.builder()

    /**
     * @param maxBatchSize Specifies the maximum number of instances that AWS CloudFormation
     * updates.
     */
    override fun maxBatchSize(maxBatchSize: Number) {
      cdkBuilder.maxBatchSize(maxBatchSize)
    }

    /**
     * @param minInstancesInService Specifies the minimum number of instances that must be in
     * service within the Auto Scaling group while AWS CloudFormation updates old instances.
     */
    override fun minInstancesInService(minInstancesInService: Number) {
      cdkBuilder.minInstancesInService(minInstancesInService)
    }

    /**
     * @param minSuccessfulInstancesPercent Specifies the percentage of instances in an Auto Scaling
     * rolling update that must signal success for an update to succeed.
     * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
     * percent. For example, if you
     * update five instances with a minimum successful percentage of 50, three instances must signal
     * success.
     *
     * If an instance doesn't send a signal within the time specified in the PauseTime property, AWS
     * CloudFormation assumes
     * that the instance wasn't updated.
     *
     * If you specify this property, you must also enable the WaitOnResourceSignals and PauseTime
     * properties.
     */
    override fun minSuccessfulInstancesPercent(minSuccessfulInstancesPercent: Number) {
      cdkBuilder.minSuccessfulInstancesPercent(minSuccessfulInstancesPercent)
    }

    /**
     * @param pauseTime The amount of time that AWS CloudFormation pauses after making a change to a
     * batch of instances to give those instances time to start software applications.
     * For example, you might need to specify PauseTime when scaling up the number of
     * instances in an Auto Scaling group.
     *
     * If you enable the WaitOnResourceSignals property, PauseTime is the amount of time that AWS
     * CloudFormation should wait
     * for the Auto Scaling group to receive the required number of valid signals from added or
     * replaced instances. If the
     * PauseTime is exceeded before the Auto Scaling group receives the required number of signals,
     * the update fails. For best
     * results, specify a time period that gives your applications sufficient time to get started.
     * If the update needs to be
     * rolled back, a short PauseTime can cause the rollback to fail.
     *
     * Specify PauseTime in the ISO8601 duration format (in the format PT#H#M#S, where each # is the
     * number of hours, minutes,
     * and seconds, respectively). The maximum PauseTime is one hour (PT1H).
     */
    override fun pauseTime(pauseTime: String) {
      cdkBuilder.pauseTime(pauseTime)
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from
     * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
     * doesn't execute scaling
     * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
     * parameter for the SuspendProcesses
     * action in the Auto Scaling API Reference.
     */
    override fun suspendProcesses(suspendProcesses: List<String>) {
      cdkBuilder.suspendProcesses(suspendProcesses)
    }

    /**
     * @param suspendProcesses Specifies the Auto Scaling processes to suspend during a stack
     * update.
     * Suspending processes prevents Auto Scaling from
     * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
     * doesn't execute scaling
     * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
     * parameter for the SuspendProcesses
     * action in the Auto Scaling API Reference.
     */
    override fun suspendProcesses(vararg suspendProcesses: String): Unit =
        suspendProcesses(suspendProcesses.toList())

    /**
     * @param waitOnResourceSignals Specifies whether the Auto Scaling group waits on signals from
     * new instances during an update.
     * Use this property to
     * ensure that instances have completed installing and configuring applications before the Auto
     * Scaling group update proceeds.
     * AWS CloudFormation suspends the update of an Auto Scaling group after new EC2 instances are
     * launched into the group.
     * AWS CloudFormation must receive a signal from each new instance within the specified
     * PauseTime before continuing the update.
     * To signal the Auto Scaling group, use the cfn-signal helper script or SignalResource API.
     *
     * To have instances wait for an Elastic Load Balancing health check before they signal success,
     * add a health-check
     * verification by using the cfn-init helper script. For an example, see the
     * verify_instance_health command in the Auto Scaling
     * rolling updates sample template.
     */
    override fun waitOnResourceSignals(waitOnResourceSignals: Boolean) {
      cdkBuilder.waitOnResourceSignals(waitOnResourceSignals)
    }

    public fun build(): software.amazon.awscdk.CfnAutoScalingRollingUpdate = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate,
  ) : CdkObject(cdkObject),
      CfnAutoScalingRollingUpdate {
    /**
     * Specifies the maximum number of instances that AWS CloudFormation updates.
     */
    override fun maxBatchSize(): Number? = unwrap(this).getMaxBatchSize()

    /**
     * Specifies the minimum number of instances that must be in service within the Auto Scaling
     * group while AWS CloudFormation updates old instances.
     */
    override fun minInstancesInService(): Number? = unwrap(this).getMinInstancesInService()

    /**
     * Specifies the percentage of instances in an Auto Scaling rolling update that must signal
     * success for an update to succeed.
     *
     * You can specify a value from 0 to 100. AWS CloudFormation rounds to the nearest tenth of a
     * percent. For example, if you
     * update five instances with a minimum successful percentage of 50, three instances must signal
     * success.
     *
     * If an instance doesn't send a signal within the time specified in the PauseTime property, AWS
     * CloudFormation assumes
     * that the instance wasn't updated.
     *
     * If you specify this property, you must also enable the WaitOnResourceSignals and PauseTime
     * properties.
     */
    override fun minSuccessfulInstancesPercent(): Number? =
        unwrap(this).getMinSuccessfulInstancesPercent()

    /**
     * The amount of time that AWS CloudFormation pauses after making a change to a batch of
     * instances to give those instances time to start software applications.
     *
     * For example, you might need to specify PauseTime when scaling up the number of
     * instances in an Auto Scaling group.
     *
     * If you enable the WaitOnResourceSignals property, PauseTime is the amount of time that AWS
     * CloudFormation should wait
     * for the Auto Scaling group to receive the required number of valid signals from added or
     * replaced instances. If the
     * PauseTime is exceeded before the Auto Scaling group receives the required number of signals,
     * the update fails. For best
     * results, specify a time period that gives your applications sufficient time to get started.
     * If the update needs to be
     * rolled back, a short PauseTime can cause the rollback to fail.
     *
     * Specify PauseTime in the ISO8601 duration format (in the format PT#H#M#S, where each # is the
     * number of hours, minutes,
     * and seconds, respectively). The maximum PauseTime is one hour (PT1H).
     */
    override fun pauseTime(): String? = unwrap(this).getPauseTime()

    /**
     * Specifies the Auto Scaling processes to suspend during a stack update.
     *
     * Suspending processes prevents Auto Scaling from
     * interfering with a stack update. For example, you can suspend alarming so that Auto Scaling
     * doesn't execute scaling
     * policies associated with an alarm. For valid values, see the ScalingProcesses.member.N
     * parameter for the SuspendProcesses
     * action in the Auto Scaling API Reference.
     */
    override fun suspendProcesses(): List<String> = unwrap(this).getSuspendProcesses() ?:
        emptyList()

    /**
     * Specifies whether the Auto Scaling group waits on signals from new instances during an
     * update.
     *
     * Use this property to
     * ensure that instances have completed installing and configuring applications before the Auto
     * Scaling group update proceeds.
     * AWS CloudFormation suspends the update of an Auto Scaling group after new EC2 instances are
     * launched into the group.
     * AWS CloudFormation must receive a signal from each new instance within the specified
     * PauseTime before continuing the update.
     * To signal the Auto Scaling group, use the cfn-signal helper script or SignalResource API.
     *
     * To have instances wait for an Elastic Load Balancing health check before they signal success,
     * add a health-check
     * verification by using the cfn-init helper script. For an example, see the
     * verify_instance_health command in the Auto Scaling
     * rolling updates sample template.
     */
    override fun waitOnResourceSignals(): Boolean? = unwrap(this).getWaitOnResourceSignals()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAutoScalingRollingUpdate {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnAutoScalingRollingUpdate):
        CfnAutoScalingRollingUpdate = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAutoScalingRollingUpdate ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAutoScalingRollingUpdate):
        software.amazon.awscdk.CfnAutoScalingRollingUpdate = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnAutoScalingRollingUpdate
  }
}
