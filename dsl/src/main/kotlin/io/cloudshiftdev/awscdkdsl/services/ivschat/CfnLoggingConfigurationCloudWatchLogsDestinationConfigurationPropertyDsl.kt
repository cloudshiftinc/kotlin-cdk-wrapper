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

package io.cloudshiftdev.awscdkdsl.services.ivschat

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

/**
 * The CloudWatchLogsDestinationConfiguration property type specifies a CloudWatch Logs location
 * where chat logs will be stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ivschat.*;
 * CloudWatchLogsDestinationConfigurationProperty cloudWatchLogsDestinationConfigurationProperty =
 * CloudWatchLogsDestinationConfigurationProperty.builder()
 * .logGroupName("logGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ivschat-loggingconfiguration-cloudwatchlogsdestinationconfiguration.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationCloudWatchLogsDestinationConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty.builder()

    /**
     * @param logGroupName Name of the Amazon Cloudwatch Logs destination where chat activity will
     *   be logged.
     */
    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun build(): CfnLoggingConfiguration.CloudWatchLogsDestinationConfigurationProperty =
        cdkBuilder.build()
}
