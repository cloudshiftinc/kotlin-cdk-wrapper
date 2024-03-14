package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IQueue : IResource {
  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun encryptionMasterKey(): IKey? = unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  public fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  public fun fifo(): Boolean

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantConsumeMessages(arg0: IGrantable): Grant

  public fun grantPurge(arg0: IGrantable): Grant

  public fun grantSendMessages(arg0: IGrantable): Grant

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricApproximateAgeOfOldestMessage(): Metric

  public fun metricApproximateAgeOfOldestMessage(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
  public fun metricApproximateAgeOfOldestMessage(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricApproximateNumberOfMessagesDelayed(): Metric

  public fun metricApproximateNumberOfMessagesDelayed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
  public fun metricApproximateNumberOfMessagesDelayed(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun metricApproximateNumberOfMessagesNotVisible(): Metric

  public fun metricApproximateNumberOfMessagesNotVisible(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
  public fun metricApproximateNumberOfMessagesNotVisible(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun metricApproximateNumberOfMessagesVisible(): Metric

  public fun metricApproximateNumberOfMessagesVisible(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
  public fun metricApproximateNumberOfMessagesVisible(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun metricNumberOfEmptyReceives(): Metric

  public fun metricNumberOfEmptyReceives(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
  public fun metricNumberOfEmptyReceives(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfMessagesDeleted(): Metric

  public fun metricNumberOfMessagesDeleted(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
  public fun metricNumberOfMessagesDeleted(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfMessagesReceived(): Metric

  public fun metricNumberOfMessagesReceived(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
  public fun metricNumberOfMessagesReceived(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfMessagesSent(): Metric

  public fun metricNumberOfMessagesSent(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
  public fun metricNumberOfMessagesSent(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSentMessageSize(): Metric

  public fun metricSentMessageSize(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
  public fun metricSentMessageSize(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun queueArn(): String

  public fun queueName(): String

  public fun queueUrl(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sqs.IQueue,
  ) : IQueue {
    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun encryptionMasterKey(): IKey? =
        unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

    override fun encryptionType(): QueueEncryption? =
        unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun fifo(): Boolean = unwrap(this).getFifo()

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantConsumeMessages(arg0: IGrantable): Grant =
        unwrap(this).grantConsumeMessages(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPurge(arg0: IGrantable): Grant =
        unwrap(this).grantPurge(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantSendMessages(arg0: IGrantable): Grant =
        unwrap(this).grantSendMessages(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricApproximateAgeOfOldestMessage(): Metric =
        unwrap(this).metricApproximateAgeOfOldestMessage().let(Metric::wrap)

    override fun metricApproximateAgeOfOldestMessage(arg0: MetricOptions): Metric =
        unwrap(this).metricApproximateAgeOfOldestMessage(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
    override fun metricApproximateAgeOfOldestMessage(arg0: MetricOptions.Builder.() -> Unit): Metric
        = metricApproximateAgeOfOldestMessage(MetricOptions(arg0))

    override fun metricApproximateNumberOfMessagesDelayed(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesDelayed().let(Metric::wrap)

    override fun metricApproximateNumberOfMessagesDelayed(arg0: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesDelayed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
    override fun metricApproximateNumberOfMessagesDelayed(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesDelayed(MetricOptions(arg0))

    override fun metricApproximateNumberOfMessagesNotVisible(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesNotVisible().let(Metric::wrap)

    override fun metricApproximateNumberOfMessagesNotVisible(arg0: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesNotVisible(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
    override
        fun metricApproximateNumberOfMessagesNotVisible(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesNotVisible(MetricOptions(arg0))

    override fun metricApproximateNumberOfMessagesVisible(): Metric =
        unwrap(this).metricApproximateNumberOfMessagesVisible().let(Metric::wrap)

    override fun metricApproximateNumberOfMessagesVisible(arg0: MetricOptions): Metric =
        unwrap(this).metricApproximateNumberOfMessagesVisible(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
    override fun metricApproximateNumberOfMessagesVisible(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricApproximateNumberOfMessagesVisible(MetricOptions(arg0))

    override fun metricNumberOfEmptyReceives(): Metric =
        unwrap(this).metricNumberOfEmptyReceives().let(Metric::wrap)

    override fun metricNumberOfEmptyReceives(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfEmptyReceives(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
    override fun metricNumberOfEmptyReceives(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfEmptyReceives(MetricOptions(arg0))

    override fun metricNumberOfMessagesDeleted(): Metric =
        unwrap(this).metricNumberOfMessagesDeleted().let(Metric::wrap)

    override fun metricNumberOfMessagesDeleted(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesDeleted(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
    override fun metricNumberOfMessagesDeleted(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesDeleted(MetricOptions(arg0))

    override fun metricNumberOfMessagesReceived(): Metric =
        unwrap(this).metricNumberOfMessagesReceived().let(Metric::wrap)

    override fun metricNumberOfMessagesReceived(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesReceived(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
    override fun metricNumberOfMessagesReceived(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesReceived(MetricOptions(arg0))

    override fun metricNumberOfMessagesSent(): Metric =
        unwrap(this).metricNumberOfMessagesSent().let(Metric::wrap)

    override fun metricNumberOfMessagesSent(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesSent(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
    override fun metricNumberOfMessagesSent(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesSent(MetricOptions(arg0))

    override fun metricSentMessageSize(): Metric =
        unwrap(this).metricSentMessageSize().let(Metric::wrap)

    override fun metricSentMessageSize(arg0: MetricOptions): Metric =
        unwrap(this).metricSentMessageSize(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
    override fun metricSentMessageSize(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSentMessageSize(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun queueArn(): String = unwrap(this).getQueueArn()

    override fun queueName(): String = unwrap(this).getQueueName()

    override fun queueUrl(): String = unwrap(this).getQueueUrl()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.IQueue): IQueue =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IQueue): software.amazon.awscdk.services.sqs.IQueue = (wrapped as
        Wrapper).cdkObject
  }
}
