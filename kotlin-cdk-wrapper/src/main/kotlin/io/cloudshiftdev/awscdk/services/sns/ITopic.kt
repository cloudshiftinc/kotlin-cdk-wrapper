@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ITopic : IResource, INotificationRuleTarget {
  public fun addSubscription(arg0: ITopicSubscription): Subscription

  public fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
  public fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
      AddToResourcePolicyResult

  public fun contentBasedDeduplication(): Boolean

  public fun fifo(): Boolean

  public fun grantPublish(arg0: IGrantable): Grant

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfMessagesPublished(): Metric

  public fun metricNumberOfMessagesPublished(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0debfcf68c56186b6266a690fc01d2ba469d215e82968a201c09ce0d090a76e3")
  public fun metricNumberOfMessagesPublished(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfNotificationsDelivered(): Metric

  public fun metricNumberOfNotificationsDelivered(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fca8e127970064d20533907387181b36ec7f4b132b5beff585ad498f1ef8ad75")
  public fun metricNumberOfNotificationsDelivered(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfNotificationsFailed(): Metric

  public fun metricNumberOfNotificationsFailed(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7ed1623b02cee0cbde24236106b0c18d58a20040a199e944a7ab04cbe1bbd6b")
  public fun metricNumberOfNotificationsFailed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfNotificationsFilteredOut(): Metric

  public fun metricNumberOfNotificationsFilteredOut(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("35bf7baed1f2513c6d518c8e354540bd10d44f78c65887bd91dc386c7f40f118")
  public fun metricNumberOfNotificationsFilteredOut(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNumberOfNotificationsFilteredOutInvalidAttributes(): Metric

  public fun metricNumberOfNotificationsFilteredOutInvalidAttributes(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6cdc48475cf159c4f09f26890c23c3be742d9b8a23ee337cbc982f1eb0925661")
  public
      fun metricNumberOfNotificationsFilteredOutInvalidAttributes(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(): Metric

  public fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("408205240c218c91b27bb4cc760b4d5578900fab2917dbd7f4298dcd3819bede")
  public
      fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun metricPublishSize(): Metric

  public fun metricPublishSize(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8d6140038736d11b4192a6bdec41905dbc513ee58f0615aae521c826fa6ea59")
  public fun metricPublishSize(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSmsMonthToDateSpentUsd(): Metric

  public fun metricSmsMonthToDateSpentUsd(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f5bf7d95644305938cdde06436a98bf86c5b1c175ce1e9a467fda47d6a49663")
  public fun metricSmsMonthToDateSpentUsd(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSmsSuccessRate(): Metric

  public fun metricSmsSuccessRate(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3a70fccfc4dc7a51391a3c0d2a1a31549ef7b7227b052d7ecbc0e728be4217e")
  public fun metricSmsSuccessRate(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun topicArn(): String

  public fun topicName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.ITopic,
  ) : CdkObject(cdkObject), ITopic {
    override fun addSubscription(arg0: ITopicSubscription): Subscription =
        unwrap(this).addSubscription(arg0.let(ITopicSubscription::unwrap)).let(Subscription::wrap)

    override fun addToResourcePolicy(arg0: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(arg0.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(arg0: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(arg0))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig =
        unwrap(this).bindAsNotificationRuleTarget(arg0.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)

    override fun contentBasedDeduplication(): Boolean = unwrap(this).getContentBasedDeduplication()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun fifo(): Boolean = unwrap(this).getFifo()

    override fun grantPublish(arg0: IGrantable): Grant =
        unwrap(this).grantPublish(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricNumberOfMessagesPublished(): Metric =
        unwrap(this).metricNumberOfMessagesPublished().let(Metric::wrap)

    override fun metricNumberOfMessagesPublished(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfMessagesPublished(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0debfcf68c56186b6266a690fc01d2ba469d215e82968a201c09ce0d090a76e3")
    override fun metricNumberOfMessagesPublished(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfMessagesPublished(MetricOptions(arg0))

    override fun metricNumberOfNotificationsDelivered(): Metric =
        unwrap(this).metricNumberOfNotificationsDelivered().let(Metric::wrap)

    override fun metricNumberOfNotificationsDelivered(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfNotificationsDelivered(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fca8e127970064d20533907387181b36ec7f4b132b5beff585ad498f1ef8ad75")
    override fun metricNumberOfNotificationsDelivered(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricNumberOfNotificationsDelivered(MetricOptions(arg0))

    override fun metricNumberOfNotificationsFailed(): Metric =
        unwrap(this).metricNumberOfNotificationsFailed().let(Metric::wrap)

    override fun metricNumberOfNotificationsFailed(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfNotificationsFailed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7ed1623b02cee0cbde24236106b0c18d58a20040a199e944a7ab04cbe1bbd6b")
    override fun metricNumberOfNotificationsFailed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNumberOfNotificationsFailed(MetricOptions(arg0))

    override fun metricNumberOfNotificationsFilteredOut(): Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOut().let(Metric::wrap)

    override fun metricNumberOfNotificationsFilteredOut(arg0: MetricOptions): Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOut(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35bf7baed1f2513c6d518c8e354540bd10d44f78c65887bd91dc386c7f40f118")
    override fun metricNumberOfNotificationsFilteredOut(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricNumberOfNotificationsFilteredOut(MetricOptions(arg0))

    override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(): Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes().let(Metric::wrap)

    override fun metricNumberOfNotificationsFilteredOutInvalidAttributes(arg0: MetricOptions):
        Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOutInvalidAttributes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6cdc48475cf159c4f09f26890c23c3be742d9b8a23ee337cbc982f1eb0925661")
    override
        fun metricNumberOfNotificationsFilteredOutInvalidAttributes(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricNumberOfNotificationsFilteredOutInvalidAttributes(MetricOptions(arg0))

    override fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(): Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes().let(Metric::wrap)

    override fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(arg0: MetricOptions):
        Metric =
        unwrap(this).metricNumberOfNotificationsFilteredOutNoMessageAttributes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("408205240c218c91b27bb4cc760b4d5578900fab2917dbd7f4298dcd3819bede")
    override
        fun metricNumberOfNotificationsFilteredOutNoMessageAttributes(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricNumberOfNotificationsFilteredOutNoMessageAttributes(MetricOptions(arg0))

    override fun metricPublishSize(): Metric = unwrap(this).metricPublishSize().let(Metric::wrap)

    override fun metricPublishSize(arg0: MetricOptions): Metric =
        unwrap(this).metricPublishSize(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8d6140038736d11b4192a6bdec41905dbc513ee58f0615aae521c826fa6ea59")
    override fun metricPublishSize(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPublishSize(MetricOptions(arg0))

    override fun metricSmsMonthToDateSpentUsd(): Metric =
        unwrap(this).metricSMSMonthToDateSpentUSD().let(Metric::wrap)

    override fun metricSmsMonthToDateSpentUsd(arg0: MetricOptions): Metric =
        unwrap(this).metricSMSMonthToDateSpentUSD(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f5bf7d95644305938cdde06436a98bf86c5b1c175ce1e9a467fda47d6a49663")
    override fun metricSmsMonthToDateSpentUsd(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSmsMonthToDateSpentUsd(MetricOptions(arg0))

    override fun metricSmsSuccessRate(): Metric =
        unwrap(this).metricSMSSuccessRate().let(Metric::wrap)

    override fun metricSmsSuccessRate(arg0: MetricOptions): Metric =
        unwrap(this).metricSMSSuccessRate(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3a70fccfc4dc7a51391a3c0d2a1a31549ef7b7227b052d7ecbc0e728be4217e")
    override fun metricSmsSuccessRate(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSmsSuccessRate(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun topicArn(): String = unwrap(this).getTopicArn()

    override fun topicName(): String = unwrap(this).getTopicName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopic): ITopic =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITopic): software.amazon.awscdk.services.sns.ITopic = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sns.ITopic
  }
}
