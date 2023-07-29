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

package cloudshift.awscdk.dsl.services.kinesis

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
import software.amazon.awscdk.services.kinesis.CfnStreamProps
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamAttributes
import software.amazon.awscdk.services.kinesis.StreamProps
import software.constructs.Construct

public object kinesis {
    /**
     * Creates a Kinesis stream that captures and transports data records that are emitted from data
     * sources.
     *
     * For information about creating streams, see
     * [CreateStream](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_CreateStream.html)
     * in the Amazon Kinesis API Reference.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesis.*;
     * CfnStream cfnStream = CfnStream.Builder.create(this, "MyCfnStream")
     * .name("name")
     * .retentionPeriodHours(123)
     * .shardCount(123)
     * .streamEncryption(StreamEncryptionProperty.builder()
     * .encryptionType("encryptionType")
     * .keyId("keyId")
     * .build())
     * .streamModeDetails(StreamModeDetailsProperty.builder()
     * .streamMode("streamMode")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
     */
    public inline fun cfnStream(
        scope: Construct,
        id: String,
        block: CfnStreamDsl.() -> Unit = {},
    ): CfnStream {
        val builder = CfnStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use the AWS CloudFormation `AWS::Kinesis::StreamConsumer` resource to register a consumer
     * with a Kinesis data stream.
     *
     * The consumer you register can then call
     * [SubscribeToShard](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_SubscribeToShard.html)
     * to receive data from the stream using enhanced fan-out, at a rate of up to 2 MiB per second
     * for every shard you subscribe to. This rate is unaffected by the total number of consumers
     * that read from the same stream.
     *
     * You can register up to five consumers per stream. However, you can request a limit increase
     * using the [Kinesis Data Streams limits form](https://docs.aws.amazon.com/support/v1?#/) . A
     * given consumer can only be registered with one stream at a time.
     *
     * For more information, see
     * [Using Consumers with Enhanced Fan-Out](https://docs.aws.amazon.com/streams/latest/dev/introduction-to-enhanced-consumers.html)
     * .
     *
     * Example:
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
    public inline fun cfnStreamConsumer(
        scope: Construct,
        id: String,
        block: CfnStreamConsumerDsl.() -> Unit = {},
    ): CfnStreamConsumer {
        val builder = CfnStreamConsumerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnStreamConsumerProps(
        block: CfnStreamConsumerPropsDsl.() -> Unit = {}
    ): CfnStreamConsumerProps {
        val builder = CfnStreamConsumerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStream`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesis.*;
     * CfnStreamProps cfnStreamProps = CfnStreamProps.builder()
     * .name("name")
     * .retentionPeriodHours(123)
     * .shardCount(123)
     * .streamEncryption(StreamEncryptionProperty.builder()
     * .encryptionType("encryptionType")
     * .keyId("keyId")
     * .build())
     * .streamModeDetails(StreamModeDetailsProperty.builder()
     * .streamMode("streamMode")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesis-stream.html)
     */
    public inline fun cfnStreamProps(block: CfnStreamPropsDsl.() -> Unit = {}): CfnStreamProps {
        val builder = CfnStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Enables or updates server-side encryption using an AWS KMS key for a specified stream.
     *
     * When invoking this API, you must use either the `StreamARN` or the `StreamName` parameter, or
     * both. It is recommended that you use the `StreamARN` input parameter when you invoke this
     * API.
     *
     * Starting encryption is an asynchronous operation. Upon receiving the request, Kinesis Data
     * Streams returns immediately and sets the status of the stream to `UPDATING` . After the
     * update is complete, Kinesis Data Streams sets the status of the stream back to `ACTIVE` .
     * Updating or applying encryption normally takes a few seconds to complete, but it can take
     * minutes. You can continue to read and write data to your stream while its status is
     * `UPDATING` . Once the status of the stream is `ACTIVE` , encryption begins for records
     * written to the stream.
     *
     * API Limits: You can successfully apply a new AWS KMS key for server-side encryption 25 times
     * in a rolling 24-hour period.
     *
     * Note: It can take up to 5 seconds after the stream is in an `ACTIVE` status before all
     * records written to the stream are encrypted. After you enable encryption, you can verify that
     * encryption is applied by inspecting the API response from `PutRecord` or `PutRecords` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesis.*;
     * StreamEncryptionProperty streamEncryptionProperty = StreamEncryptionProperty.builder()
     * .encryptionType("encryptionType")
     * .keyId("keyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streamencryption.html)
     */
    public inline fun cfnStreamStreamEncryptionProperty(
        block: CfnStreamStreamEncryptionPropertyDsl.() -> Unit = {}
    ): CfnStream.StreamEncryptionProperty {
        val builder = CfnStreamStreamEncryptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the capacity mode to which you want to set your data stream.
     *
     * Currently, in Kinesis Data Streams, you can choose between an *on-demand* capacity mode and a
     * *provisioned* capacity mode for your data streams.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.kinesis.*;
     * StreamModeDetailsProperty streamModeDetailsProperty = StreamModeDetailsProperty.builder()
     * .streamMode("streamMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesis-stream-streammodedetails.html)
     */
    public inline fun cfnStreamStreamModeDetailsProperty(
        block: CfnStreamStreamModeDetailsPropertyDsl.() -> Unit = {}
    ): CfnStream.StreamModeDetailsProperty {
        val builder = CfnStreamStreamModeDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Kinesis stream.
     *
     * Can be encrypted with a KMS key.
     *
     * Example:
     * ```
     * Key key = new Key(this, "MyKey");
     * Stream.Builder.create(this, "MyEncryptedStream")
     * .encryption(StreamEncryption.KMS)
     * .encryptionKey(key)
     * .build();
     * ```
     */
    public inline fun stream(
        scope: Construct,
        id: String,
        block: StreamDsl.() -> Unit = {},
    ): Stream {
        val builder = StreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A reference to a stream.
     *
     * The easiest way to instantiate is to call `stream.export()`. Then, the consumer can use
     * `Stream.import(this, ref)` and get a `Stream`.
     *
     * Example:
     * ```
     * IStream importedStream = Stream.fromStreamAttributes(this, "ImportedEncryptedStream",
     * StreamAttributes.builder()
     * .streamArn("arn:aws:kinesis:us-east-2:123456789012:stream/f3j09j2230j")
     * .encryptionKey(Key.fromKeyArn(this, "key",
     * "arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012"))
     * .build());
     * ```
     */
    public inline fun streamAttributes(
        block: StreamAttributesDsl.() -> Unit = {}
    ): StreamAttributes {
        val builder = StreamAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Kinesis Stream.
     *
     * Example:
     * ```
     * Key key = new Key(this, "MyKey");
     * Stream.Builder.create(this, "MyEncryptedStream")
     * .encryption(StreamEncryption.KMS)
     * .encryptionKey(key)
     * .build();
     * ```
     */
    public inline fun streamProps(block: StreamPropsDsl.() -> Unit = {}): StreamProps {
        val builder = StreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
