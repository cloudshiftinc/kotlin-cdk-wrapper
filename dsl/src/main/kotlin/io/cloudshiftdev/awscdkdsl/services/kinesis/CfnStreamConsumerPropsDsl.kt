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

package io.cloudshiftdev.awscdkdsl.services.kinesis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps

/**
 * Properties for defining a `CfnStreamConsumer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesis.*;
 * CfnStreamConsumerProps cfnStreamConsumerProps = CfnStreamConsumerProps.builder()
 * .consumerName("consumerName")
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html)
 */
@CdkDslMarker
public class CfnStreamConsumerPropsDsl {
    private val cdkBuilder: CfnStreamConsumerProps.Builder = CfnStreamConsumerProps.builder()

    /**
     * @param consumerName The name of the consumer is something you choose when you register the
     *   consumer.
     */
    public fun consumerName(consumerName: String) {
        cdkBuilder.consumerName(consumerName)
    }

    /** @param streamArn The ARN of the stream with which you registered the consumer. */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnStreamConsumerProps = cdkBuilder.build()
}
