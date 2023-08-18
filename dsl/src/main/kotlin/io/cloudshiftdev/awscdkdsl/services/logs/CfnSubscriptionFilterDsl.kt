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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.CfnSubscriptionFilter
import software.constructs.Construct

/**
 * The `AWS::Logs::SubscriptionFilter` resource specifies a subscription filter and associates it
 * with the specified log group.
 *
 * Subscription filters allow you to subscribe to a real-time stream of log events and have them
 * delivered to a specific destination. Currently, the supported destinations are:
 * * An Amazon Kinesis data stream belonging to the same account as the subscription filter, for
 *   same-account delivery.
 * * A logical destination that belongs to a different account, for cross-account delivery.
 * * An Amazon Kinesis Firehose delivery stream that belongs to the same account as the subscription
 *   filter, for same-account delivery.
 * * An AWS Lambda function that belongs to the same account as the subscription filter, for
 *   same-account delivery.
 *
 * There can be as many as two subscription filters associated with a log group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnSubscriptionFilter cfnSubscriptionFilter = CfnSubscriptionFilter.Builder.create(this,
 * "MyCfnSubscriptionFilter")
 * .destinationArn("destinationArn")
 * .filterPattern("filterPattern")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .distribution("distribution")
 * .filterName("filterName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html)
 */
@CdkDslMarker
public class CfnSubscriptionFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubscriptionFilter.Builder =
        CfnSubscriptionFilter.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-destinationarn)
     *
     * @param destinationArn The Amazon Resource Name (ARN) of the destination.
     */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * The method used to distribute log data to the destination, which can be either random or
     * grouped by log stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-distribution)
     *
     * @param distribution The method used to distribute log data to the destination, which can be
     *   either random or grouped by log stream.
     */
    public fun distribution(distribution: String) {
        cdkBuilder.distribution(distribution)
    }

    /**
     * The name of the subscription filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filtername)
     *
     * @param filterName The name of the subscription filter.
     */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /**
     * The filtering expressions that restrict what gets delivered to the destination AWS resource.
     *
     * For more information about the filter pattern syntax, see
     * [Filter and Pattern Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-filterpattern)
     *
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     *   destination AWS resource.
     */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * The log group to associate with the subscription filter.
     *
     * All log events that are uploaded to this log group are filtered and delivered to the
     * specified AWS resource if the filter pattern matches the log events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-loggroupname)
     *
     * @param logGroupName The log group to associate with the subscription filter.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * The ARN of an IAM role that grants CloudWatch Logs permissions to deliver ingested log events
     * to the destination stream.
     *
     * You don't need to provide the ARN when you are working with a logical destination for
     * cross-account delivery.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-logs-subscriptionfilter-rolearn)
     *
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     *   ingested log events to the destination stream.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSubscriptionFilter = cdkBuilder.build()
}
