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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnHookVersion

/**
 * The `LoggingConfig` property type specifies logging configuration information for an extension.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
 * .logGroupName("logGroupName")
 * .logRoleArn("logRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-hookversion-loggingconfig.html)
 */
@CdkDslMarker
public class CfnHookVersionLoggingConfigPropertyDsl {
    private val cdkBuilder: CfnHookVersion.LoggingConfigProperty.Builder =
        CfnHookVersion.LoggingConfigProperty.builder()

    /**
     * @param logGroupName The Amazon CloudWatch Logs group to which CloudFormation sends error
     *   logging information when invoking the extension's handlers.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    /**
     * @param logRoleArn The Amazon Resource Name (ARN) of the role that CloudFormation should
     *   assume when sending log entries to CloudWatch Logs.
     */
    public fun logRoleArn(logRoleArn: String) {
        cdkBuilder.logRoleArn(logRoleArn)
    }

    public fun build(): CfnHookVersion.LoggingConfigProperty = cdkBuilder.build()
}
