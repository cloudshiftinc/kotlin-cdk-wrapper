@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Reference to a new or existing Amazon SQS queue.
 */
public abstract class QueueBase(
  cdkObject: software.amazon.awscdk.services.sqs.QueueBase,
) : Resource(cdkObject),
    IQueue {
  /**
   * Adds a statement to the IAM resource policy associated with this queue.
   *
   * If this queue was created in this stack (`new Queue`), a queue policy
   * will be automatically created upon the first call to `addToPolicy`. If
   * the queue is imported (`Queue.import`), then this is a no-op.
   *
   * @param statement 
   */
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

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
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  /**
   * If this queue is server-side encrypted, this is the KMS encryption key.
   */
  public override fun encryptionMasterKey(): IKey? =
      unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  /**
   * Whether the contents of the queue are encrypted, and by what type of key.
   */
  public override fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  /**
   * Whether this queue is an Amazon SQS FIFO queue.
   *
   * If false, this is a standard queue.
   */
  public override fun fifo(): Boolean = unwrap(this).getFifo()

  /**
   * Grant the actions defined in queueActions to the identity Principal given on this SQS queue
   * resource.
   *
   * @param grantee Principal to grant right to. 
   * @param actions The actions to grant. 
   */
  public override fun grant(grantee: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
      *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

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
   * If encryption is used, permission to use the key to decrypt the contents of the queue will also
   * be granted to the same principal.
   *
   * This will grant the following KMS permissions:
   *
   * * kms:Decrypt
   *
   * @param grantee Principal to grant consume rights to. 
   */
  public override fun grantConsumeMessages(grantee: IGrantable): Grant =
      unwrap(this).grantConsumeMessages(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

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
  public override fun grantPurge(grantee: IGrantable): Grant =
      unwrap(this).grantPurge(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Grant access to send messages to a queue to the given identity.
   *
   * This will grant the following permissions:
   *
   * * sqs:SendMessage
   * * sqs:GetQueueAttributes
   * * sqs:GetQueueUrl
   *
   * If encryption is used, permission to use the key to encrypt/decrypt the contents of the queue
   * will also be granted to the same principal.
   *
   * This will grant the following KMS permissions:
   *
   * * kms:Decrypt
   * * kms:Encrypt
   * * kms:ReEncrypt*
   * * kms:GenerateDataKey*
   *
   * @param grantee Principal to grant send rights to. 
   */
  public override fun grantSendMessages(grantee: IGrantable): Grant =
      unwrap(this).grantSendMessages(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Queue.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateAgeOfOldestMessage(): Metric =
      unwrap(this).metricApproximateAgeOfOldestMessage().let(Metric::wrap)

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateAgeOfOldestMessage(props: MetricOptions): Metric =
      unwrap(this).metricApproximateAgeOfOldestMessage(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The approximate age of the oldest non-deleted message in the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
  public override fun metricApproximateAgeOfOldestMessage(props: MetricOptions.Builder.() -> Unit):
      Metric = metricApproximateAgeOfOldestMessage(MetricOptions(props))

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesDelayed(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesDelayed().let(Metric::wrap)

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesDelayed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages in the queue that are delayed and not available for reading immediately.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
  public override
      fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions.Builder.() -> Unit): Metric
      = metricApproximateNumberOfMessagesDelayed(MetricOptions(props))

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesNotVisible(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesNotVisible().let(Metric::wrap)

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesNotVisible(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages that are in flight.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
  public override
      fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions.Builder.() -> Unit):
      Metric = metricApproximateNumberOfMessagesNotVisible(MetricOptions(props))

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesVisible(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesVisible().let(Metric::wrap)

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricApproximateNumberOfMessagesVisible(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesVisible(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages available for retrieval from the queue.
   *
   * Maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
  public override
      fun metricApproximateNumberOfMessagesVisible(props: MetricOptions.Builder.() -> Unit): Metric
      = metricApproximateNumberOfMessagesVisible(MetricOptions(props))

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfEmptyReceives(): Metric =
      unwrap(this).metricNumberOfEmptyReceives().let(Metric::wrap)

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfEmptyReceives(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfEmptyReceives(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of ReceiveMessage API calls that did not return a message.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
  public override fun metricNumberOfEmptyReceives(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfEmptyReceives(MetricOptions(props))

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesDeleted(): Metric =
      unwrap(this).metricNumberOfMessagesDeleted().let(Metric::wrap)

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesDeleted(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesDeleted(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages deleted from the queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
  public override fun metricNumberOfMessagesDeleted(props: MetricOptions.Builder.() -> Unit): Metric
      = metricNumberOfMessagesDeleted(MetricOptions(props))

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesReceived(): Metric =
      unwrap(this).metricNumberOfMessagesReceived().let(Metric::wrap)

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesReceived(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesReceived(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages returned by calls to the ReceiveMessage action.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
  public override fun metricNumberOfMessagesReceived(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfMessagesReceived(MetricOptions(props))

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesSent(): Metric =
      unwrap(this).metricNumberOfMessagesSent().let(Metric::wrap)

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  public override fun metricNumberOfMessagesSent(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesSent(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The number of messages added to a queue.
   *
   * Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
  public override fun metricNumberOfMessagesSent(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfMessagesSent(MetricOptions(props))

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricSentMessageSize(): Metric =
      unwrap(this).metricSentMessageSize().let(Metric::wrap)

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricSentMessageSize(props: MetricOptions): Metric =
      unwrap(this).metricSentMessageSize(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * The size of messages added to a queue.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
  public override fun metricSentMessageSize(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSentMessageSize(MetricOptions(props))

  /**
   * The ARN of this queue.
   */
  public override fun queueArn(): String = unwrap(this).getQueueArn()

  /**
   * The name of this queue.
   */
  public override fun queueName(): String = unwrap(this).getQueueName()

  /**
   * The URL of this queue.
   */
  public override fun queueUrl(): String = unwrap(this).getQueueUrl()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sqs.QueueBase,
  ) : QueueBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueBase): QueueBase =
        CdkObjectWrappers.wrap(cdkObject) as? QueueBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueBase): software.amazon.awscdk.services.sqs.QueueBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.QueueBase
  }
}
