@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnTopic`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Object archivePolicy;
 * Object dataProtectionPolicy;
 * CfnTopicProps cfnTopicProps = CfnTopicProps.builder()
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
public interface CfnTopicProps {
  /**
   * The `ArchivePolicy` determines the number of days Amazon SNS retains messages in FIFO topics.
   *
   * You can set a retention period ranging from 1 to 365 days. This property is only applicable to
   * FIFO topics; attempting to use it with standard topics will result in a creation failure.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-archivepolicy)
   */
  public fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

  /**
   * `ContentBasedDeduplication` enables deduplication of messages based on their content for FIFO
   * topics.
   *
   * By default, this property is set to false. If you create a FIFO topic with
   * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
   * `Publish` action. When set to true, Amazon SNS automatically generates a `MessageDeduplicationId`
   * using a SHA-256 hash of the message body (excluding message attributes). You can optionally
   * override this generated value by specifying a `MessageDeduplicationId` in the `Publish` action.
   * Note that this property only applies to FIFO topics; using it with standard topics will cause the
   * creation to fail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
   */
  public fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

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
   */
  public fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

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
   */
  public fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

  /**
   * The display name to use for an Amazon SNS topic with SMS subscriptions.
   *
   * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
   * spaces, and tabs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Set to true to create a FIFO topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
   */
  public fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

  /**
   * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
   *
   * For more information, see [Key
   * terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms) .
   * For more examples, see
   * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
   * in the *AWS Key Management Service API Reference* .
   *
   * This property applies only to
   * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-kmsmasterkeyid)
   */
  public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  /**
   * The signature version corresponds to the hashing algorithm used while creating the signature of
   * the notifications, subscription confirmations, or unsubscribe confirmation messages sent by Amazon
   * SNS.
   *
   * By default, `SignatureVersion` is set to `1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-signatureversion)
   */
  public fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

  /**
   * The Amazon SNS subscriptions (endpoints) for this topic.
   *
   *
   * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates an
   * associated subscription resource, the associated subscription is not deleted when the
   * `AWS::SNS::Topic` resource is deleted.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
   */
  public fun subscription(): Any? = unwrap(this).getSubscription()

  /**
   * The list of tags to add to a new topic.
   *
   *
   * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
   * `sns:TagResource` permissions.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the topic you want to create.
   *
   * Topic names must include only uppercase and lowercase ASCII letters, numbers, underscores, and
   * hyphens, and must be between 1 and 256 characters long. FIFO topic names must end with `.fifo` .
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the topic name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you can't perform updates that require replacement of this resource. You
   * can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-topicname)
   */
  public fun topicName(): String? = unwrap(this).getTopicName()

  /**
   * Tracing mode of an Amazon SNS topic.
   *
   * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
   * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` , Amazon
   * SNS will vend X-Ray segment data to topic owner account if the sampled flag in the tracing header
   * is true.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tracingconfig)
   */
  public fun tracingConfig(): String? = unwrap(this).getTracingConfig()

  /**
   * A builder for [CfnTopicProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param archivePolicy The `ArchivePolicy` determines the number of days Amazon SNS retains
     * messages in FIFO topics.
     * You can set a retention period ranging from 1 to 365 days. This property is only applicable
     * to FIFO topics; attempting to use it with standard topics will result in a creation failure.
     */
    public fun archivePolicy(archivePolicy: Any)

    /**
     * @param contentBasedDeduplication `ContentBasedDeduplication` enables deduplication of
     * messages based on their content for FIFO topics.
     * By default, this property is set to false. If you create a FIFO topic with
     * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
     * `Publish` action. When set to true, Amazon SNS automatically generates a
     * `MessageDeduplicationId` using a SHA-256 hash of the message body (excluding message
     * attributes). You can optionally override this generated value by specifying a
     * `MessageDeduplicationId` in the `Publish` action. Note that this property only applies to FIFO
     * topics; using it with standard topics will cause the creation to fail.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * @param contentBasedDeduplication `ContentBasedDeduplication` enables deduplication of
     * messages based on their content for FIFO topics.
     * By default, this property is set to false. If you create a FIFO topic with
     * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
     * `Publish` action. When set to true, Amazon SNS automatically generates a
     * `MessageDeduplicationId` using a SHA-256 hash of the message body (excluding message
     * attributes). You can optionally override this generated value by specifying a
     * `MessageDeduplicationId` in the `Publish` action. Note that this property only applies to FIFO
     * topics; using it with standard topics will cause the creation to fail.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    /**
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic.
     * You can only add one policy per topic.
     *
     * The policy must be in JSON string format.
     *
     * Length Constraints: Maximum length of 30,720.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    public fun deliveryStatusLogging(deliveryStatusLogging: IResolvable)

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    public fun deliveryStatusLogging(deliveryStatusLogging: List<Any>)

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    public fun deliveryStatusLogging(vararg deliveryStatusLogging: Any)

    /**
     * @param displayName The display name to use for an Amazon SNS topic with SMS subscriptions.
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     */
    public fun displayName(displayName: String)

    /**
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    public fun fifoTopic(fifoTopic: Boolean)

    /**
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    public fun fifoTopic(fifoTopic: IResolvable)

    /**
     * @param kmsMasterKeyId The ID of an AWS managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * For more information, see [Key
     * terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * . For more examples, see
     * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
     * in the *AWS Key Management Service API Reference* .
     *
     * This property applies only to
     * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
     * .
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    /**
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS.
     * By default, `SignatureVersion` is set to `1` .
     */
    public fun signatureVersion(signatureVersion: String)

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    public fun subscription(subscription: IResolvable)

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    public fun subscription(subscription: List<Any>)

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    public fun subscription(vararg subscription: Any)

    /**
     * @param tags The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topicName The name of the topic you want to create.
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
     */
    public fun topicName(topicName: String)

    /**
     * @param tracingConfig Tracing mode of an Amazon SNS topic.
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` ,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the
     * tracing header is true.
     */
    public fun tracingConfig(tracingConfig: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicProps.builder()

    /**
     * @param archivePolicy The `ArchivePolicy` determines the number of days Amazon SNS retains
     * messages in FIFO topics.
     * You can set a retention period ranging from 1 to 365 days. This property is only applicable
     * to FIFO topics; attempting to use it with standard topics will result in a creation failure.
     */
    override fun archivePolicy(archivePolicy: Any) {
      cdkBuilder.archivePolicy(archivePolicy)
    }

    /**
     * @param contentBasedDeduplication `ContentBasedDeduplication` enables deduplication of
     * messages based on their content for FIFO topics.
     * By default, this property is set to false. If you create a FIFO topic with
     * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
     * `Publish` action. When set to true, Amazon SNS automatically generates a
     * `MessageDeduplicationId` using a SHA-256 hash of the message body (excluding message
     * attributes). You can optionally override this generated value by specifying a
     * `MessageDeduplicationId` in the `Publish` action. Note that this property only applies to FIFO
     * topics; using it with standard topics will cause the creation to fail.
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param contentBasedDeduplication `ContentBasedDeduplication` enables deduplication of
     * messages based on their content for FIFO topics.
     * By default, this property is set to false. If you create a FIFO topic with
     * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
     * `Publish` action. When set to true, Amazon SNS automatically generates a
     * `MessageDeduplicationId` using a SHA-256 hash of the message body (excluding message
     * attributes). You can optionally override this generated value by specifying a
     * `MessageDeduplicationId` in the `Publish` action. Note that this property only applies to FIFO
     * topics; using it with standard topics will cause the creation to fail.
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic.
     * You can only add one policy per topic.
     *
     * The policy must be in JSON string format.
     *
     * Length Constraints: Maximum length of 30,720.
     */
    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    override fun deliveryStatusLogging(deliveryStatusLogging: IResolvable) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    override fun deliveryStatusLogging(deliveryStatusLogging: List<Any>) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param deliveryStatusLogging The `DeliveryStatusLogging` configuration enables you to log the
     * delivery status of messages sent from your Amazon SNS topic to subscribed endpoints with the
     * following supported delivery protocols:.
     * * HTTP
     * * Amazon Kinesis Data Firehose
     * * AWS Lambda
     * * Platform application endpoint
     * * Amazon Simple Queue Service
     *
     * Once configured, log entries are sent to Amazon CloudWatch Logs.
     */
    override fun deliveryStatusLogging(vararg deliveryStatusLogging: Any): Unit =
        deliveryStatusLogging(deliveryStatusLogging.toList())

    /**
     * @param displayName The display name to use for an Amazon SNS topic with SMS subscriptions.
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    override fun fifoTopic(fifoTopic: Boolean) {
      cdkBuilder.fifoTopic(fifoTopic)
    }

    /**
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    override fun fifoTopic(fifoTopic: IResolvable) {
      cdkBuilder.fifoTopic(fifoTopic.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param kmsMasterKeyId The ID of an AWS managed customer master key (CMK) for Amazon SNS or a
     * custom CMK.
     * For more information, see [Key
     * terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * . For more examples, see
     * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
     * in the *AWS Key Management Service API Reference* .
     *
     * This property applies only to
     * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
     * .
     */
    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS.
     * By default, `SignatureVersion` is set to `1` .
     */
    override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
    }

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    override fun subscription(subscription: IResolvable) {
      cdkBuilder.subscription(subscription.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    override fun subscription(subscription: List<Any>) {
      cdkBuilder.subscription(subscription.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     */
    override fun subscription(vararg subscription: Any): Unit = subscription(subscription.toList())

    /**
     * @param tags The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topicName The name of the topic you want to create.
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
     */
    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    /**
     * @param tracingConfig Tracing mode of an Amazon SNS topic.
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` ,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the
     * tracing header is true.
     */
    override fun tracingConfig(tracingConfig: String) {
      cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.CfnTopicProps,
  ) : CdkObject(cdkObject),
      CfnTopicProps {
    /**
     * The `ArchivePolicy` determines the number of days Amazon SNS retains messages in FIFO topics.
     *
     * You can set a retention period ranging from 1 to 365 days. This property is only applicable
     * to FIFO topics; attempting to use it with standard topics will result in a creation failure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-archivepolicy)
     */
    override fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

    /**
     * `ContentBasedDeduplication` enables deduplication of messages based on their content for FIFO
     * topics.
     *
     * By default, this property is set to false. If you create a FIFO topic with
     * `ContentBasedDeduplication` set to false, you must provide a `MessageDeduplicationId` for each
     * `Publish` action. When set to true, Amazon SNS automatically generates a
     * `MessageDeduplicationId` using a SHA-256 hash of the message body (excluding message
     * attributes). You can optionally override this generated value by specifying a
     * `MessageDeduplicationId` in the `Publish` action. Note that this property only applies to FIFO
     * topics; using it with standard topics will cause the creation to fail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     */
    override fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

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
     */
    override fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

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
     */
    override fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

    /**
     * The display name to use for an Amazon SNS topic with SMS subscriptions.
     *
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     */
    override fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

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
     */
    override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    /**
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * By default, `SignatureVersion` is set to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-signatureversion)
     */
    override fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

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
     */
    override fun subscription(): Any? = unwrap(this).getSubscription()

    /**
     * The list of tags to add to a new topic.
     *
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun topicName(): String? = unwrap(this).getTopicName()

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an Amazon SNS publisher to its subscriptions. If set to `Active` ,
     * Amazon SNS will vend X-Ray segment data to topic owner account if the sampled flag in the
     * tracing header is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tracingconfig)
     */
    override fun tracingConfig(): String? = unwrap(this).getTracingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicProps): CfnTopicProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnTopicProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicProps): software.amazon.awscdk.services.sns.CfnTopicProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopicProps
  }
}
