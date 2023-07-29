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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * The settings for delivering logs to Amazon Kinesis Data Firehose.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * FirehoseLogDeliveryProperty firehoseLogDeliveryProperty = FirehoseLogDeliveryProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .deliveryStream("deliveryStream")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-firehoselogdelivery.html)
 */
@CdkDslMarker
public class CfnConnectorFirehoseLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.FirehoseLogDeliveryProperty.Builder =
        CfnConnector.FirehoseLogDeliveryProperty.builder()

    /**
     * @param deliveryStream The name of the Kinesis Data Firehose delivery stream that is the
     *   destination for log delivery.
     */
    public fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
    }

    /**
     * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
     *   Firehose.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether connector logs get delivered to Amazon Kinesis Data
     *   Firehose.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnConnector.FirehoseLogDeliveryProperty = cdkBuilder.build()
}
