@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sns

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sns.BetweenCondition
import software.amazon.awscdk.services.sns.CfnSubscription
import software.amazon.awscdk.services.sns.CfnSubscriptionProps
import software.amazon.awscdk.services.sns.CfnTopic
import software.amazon.awscdk.services.sns.CfnTopicPolicy
import software.amazon.awscdk.services.sns.CfnTopicPolicyProps
import software.amazon.awscdk.services.sns.CfnTopicProps
import software.amazon.awscdk.services.sns.NumericConditions
import software.amazon.awscdk.services.sns.StringConditions
import software.amazon.awscdk.services.sns.Subscription
import software.amazon.awscdk.services.sns.SubscriptionOptions
import software.amazon.awscdk.services.sns.SubscriptionProps
import software.amazon.awscdk.services.sns.Topic
import software.amazon.awscdk.services.sns.TopicPolicy
import software.amazon.awscdk.services.sns.TopicPolicyProps
import software.amazon.awscdk.services.sns.TopicProps
import software.amazon.awscdk.services.sns.TopicSubscriptionConfig
import software.constructs.Construct

public object sns {
  public inline fun betweenCondition(block: BetweenConditionDsl.() -> Unit = {}): BetweenCondition {
    val builder = BetweenConditionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubscription(
    scope: Construct,
    id: String,
    block: CfnSubscriptionDsl.() -> Unit = {},
  ): CfnSubscription {
    val builder = CfnSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSubscriptionProps(block: CfnSubscriptionPropsDsl.() -> Unit = {}):
      CfnSubscriptionProps {
    val builder = CfnSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopic(
    scope: Construct,
    id: String,
    block: CfnTopicDsl.() -> Unit = {},
  ): CfnTopic {
    val builder = CfnTopicDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicPolicy(
    scope: Construct,
    id: String,
    block: CfnTopicPolicyDsl.() -> Unit = {},
  ): CfnTopicPolicy {
    val builder = CfnTopicPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicPolicyProps(block: CfnTopicPolicyPropsDsl.() -> Unit = {}):
      CfnTopicPolicyProps {
    val builder = CfnTopicPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicProps(block: CfnTopicPropsDsl.() -> Unit = {}): CfnTopicProps {
    val builder = CfnTopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTopicSubscriptionProperty(block: CfnTopicSubscriptionPropertyDsl.() -> Unit =
      {}): CfnTopic.SubscriptionProperty {
    val builder = CfnTopicSubscriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun numericConditions(block: NumericConditionsDsl.() -> Unit = {}):
      NumericConditions {
    val builder = NumericConditionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun stringConditions(block: StringConditionsDsl.() -> Unit = {}): StringConditions {
    val builder = StringConditionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subscription(
    scope: Construct,
    id: String,
    block: SubscriptionDsl.() -> Unit = {},
  ): Subscription {
    val builder = SubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun subscriptionOptions(block: SubscriptionOptionsDsl.() -> Unit = {}):
      SubscriptionOptions {
    val builder = SubscriptionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun subscriptionProps(block: SubscriptionPropsDsl.() -> Unit = {}):
      SubscriptionProps {
    val builder = SubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun topic(
    scope: Construct,
    id: String,
    block: TopicDsl.() -> Unit = {},
  ): Topic {
    val builder = TopicDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun topicPolicy(
    scope: Construct,
    id: String,
    block: TopicPolicyDsl.() -> Unit = {},
  ): TopicPolicy {
    val builder = TopicPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun topicPolicyProps(block: TopicPolicyPropsDsl.() -> Unit = {}): TopicPolicyProps {
    val builder = TopicPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun topicProps(block: TopicPropsDsl.() -> Unit = {}): TopicProps {
    val builder = TopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun topicSubscriptionConfig(block: TopicSubscriptionConfigDsl.() -> Unit = {}):
      TopicSubscriptionConfig {
    val builder = TopicSubscriptionConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
