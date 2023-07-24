@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.constructs.Construct
import kotlin.String

/**
 * Use the AWS CloudFormation `AWS::Kinesis::StreamConsumer` resource to register a consumer with a
 * Kinesis data stream.
 *
 * The consumer you register can then call
 * [SubscribeToShard](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_SubscribeToShard.html)
 * to receive data from the stream using enhanced fan-out, at a rate of up to 2 MiB per second for
 * every shard you subscribe to. This rate is unaffected by the total number of consumers that read
 * from the same stream.
 *
 * You can register up to five consumers per stream. However, you can request a limit increase using
 * the [Kinesis Data Streams limits form](https://docs.aws.amazon.com/support/v1?#/) . A given consumer
 * can only be registered with one stream at a time.
 *
 * For more information, see [Using Consumers with Enhanced
 * Fan-Out](https://docs.aws.amazon.com/streams/latest/dev/introduction-to-enhanced-consumers.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesis.*;
 * CfnStreamConsumer cfnStreamConsumer = CfnStreamConsumer.Builder.create(this,
 * "MyCfnStreamConsumer")
 * .consumerName("consumerName")
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html)
 */
@CdkDslMarker
public class CfnStreamConsumerDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnStreamConsumer.Builder = CfnStreamConsumer.Builder.create(scope, id)

    /**
     * The name of the consumer is something you choose when you register the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-consumername)
     * @param consumerName The name of the consumer is something you choose when you register the
     * consumer.
     */
    public fun consumerName(consumerName: String) {
        cdkBuilder.consumerName(consumerName)
    }

    /**
     * The ARN of the stream with which you registered the consumer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-streamconsumer.html#cfn-kinesis-streamconsumer-streamarn)
     * @param streamArn The ARN of the stream with which you registered the consumer.
     */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnStreamConsumer = cdkBuilder.build()
}
