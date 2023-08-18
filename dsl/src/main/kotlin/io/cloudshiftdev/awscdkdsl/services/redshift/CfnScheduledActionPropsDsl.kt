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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.amazon.awscdk.services.redshift.CfnScheduledActionProps

/**
 * Properties for defining a `CfnScheduledAction`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnScheduledActionProps cfnScheduledActionProps = CfnScheduledActionProps.builder()
 * .scheduledActionName("scheduledActionName")
 * // the properties below are optional
 * .enable(false)
 * .endTime("endTime")
 * .iamRole("iamRole")
 * .schedule("schedule")
 * .scheduledActionDescription("scheduledActionDescription")
 * .startTime("startTime")
 * .targetAction(ScheduledActionTypeProperty.builder()
 * .pauseCluster(PauseClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .resizeCluster(ResizeClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .classic(false)
 * .clusterType("clusterType")
 * .nodeType("nodeType")
 * .numberOfNodes(123)
 * .build())
 * .resumeCluster(ResumeClusterMessageProperty.builder()
 * .clusterIdentifier("clusterIdentifier")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html)
 */
@CdkDslMarker
public class CfnScheduledActionPropsDsl {
    private val cdkBuilder: CfnScheduledActionProps.Builder = CfnScheduledActionProps.builder()

    /**
     * @param enable If true, the schedule is enabled. If false, the scheduled action does not
     *   trigger. For more information about `state` of the scheduled action, see `ScheduledAction`
     *   .
     */
    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    /**
     * @param enable If true, the schedule is enabled. If false, the scheduled action does not
     *   trigger. For more information about `state` of the scheduled action, see `ScheduledAction`
     *   .
     */
    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    /**
     * @param endTime The end time in UTC when the schedule is no longer active. After this time,
     *   the scheduled action does not trigger.
     */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * @param iamRole The IAM role to assume to run the scheduled action. This IAM role must have
     *   permission to run the Amazon Redshift API operation in the scheduled action. This IAM role
     *   must allow the Amazon Redshift scheduler (Principal scheduler.redshift.amazonaws.com) to
     *   assume permissions on your behalf. For more information about the IAM role to use with the
     *   Amazon Redshift scheduler, see
     *   [Using Identity-Based Policies for Amazon Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
     *   in the *Amazon Redshift Cluster Management Guide* .
     */
    public fun iamRole(iamRole: String) {
        cdkBuilder.iamRole(iamRole)
    }

    /**
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     *   action. Schedule invocations must be separated by at least one hour.
     *
     * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
     * `at(2016-03-04T17:27:00)` ".
     *
     * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
     * For example, " `cron(0 10 ? * MON *)` ". For more information, see
     * [Cron Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch Events User Guide* .
     */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    /** @param scheduledActionDescription The description of the scheduled action. */
    public fun scheduledActionDescription(scheduledActionDescription: String) {
        cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    /** @param scheduledActionName The name of the scheduled action. */
    public fun scheduledActionName(scheduledActionName: String) {
        cdkBuilder.scheduledActionName(scheduledActionName)
    }

    /**
     * @param startTime The start time in UTC when the schedule is active. Before this time, the
     *   scheduled action does not trigger.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     *   parameters. "
     *   `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     *   ".
     */
    public fun targetAction(targetAction: IResolvable) {
        cdkBuilder.targetAction(targetAction)
    }

    /**
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     *   parameters. "
     *   `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     *   ".
     */
    public fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty) {
        cdkBuilder.targetAction(targetAction)
    }

    public fun build(): CfnScheduledActionProps = cdkBuilder.build()
}
