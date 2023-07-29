@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.AlarmBehavior
import software.amazon.awscdk.services.ecs.DeploymentAlarmOptions

/**
 * Options for deployment alarms.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
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
@CdkDslMarker
public class DeploymentAlarmOptionsDsl {
    private val cdkBuilder: DeploymentAlarmOptions.Builder = DeploymentAlarmOptions.builder()

    /** @param behavior Default rollback on alarm. */
    public fun behavior(behavior: AlarmBehavior) {
        cdkBuilder.behavior(behavior)
    }

    public fun build(): DeploymentAlarmOptions = cdkBuilder.build()
}
