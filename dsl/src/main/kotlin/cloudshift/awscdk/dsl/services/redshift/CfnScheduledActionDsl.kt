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

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnScheduledAction
import software.constructs.Construct

/**
 * Creates a scheduled action.
 *
 * A scheduled action contains a schedule and an Amazon Redshift API action. For example, you can
 * create a schedule of when to run the `ResizeCluster` API operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnScheduledAction cfnScheduledAction = CfnScheduledAction.Builder.create(this,
 * "MyCfnScheduledAction")
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
public class CfnScheduledActionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnScheduledAction.Builder =
        CfnScheduledAction.Builder.create(scope, id)

    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     *
     * @param enable If true, the schedule is enabled.
     */
    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    /**
     * If true, the schedule is enabled.
     *
     * If false, the scheduled action does not trigger. For more information about `state` of the
     * scheduled action, see `ScheduledAction` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-enable)
     *
     * @param enable If true, the schedule is enabled.
     */
    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    /**
     * The end time in UTC when the schedule is no longer active.
     *
     * After this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-endtime)
     *
     * @param endTime The end time in UTC when the schedule is no longer active.
     */
    public fun endTime(endTime: String) {
        cdkBuilder.endTime(endTime)
    }

    /**
     * The IAM role to assume to run the scheduled action.
     *
     * This IAM role must have permission to run the Amazon Redshift API operation in the scheduled
     * action. This IAM role must allow the Amazon Redshift scheduler (Principal
     * scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information
     * about the IAM role to use with the Amazon Redshift scheduler, see
     * [Using Identity-Based Policies for Amazon Redshift](https://docs.aws.amazon.com/redshift/latest/mgmt/redshift-iam-access-control-identity-based.html)
     * in the *Amazon Redshift Cluster Management Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-iamrole)
     *
     * @param iamRole The IAM role to assume to run the scheduled action.
     */
    public fun iamRole(iamRole: String) {
        cdkBuilder.iamRole(iamRole)
    }

    /**
     * The schedule for a one-time (at format) or recurring (cron format) scheduled action.
     *
     * Schedule invocations must be separated by at least one hour.
     *
     * Format of at expressions is " `at(yyyy-mm-ddThh:mm:ss)` ". For example, "
     * `at(2016-03-04T17:27:00)` ".
     *
     * Format of cron expressions is " `cron(Minutes Hours Day-of-month Month Day-of-week Year)` ".
     * For example, " `cron(0 10 ? * MON *)` ". For more information, see
     * [Cron Expressions](https://docs.aws.amazon.com//AmazonCloudWatch/latest/events/ScheduledEvents.html#CronExpressions)
     * in the *Amazon CloudWatch Events User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-schedule)
     *
     * @param schedule The schedule for a one-time (at format) or recurring (cron format) scheduled
     *   action.
     */
    public fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
    }

    /**
     * The description of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactiondescription)
     *
     * @param scheduledActionDescription The description of the scheduled action.
     */
    public fun scheduledActionDescription(scheduledActionDescription: String) {
        cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    /**
     * The name of the scheduled action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-scheduledactionname)
     *
     * @param scheduledActionName The name of the scheduled action.
     */
    public fun scheduledActionName(scheduledActionName: String) {
        cdkBuilder.scheduledActionName(scheduledActionName)
    }

    /**
     * The start time in UTC when the schedule is active.
     *
     * Before this time, the scheduled action does not trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-starttime)
     *
     * @param startTime The start time in UTC when the schedule is active.
     */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     *
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     *   parameters.
     */
    public fun targetAction(targetAction: IResolvable) {
        cdkBuilder.targetAction(targetAction)
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     *
     * "
     * `{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}`
     * ".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-scheduledaction.html#cfn-redshift-scheduledaction-targetaction)
     *
     * @param targetAction A JSON format string of the Amazon Redshift API operation with input
     *   parameters.
     */
    public fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty) {
        cdkBuilder.targetAction(targetAction)
    }

    public fun build(): CfnScheduledAction = cdkBuilder.build()
}
