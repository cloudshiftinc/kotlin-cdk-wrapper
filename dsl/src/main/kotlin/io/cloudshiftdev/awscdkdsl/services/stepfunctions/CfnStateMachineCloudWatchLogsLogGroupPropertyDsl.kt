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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

/**
 * Defines a CloudWatch log group.
 *
 * For more information see
 * [Standard Versus Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-standard-vs-express.html)
 * in the AWS Step Functions Developer Guide.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
 * CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-cloudwatchlogsloggroup.html)
 */
@CdkDslMarker
public class CfnStateMachineCloudWatchLogsLogGroupPropertyDsl {
    private val cdkBuilder: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder =
        CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

    /**
     * @param logGroupArn The ARN of the the CloudWatch log group to which you want your logs
     *   emitted to. The ARN must end with `:*`
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnStateMachine.CloudWatchLogsLogGroupProperty = cdkBuilder.build()
}
