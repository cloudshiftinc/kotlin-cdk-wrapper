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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * CloudWatchLogsLogGroupProperty cloudWatchLogsLogGroupProperty =
 * CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatchlogsloggroup.html)
 */
@CdkDslMarker
public class CfnStateMachineCloudWatchLogsLogGroupPropertyDsl {
    private val cdkBuilder: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder =
        CfnStateMachine.CloudWatchLogsLogGroupProperty.builder()

    /** @param logGroupArn the value to be set. */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnStateMachine.CloudWatchLogsLogGroupProperty = cdkBuilder.build()
}
