@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object archivePolicy;
 * Object dataProtectionPolicy;
 * CfnTopic cfnTopic = CfnTopic.Builder.create(this, "MyCfnTopic")
 * .archivePolicy(archivePolicy)
 * .contentBasedDeduplication(false)
 * .dataProtectionPolicy(dataProtectionPolicy)
 * .deliveryStatusLogging(List.of(LoggingConfigProperty.builder()
 * .protocol("protocol")
 * // the properties below are optional
 * .failureFeedbackRoleArn("failureFeedbackRoleArn")
 * .successFeedbackRoleArn("successFeedbackRoleArn")
 * .successFeedbackSampleRate("successFeedbackSampleRate")
 * .build()))
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
public open class CfnTopic internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.CfnTopic,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sns.CfnTopic(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicProps,
  ) :
      this(software.amazon.awscdk.services.sns.CfnTopic(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTopicProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTopicProps(props)
  )

  /**
   * The archive policy determines the number of days Amazon SNS retains messages.
   */
  public open fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

  /**
   * The archive policy determines the number of days Amazon SNS retains messages.
   */
  public open fun archivePolicy(`value`: Any) {
    unwrap(this).setArchivePolicy(`value`)
  }

  /**
   * Returns the ARN of an Amazon SNS topic.
   */
  public open fun attrTopicArn(): String = unwrap(this).getAttrTopicArn()

  /**
   * Returns the name of an Amazon SNS topic.
   */
  public open fun attrTopicName(): String = unwrap(this).getAttrTopicName()

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public open fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public open fun contentBasedDeduplication(`value`: Boolean) {
    unwrap(this).setContentBasedDeduplication(`value`)
  }

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public open fun contentBasedDeduplication(`value`: IResolvable) {
    unwrap(this).setContentBasedDeduplication(`value`.let(IResolvable::unwrap))
  }

  /**
   * The body of the policy document you want to use for this topic.
   */
  public open fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  /**
   * The body of the policy document you want to use for this topic.
   */
  public open fun dataProtectionPolicy(`value`: Any) {
    unwrap(this).setDataProtectionPolicy(`value`)
  }

  /**
   * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
   * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
   * protocols:.
   */
  public open fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

  /**
   * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
   * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
   * protocols:.
   */
  public open fun deliveryStatusLogging(`value`: IResolvable) {
    unwrap(this).setDeliveryStatusLogging(`value`.let(IResolvable::unwrap))
  }

  /**
   * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
   * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
   * protocols:.
   */
  public open fun deliveryStatusLogging(`value`: List<Any>) {
    unwrap(this).setDeliveryStatusLogging(`value`)
  }

  /**
   * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
   * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
   * protocols:.
   */
  public open fun deliveryStatusLogging(vararg `value`: Any): Unit =
      deliveryStatusLogging(`value`.toList())

  /**
   * The display name to use for an Amazon SNS topic with SMS subscriptions.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name to use for an Amazon SNS topic with SMS subscriptions.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Set to true to create a FIFO topic.
   */
  public open fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

  /**
   * Set to true to create a FIFO topic.
   */
  public open fun fifoTopic(`value`: Boolean) {
    unwrap(this).setFifoTopic(`value`)
  }

  /**
   * Set to true to create a FIFO topic.
   */
  public open fun fifoTopic(`value`: IResolvable) {
    unwrap(this).setFifoTopic(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
   */
  public open fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  /**
   * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
   */
  public open fun kmsMasterKeyId(`value`: String) {
    unwrap(this).setKmsMasterKeyId(`value`)
  }

  /**
   * The signature version corresponds to the hashing algorithm used while creating the signature of
   * the notifications, subscription confirmations, or unsubscribe confirmation messages sent by Amazon
   * SNS.
   */
  public open fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

  /**
   * The signature version corresponds to the hashing algorithm used while creating the signature of
   * the notifications, subscription confirmations, or unsubscribe confirmation messages sent by Amazon
   * SNS.
   */
  public open fun signatureVersion(`value`: String) {
    unwrap(this).setSignatureVersion(`value`)
  }

  /**
   * The Amazon SNS subscriptions (endpoints) for this topic.
   */
  public open fun subscription(): Any? = unwrap(this).getSubscription()

  /**
   * The Amazon SNS subscriptions (endpoints) for this topic.
   */
  public open fun subscription(`value`: IResolvable) {
    unwrap(this).setSubscription(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon SNS subscriptions (endpoints) for this topic.
   */
  public open fun subscription(`value`: List<Any>) {
    unwrap(this).setSubscription(`value`)
  }

  /**
   * The Amazon SNS subscriptions (endpoints) for this topic.
   */
  public open fun subscription(vararg `value`: Any): Unit = subscription(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tags to add to a new topic.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of tags to add to a new topic.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of tags to add to a new topic.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the topic you want to create.
   */
  public open fun topicName(): String? = unwrap(this).getTopicName()

  /**
   * The name of the topic you want to create.
   */
  public open fun topicName(`value`: String) {
    unwrap(this).setTopicName(`value`)
  }

  /**
   * Tracing mode of an Amazon SNS topic.
   */
  public open fun tracingConfig(): String? = unwrap(this).getTracingConfig()

  /**
   * Tracing mode of an Amazon SNS topic.
   */
  public open fun tracingConfig(`value`: String) {
    unwrap(this).setTracingConfig(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.CfnTopic].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The archive policy determines the number of days Amazon SNS retains messages.
     *
     * You can set a retention period from 1 to 365 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-archivepolicy)
     * @param archivePolicy The archive policy determines the number of days Amazon SNS retains
     * messages. 
     */
    public fun archivePolicy(archivePolicy: Any)

    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     * this attribute is `false` , you must specify a value for the `MessageDeduplicationId` parameter
     * for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html) action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     * generate the `MessageDeduplicationId` using the body of the message (but not the attributes of
     * the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     * this attribute is `false` , you must specify a value for the `MessageDeduplicationId` parameter
     * for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html) action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     * generate the `MessageDeduplicationId` using the body of the message (but not the attributes of
     * the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    /**
     * The body of the policy document you want to use for this topic.
     *
     * You can only add one policy per topic.
     *
     * The policy must be in JSON string format.
     *
     * Length Constraints: Maximum length of 30,720.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-dataprotectionpolicy)
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic. 
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    public fun deliveryStatusLogging(deliveryStatusLogging: IResolvable)

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    public fun deliveryStatusLogging(deliveryStatusLogging: List<Any>)

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    public fun deliveryStatusLogging(vararg deliveryStatusLogging: Any)

    /**
     * The display name to use for an Amazon SNS topic with SMS subscriptions.
     *
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-displayname)
     * @param displayName The display name to use for an Amazon SNS topic with SMS subscriptions. 
     */
    public fun displayName(displayName: String)

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     * @param fifoTopic Set to true to create a FIFO topic. 
     */
    public fun fifoTopic(fifoTopic: Boolean)

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     * @param fifoTopic Set to true to create a FIFO topic. 
     */
    public fun fifoTopic(fifoTopic: IResolvable)

    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
     *
     * For more information, see [Key
     * terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * . For more examples, see
     * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
     * in the *AWS Key Management Service API Reference* .
     *
     * This property applies only to
     * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-kmsmasterkeyid)
     * @param kmsMasterKeyId The ID of an AWS managed customer master key (CMK) for Amazon SNS or a
     * custom CMK. 
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    /**
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * By default, `SignatureVersion` is set to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-signatureversion)
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS. 
     */
    public fun signatureVersion(signatureVersion: String)

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    public fun subscription(subscription: IResolvable)

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    public fun subscription(subscription: List<Any>)

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    public fun subscription(vararg subscription: Any)

    /**
     * The list of tags to add to a new topic.
     *
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     * @param tags The list of tags to add to a new topic. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of tags to add to a new topic.
     *
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     * @param tags The list of tags to add to a new topic. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the topic you want to create.
     *
     * Topic names must include only uppercase and lowercase ASCII letters, numbers, underscores,
     * and hyphens, and must be between 1 and 256 characters long. FIFO topic names must end with
     * `.fifo` .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the topic name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-topicname)
     * @param topicName The name of the topic you want to create. 
     */
    public fun topicName(topicName: String)

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` ,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the
     * tracing header is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tracingconfig)
     * @param tracingConfig Tracing mode of an Amazon SNS topic. 
     */
    public fun tracingConfig(tracingConfig: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopic.Builder =
        software.amazon.awscdk.services.sns.CfnTopic.Builder.create(scope, id)

    /**
     * The archive policy determines the number of days Amazon SNS retains messages.
     *
     * You can set a retention period from 1 to 365 days.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-archivepolicy)
     * @param archivePolicy The archive policy determines the number of days Amazon SNS retains
     * messages. 
     */
    override fun archivePolicy(archivePolicy: Any) {
      cdkBuilder.archivePolicy(archivePolicy)
    }

    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     * this attribute is `false` , you must specify a value for the `MessageDeduplicationId` parameter
     * for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html) action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     * generate the `MessageDeduplicationId` using the body of the message (but not the attributes of
     * the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     * this attribute is `false` , you must specify a value for the `MessageDeduplicationId` parameter
     * for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html) action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     * generate the `MessageDeduplicationId` using the body of the message (but not the attributes of
     * the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    /**
     * The body of the policy document you want to use for this topic.
     *
     * You can only add one policy per topic.
     *
     * The policy must be in JSON string format.
     *
     * Length Constraints: Maximum length of 30,720.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-dataprotectionpolicy)
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic. 
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    override fun deliveryStatusLogging(deliveryStatusLogging: IResolvable) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging.let(IResolvable::unwrap))
    }

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    override fun deliveryStatusLogging(deliveryStatusLogging: List<Any>) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging)
    }

    /**
     * The `DeliveryStatusLogging` configuration enables you to log the delivery status of messages
     * sent from your Amazon SNS topic to subscribed endpoints with the following supported delivery
     * protocols:.
     *
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-deliverystatuslogging)
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:. 
     */
    override fun deliveryStatusLogging(vararg deliveryStatusLogging: Any): Unit =
        deliveryStatusLogging(deliveryStatusLogging.toList())

    /**
     * The display name to use for an Amazon SNS topic with SMS subscriptions.
     *
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-displayname)
     * @param displayName The display name to use for an Amazon SNS topic with SMS subscriptions. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     * @param fifoTopic Set to true to create a FIFO topic. 
     */
    override fun fifoTopic(fifoTopic: Boolean) {
      cdkBuilder.fifoTopic(fifoTopic)
    }

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     * @param fifoTopic Set to true to create a FIFO topic. 
     */
    override fun fifoTopic(fifoTopic: IResolvable) {
      cdkBuilder.fifoTopic(fifoTopic.let(IResolvable::unwrap))
    }

    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
     *
     * For more information, see [Key
     * terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * . For more examples, see
     * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
     * in the *AWS Key Management Service API Reference* .
     *
     * This property applies only to
     * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-kmsmasterkeyid)
     * @param kmsMasterKeyId The ID of an AWS managed customer master key (CMK) for Amazon SNS or a
     * custom CMK. 
     */
    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * By default, `SignatureVersion` is set to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-signatureversion)
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS. 
     */
    override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    override fun subscription(subscription: IResolvable) {
      cdkBuilder.subscription(subscription.let(IResolvable::unwrap))
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    override fun subscription(subscription: List<Any>) {
      cdkBuilder.subscription(subscription)
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic. 
     */
    override fun subscription(vararg subscription: Any): Unit = subscription(subscription.toList())

    /**
     * The list of tags to add to a new topic.
     *
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     * @param tags The list of tags to add to a new topic. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of tags to add to a new topic.
     *
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     * @param tags The list of tags to add to a new topic. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the topic you want to create.
     *
     * Topic names must include only uppercase and lowercase ASCII letters, numbers, underscores,
     * and hyphens, and must be between 1 and 256 characters long. FIFO topic names must end with
     * `.fifo` .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the topic name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-topicname)
     * @param topicName The name of the topic you want to create. 
     */
    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` ,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the
     * tracing header is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tracingconfig)
     * @param tracingConfig Tracing mode of an Amazon SNS topic. 
     */
    override fun tracingConfig(tracingConfig: String) {
      cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopic = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sns.CfnTopic.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopic {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic): CfnTopic =
        CfnTopic(cdkObject)

    internal fun unwrap(wrapped: CfnTopic): software.amazon.awscdk.services.sns.CfnTopic =
        wrapped.cdkObject
  }

  /**
   * The `LoggingConfig` property type specifies the `Delivery` status logging configuration for an
   * [`AWS::SNS::Topic`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.sns.*;
   * LoggingConfigProperty loggingConfigProperty = LoggingConfigProperty.builder()
   * .protocol("protocol")
   * // the properties below are optional
   * .failureFeedbackRoleArn("failureFeedbackRoleArn")
   * .successFeedbackRoleArn("successFeedbackRoleArn")
   * .successFeedbackSampleRate("successFeedbackSampleRate")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html)
   */
  public interface LoggingConfigProperty {
    /**
     * The IAM role ARN to be used when logging failed message deliveries in Amazon CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-failurefeedbackrolearn)
     */
    public fun failureFeedbackRoleArn(): String? = unwrap(this).getFailureFeedbackRoleArn()

    /**
     * Indicates one of the supported protocols for the Amazon SNS topic.
     *
     *
     * At least one of the other three `LoggingConfig` properties is recommend along with `Protocol`
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-protocol)
     */
    public fun protocol(): String

    /**
     * The IAM role ARN to be used when logging successful message deliveries in Amazon CloudWatch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-successfeedbackrolearn)
     */
    public fun successFeedbackRoleArn(): String? = unwrap(this).getSuccessFeedbackRoleArn()

    /**
     * The percentage of successful message deliveries to be logged in Amazon CloudWatch.
     *
     * Valid percentage values range from 0 to 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-successfeedbacksamplerate)
     */
    public fun successFeedbackSampleRate(): String? = unwrap(this).getSuccessFeedbackSampleRate()

    /**
     * A builder for [LoggingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param failureFeedbackRoleArn The IAM role ARN to be used when logging failed message
       * deliveries in Amazon CloudWatch.
       */
      public fun failureFeedbackRoleArn(failureFeedbackRoleArn: String)

      /**
       * @param protocol Indicates one of the supported protocols for the Amazon SNS topic. 
       *
       * At least one of the other three `LoggingConfig` properties is recommend along with
       * `Protocol` .
       */
      public fun protocol(protocol: String)

      /**
       * @param successFeedbackRoleArn The IAM role ARN to be used when logging successful message
       * deliveries in Amazon CloudWatch.
       */
      public fun successFeedbackRoleArn(successFeedbackRoleArn: String)

      /**
       * @param successFeedbackSampleRate The percentage of successful message deliveries to be
       * logged in Amazon CloudWatch.
       * Valid percentage values range from 0 to 100.
       */
      public fun successFeedbackSampleRate(successFeedbackSampleRate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty.Builder =
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty.builder()

      /**
       * @param failureFeedbackRoleArn The IAM role ARN to be used when logging failed message
       * deliveries in Amazon CloudWatch.
       */
      override fun failureFeedbackRoleArn(failureFeedbackRoleArn: String) {
        cdkBuilder.failureFeedbackRoleArn(failureFeedbackRoleArn)
      }

      /**
       * @param protocol Indicates one of the supported protocols for the Amazon SNS topic. 
       *
       * At least one of the other three `LoggingConfig` properties is recommend along with
       * `Protocol` .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param successFeedbackRoleArn The IAM role ARN to be used when logging successful message
       * deliveries in Amazon CloudWatch.
       */
      override fun successFeedbackRoleArn(successFeedbackRoleArn: String) {
        cdkBuilder.successFeedbackRoleArn(successFeedbackRoleArn)
      }

      /**
       * @param successFeedbackSampleRate The percentage of successful message deliveries to be
       * logged in Amazon CloudWatch.
       * Valid percentage values range from 0 to 100.
       */
      override fun successFeedbackSampleRate(successFeedbackSampleRate: String) {
        cdkBuilder.successFeedbackSampleRate(successFeedbackSampleRate)
      }

      public fun build(): software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty,
    ) : CdkObject(cdkObject), LoggingConfigProperty {
      /**
       * The IAM role ARN to be used when logging failed message deliveries in Amazon CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-failurefeedbackrolearn)
       */
      override fun failureFeedbackRoleArn(): String? = unwrap(this).getFailureFeedbackRoleArn()

      /**
       * Indicates one of the supported protocols for the Amazon SNS topic.
       *
       *
       * At least one of the other three `LoggingConfig` properties is recommend along with
       * `Protocol` .
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The IAM role ARN to be used when logging successful message deliveries in Amazon
       * CloudWatch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-successfeedbackrolearn)
       */
      override fun successFeedbackRoleArn(): String? = unwrap(this).getSuccessFeedbackRoleArn()

      /**
       * The percentage of successful message deliveries to be logged in Amazon CloudWatch.
       *
       * Valid percentage values range from 0 to 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-loggingconfig.html#cfn-sns-topic-loggingconfig-successfeedbacksamplerate)
       */
      override fun successFeedbackSampleRate(): String? =
          unwrap(this).getSuccessFeedbackSampleRate()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty):
          LoggingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? LoggingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingConfigProperty):
          software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopic.LoggingConfigProperty
    }
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
   * import io.cloudshiftdev.awscdk.services.sns.*;
   * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
   * .endpoint("endpoint")
   * .protocol("protocol")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html)
   */
  public interface SubscriptionProperty {
    /**
     * The endpoint that receives notifications from the Amazon SNS topic.
     *
     * The endpoint value depends on the protocol that you specify. For more information, see the
     * `Endpoint` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html#cfn-sns-topic-subscription-endpoint)
     */
    public fun endpoint(): String

    /**
     * The subscription's protocol.
     *
     * For more information, see the `Protocol` parameter of the
     * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
     * *Amazon SNS API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html#cfn-sns-topic-subscription-protocol)
     */
    public fun protocol(): String

    /**
     * A builder for [SubscriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoint The endpoint that receives notifications from the Amazon SNS topic. 
       * The endpoint value depends on the protocol that you specify. For more information, see the
       * `Endpoint` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       */
      public fun endpoint(endpoint: String)

      /**
       * @param protocol The subscription's protocol. 
       * For more information, see the `Protocol` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       */
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.Builder =
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty.builder()

      /**
       * @param endpoint The endpoint that receives notifications from the Amazon SNS topic. 
       * The endpoint value depends on the protocol that you specify. For more information, see the
       * `Endpoint` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       */
      override fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
      }

      /**
       * @param protocol The subscription's protocol. 
       * For more information, see the `Protocol` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build(): software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty,
    ) : CdkObject(cdkObject), SubscriptionProperty {
      /**
       * The endpoint that receives notifications from the Amazon SNS topic.
       *
       * The endpoint value depends on the protocol that you specify. For more information, see the
       * `Endpoint` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html#cfn-sns-topic-subscription-endpoint)
       */
      override fun endpoint(): String = unwrap(this).getEndpoint()

      /**
       * The subscription's protocol.
       *
       * For more information, see the `Protocol` parameter of the
       * `[Subscribe](https://docs.aws.amazon.com/sns/latest/api/API_Subscribe.html)` action in the
       * *Amazon SNS API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic-subscription.html#cfn-sns-topic-subscription-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty):
          SubscriptionProperty = CdkObjectWrappers.wrap(cdkObject) as? SubscriptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopic.SubscriptionProperty
    }
  }
}
