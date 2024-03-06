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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel

/**
 * Sends information about the detector model instance and the event that triggered the action to an
 * Amazon Kinesis Data Firehose delivery stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * FirehoseProperty firehoseProperty = FirehoseProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .separator("separator")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-alarmmodel-firehose.html)
 */
@CdkDslMarker
public class CfnAlarmModelFirehosePropertyDsl {
    private val cdkBuilder: CfnAlarmModel.FirehoseProperty.Builder =
        CfnAlarmModel.FirehoseProperty.builder()

    /**
     * @param deliveryStreamName The name of the Kinesis Data Firehose delivery stream where the
     *   data is written.
     */
    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon Data
     *   Firehose delivery stream.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon Data
     *   Firehose delivery stream.
     */
    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param separator A character separator that is used to separate records written to the
     *   Kinesis Data Firehose delivery stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n'
     *   (Windows newline), ',' (comma).
     */
    public fun separator(separator: String) {
        cdkBuilder.separator(separator)
    }

    public fun build(): CfnAlarmModel.FirehoseProperty = cdkBuilder.build()
}
