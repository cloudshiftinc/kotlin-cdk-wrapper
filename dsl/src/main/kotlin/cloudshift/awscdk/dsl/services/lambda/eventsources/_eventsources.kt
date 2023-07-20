@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda.eventsources

import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.lambda.eventsources.ApiEventSource
import software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource
import software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.S3EventSource
import software.amazon.awscdk.services.lambda.eventsources.S3EventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource
import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource
import software.amazon.awscdk.services.lambda.eventsources.SnsEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSource
import software.amazon.awscdk.services.lambda.eventsources.SqsEventSourceProps
import software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps
import software.amazon.awscdk.services.s3.Bucket
import software.amazon.awscdk.services.sns.ITopic
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.String
import kotlin.Unit

public object eventsources {
    public inline fun apiEventSource(
        method: String,
        path: String,
        block: ApiEventSourceDsl.() -> Unit = {},
    ): ApiEventSource {
        val builder = ApiEventSourceDsl(method, path)
        builder.apply(block)
        return builder.build()
    }

    public inline fun baseStreamEventSourceProps(
        block: BaseStreamEventSourcePropsDsl.() -> Unit =
            {},
    ): BaseStreamEventSourceProps {
        val builder = BaseStreamEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoEventSource(table: ITable, block: DynamoEventSourceDsl.() -> Unit = {}): DynamoEventSource {
        val builder = DynamoEventSourceDsl(table)
        builder.apply(block)
        return builder.build()
    }

    public inline fun dynamoEventSourceProps(block: DynamoEventSourcePropsDsl.() -> Unit = {}): DynamoEventSourceProps {
        val builder = DynamoEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kafkaEventSourceProps(block: KafkaEventSourcePropsDsl.() -> Unit = {}): KafkaEventSourceProps {
        val builder = KafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun kinesisEventSource(
        stream: IStream,
        block: KinesisEventSourceDsl.() -> Unit =
            {},
    ): KinesisEventSource {
        val builder = KinesisEventSourceDsl(stream)
        builder.apply(block)
        return builder.build()
    }

    public inline fun kinesisEventSourceProps(block: KinesisEventSourcePropsDsl.() -> Unit = {}): KinesisEventSourceProps {
        val builder = KinesisEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun managedKafkaEventSource(block: ManagedKafkaEventSourceDsl.() -> Unit = {}): ManagedKafkaEventSource {
        val builder = ManagedKafkaEventSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun managedKafkaEventSourceProps(
        block: ManagedKafkaEventSourcePropsDsl.() -> Unit =
            {},
    ): ManagedKafkaEventSourceProps {
        val builder = ManagedKafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3EventSource(bucket: Bucket, block: S3EventSourceDsl.() -> Unit = {}): S3EventSource {
        val builder = S3EventSourceDsl(bucket)
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3EventSourceProps(block: S3EventSourcePropsDsl.() -> Unit = {}): S3EventSourceProps {
        val builder = S3EventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun selfManagedKafkaEventSource(
        block: SelfManagedKafkaEventSourceDsl.() -> Unit =
            {},
    ): SelfManagedKafkaEventSource {
        val builder = SelfManagedKafkaEventSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun selfManagedKafkaEventSourceProps(
        block: SelfManagedKafkaEventSourcePropsDsl.() -> Unit =
            {},
    ): SelfManagedKafkaEventSourceProps {
        val builder = SelfManagedKafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun snsEventSource(topic: ITopic, block: SnsEventSourceDsl.() -> Unit = {}): SnsEventSource {
        val builder = SnsEventSourceDsl(topic)
        builder.apply(block)
        return builder.build()
    }

    public inline fun snsEventSourceProps(block: SnsEventSourcePropsDsl.() -> Unit = {}): SnsEventSourceProps {
        val builder = SnsEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsEventSource(queue: IQueue, block: SqsEventSourceDsl.() -> Unit = {}): SqsEventSource {
        val builder = SqsEventSourceDsl(queue)
        builder.apply(block)
        return builder.build()
    }

    public inline fun sqsEventSourceProps(block: SqsEventSourcePropsDsl.() -> Unit = {}): SqsEventSourceProps {
        val builder = SqsEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun streamEventSourceProps(block: StreamEventSourcePropsDsl.() -> Unit = {}): StreamEventSourceProps {
        val builder = StreamEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
