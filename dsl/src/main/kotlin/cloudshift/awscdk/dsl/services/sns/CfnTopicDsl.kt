@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sns.CfnTopic
import software.constructs.Construct

/**
 * The `AWS::SNS::Topic` resource creates a topic to which notifications can be published.
 *
 * One account can create a maximum of 100,000 standard topics and 1,000 FIFO topics. For more
 * information, see
 * [Amazon SNS endpoints and quotas](https://docs.aws.amazon.com/general/latest/gr/sns.html) in the
 * *AWS General Reference* .
 *
 * Example:
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
@CdkDslMarker
public class CfnTopicDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTopic.Builder = CfnTopic.Builder.create(scope, id)

    private val _subscription: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * Enables content-based deduplication for FIFO topics.
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     *   this attribute is `false` , you must specify a value for the `MessageDeduplicationId`
     *   parameter for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html)
     *   action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     *   generate the `MessageDeduplicationId` using the body of the message (but not the attributes
     *   of the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     *
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * Enables content-based deduplication for FIFO topics.
     * * By default, `ContentBasedDeduplication` is set to `false` . If you create a FIFO topic and
     *   this attribute is `false` , you must specify a value for the `MessageDeduplicationId`
     *   parameter for the [Publish](https://docs.aws.amazon.com/sns/latest/api/API_Publish.html)
     *   action.
     * * When you set `ContentBasedDeduplication` to `true` , Amazon SNS uses a SHA-256 hash to
     *   generate the `MessageDeduplicationId` using the body of the message (but not the attributes
     *   of the message).
     *
     * (Optional) To override the generated value, you can specify a value for the the
     * `MessageDeduplicationId` parameter for the `Publish` action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-contentbaseddeduplication)
     *
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
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
     *
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(dataProtectionPolicy)
        cdkBuilder.dataProtectionPolicy(builder.map)
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
     *
     * @param dataProtectionPolicy The body of the policy document you want to use for this topic.
     */
    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    /**
     * The display name to use for an Amazon SNS topic with SMS subscriptions.
     *
     * The display name must be maximum 100 characters long, including hyphens (-), underscores (_),
     * spaces, and tabs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-displayname)
     *
     * @param displayName The display name to use for an Amazon SNS topic with SMS subscriptions.
     */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     *
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    public fun fifoTopic(fifoTopic: Boolean) {
        cdkBuilder.fifoTopic(fifoTopic)
    }

    /**
     * Set to true to create a FIFO topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-fifotopic)
     *
     * @param fifoTopic Set to true to create a FIFO topic.
     */
    public fun fifoTopic(fifoTopic: IResolvable) {
        cdkBuilder.fifoTopic(fifoTopic)
    }

    /**
     * The ID of an AWS managed customer master key (CMK) for Amazon SNS or a custom CMK.
     *
     * For more information, see
     * [Key terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * . For more examples, see
     * `[KeyId](https://docs.aws.amazon.com/kms/latest/APIReference/API_DescribeKey.html#API_DescribeKey_RequestParameters)`
     * in the *AWS Key Management Service API Reference* .
     *
     * This property applies only to
     * [server-side-encryption](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-kmsmasterkeyid)
     *
     * @param kmsMasterKeyId The ID of an AWS managed customer master key (CMK) for Amazon SNS or a
     *   custom CMK.
     */
    public fun kmsMasterKeyId(kmsMasterKeyId: String) {
        cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    /**
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent
     * by Amazon SNS.
     *
     * By default, `SignatureVersion` is set to `1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-signatureversion)
     *
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     *   creating the signature of the notifications, subscription confirmations, or unsubscribe
     *   confirmation messages sent by Amazon SNS.
     */
    public fun signatureVersion(signatureVersion: String) {
        cdkBuilder.signatureVersion(signatureVersion)
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     *
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     */
    public fun subscription(vararg subscription: Any) {
        _subscription.addAll(listOf(*subscription))
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     *
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     */
    public fun subscription(subscription: Collection<Any>) {
        _subscription.addAll(subscription)
    }

    /**
     * The Amazon SNS subscriptions (endpoints) for this topic.
     *
     * If you specify the `Subscription` property in the `AWS::SNS::Topic` resource and it creates
     * an associated subscription resource, the associated subscription is not deleted when the
     * `AWS::SNS::Topic` resource is deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-subscription)
     *
     * @param subscription The Amazon SNS subscriptions (endpoints) for this topic.
     */
    public fun subscription(subscription: IResolvable) {
        cdkBuilder.subscription(subscription)
    }

    /**
     * The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     *
     * @param tags The list of tags to add to a new topic.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The list of tags to add to a new topic.
     *
     * To be able to tag a topic on creation, you must have the `sns:CreateTopic` and
     * `sns:TagResource` permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tags)
     *
     * @param tags The list of tags to add to a new topic.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the topic you want to create.
     *
     * Topic names must include only uppercase and lowercase ASCII letters, numbers, underscores,
     * and hyphens, and must be between 1 and 256 characters long. FIFO topic names must end with
     * `.fifo` .
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the topic name. For more information, see
     * [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-topicname)
     *
     * @param topicName The name of the topic you want to create.
     */
    public fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
    }

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * By default `TracingConfig` is set to `PassThrough` , and the topic passes through the tracing
     * header it receives from an SNS publisher to its subscriptions. If set to `Active` , SNS will
     * vend X-Ray segment data to topic owner account if the sampled flag in the tracing header is
     * true. Only supported on standard topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-topic.html#cfn-sns-topic-tracingconfig)
     *
     * @param tracingConfig Tracing mode of an Amazon SNS topic.
     */
    public fun tracingConfig(tracingConfig: String) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): CfnTopic {
        if (_subscription.isNotEmpty()) cdkBuilder.subscription(_subscription)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
