@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Options for deployment alarms.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Alarm elbAlarm;
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .deploymentAlarms(DeploymentAlarmConfig.builder()
 * .alarmNames(List.of(elbAlarm.getAlarmName()))
 * .behavior(AlarmBehavior.ROLLBACK_ON_ALARM)
 * .build())
 * .build();
 * // Defining a deployment alarm after the service has been created
 * String cpuAlarmName = "MyCpuMetricAlarm";
 * Alarm.Builder.create(this, "CPUAlarm")
 * .alarmName(cpuAlarmName)
 * .metric(service.metricCpuUtilization())
 * .evaluationPeriods(2)
 * .threshold(80)
 * .build();
 * service.enableDeploymentAlarms(List.of(cpuAlarmName), DeploymentAlarmOptions.builder()
 * .behavior(AlarmBehavior.FAIL_ON_ALARM)
 * .build());
 * ```
 */
public interface DeploymentAlarmOptions {
  /**
   * Default rollback on alarm.
   *
   * Default: AlarmBehavior.ROLLBACK_ON_ALARM
   */
  public fun behavior(): AlarmBehavior? = unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)

  /**
   * A builder for [DeploymentAlarmOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param behavior Default rollback on alarm.
     */
    public fun behavior(behavior: AlarmBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.Builder =
        software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.builder()

    /**
     * @param behavior Default rollback on alarm.
     */
    override fun behavior(behavior: AlarmBehavior) {
      cdkBuilder.behavior(behavior.let(AlarmBehavior.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentAlarmOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions,
  ) : CdkObject(cdkObject), DeploymentAlarmOptions {
    /**
     * Default rollback on alarm.
     *
     * Default: AlarmBehavior.ROLLBACK_ON_ALARM
     */
    override fun behavior(): AlarmBehavior? = unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions):
        DeploymentAlarmOptions = CdkObjectWrappers.wrap(cdkObject) as? DeploymentAlarmOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentAlarmOptions):
        software.amazon.awscdk.services.ecs.DeploymentAlarmOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.DeploymentAlarmOptions
  }
}
