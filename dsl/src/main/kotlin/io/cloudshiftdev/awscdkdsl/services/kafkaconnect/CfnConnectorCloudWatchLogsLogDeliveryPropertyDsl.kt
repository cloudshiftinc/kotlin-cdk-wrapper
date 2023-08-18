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

package io.cloudshiftdev.awscdkdsl.services.kafkaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The settings for delivering connector logs to Amazon CloudWatch Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * CloudWatchLogsLogDeliveryProperty cloudWatchLogsLogDeliveryProperty =
 * CloudWatchLogsLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-cloudwatchlogslogdelivery.html)
 */
@CdkDslMarker
public class CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder =
        CfnConnector.CloudWatchLogsLogDeliveryProperty.builder()

    /** @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled Whether log delivery to Amazon CloudWatch Logs is enabled. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param logGroup The name of the CloudWatch log group that is the destination for log
     *   delivery.
     */
    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnConnector.CloudWatchLogsLogDeliveryProperty = cdkBuilder.build()
}
