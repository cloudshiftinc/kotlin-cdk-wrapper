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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnLogDeliveryConfiguration

/**
 * The logging parameters of a user pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * LogConfigurationProperty logConfigurationProperty = LogConfigurationProperty.builder()
 * .cloudWatchLogsConfiguration(CloudWatchLogsConfigurationProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .eventSource("eventSource")
 * .logLevel("logLevel")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-logdeliveryconfiguration-logconfiguration.html)
 */
@CdkDslMarker
public class CfnLogDeliveryConfigurationLogConfigurationPropertyDsl {
    private val cdkBuilder: CfnLogDeliveryConfiguration.LogConfigurationProperty.Builder =
        CfnLogDeliveryConfiguration.LogConfigurationProperty.builder()

    /**
     * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool detailed
     *   activity logging configuration.
     */
    public fun cloudWatchLogsConfiguration(cloudWatchLogsConfiguration: IResolvable) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
    }

    /**
     * @param cloudWatchLogsConfiguration The CloudWatch logging destination of a user pool detailed
     *   activity logging configuration.
     */
    public fun cloudWatchLogsConfiguration(
        cloudWatchLogsConfiguration: CfnLogDeliveryConfiguration.CloudWatchLogsConfigurationProperty
    ) {
        cdkBuilder.cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
    }

    /**
     * @param eventSource The source of events that your user pool sends for detailed activity
     *   logging.
     */
    public fun eventSource(eventSource: String) {
        cdkBuilder.eventSource(eventSource)
    }

    /**
     * @param logLevel The `errorlevel` selection of logs that a user pool sends for detailed
     *   activity logging.
     */
    public fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
    }

    public fun build(): CfnLogDeliveryConfiguration.LogConfigurationProperty = cdkBuilder.build()
}
