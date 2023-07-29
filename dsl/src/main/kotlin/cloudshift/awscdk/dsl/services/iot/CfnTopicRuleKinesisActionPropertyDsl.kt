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
import kotlin.String
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Describes an action to write data to an Amazon Kinesis stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * KinesisActionProperty kinesisActionProperty = KinesisActionProperty.builder()
 * .roleArn("roleArn")
 * .streamName("streamName")
 * // the properties below are optional
 * .partitionKey("partitionKey")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-kinesisaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleKinesisActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.KinesisActionProperty.Builder =
        CfnTopicRule.KinesisActionProperty.builder()

    /** @param partitionKey The partition key. */
    public fun partitionKey(partitionKey: String) {
        cdkBuilder.partitionKey(partitionKey)
    }

    /** @param roleArn The ARN of the IAM role that grants access to the Amazon Kinesis stream. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param streamName The name of the Amazon Kinesis stream. */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    public fun build(): CfnTopicRule.KinesisActionProperty = cdkBuilder.build()
}
