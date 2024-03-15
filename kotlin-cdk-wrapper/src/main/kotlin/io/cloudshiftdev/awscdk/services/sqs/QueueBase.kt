@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
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

public abstract class QueueBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sqs.QueueBase,
) : Resource(cdkObject), IQueue {
  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun encryptionMasterKey(): IKey? =
      unwrap(this).getEncryptionMasterKey()?.let(IKey::wrap)

  public override fun encryptionType(): QueueEncryption? =
      unwrap(this).getEncryptionType()?.let(QueueEncryption::wrap)

  public override fun fifo(): Boolean = unwrap(this).getFifo()

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantConsumeMessages(grantee: IGrantable): Grant =
      unwrap(this).grantConsumeMessages(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPurge(grantee: IGrantable): Grant =
      unwrap(this).grantPurge(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantSendMessages(grantee: IGrantable): Grant =
      unwrap(this).grantSendMessages(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricApproximateAgeOfOldestMessage(): Metric =
      unwrap(this).metricApproximateAgeOfOldestMessage().let(Metric::wrap)

  public override fun metricApproximateAgeOfOldestMessage(props: MetricOptions): Metric =
      unwrap(this).metricApproximateAgeOfOldestMessage(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bb447dbf2a82c05bdfcd7dcd24abf2ca95a39f1b33a13e2394e3ae4232332ada")
  public override fun metricApproximateAgeOfOldestMessage(props: MetricOptions.Builder.() -> Unit):
      Metric = metricApproximateAgeOfOldestMessage(MetricOptions(props))

  public override fun metricApproximateNumberOfMessagesDelayed(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesDelayed().let(Metric::wrap)

  public override fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesDelayed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ec20e8b1c6fa8dfa1811d5d75d734a7f4ccef6a8b1fc748ab047cd2c8a6b70a9")
  public override
      fun metricApproximateNumberOfMessagesDelayed(props: MetricOptions.Builder.() -> Unit): Metric
      = metricApproximateNumberOfMessagesDelayed(MetricOptions(props))

  public override fun metricApproximateNumberOfMessagesNotVisible(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesNotVisible().let(Metric::wrap)

  public override fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesNotVisible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e0e358f95f85dcccfdbf1e95cf401c51e0960552cdad28bac191cfd56faf4b1")
  public override
      fun metricApproximateNumberOfMessagesNotVisible(props: MetricOptions.Builder.() -> Unit):
      Metric = metricApproximateNumberOfMessagesNotVisible(MetricOptions(props))

  public override fun metricApproximateNumberOfMessagesVisible(): Metric =
      unwrap(this).metricApproximateNumberOfMessagesVisible().let(Metric::wrap)

  public override fun metricApproximateNumberOfMessagesVisible(props: MetricOptions): Metric =
      unwrap(this).metricApproximateNumberOfMessagesVisible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d90f82144565dad643479d1bf8c90cfa7841f02407b91ae1f30ecd1738076f01")
  public override
      fun metricApproximateNumberOfMessagesVisible(props: MetricOptions.Builder.() -> Unit): Metric
      = metricApproximateNumberOfMessagesVisible(MetricOptions(props))

  public override fun metricNumberOfEmptyReceives(): Metric =
      unwrap(this).metricNumberOfEmptyReceives().let(Metric::wrap)

  public override fun metricNumberOfEmptyReceives(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfEmptyReceives(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2cfecb20f0f28f71404e98cd81ef7bae26ed306a74d315ae104a3740d5323cc8")
  public override fun metricNumberOfEmptyReceives(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfEmptyReceives(MetricOptions(props))

  public override fun metricNumberOfMessagesDeleted(): Metric =
      unwrap(this).metricNumberOfMessagesDeleted().let(Metric::wrap)

  public override fun metricNumberOfMessagesDeleted(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesDeleted(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("43f4c13dd245a3194abcc55746b35f7f0f0efcc0f74c3a7b9a32d11805492932")
  public override fun metricNumberOfMessagesDeleted(props: MetricOptions.Builder.() -> Unit): Metric
      = metricNumberOfMessagesDeleted(MetricOptions(props))

  public override fun metricNumberOfMessagesReceived(): Metric =
      unwrap(this).metricNumberOfMessagesReceived().let(Metric::wrap)

  public override fun metricNumberOfMessagesReceived(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesReceived(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2068c34cb94ecf96b8a1cf0fd6d58ebfd3ac48f69d718af0bdd6c1a31d866f18")
  public override fun metricNumberOfMessagesReceived(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfMessagesReceived(MetricOptions(props))

  public override fun metricNumberOfMessagesSent(): Metric =
      unwrap(this).metricNumberOfMessagesSent().let(Metric::wrap)

  public override fun metricNumberOfMessagesSent(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesSent(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b2902186b84a01800470ae306a0422607a541d9a2cde3513fb6f67fcec9eca13")
  public override fun metricNumberOfMessagesSent(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfMessagesSent(MetricOptions(props))

  public override fun metricSentMessageSize(): Metric =
      unwrap(this).metricSentMessageSize().let(Metric::wrap)

  public override fun metricSentMessageSize(props: MetricOptions): Metric =
      unwrap(this).metricSentMessageSize(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f744b4a69e8a4f4581ffdd347d3f50ff19bcd06ea1a2cae6fea703890c06cfdf")
  public override fun metricSentMessageSize(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSentMessageSize(MetricOptions(props))

  public override fun queueArn(): String = unwrap(this).getQueueArn()

  public override fun queueName(): String = unwrap(this).getQueueName()

  public override fun queueUrl(): String = unwrap(this).getQueueUrl()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.QueueBase,
  ) : QueueBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.QueueBase): QueueBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: QueueBase): software.amazon.awscdk.services.sqs.QueueBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.QueueBase
  }
}
