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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action that writes data to an Amazon Kinesis Firehose stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * FirehoseActionProperty firehoseActionProperty = FirehoseActionProperty.builder()
 * .deliveryStreamName("deliveryStreamName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .separator("separator")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-firehoseaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleFirehoseActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.FirehoseActionProperty.Builder =
        CfnTopicRule.FirehoseActionProperty.builder()

    /**
     * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
     *   [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     *   . The default value is `false` . When `batchMode` is `true` and the rule's SQL statement
     *   evaluates to an Array, each Array element forms one record in the
     *   [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     *   request. The resulting array can't have more than 500 records.
     */
    public fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
    }

    /**
     * @param batchMode Whether to deliver the Kinesis Data Firehose stream as a batch by using
     *   [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     *   . The default value is `false` . When `batchMode` is `true` and the rule's SQL statement
     *   evaluates to an Array, each Array element forms one record in the
     *   [`PutRecordBatch`](https://docs.aws.amazon.com/firehose/latest/APIReference/API_PutRecordBatch.html)
     *   request. The resulting array can't have more than 500 records.
     */
    public fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode)
    }

    /** @param deliveryStreamName The delivery stream name. */
    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    /** @param roleArn The IAM role that grants access to the Amazon Kinesis Firehose stream. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param separator A character separator that will be used to separate records written to the
     *   Firehose stream. Valid values are: '\n' (newline), '\t' (tab), '\r\n' (Windows newline),
     *   ',' (comma).
     */
    public fun separator(separator: String) {
        cdkBuilder.separator(separator)
    }

    public fun build(): CfnTopicRule.FirehoseActionProperty = cdkBuilder.build()
}
