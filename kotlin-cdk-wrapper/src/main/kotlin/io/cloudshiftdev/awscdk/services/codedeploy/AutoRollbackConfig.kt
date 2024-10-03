@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * The configuration for automatically rolling back deployments in a given Deployment Group.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * ServerApplication application;
 * AutoScalingGroup asg;
 * Alarm alarm;
 * ServerDeploymentGroup deploymentGroup = ServerDeploymentGroup.Builder.create(this,
 * "CodeDeployDeploymentGroup")
 * .application(application)
 * .deploymentGroupName("MyDeploymentGroup")
 * .autoScalingGroups(List.of(asg))
 * // adds User Data that installs the CodeDeploy agent on your auto-scaling groups hosts
 * // default: true
 * .installAgent(true)
 * // adds EC2 instances matching tags
 * .ec2InstanceTags(new InstanceTagSet(Map.of(
 * // any instance with tags satisfying
 * // key1=v1 or key1=v2 or key2 (any value) or value v3 (any key)
 * // will match this group
 * "key1", List.of("v1", "v2"),
 * "key2", List.of(),
 * "", List.of("v3"))))
 * // adds on-premise instances matching tags
 * .onPremiseInstanceTags(new InstanceTagSet(Map.of(
 * "key1", List.of("v1", "v2")), Map.of(
 * "key2", List.of("v3"))))
 * // CloudWatch alarms
 * .alarms(List.of(alarm))
 * // whether to ignore failure to fetch the status of alarms from CloudWatch
 * // default: false
 * .ignorePollAlarmsFailure(false)
 * // whether to skip the step of checking CloudWatch alarms during the deployment process
 * // default: false
 * .ignoreAlarmConfiguration(false)
 * // auto-rollback configuration
 * .autoRollback(AutoRollbackConfig.builder()
 * .failedDeployment(true) // default: true
 * .stoppedDeployment(true) // default: false
 * .deploymentInAlarm(true)
 * .build())
 * // whether the deployment group was configured to have CodeDeploy install a termination hook into
 * an Auto Scaling group
 * // default: false
 * .terminationHook(true)
 * .build();
 * ```
 */
public interface AutoRollbackConfig {
  /**
   * Whether to automatically roll back a deployment during which one of the configured CloudWatch
   * alarms for this Deployment Group went off.
   *
   * Default: true if you've provided any Alarms with the `alarms` property, false otherwise
   */
  public fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

  /**
   * Whether to automatically roll back a deployment that fails.
   *
   * Default: true
   */
  public fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

  /**
   * Whether to automatically roll back a deployment that was manually stopped.
   *
   * Default: false
   */
  public fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()

  /**
   * A builder for [AutoRollbackConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deploymentInAlarm Whether to automatically roll back a deployment during which one of
     * the configured CloudWatch alarms for this Deployment Group went off.
     */
    public fun deploymentInAlarm(deploymentInAlarm: Boolean)

    /**
     * @param failedDeployment Whether to automatically roll back a deployment that fails.
     */
    public fun failedDeployment(failedDeployment: Boolean)

    /**
     * @param stoppedDeployment Whether to automatically roll back a deployment that was manually
     * stopped.
     */
    public fun stoppedDeployment(stoppedDeployment: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.Builder =
        software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.builder()

    /**
     * @param deploymentInAlarm Whether to automatically roll back a deployment during which one of
     * the configured CloudWatch alarms for this Deployment Group went off.
     */
    override fun deploymentInAlarm(deploymentInAlarm: Boolean) {
      cdkBuilder.deploymentInAlarm(deploymentInAlarm)
    }

    /**
     * @param failedDeployment Whether to automatically roll back a deployment that fails.
     */
    override fun failedDeployment(failedDeployment: Boolean) {
      cdkBuilder.failedDeployment(failedDeployment)
    }

    /**
     * @param stoppedDeployment Whether to automatically roll back a deployment that was manually
     * stopped.
     */
    override fun stoppedDeployment(stoppedDeployment: Boolean) {
      cdkBuilder.stoppedDeployment(stoppedDeployment)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.AutoRollbackConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig,
  ) : CdkObject(cdkObject),
      AutoRollbackConfig {
    /**
     * Whether to automatically roll back a deployment during which one of the configured CloudWatch
     * alarms for this Deployment Group went off.
     *
     * Default: true if you've provided any Alarms with the `alarms` property, false otherwise
     */
    override fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

    /**
     * Whether to automatically roll back a deployment that fails.
     *
     * Default: true
     */
    override fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

    /**
     * Whether to automatically roll back a deployment that was manually stopped.
     *
     * Default: false
     */
    override fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoRollbackConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig):
        AutoRollbackConfig = CdkObjectWrappers.wrap(cdkObject) as? AutoRollbackConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoRollbackConfig):
        software.amazon.awscdk.services.codedeploy.AutoRollbackConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
  }
}
