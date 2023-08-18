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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

/**
 * Specifies the configuration for experiment logging to CloudWatch Logs .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * CloudWatchLogsConfigurationProperty cloudWatchLogsConfigurationProperty =
 * CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-fis-experimenttemplate-cloudwatchlogsconfiguration.html)
 */
@CdkDslMarker
public class CfnExperimentTemplateCloudWatchLogsConfigurationPropertyDsl {
    private val cdkBuilder: CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.Builder =
        CfnExperimentTemplate.CloudWatchLogsConfigurationProperty.builder()

    /**
     * @param logGroupArn The Amazon Resource Name (ARN) of the destination Amazon CloudWatch Logs
     *   log group.
     */
    public fun logGroupArn(logGroupArn: String) {
        cdkBuilder.logGroupArn(logGroupArn)
    }

    public fun build(): CfnExperimentTemplate.CloudWatchLogsConfigurationProperty =
        cdkBuilder.build()
}
