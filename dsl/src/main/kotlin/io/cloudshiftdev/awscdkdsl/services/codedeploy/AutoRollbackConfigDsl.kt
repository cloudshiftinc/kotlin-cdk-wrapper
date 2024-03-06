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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig

/**
 * The configuration for automatically rolling back deployments in a given Deployment Group.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.autoscaling.*;
 * import software.amazon.awscdk.services.cloudwatch.*;
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
 * .build();
 * ```
 */
@CdkDslMarker
public class AutoRollbackConfigDsl {
    private val cdkBuilder: AutoRollbackConfig.Builder = AutoRollbackConfig.builder()

    /**
     * @param deploymentInAlarm Whether to automatically roll back a deployment during which one of
     *   the configured CloudWatch alarms for this Deployment Group went off.
     */
    public fun deploymentInAlarm(deploymentInAlarm: Boolean) {
        cdkBuilder.deploymentInAlarm(deploymentInAlarm)
    }

    /** @param failedDeployment Whether to automatically roll back a deployment that fails. */
    public fun failedDeployment(failedDeployment: Boolean) {
        cdkBuilder.failedDeployment(failedDeployment)
    }

    /**
     * @param stoppedDeployment Whether to automatically roll back a deployment that was manually
     *   stopped.
     */
    public fun stoppedDeployment(stoppedDeployment: Boolean) {
        cdkBuilder.stoppedDeployment(stoppedDeployment)
    }

    public fun build(): AutoRollbackConfig = cdkBuilder.build()
}
