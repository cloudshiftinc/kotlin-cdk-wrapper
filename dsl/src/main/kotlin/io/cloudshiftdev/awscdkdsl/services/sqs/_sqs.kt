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

package io.cloudshiftdev.awscdkdsl.services.sqs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sqs.CfnQueue
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicy
import software.amazon.awscdk.services.sqs.CfnQueueInlinePolicyProps
import software.amazon.awscdk.services.sqs.CfnQueuePolicy
import software.amazon.awscdk.services.sqs.CfnQueuePolicyProps
import software.amazon.awscdk.services.sqs.CfnQueueProps
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.Queue
import software.amazon.awscdk.services.sqs.QueueAttributes
import software.amazon.awscdk.services.sqs.QueuePolicy
import software.amazon.awscdk.services.sqs.QueuePolicyProps
import software.amazon.awscdk.services.sqs.QueueProps
import software.amazon.awscdk.services.sqs.RedriveAllowPolicy
import software.constructs.Construct

public object sqs {
    /**
     * The `AWS::SQS::Queue` resource creates an Amazon SQS standard or FIFO queue.
     *
     * Keep the following caveats in mind:
     * * If you don't specify the `FifoQueue` property, Amazon SQS creates a standard queue.
     *
     * You can't change the queue type after you create it and you can't convert an existing
     * standard queue into a FIFO queue. You must either create a new FIFO queue for your
     * application or delete your existing standard queue and recreate it as a FIFO queue. For more
     * information, see
     * [Moving from a standard queue to a FIFO queue](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues-moving.html)
     * in the *Amazon SQS Developer Guide* .
     * * If you don't provide a value for a property, the queue is created with the default value
     *   for the property.
     * * If you delete a queue, you must wait at least 60 seconds before creating a queue with the
     *   same name.
     * * To successfully create a new queue, you must provide a queue name that adheres to the
     *   [limits related to queues](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/limits-queues.html)
     *   and is unique within the scope of your queues.
     *
     * For more information about creating FIFO (first-in-first-out) queues, see
     * [Creating an Amazon SQS queue ( AWS CloudFormation )](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/screate-queue-cloudformation.html)
     * in the *Amazon SQS Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object redriveAllowPolicy;
     * Object redrivePolicy;
     * CfnQueue cfnQueue = CfnQueue.Builder.create(this, "MyCfnQueue")
     * .contentBasedDeduplication(false)
     * .deduplicationScope("deduplicationScope")
     * .delaySeconds(123)
     * .fifoQueue(false)
     * .fifoThroughputLimit("fifoThroughputLimit")
     * .kmsDataKeyReusePeriodSeconds(123)
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .maximumMessageSize(123)
     * .messageRetentionPeriod(123)
     * .queueName("queueName")
     * .receiveMessageWaitTimeSeconds(123)
     * .redriveAllowPolicy(redriveAllowPolicy)
     * .redrivePolicy(redrivePolicy)
     * .sqsManagedSseEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .visibilityTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html)
     */
    public inline fun cfnQueue(
        scope: Construct,
        id: String,
        block: CfnQueueDsl.() -> Unit = {},
    ): CfnQueue {
        val builder = CfnQueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SQS::QueueInlinePolicy` resource associates one Amazon SQS queue with one policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object policyDocument;
     * CfnQueueInlinePolicy cfnQueueInlinePolicy = CfnQueueInlinePolicy.Builder.create(this,
     * "MyCfnQueueInlinePolicy")
     * .policyDocument(policyDocument)
     * .queue("queue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html)
     */
    public inline fun cfnQueueInlinePolicy(
        scope: Construct,
        id: String,
        block: CfnQueueInlinePolicyDsl.() -> Unit = {},
    ): CfnQueueInlinePolicy {
        val builder = CfnQueueInlinePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnQueueInlinePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object policyDocument;
     * CfnQueueInlinePolicyProps cfnQueueInlinePolicyProps = CfnQueueInlinePolicyProps.builder()
     * .policyDocument(policyDocument)
     * .queue("queue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queueinlinepolicy.html)
     */
    public inline fun cfnQueueInlinePolicyProps(
        block: CfnQueueInlinePolicyPropsDsl.() -> Unit = {}
    ): CfnQueueInlinePolicyProps {
        val builder = CfnQueueInlinePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::SQS::QueuePolicy` type applies a policy to Amazon SQS queues.
     *
     * For an example snippet, see
     * [Declaring an Amazon SQS policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-sqs-policy)
     * in the *AWS CloudFormation User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object policyDocument;
     * CfnQueuePolicy cfnQueuePolicy = CfnQueuePolicy.Builder.create(this, "MyCfnQueuePolicy")
     * .policyDocument(policyDocument)
     * .queues(List.of("queues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html)
     */
    public inline fun cfnQueuePolicy(
        scope: Construct,
        id: String,
        block: CfnQueuePolicyDsl.() -> Unit = {},
    ): CfnQueuePolicy {
        val builder = CfnQueuePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnQueuePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object policyDocument;
     * CfnQueuePolicyProps cfnQueuePolicyProps = CfnQueuePolicyProps.builder()
     * .policyDocument(policyDocument)
     * .queues(List.of("queues"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queuepolicy.html)
     */
    public inline fun cfnQueuePolicyProps(
        block: CfnQueuePolicyPropsDsl.() -> Unit = {}
    ): CfnQueuePolicyProps {
        val builder = CfnQueuePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnQueue`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Object redriveAllowPolicy;
     * Object redrivePolicy;
     * CfnQueueProps cfnQueueProps = CfnQueueProps.builder()
     * .contentBasedDeduplication(false)
     * .deduplicationScope("deduplicationScope")
     * .delaySeconds(123)
     * .fifoQueue(false)
     * .fifoThroughputLimit("fifoThroughputLimit")
     * .kmsDataKeyReusePeriodSeconds(123)
     * .kmsMasterKeyId("kmsMasterKeyId")
     * .maximumMessageSize(123)
     * .messageRetentionPeriod(123)
     * .queueName("queueName")
     * .receiveMessageWaitTimeSeconds(123)
     * .redriveAllowPolicy(redriveAllowPolicy)
     * .redrivePolicy(redrivePolicy)
     * .sqsManagedSseEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .visibilityTimeout(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sqs-queue.html)
     */
    public inline fun cfnQueueProps(block: CfnQueuePropsDsl.() -> Unit = {}): CfnQueueProps {
        val builder = CfnQueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Dead letter queue settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Queue queue;
     * DeadLetterQueue deadLetterQueue = DeadLetterQueue.builder()
     * .maxReceiveCount(123)
     * .queue(queue)
     * .build();
     * ```
     */
    public inline fun deadLetterQueue(block: DeadLetterQueueDsl.() -> Unit = {}): DeadLetterQueue {
        val builder = DeadLetterQueueDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A new Amazon SQS queue.
     *
     * Example:
     * ```
     * Queue sourceQueue;
     * Queue targetQueue;
     * SqsTarget pipeTarget = SqsTarget.Builder.create(targetQueue)
     * .inputTransformation(InputTransformation.fromObject(Map.of(
     * "SomeKey", DynamicInput.fromEventPath("$.body"))))
     * .build();
     * Pipe pipe = Pipe.Builder.create(this, "Pipe")
     * .source(new SomeSource(sourceQueue))
     * .target(pipeTarget)
     * .build();
     * ```
     */
    public inline fun queue(
        scope: Construct,
        id: String,
        block: QueueDsl.() -> Unit = {},
    ): Queue {
        val builder = QueueDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to a queue.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * QueueAttributes queueAttributes = QueueAttributes.builder()
     * .queueArn("queueArn")
     * // the properties below are optional
     * .fifo(false)
     * .keyArn("keyArn")
     * .queueName("queueName")
     * .queueUrl("queueUrl")
     * .build();
     * ```
     */
    public inline fun queueAttributes(block: QueueAttributesDsl.() -> Unit = {}): QueueAttributes {
        val builder = QueueAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy for an SQS Queue.
     *
     * Policies define the operations that are allowed on this resource.
     *
     * You almost never need to define this construct directly.
     *
     * All AWS resources that support resource policies have a method called
     * `addToResourcePolicy()`, which will automatically create a new resource policy if one doesn't
     * exist yet, otherwise it will add to the existing policy.
     *
     * Prefer to use `addToResourcePolicy()` instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Queue queue;
     * QueuePolicy queuePolicy = QueuePolicy.Builder.create(this, "MyQueuePolicy")
     * .queues(List.of(queue))
     * .build();
     * ```
     */
    public inline fun queuePolicy(
        scope: Construct,
        id: String,
        block: QueuePolicyDsl.() -> Unit = {},
    ): QueuePolicy {
        val builder = QueuePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to associate SQS queues with a policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.sqs.*;
     * Queue queue;
     * QueuePolicyProps queuePolicyProps = QueuePolicyProps.builder()
     * .queues(List.of(queue))
     * .build();
     * ```
     */
    public inline fun queuePolicyProps(
        block: QueuePolicyPropsDsl.() -> Unit = {}
    ): QueuePolicyProps {
        val builder = QueuePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a new Queue.
     *
     * Example:
     * ```
     * Topic topic = new Topic(this, "Topic");
     * Queue dlQueue = Queue.Builder.create(this, "DeadLetterQueue")
     * .queueName("MySubscription_DLQ")
     * .retentionPeriod(Duration.days(14))
     * .build();
     * Subscription.Builder.create(this, "Subscription")
     * .endpoint("endpoint")
     * .protocol(SubscriptionProtocol.LAMBDA)
     * .topic(topic)
     * .deadLetterQueue(dlQueue)
     * .build();
     * ```
     */
    public inline fun queueProps(block: QueuePropsDsl.() -> Unit = {}): QueueProps {
        val builder = QueuePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Permission settings for the dead letter source queue.
     *
     * Example:
     * ```
     * IQueue sourceQueue;
     * // Only the sourceQueue can specify this queue as the dead-letter queue.
     * Queue queue1 = Queue.Builder.create(this, "Queue2")
     * .redriveAllowPolicy(RedriveAllowPolicy.builder()
     * .sourceQueues(List.of(sourceQueue))
     * .build())
     * .build();
     * // No source queues can specify this queue as the dead-letter queue.
     * Queue queue2 = Queue.Builder.create(this, "Queue")
     * .redriveAllowPolicy(RedriveAllowPolicy.builder()
     * .redrivePermission(RedrivePermission.DENY_ALL)
     * .build())
     * .build();
     * ```
     */
    public inline fun redriveAllowPolicy(
        block: RedriveAllowPolicyDsl.() -> Unit = {}
    ): RedriveAllowPolicy {
        val builder = RedriveAllowPolicyDsl()
        builder.apply(block)
        return builder.build()
    }
}
