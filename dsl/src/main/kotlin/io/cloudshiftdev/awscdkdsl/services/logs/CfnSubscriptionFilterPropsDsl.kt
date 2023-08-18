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
import software.amazon.awscdk.services.logs.CfnSubscriptionFilterProps

/**
 * Properties for defining a `CfnSubscriptionFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnSubscriptionFilterProps cfnSubscriptionFilterProps = CfnSubscriptionFilterProps.builder()
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
public class CfnSubscriptionFilterPropsDsl {
    private val cdkBuilder: CfnSubscriptionFilterProps.Builder =
        CfnSubscriptionFilterProps.builder()

    /** @param destinationArn The Amazon Resource Name (ARN) of the destination. */
    public fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
    }

    /**
     * @param distribution The method used to distribute log data to the destination, which can be
     *   either random or grouped by log stream.
     */
    public fun distribution(distribution: String) {
        cdkBuilder.distribution(distribution)
    }

    /** @param filterName The name of the subscription filter. */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /**
     * @param filterPattern The filtering expressions that restrict what gets delivered to the
     *   destination AWS resource. For more information about the filter pattern syntax, see
     *   [Filter and Pattern Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html)
     *   .
     */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param logGroupName The log group to associate with the subscription filter. All log events
     *   that are uploaded to this log group are filtered and delivered to the specified AWS
     *   resource if the filter pattern matches the log events.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param roleArn The ARN of an IAM role that grants CloudWatch Logs permissions to deliver
     *   ingested log events to the destination stream. You don't need to provide the ARN when you
     *   are working with a logical destination for cross-account delivery.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnSubscriptionFilterProps = cdkBuilder.build()
}
