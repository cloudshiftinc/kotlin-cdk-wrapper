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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.AlarmBehavior
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig

/**
 * Configuration for deployment alarms.
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
public class DeploymentAlarmConfigDsl {
    private val cdkBuilder: DeploymentAlarmConfig.Builder = DeploymentAlarmConfig.builder()

    private val _alarmNames: MutableList<String> = mutableListOf()

    /** @param alarmNames List of alarm names to monitor during deployments. */
    public fun alarmNames(vararg alarmNames: String) {
        _alarmNames.addAll(listOf(*alarmNames))
    }

    /** @param alarmNames List of alarm names to monitor during deployments. */
    public fun alarmNames(alarmNames: Collection<String>) {
        _alarmNames.addAll(alarmNames)
    }

    /** @param behavior Default rollback on alarm. */
    public fun behavior(behavior: AlarmBehavior) {
        cdkBuilder.behavior(behavior)
    }

    public fun build(): DeploymentAlarmConfig {
        if (_alarmNames.isNotEmpty()) cdkBuilder.alarmNames(_alarmNames)
        return cdkBuilder.build()
    }
}
