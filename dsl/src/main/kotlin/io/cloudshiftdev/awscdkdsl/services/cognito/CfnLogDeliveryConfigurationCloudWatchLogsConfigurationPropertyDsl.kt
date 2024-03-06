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

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration

/**
 * The CloudWatch logging destination of a user pool detailed activity logging configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CloudWatchLogsConfigurationProperty cloudWatchLogsConfigurationProperty =
 * CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-cloudwatchlogsconfiguration.html)
 */
@CdkDslMarker
public class CfnLogDeliveryConfigurationCloudWatchLogsConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.Builder =
        CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty.builder()

    /**
     * @param logGroupArn The Amazon Resource Name (arn) of a CloudWatch Logs log group where your
     *   user pool sends logs. The log group must not be encrypted with AWS Key Management Service
     *   and must be in the same AWS account as your user pool.
     *
     * To send logs to log groups with a resource policy of a size greater than 5120 characters,
     * configure a log group with a path that starts with `/aws/vendedlogs` . For more information,
     * see
     * [Enabling logging from certain AWS services](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AWS-logs-and-resource-policy.html)
     * .
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty =
        cdkBuilder.build()
}
