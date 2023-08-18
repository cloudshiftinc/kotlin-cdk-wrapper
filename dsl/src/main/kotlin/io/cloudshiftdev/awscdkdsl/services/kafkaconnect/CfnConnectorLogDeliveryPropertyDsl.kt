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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Details about log delivery.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * LogDeliveryProperty logDeliveryProperty = LogDeliveryProperty.builder()
 * .workerLogDelivery(WorkerLogDeliveryProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logGroup("logGroup")
 * .build())
 * .firehose(FirehoseLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build())
 * .s3(S3LogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bucket("bucket")
 * .prefix("prefix")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-logdelivery.html)
 */
@CdkDslMarker
public class CfnConnectorLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.LogDeliveryProperty.Builder =
        CfnConnector.LogDeliveryProperty.builder()

    /**
     * @param workerLogDelivery The workers can send worker logs to different destination types.
     *   This configuration specifies the details of these destinations.
     */
    public fun workerLogDelivery(workerLogDelivery: IResolvable) {
        cdkBuilder.workerLogDelivery(workerLogDelivery)
    }

    /**
     * @param workerLogDelivery The workers can send worker logs to different destination types.
     *   This configuration specifies the details of these destinations.
     */
    public fun workerLogDelivery(workerLogDelivery: CfnConnector.WorkerLogDeliveryProperty) {
        cdkBuilder.workerLogDelivery(workerLogDelivery)
    }

    public fun build(): CfnConnector.LogDeliveryProperty = cdkBuilder.build()
}
