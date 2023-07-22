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
  /**
   * Between condition for a numeric attribute.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.lambda.*;
   * Function fn;
   * Topic myTopic = new Topic(this, "MyTopic");
   * // Lambda should receive only message matching the following conditions on attributes:
   * // color: 'red' or 'orange' or begins with 'bl'
   * // size: anything but 'small' or 'medium'
   * // price: between 100 and 200 or greater than 300
   * // store: attribute must be present
   * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
   * .filterPolicy(Map.of(
   * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .allowlist(List.of("red", "orange"))
   * .matchPrefixes(List.of("bl"))
   * .build()),
   * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .denylist(List.of("small", "medium"))
   * .build()),
   * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
   * .between(BetweenCondition.builder().start(100).stop(200).build())
   * .greaterThan(300)
   * .build()),
   * "store", SubscriptionFilter.existsFilter()))
   * .build());
   * ```
   */
  public inline fun betweenCondition(block: BetweenConditionDsl.() -> Unit = {}): BetweenCondition {
    val builder = BetweenConditionDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::SNS::Subscription` resource subscribes an endpoint to an Amazon SNS topic.
   *
   * For a subscription to be created, the owner of the endpoint must confirm the subscription.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object deliveryPolicy;
   * Object filterPolicy;
   * Object redrivePolicy;
   * CfnSubscription cfnSubscription = CfnSubscription.Builder.create(this, "MyCfnSubscription")
   * .protocol("protocol")
   * .topicArn("topicArn")
   * // the properties below are optional
   * .deliveryPolicy(deliveryPolicy)
   * .endpoint("endpoint")
   * .filterPolicy(filterPolicy)
   * .filterPolicyScope("filterPolicyScope")
   * .rawMessageDelivery(false)
   * .redrivePolicy(redrivePolicy)
   * .region("region")
   * .subscriptionRoleArn("subscriptionRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
   */
  public inline fun cfnSubscription(
    scope: Construct,
    id: String,
    block: CfnSubscriptionDsl.() -> Unit = {},
  ): CfnSubscription {
    val builder = CfnSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSubscription`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object deliveryPolicy;
   * Object filterPolicy;
   * Object redrivePolicy;
   * CfnSubscriptionProps cfnSubscriptionProps = CfnSubscriptionProps.builder()
   * .protocol("protocol")
   * .topicArn("topicArn")
   * // the properties below are optional
   * .deliveryPolicy(deliveryPolicy)
   * .endpoint("endpoint")
   * .filterPolicy(filterPolicy)
   * .filterPolicyScope("filterPolicyScope")
   * .rawMessageDelivery(false)
   * .redrivePolicy(redrivePolicy)
   * .region("region")
   * .subscriptionRoleArn("subscriptionRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
   */
  public inline fun cfnSubscriptionProps(block: CfnSubscriptionPropsDsl.() -> Unit = {}):
      CfnSubscriptionProps {
    val builder = CfnSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::SNS::Topic` resource creates a topic to which notifications can be published.
   *
   *
   * One account can create a maximum of 100,000 standard topics and 1,000 FIFO topics. For more
   * information, see [Amazon SNS endpoints and
   * quotas](https://docs.aws.amazon.com/general/latest/gr/sns.html) in the *AWS General Reference* .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object dataProtectionPolicy;
   * CfnTopic cfnTopic = CfnTopic.Builder.create(this, "MyCfnTopic")
   * .contentBasedDeduplication(false)
   * .dataProtectionPolicy(dataProtectionPolicy)
   * .displayName("displayName")
   * .fifoTopic(false)
   * .kmsMasterKeyId("kmsMasterKeyId")
   * .signatureVersion("signatureVersion")
   * .subscription(List.of(SubscriptionProperty.builder()
   * .endpoint("endpoint")
   * .protocol("protocol")
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .topicName("topicName")
   * .tracingConfig("tracingConfig")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)
   */
  public inline fun cfnTopic(
    scope: Construct,
    id: String,
    block: CfnTopicDsl.() -> Unit = {},
  ): CfnTopic {
    val builder = CfnTopicDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::SNS::TopicPolicy` resource associates Amazon SNS topics with a policy.
   *
   * For an example snippet, see [Declaring an Amazon SNS
   * policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-sns-policy)
   * in the *AWS CloudFormation User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object policyDocument;
   * CfnTopicPolicy cfnTopicPolicy = CfnTopicPolicy.Builder.create(this, "MyCfnTopicPolicy")
   * .policyDocument(policyDocument)
   * .topics(List.of("topics"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
   */
  public inline fun cfnTopicPolicy(
    scope: Construct,
    id: String,
    block: CfnTopicPolicyDsl.() -> Unit = {},
  ): CfnTopicPolicy {
    val builder = CfnTopicPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnTopicPolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object policyDocument;
   * CfnTopicPolicyProps cfnTopicPolicyProps = CfnTopicPolicyProps.builder()
   * .policyDocument(policyDocument)
   * .topics(List.of("topics"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topicpolicy.html)
   */
  public inline fun cfnTopicPolicyProps(block: CfnTopicPolicyPropsDsl.() -> Unit = {}):
      CfnTopicPolicyProps {
    val builder = CfnTopicPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnTopic`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * Object dataProtectionPolicy;
   * CfnTopicProps cfnTopicProps = CfnTopicProps.builder()
   * .contentBasedDeduplication(false)
   * .dataProtectionPolicy(dataProtectionPolicy)
   * .displayName("displayName")
   * .fifoTopic(false)
   * .kmsMasterKeyId("kmsMasterKeyId")
   * .signatureVersion("signatureVersion")
   * .subscription(List.of(SubscriptionProperty.builder()
   * .endpoint("endpoint")
   * .protocol("protocol")
   * .build()))
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .topicName("topicName")
   * .tracingConfig("tracingConfig")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)
   */
  public inline fun cfnTopicProps(block: CfnTopicPropsDsl.() -> Unit = {}): CfnTopicProps {
    val builder = CfnTopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * `Subscription` is an embedded property that describes the subscription endpoints of an Amazon
   * SNS topic.
   *
   *
   * For full control over subscription behavior (for example, delivery policy, filtering, raw
   * message delivery, and cross-region subscriptions), use the
   * [AWS::SNS::Subscription](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html)
   * resource.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
   * .endpoint("endpoint")
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html)
   */
  public inline fun cfnTopicSubscriptionProperty(block: CfnTopicSubscriptionPropertyDsl.() -> Unit =
      {}): CfnTopic.SubscriptionProperty {
    val builder = CfnTopicSubscriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Conditions that can be applied to numeric attributes.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.lambda.*;
   * Function fn;
   * Topic myTopic = new Topic(this, "MyTopic");
   * // Lambda should receive only message matching the following conditions on attributes:
   * // color: 'red' or 'orange' or begins with 'bl'
   * // size: anything but 'small' or 'medium'
   * // price: between 100 and 200 or greater than 300
   * // store: attribute must be present
   * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
   * .filterPolicy(Map.of(
   * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .allowlist(List.of("red", "orange"))
   * .matchPrefixes(List.of("bl"))
   * .build()),
   * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .denylist(List.of("small", "medium"))
   * .build()),
   * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
   * .between(BetweenCondition.builder().start(100).stop(200).build())
   * .greaterThan(300)
   * .build()),
   * "store", SubscriptionFilter.existsFilter()))
   * .build());
   * ```
   */
  public inline fun numericConditions(block: NumericConditionsDsl.() -> Unit = {}):
      NumericConditions {
    val builder = NumericConditionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Conditions that can be applied to string attributes.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.lambda.*;
   * Function fn;
   * Topic myTopic = new Topic(this, "MyTopic");
   * // Lambda should receive only message matching the following conditions on attributes:
   * // color: 'red' or 'orange' or begins with 'bl'
   * // size: anything but 'small' or 'medium'
   * // price: between 100 and 200 or greater than 300
   * // store: attribute must be present
   * myTopic.addSubscription(LambdaSubscription.Builder.create(fn)
   * .filterPolicy(Map.of(
   * "color", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .allowlist(List.of("red", "orange"))
   * .matchPrefixes(List.of("bl"))
   * .build()),
   * "size", SubscriptionFilter.stringFilter(StringConditions.builder()
   * .denylist(List.of("small", "medium"))
   * .build()),
   * "price", SubscriptionFilter.numericFilter(NumericConditions.builder()
   * .between(BetweenCondition.builder().start(100).stop(200).build())
   * .greaterThan(300)
   * .build()),
   * "store", SubscriptionFilter.existsFilter()))
   * .build());
   * ```
   */
  public inline fun stringConditions(block: StringConditionsDsl.() -> Unit = {}): StringConditions {
    val builder = StringConditionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A new subscription.
   *
   * Prefer to use the `ITopic.addSubscription()` methods to create instances of
   * this class.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.kinesisfirehose.alpha.DeliveryStream;
   * DeliveryStream stream;
   * Topic topic = new Topic(this, "Topic");
   * Subscription.Builder.create(this, "Subscription")
   * .topic(topic)
   * .endpoint(stream.getDeliveryStreamArn())
   * .protocol(SubscriptionProtocol.FIREHOSE)
   * .subscriptionRoleArn("SAMPLE_ARN")
   * .build();
   * ```
   */
  public inline fun subscription(
    scope: Construct,
    id: String,
    block: SubscriptionDsl.() -> Unit = {},
  ): Subscription {
    val builder = SubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for creating a new subscription.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * import software.amazon.awscdk.services.sqs.*;
   * FilterOrPolicy filterOrPolicy;
   * Queue queue;
   * SubscriptionFilter subscriptionFilter;
   * SubscriptionOptions subscriptionOptions = SubscriptionOptions.builder()
   * .endpoint("endpoint")
   * .protocol(SubscriptionProtocol.HTTP)
   * // the properties below are optional
   * .deadLetterQueue(queue)
   * .filterPolicy(Map.of(
   * "filterPolicyKey", subscriptionFilter))
   * .filterPolicyWithMessageBody(Map.of(
   * "filterPolicyWithMessageBodyKey", filterOrPolicy))
   * .rawMessageDelivery(false)
   * .region("region")
   * .subscriptionRoleArn("subscriptionRoleArn")
   * .build();
   * ```
   */
  public inline fun subscriptionOptions(block: SubscriptionOptionsDsl.() -> Unit = {}):
      SubscriptionOptions {
    val builder = SubscriptionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for creating a new subscription.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.kinesisfirehose.alpha.DeliveryStream;
   * DeliveryStream stream;
   * Topic topic = new Topic(this, "Topic");
   * Subscription.Builder.create(this, "Subscription")
   * .topic(topic)
   * .endpoint(stream.getDeliveryStreamArn())
   * .protocol(SubscriptionProtocol.FIREHOSE)
   * .subscriptionRoleArn("SAMPLE_ARN")
   * .build();
   * ```
   */
  public inline fun subscriptionProps(block: SubscriptionPropsDsl.() -> Unit = {}):
      SubscriptionProps {
    val builder = SubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A new SNS topic.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.sns.*;
   * Topic topic = new Topic(this, "MyTopic");
   * TopicRule topicRule = TopicRule.Builder.create(this, "TopicRule")
   * .sql(IotSql.fromStringAsVer20160323("SELECT topic(2) as device_id, year, month, day FROM
   * 'device/+/data'"))
   * .actions(List.of(
   * SnsTopicAction.Builder.create(topic)
   * .messageFormat(SnsActionMessageFormat.JSON)
   * .build()))
   * .build();
   * ```
   */
  public inline fun topic(
    scope: Construct,
    id: String,
    block: TopicDsl.() -> Unit = {},
  ): Topic {
    val builder = TopicDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The policy for an SNS Topic.
   *
   * Policies define the operations that are allowed on this resource.
   *
   * You almost never need to define this construct directly.
   *
   * All AWS resources that support resource policies have a method called
   * `addToResourcePolicy()`, which will automatically create a new resource
   * policy if one doesn't exist yet, otherwise it will add to the existing
   * policy.
   *
   * Prefer to use `addToResourcePolicy()` instead.
   *
   * Example:
   *
   * ```
   * Topic topic = new Topic(this, "Topic");
   * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "TopicPolicy")
   * .topics(List.of(topic))
   * .build();
   * topicPolicy.document.addStatements(PolicyStatement.Builder.create()
   * .actions(List.of("sns:Subscribe"))
   * .principals(List.of(new AnyPrincipal()))
   * .resources(List.of(topic.getTopicArn()))
   * .build());
   * ```
   */
  public inline fun topicPolicy(
    scope: Construct,
    id: String,
    block: TopicPolicyDsl.() -> Unit = {},
  ): TopicPolicy {
    val builder = TopicPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties to associate SNS topics with a policy.
   *
   * Example:
   *
   * ```
   * Topic topic = new Topic(this, "Topic");
   * TopicPolicy topicPolicy = TopicPolicy.Builder.create(this, "TopicPolicy")
   * .topics(List.of(topic))
   * .build();
   * topicPolicy.document.addStatements(PolicyStatement.Builder.create()
   * .actions(List.of("sns:Subscribe"))
   * .principals(List.of(new AnyPrincipal()))
   * .resources(List.of(topic.getTopicArn()))
   * .build());
   * ```
   */
  public inline fun topicPolicyProps(block: TopicPolicyPropsDsl.() -> Unit = {}): TopicPolicyProps {
    val builder = TopicPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a new SNS topic.
   *
   * Example:
   *
   * ```
   * Topic topic = Topic.Builder.create(this, "Topic")
   * .displayName("Customer subscription topic")
   * .build();
   * ```
   */
  public inline fun topicProps(block: TopicPropsDsl.() -> Unit = {}): TopicProps {
    val builder = TopicPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Subscription configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.sns.*;
   * import software.amazon.awscdk.services.sqs.*;
   * import software.constructs.*;
   * Construct construct;
   * IDependable dependable;
   * FilterOrPolicy filterOrPolicy;
   * Queue queue;
   * SubscriptionFilter subscriptionFilter;
   * TopicSubscriptionConfig topicSubscriptionConfig = TopicSubscriptionConfig.builder()
   * .endpoint("endpoint")
   * .protocol(SubscriptionProtocol.HTTP)
   * .subscriberId("subscriberId")
   * // the properties below are optional
   * .deadLetterQueue(queue)
   * .filterPolicy(Map.of(
   * "filterPolicyKey", subscriptionFilter))
   * .filterPolicyWithMessageBody(Map.of(
   * "filterPolicyWithMessageBodyKey", filterOrPolicy))
   * .rawMessageDelivery(false)
   * .region("region")
   * .subscriberScope(construct)
   * .subscriptionDependency(dependable)
   * .subscriptionRoleArn("subscriptionRoleArn")
   * .build();
   * ```
   */
  public inline fun topicSubscriptionConfig(block: TopicSubscriptionConfigDsl.() -> Unit = {}):
      TopicSubscriptionConfig {
    val builder = TopicSubscriptionConfigDsl()
    builder.apply(block)
    return builder.build()
  }
}
