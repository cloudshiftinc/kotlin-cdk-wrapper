package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class TopicBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sns.TopicBase,
) : Resource(cdkObject), ITopic {
  public override fun addSubscription(topicSubscription: ITopicSubscription): Subscription =
      unwrap(this).addSubscription(topicSubscription.let(ITopicSubscription::unwrap)).let(Subscription::wrap)

  public override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
      unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

  public override fun bindAsNotificationRuleTarget(_scope: Construct): NotificationRuleTargetConfig
      =
      unwrap(this).bindAsNotificationRuleTarget(_scope.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)

  public override fun contentBasedDeduplication(): Boolean =
      unwrap(this).getContentBasedDeduplication()

  public override fun fifo(): Boolean = unwrap(this).getFifo()

  public override fun grantPublish(grantee: IGrantable): Grant =
      unwrap(this).grantPublish(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricNumberOfMessagesPublished(): Metric =
      unwrap(this).metricNumberOfMessagesPublished().let(Metric::wrap)

  public override fun metricNumberOfMessagesPublished(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfMessagesPublished(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0debfcf68c56186b6266a690fc01d2ba469d215e82968a201c09ce0d090a76e3")
  public override fun metricNumberOfMessagesPublished(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfMessagesPublished(MetricOptions(props))

  public override fun metricNumberOfNotificationsDelivered(): Metric =
      unwrap(this).metricNumberOfNotificationsDelivered().let(Metric::wrap)

  public override fun metricNumberOfNotificationsDelivered(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsDelivered(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fca8e127970064d20533907387181b36ec7f4b132b5beff585ad498f1ef8ad75")
  public override fun metricNumberOfNotificationsDelivered(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsDelivered(MetricOptions(props))

  public override fun metricNumberOfNotificationsFailed(): Metric =
      unwrap(this).metricNumberOfNotificationsFailed().let(Metric::wrap)

  public override fun metricNumberOfNotificationsFailed(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFailed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ed1623b02cee0cbde24236106b0c18d58a20040a199e944a7ab04cbe1bbd6b")
  public override fun metricNumberOfNotificationsFailed(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFailed(MetricOptions(props))

  public override fun metricNumberOfNotificationsFilteredOut(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOut().let(Metric::wrap)

  public override fun metricNumberOfNotificationsFilteredOut(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOut(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35bf7baed1f2513c6d518c8e354540bd10d44f78c65887bd91dc386c7f40f118")
  public override
      fun metricNumberOfNotificationsFilteredOut(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNumberOfNotificationsFilteredOut(MetricOptions(props))

  public override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes().let(Metric::wrap)

  public override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions):
      Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cdc48475cf159c4f09f26890c23c3be742d9b8a23ee337cbc982f1eb0925661")
  public override
      fun metricNumberOfNotificationsFilteredOutInvalidAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFilteredOutInvalidAttributes(MetricOptions(props))

  public override fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes().let(Metric::wrap)

  public override
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions): Metric =
      unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("408205240c218c91b27bb4cc760b4d5578900fab2917dbd7f4298dcd3819bede")
  public override
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNumberOfNotificationsFilteredOutNoMessageAttributes(MetricOptions(props))

  public override fun metricPublishSize(): Metric =
      unwrap(this).metricPublishSize().let(Metric::wrap)

  public override fun metricPublishSize(props: MetricOptions): Metric =
      unwrap(this).metricPublishSize(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d6140038736d11b4192a6bdec41905dbc513ee58f0615aae521c826fa6ea59")
  public override fun metricPublishSize(props: MetricOptions.Builder.() -> Unit): Metric =
      metricPublishSize(MetricOptions(props))

  public override fun metricSmsMonthToDateSpentUsd(): Metric =
      unwrap(this).metricSMSMonthToDateSpentUSD().let(Metric::wrap)

  public override fun metricSmsMonthToDateSpentUsd(props: MetricOptions): Metric =
      unwrap(this).metricSMSMonthToDateSpentUSD(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f5bf7d95644305938cdde06436a98bf86c5b1c175ce1e9a467fda47d6a49663")
  public override fun metricSmsMonthToDateSpentUsd(props: MetricOptions.Builder.() -> Unit): Metric
      = metricSmsMonthToDateSpentUsd(MetricOptions(props))

  public override fun metricSmsSuccessRate(): Metric =
      unwrap(this).metricSMSSuccessRate().let(Metric::wrap)

  public override fun metricSmsSuccessRate(props: MetricOptions): Metric =
      unwrap(this).metricSMSSuccessRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3a70fccfc4dc7a51391a3c0d2a1a31549ef7b7227b052d7ecbc0e728be4217e")
  public override fun metricSmsSuccessRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSmsSuccessRate(MetricOptions(props))

  public override fun topicArn(): String = unwrap(this).getTopicArn()

  public override fun topicName(): String = unwrap(this).getTopicName()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.TopicBase,
  ) : TopicBase(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicBase): TopicBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicBase): software.amazon.awscdk.services.sns.TopicBase =
        (wrapped as Wrapper).cdkObject
  }
}
