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

package io.cloudshiftdev.awscdkdsl.services.lambda.eventsources

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
    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigateway.*;
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * Authorizer authorizer;
     * Model model;
     * RequestValidator requestValidator;
     * ApiEventSource apiEventSource = ApiEventSource.Builder.create("method", "path")
     * .apiKeyRequired(false)
     * .authorizationScopes(List.of("authorizationScopes"))
     * .authorizationType(AuthorizationType.NONE)
     * .authorizer(authorizer)
     * .methodResponses(List.of(MethodResponse.builder()
     * .statusCode("statusCode")
     * // the properties below are optional
     * .responseModels(Map.of(
     * "responseModelsKey", model))
     * .responseParameters(Map.of(
     * "responseParametersKey", false))
     * .build()))
     * .operationName("operationName")
     * .requestModels(Map.of(
     * "requestModelsKey", model))
     * .requestParameters(Map.of(
     * "requestParametersKey", false))
     * .requestValidator(requestValidator)
     * .requestValidatorOptions(RequestValidatorOptions.builder()
     * .requestValidatorName("requestValidatorName")
     * .validateRequestBody(false)
     * .validateRequestParameters(false)
     * .build())
     * .build();
     * ```
     */
    public inline fun apiEventSource(
        method: String,
        path: String,
        block: ApiEventSourceDsl.() -> Unit = {},
    ): ApiEventSource {
        val builder = ApiEventSourceDsl(method, path)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of properties for streaming event sources shared by Dynamo, Kinesis and Kafka.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * BaseStreamEventSourceProps baseStreamEventSourceProps = BaseStreamEventSourceProps.builder()
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * // the properties below are optional
     * .batchSize(123)
     * .enabled(false)
     * .maxBatchingWindow(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun baseStreamEventSourceProps(
        block: BaseStreamEventSourcePropsDsl.() -> Unit = {}
    ): BaseStreamEventSourceProps {
        val builder = BaseStreamEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an Amazon DynamoDB stream as an event source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * import software.amazon.awscdk.services.dynamodb.*;
     * Function fn;
     * Table table = Table.Builder.create(this, "Table")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .stream(StreamViewType.NEW_IMAGE)
     * .build();
     * fn.addEventSource(DynamoEventSource.Builder.create(table)
     * .startingPosition(StartingPosition.LATEST)
     * .filters(List.of(FilterCriteria.filter(Map.of("eventName", FilterRule.isEqual("INSERT")))))
     * .build());
     * ```
     */
    public inline fun dynamoEventSource(
        table: ITable,
        block: DynamoEventSourceDsl.() -> Unit = {}
    ): DynamoEventSource {
        val builder = DynamoEventSourceDsl(table)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * import software.amazon.awscdk.services.dynamodb.*;
     * Function fn;
     * Table table = Table.Builder.create(this, "Table")
     * .partitionKey(Attribute.builder()
     * .name("id")
     * .type(AttributeType.STRING)
     * .build())
     * .stream(StreamViewType.NEW_IMAGE)
     * .build();
     * fn.addEventSource(DynamoEventSource.Builder.create(table)
     * .startingPosition(StartingPosition.LATEST)
     * .filters(List.of(FilterCriteria.filter(Map.of("eventName", FilterRule.isEqual("INSERT")))))
     * .build());
     * ```
     */
    public inline fun dynamoEventSourceProps(
        block: DynamoEventSourcePropsDsl.() -> Unit = {}
    ): DynamoEventSourceProps {
        val builder = DynamoEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Kafka event source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * import software.amazon.awscdk.services.secretsmanager.*;
     * Object filters;
     * Secret secret;
     * KafkaEventSourceProps kafkaEventSourceProps = KafkaEventSourceProps.builder()
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .topic("topic")
     * // the properties below are optional
     * .batchSize(123)
     * .consumerGroupId("consumerGroupId")
     * .enabled(false)
     * .filters(List.of(Map.of(
     * "filtersKey", filters)))
     * .maxBatchingWindow(Duration.minutes(30))
     * .secret(secret)
     * .build();
     * ```
     */
    public inline fun kafkaEventSourceProps(
        block: KafkaEventSourcePropsDsl.() -> Unit = {}
    ): KafkaEventSourceProps {
        val builder = KafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an Amazon Kinesis stream as an event source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.kinesis.*;
     * import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource;
     * Function myFunction;
     * Stream stream = new Stream(this, "MyStream");
     * myFunction.addEventSource(KinesisEventSource.Builder.create(stream)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun kinesisEventSource(
        stream: IStream,
        block: KinesisEventSourceDsl.() -> Unit = {}
    ): KinesisEventSource {
        val builder = KinesisEventSourceDsl(stream)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.kinesis.*;
     * import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSource;
     * Function myFunction;
     * Stream stream = new Stream(this, "MyStream");
     * myFunction.addEventSource(KinesisEventSource.Builder.create(stream)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun kinesisEventSourceProps(
        block: KinesisEventSourcePropsDsl.() -> Unit = {}
    ): KinesisEventSourceProps {
        val builder = KinesisEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a MSK cluster as a streaming source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.secretsmanager.Secret;
     * import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
     * Function myFunction;
     * // Your MSK cluster arn
     * String clusterArn =
     * "arn:aws:kafka:us-east-1:0123456789019:cluster/SalesCluster/abcd1234-abcd-cafe-abab-9876543210ab-4";
     * // The Kafka topic you want to subscribe to
     * String topic = "some-cool-topic";
     * // The secret that allows access to your MSK cluster
     * // You still have to make sure that it is associated with your cluster as described in the
     * documentation
     * Secret secret = Secret.Builder.create(this,
     * "Secret").secretName("AmazonMSK_KafkaSecret").build();
     * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
     * .clusterArn(clusterArn)
     * .topic(topic)
     * .secret(secret)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun managedKafkaEventSource(
        block: ManagedKafkaEventSourceDsl.() -> Unit = {}
    ): ManagedKafkaEventSource {
        val builder = ManagedKafkaEventSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a MSK event source.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.secretsmanager.Secret;
     * import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
     * Function myFunction;
     * // Your MSK cluster arn
     * String clusterArn =
     * "arn:aws:kafka:us-east-1:0123456789019:cluster/SalesCluster/abcd1234-abcd-cafe-abab-9876543210ab-4";
     * // The Kafka topic you want to subscribe to
     * String topic = "some-cool-topic";
     * // The secret that allows access to your MSK cluster
     * // You still have to make sure that it is associated with your cluster as described in the
     * documentation
     * Secret secret = Secret.Builder.create(this,
     * "Secret").secretName("AmazonMSK_KafkaSecret").build();
     * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
     * .clusterArn(clusterArn)
     * .topic(topic)
     * .secret(secret)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun managedKafkaEventSourceProps(
        block: ManagedKafkaEventSourcePropsDsl.() -> Unit = {}
    ): ManagedKafkaEventSourceProps {
        val builder = ManagedKafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use S3 bucket notifications as an event source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * import software.amazon.awscdk.services.s3.*;
     * Function fn;
     * Bucket bucket = new Bucket(this, "Bucket");
     * fn.addEventSource(S3EventSource.Builder.create(bucket)
     * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
     * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
     * .build());
     * ```
     */
    public inline fun s3EventSource(
        bucket: Bucket,
        block: S3EventSourceDsl.() -> Unit = {}
    ): S3EventSource {
        val builder = S3EventSourceDsl(bucket)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * import software.amazon.awscdk.services.s3.*;
     * Function fn;
     * Bucket bucket = new Bucket(this, "Bucket");
     * fn.addEventSource(S3EventSource.Builder.create(bucket)
     * .events(List.of(EventType.OBJECT_CREATED, EventType.OBJECT_REMOVED))
     * .filters(List.of(NotificationKeyFilter.builder().prefix("subdir/").build()))
     * .build());
     * ```
     */
    public inline fun s3EventSourceProps(
        block: S3EventSourcePropsDsl.() -> Unit = {}
    ): S3EventSourceProps {
        val builder = S3EventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use a self hosted Kafka installation as a streaming source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.secretsmanager.Secret;
     * import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource;
     * // The secret that allows access to your self hosted Kafka cluster
     * Secret secret;
     * Function myFunction;
     * // The list of Kafka brokers
     * String[] bootstrapServers = List.of("kafka-broker:9092");
     * // The Kafka topic you want to subscribe to
     * String topic = "some-cool-topic";
     * // (Optional) The consumer group id to use when connecting to the Kafka broker. If omitted the
     * UUID of the event source mapping will be used.
     * String consumerGroupId = "my-consumer-group-id";
     * myFunction.addEventSource(SelfManagedKafkaEventSource.Builder.create()
     * .bootstrapServers(bootstrapServers)
     * .topic(topic)
     * .consumerGroupId(consumerGroupId)
     * .secret(secret)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun selfManagedKafkaEventSource(
        block: SelfManagedKafkaEventSourceDsl.() -> Unit = {}
    ): SelfManagedKafkaEventSource {
        val builder = SelfManagedKafkaEventSourceDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a self managed Kafka cluster event source.
     *
     * If your Kafka cluster is only reachable via VPC make sure to configure it.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.secretsmanager.Secret;
     * import software.amazon.awscdk.services.lambda.eventsources.SelfManagedKafkaEventSource;
     * // The secret that allows access to your self hosted Kafka cluster
     * Secret secret;
     * Function myFunction;
     * // The list of Kafka brokers
     * String[] bootstrapServers = List.of("kafka-broker:9092");
     * // The Kafka topic you want to subscribe to
     * String topic = "some-cool-topic";
     * // (Optional) The consumer group id to use when connecting to the Kafka broker. If omitted the
     * UUID of the event source mapping will be used.
     * String consumerGroupId = "my-consumer-group-id";
     * myFunction.addEventSource(SelfManagedKafkaEventSource.Builder.create()
     * .bootstrapServers(bootstrapServers)
     * .topic(topic)
     * .consumerGroupId(consumerGroupId)
     * .secret(secret)
     * .batchSize(100) // default
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * .build());
     * ```
     */
    public inline fun selfManagedKafkaEventSourceProps(
        block: SelfManagedKafkaEventSourcePropsDsl.() -> Unit = {}
    ): SelfManagedKafkaEventSourceProps {
        val builder = SelfManagedKafkaEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an Amazon SNS topic as an event source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource;
     * Topic topic;
     * Function fn;
     * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
     * fn.addEventSource(SnsEventSource.Builder.create(topic)
     * .filterPolicy(Map.of())
     * .deadLetterQueue(deadLetterQueue)
     * .build());
     * ```
     */
    public inline fun snsEventSource(
        topic: ITopic,
        block: SnsEventSourceDsl.() -> Unit = {}
    ): SnsEventSource {
        val builder = SnsEventSourceDsl(topic)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties forwarded to the Lambda Subscription.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.sns.*;
     * import software.amazon.awscdk.services.lambda.eventsources.SnsEventSource;
     * Topic topic;
     * Function fn;
     * Queue deadLetterQueue = new Queue(this, "deadLetterQueue");
     * fn.addEventSource(SnsEventSource.Builder.create(topic)
     * .filterPolicy(Map.of())
     * .deadLetterQueue(deadLetterQueue)
     * .build());
     * ```
     */
    public inline fun snsEventSourceProps(
        block: SnsEventSourcePropsDsl.() -> Unit = {}
    ): SnsEventSourceProps {
        val builder = SnsEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use an Amazon SQS queue as an event source for AWS Lambda.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.SqsEventSource;
     * Function fn;
     * Queue queue = new Queue(this, "MyQueue");
     * SqsEventSource eventSource = new SqsEventSource(queue);
     * fn.addEventSource(eventSource);
     * String eventSourceId = eventSource.getEventSourceMappingId();
     * String eventSourceMappingArn = eventSource.getEventSourceMappingArn();
     * ```
     */
    public inline fun sqsEventSource(
        queue: IQueue,
        block: SqsEventSourceDsl.() -> Unit = {}
    ): SqsEventSource {
        val builder = SqsEventSourceDsl(queue)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.eventsources.SqsEventSource;
     * Function fn;
     * Queue queue = Queue.Builder.create(this, "MyQueue")
     * .visibilityTimeout(Duration.seconds(30)) // default,
     * .receiveMessageWaitTime(Duration.seconds(20))
     * .build();
     * fn.addEventSource(SqsEventSource.Builder.create(queue)
     * .batchSize(10) // default
     * .maxBatchingWindow(Duration.minutes(5))
     * .reportBatchItemFailures(true)
     * .build());
     * ```
     */
    public inline fun sqsEventSourceProps(
        block: SqsEventSourcePropsDsl.() -> Unit = {}
    ): SqsEventSourceProps {
        val builder = SqsEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of properties for streaming event sources shared by Dynamo and Kinesis.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.services.lambda.eventsources.*;
     * IEventSourceDlq eventSourceDlq;
     * Object filters;
     * StreamEventSourceProps streamEventSourceProps = StreamEventSourceProps.builder()
     * .startingPosition(StartingPosition.TRIM_HORIZON)
     * // the properties below are optional
     * .batchSize(123)
     * .bisectBatchOnError(false)
     * .enabled(false)
     * .filters(List.of(Map.of(
     * "filtersKey", filters)))
     * .maxBatchingWindow(Duration.minutes(30))
     * .maxRecordAge(Duration.minutes(30))
     * .onFailure(eventSourceDlq)
     * .parallelizationFactor(123)
     * .reportBatchItemFailures(false)
     * .retryAttempts(123)
     * .tumblingWindow(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun streamEventSourceProps(
        block: StreamEventSourcePropsDsl.() -> Unit = {}
    ): StreamEventSourceProps {
        val builder = StreamEventSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
