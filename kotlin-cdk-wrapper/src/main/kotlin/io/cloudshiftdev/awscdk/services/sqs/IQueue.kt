@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents an SQS queue.
 */
public interface IQueue : IResource {
  /**
   * Adds a statement to the IAM resource policy associated with this queue.
   *
   * If this queue was created in this stack (`new Queue`), a queue policy
   * will be automatically created upon the first call to `addToPolicy`. If
   * the queue is imported (`Queue.import`), then this is a no-op.
   *
   * @param statement 
   */
  public fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult

  /**
   * Adds a statement to the IAM resource policy associated with this queue.
   *
   * If this queue was created in this stack (`new Queue`), a queue policy
   * will be automatically created upon the first call to `addToPolicy`. If
   * the queue is imported (`Queue.import`), then this is a no-op.
   *
   * @param statement 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  /**
   * If this queue is server-side encrypted, this is the KMS encryption key.
   */
  public fun encryptionMasterKey(): IKey? = unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  /**
   * Whether the contents of the queue are encrypted, and by what type of key.
   */
  public fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  /**
   * Whether this queue is an Amazon SQS FIFO queue.
   *
   * If false, this is a standard queue.
   */
  public fun fifo(): Boolean

  /**
   * Grant the actions defined in queueActions to the identity Principal given on this SQS queue
   * resource.
   *
   * @param grantee Principal to grant right to. 
   * @param queueActions The actions to grant. 
   */
  public fun grant(grantee: IGrantable, vararg queueActions: String): Grant

  /**
   * Grant permissions to consume messages from a queue.
   *
   * This will grant the following permissions:
   *
   * * sqs:ChangeMessageVisibility
   * * sqs:DeleteMessage
   * * sqs:ReceiveMessage
   * * sqs:GetQueueAttributes
   * * sqs:GetQueueUrl
   *
   * @param grantee Principal to grant consume rights to. 
   */
  public fun grantConsumeMessages(grantee: IGrantable): Grant

  /**
   * Grant an IAM principal permissions to purge all messages from the queue.
   *
   * This will grant the following permissions:
   *
   * * sqs:PurgeQueue
   * * sqs:GetQueueAttributes
   * * sqs:GetQueueUrl
   *
   * @param grantee Principal to grant send rights to. 
   */
  public fun grantPurge(grantee: IGrantable): Grant

  /**
   * Grant access to send messages to a queue to the given identity.
   *
   * This will grant the following permissions:
   *
   * * sqs:SendMessage
   * * sqs:GetQueueAttributes
   * * sqs:GetQueueUrl
   *
   * @param grantee Principal to grant send rights to. 
   */
  public fun grantSendMessages(grantee: IGrantable): Grant

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateAgeOfOldestMessage(): Metric

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateAgeOfOldestMessage(props: MetricOptions): Metric

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
  public fun metricApproximateAgeOfOldestMessage(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesDelayed(): Metric

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions): Metric

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
  public fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesNotVisible(): Metric

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions): Metric

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
  public fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesVisible(): Metric

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public fun metricApproximateNumberOfMessagesVisible(props: MetricOptions): Metric

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
  public fun metricApproximateNumberOfMessagesVisible(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfEmptyReceives(): Metric

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfEmptyReceives(props: MetricOptions): Metric

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
  public fun metricNumberOfEmptyReceives(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesDeleted(): Metric

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesDeleted(props: MetricOptions): Metric

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
  public fun metricNumberOfMessagesDeleted(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesReceived(): Metric

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesReceived(props: MetricOptions): Metric

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
  public fun metricNumberOfMessagesReceived(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesSent(): Metric

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public fun metricNumberOfMessagesSent(props: MetricOptions): Metric

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
  public fun metricNumberOfMessagesSent(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricSentMessageSize(): Metric

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricSentMessageSize(props: MetricOptions): Metric

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
  public fun metricSentMessageSize(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The ARN of this queue.
   */
  public fun queueArn(): String

  /**
   * The name of this queue.
   */
  public fun queueName(): String

  /**
   * The URL of this queue.
   */
  public fun queueUrl(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.IQueue,
  ) : CdkObject(cdkObject), IQueue {
    /**
     * Adds a statement to the IAM resource policy associated with this queue.
     *
     * If this queue was created in this stack (`new Queue`), a queue policy
     * will be automatically created upon the first call to `addToPolicy`. If
     * the queue is imported (`Queue.import`), then this is a no-op.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Adds a statement to the IAM resource policy associated with this queue.
     *
     * If this queue was created in this stack (`new Queue`), a queue policy
     * will be automatically created upon the first call to `addToPolicy`. If
     * the queue is imported (`Queue.import`), then this is a no-op.
     *
     * @param statement 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * If this queue is server-side encrypted, this is the KMS encryption key.
     */
    override fun encryptionMasterKey(): IKey? =
        unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

    /**
     * Whether the contents of the queue are encrypted, and by what type of key.
     */
    override fun encryptionType(): QueueEncryption? =
        unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Whether this queue is an Amazon SQS FIFO queue.
     *
     * If false, this is a standard queue.
     */
    override fun fifo(): Boolean = unwrap(this).getFifo()

    /**
     * Grant the actions defined in queueActions to the identity Principal given on this SQS queue
     * resource.
     *
     * @param grantee Principal to grant right to. 
     * @param queueActions The actions to grant. 
     */
    override fun grant(grantee: IGrantable, vararg queueActions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap),
        *queueActions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Grant permissions to consume messages from a queue.
     *
     * This will grant the following permissions:
     *
     * * sqs:ChangeMessageVisibility
     * * sqs:DeleteMessage
     * * sqs:ReceiveMessage
     * * sqs:GetQueueAttributes
     * * sqs:GetQueueUrl
     *
     * @param grantee Principal to grant consume rights to. 
     */
    override fun grantConsumeMessages(grantee: IGrantable): Grant =
        unwrap(this).grantConsumeMessages(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant an IAM principal permissions to purge all messages from the queue.
     *
     * This will grant the following permissions:
     *
     * * sqs:PurgeQueue
     * * sqs:GetQueueAttributes
     * * sqs:GetQueueUrl
     *
     * @param grantee Principal to grant send rights to. 
     */
    override fun grantPurge(grantee: IGrantable): Grant =
        unwrap(this).grantPurge(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant access to send messages to a queue to the given identity.
     *
     * This will grant the following permissions:
     *
     * * sqs:SendMessage
     * * sqs:GetQueueAttributes
     * * sqs:GetQueueUrl
     *
     * @param grantee Principal to grant send rights to. 
     */
    override fun grantSendMessages(grantee: IGrantable): Grant =
        unwrap(this).grantSendMessages(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Return the given named metric for this Queue.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this Queue.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this Queue.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The approximate age of the oldest non-deleted message in the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateAgeOfOldestMessage(): Metric =
        unwrap(this).metricApproximateAgeOfOldestMessage().let(Metric::wrap)

    /**
     * The approximate age of the oldest non-deleted message in the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateAgeOfOldestMessage(props: MetricOptions): Metric =
        unwrap(this).metricApproximateAgeOfOldestMessage(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The approximate age of the oldest non-deleted message in the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
    override fun metricApproximateAgeOfOldestMessage(props: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateAgeOfOldestMessage(MetricOptions(props))

    /**
     * The number of messages in the queue that are delayed and not available for reading
     * immediately.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesDelayed(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesDelayed().let(Metric::wrap)

    /**
     * The number of messages in the queue that are delayed and not available for reading
     * immediately.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesDelayed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages in the queue that are delayed and not available for reading
     * immediately.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
    override fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesDelayed(MetricOptions(props))

    /**
     * The number of messages that are in flight.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesNotVisible(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesNotVisible().let(Metric::wrap)

    /**
     * The number of messages that are in flight.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesNotVisible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages that are in flight.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
    override
        fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesNotVisible(MetricOptions(props))

    /**
     * The number of messages available for retrieval from the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesVisible(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesVisible().let(Metric::wrap)

    /**
     * The number of messages available for retrieval from the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    override fun metricApproximateNumberOfMessagesVisible(props: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesVisible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages available for retrieval from the queue.
     *
     * Maximum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
    override fun metricApproximateNumberOfMessagesVisible(props: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesVisible(MetricOptions(props))

    /**
     * The number of ReceiveMessage API calls that did not return a message.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfEmptyReceives(): Metric =
        unwrap(this).metricNumberOfEmptyReceives().let(Metric::wrap)

    /**
     * The number of ReceiveMessage API calls that did not return a message.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfEmptyReceives(props: MetricOptions): Metric =
        unwrap(this).metricNumberOfEmptyReceives(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of ReceiveMessage API calls that did not return a message.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
    override fun metricNumberOfEmptyReceives(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfEmptyReceives(MetricOptions(props))

    /**
     * The number of messages deleted from the queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesDeleted(): Metric =
        unwrap(this).metricNumberOfMessagesDeleted().let(Metric::wrap)

    /**
     * The number of messages deleted from the queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesDeleted(props: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesDeleted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages deleted from the queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
    override fun metricNumberOfMessagesDeleted(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesDeleted(MetricOptions(props))

    /**
     * The number of messages returned by calls to the ReceiveMessage action.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesReceived(): Metric =
        unwrap(this).metricNumberOfMessagesReceived().let(Metric::wrap)

    /**
     * The number of messages returned by calls to the ReceiveMessage action.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesReceived(props: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesReceived(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages returned by calls to the ReceiveMessage action.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
    override fun metricNumberOfMessagesReceived(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesReceived(MetricOptions(props))

    /**
     * The number of messages added to a queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesSent(): Metric =
        unwrap(this).metricNumberOfMessagesSent().let(Metric::wrap)

    /**
     * The number of messages added to a queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    override fun metricNumberOfMessagesSent(props: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesSent(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of messages added to a queue.
     *
     * Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
    override fun metricNumberOfMessagesSent(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesSent(MetricOptions(props))

    /**
     * The size of messages added to a queue.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricSentMessageSize(): Metric =
        unwrap(this).metricSentMessageSize().let(Metric::wrap)

    /**
     * The size of messages added to a queue.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricSentMessageSize(props: MetricOptions): Metric =
        unwrap(this).metricSentMessageSize(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The size of messages added to a queue.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
    override fun metricSentMessageSize(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSentMessageSize(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The ARN of this queue.
     */
    override fun queueArn(): String = unwrap(this).getQueueArn()

    /**
     * The name of this queue.
     */
    override fun queueName(): String = unwrap(this).getQueueName()

    /**
     * The URL of this queue.
     */
    override fun queueUrl(): String = unwrap(this).getQueueUrl()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.IQueue): IQueue =
        CdkObjectWrappers.wrap(cdkObject) as? IQueue ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IQueue): software.amazon.awscdk.services.sqs.IQueue = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sqs.IQueue
  }
}
