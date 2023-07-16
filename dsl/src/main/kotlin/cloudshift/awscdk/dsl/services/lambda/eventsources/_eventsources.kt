@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import kotlin.String
import kotlin.Unit
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

public object eventsources {
  public inline fun apiEventSource(
    arg0: String,
    arg1: String,
    block: ApiEventSourceDsl.() -> Unit = {},
  ): ApiEventSource {
    val builder = ApiEventSourceDsl(arg0, arg1)
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseStreamEventSourceProps(block: BaseStreamEventSourcePropsDsl.() -> Unit =
      {}): BaseStreamEventSourceProps {
    val builder = BaseStreamEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dynamoEventSource(arg0: ITable, block: DynamoEventSourceDsl.() -> Unit = {}):
      DynamoEventSource {
    val builder = DynamoEventSourceDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dynamoEventSourceProps(block: DynamoEventSourcePropsDsl.() -> Unit = {}):
      DynamoEventSourceProps {
    val builder = DynamoEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun kafkaEventSourceProps(block: KafkaEventSourcePropsDsl.() -> Unit = {}):
      KafkaEventSourceProps {
    val builder = KafkaEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisEventSource(arg0: IStream, block: KinesisEventSourceDsl.() -> Unit = {}):
      KinesisEventSource {
    val builder = KinesisEventSourceDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun kinesisEventSourceProps(block: KinesisEventSourcePropsDsl.() -> Unit = {}):
      KinesisEventSourceProps {
    val builder = KinesisEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedKafkaEventSource(block: ManagedKafkaEventSourceDsl.() -> Unit = {}):
      ManagedKafkaEventSource {
    val builder = ManagedKafkaEventSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun managedKafkaEventSourceProps(block: ManagedKafkaEventSourcePropsDsl.() -> Unit =
      {}): ManagedKafkaEventSourceProps {
    val builder = ManagedKafkaEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3EventSource(arg0: Bucket, block: S3EventSourceDsl.() -> Unit = {}):
      S3EventSource {
    val builder = S3EventSourceDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3EventSourceProps(block: S3EventSourcePropsDsl.() -> Unit = {}):
      S3EventSourceProps {
    val builder = S3EventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun selfManagedKafkaEventSource(block: SelfManagedKafkaEventSourceDsl.() -> Unit =
      {}): SelfManagedKafkaEventSource {
    val builder = SelfManagedKafkaEventSourceDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun selfManagedKafkaEventSourceProps(block: SelfManagedKafkaEventSourcePropsDsl.() -> Unit =
      {}): SelfManagedKafkaEventSourceProps {
    val builder = SelfManagedKafkaEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun snsEventSource(arg0: ITopic, block: SnsEventSourceDsl.() -> Unit = {}):
      SnsEventSource {
    val builder = SnsEventSourceDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun snsEventSourceProps(block: SnsEventSourcePropsDsl.() -> Unit = {}):
      SnsEventSourceProps {
    val builder = SnsEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sqsEventSource(arg0: IQueue, block: SqsEventSourceDsl.() -> Unit = {}):
      SqsEventSource {
    val builder = SqsEventSourceDsl(arg0)
    builder.apply(block)
    return builder.build()
  }

  public inline fun sqsEventSourceProps(block: SqsEventSourcePropsDsl.() -> Unit = {}):
      SqsEventSourceProps {
    val builder = SqsEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun streamEventSourceProps(block: StreamEventSourcePropsDsl.() -> Unit = {}):
      StreamEventSourceProps {
    val builder = StreamEventSourcePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
