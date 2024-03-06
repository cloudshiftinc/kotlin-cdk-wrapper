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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * The function's Amazon CloudWatch Logs configuration settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
 * .applicationLogLevel("applicationLogLevel")
 * .logFormat("logFormat")
 * .logGroup("logGroup")
 * .systemLogLevel("systemLogLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-loggingconfig.html)
 */
@CdkDslMarker
public class CfnFunctionLoggingConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.LoggingConfigProperty.Builder =
        CfnFunction.LoggingConfigProperty.builder()

    /**
     * @param applicationLogLevel Set this property to filter the application logs for your function
     *   that Lambda sends to CloudWatch. Lambda only sends application logs at the selected level
     *   of detail and lower, where `TRACE` is the highest level and `FATAL` is the lowest.
     */
    public fun applicationLogLevel(applicationLogLevel: String) {
        cdkBuilder.applicationLogLevel(applicationLogLevel)
    }

    /**
     * @param logFormat The format in which Lambda sends your function's application and system logs
     *   to CloudWatch. Select between plain text and structured JSON.
     */
    public fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
    }

    /**
     * @param logGroup The name of the Amazon CloudWatch log group the function sends logs to. By
     *   default, Lambda functions send logs to a default log group named `/aws/lambda/&lt;function
     *   name&gt;` . To use a different log group, enter an existing log group or enter a new log
     *   group name.
     */
    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    /**
     * @param systemLogLevel Set this property to filter the system logs for your function that
     *   Lambda sends to CloudWatch. Lambda only sends system logs at the selected level of detail
     *   and lower, where `DEBUG` is the highest level and `WARN` is the lowest.
     */
    public fun systemLogLevel(systemLogLevel: String) {
        cdkBuilder.systemLogLevel(systemLogLevel)
    }

    public fun build(): CfnFunction.LoggingConfigProperty = cdkBuilder.build()
}
