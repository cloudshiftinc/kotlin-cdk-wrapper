@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aiops

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInvestigationGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aiops.*;
 * CfnInvestigationGroupProps cfnInvestigationGroupProps = CfnInvestigationGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .chatbotNotificationChannels(List.of(ChatbotNotificationChannelProperty.builder()
 * .chatConfigurationArns(List.of("chatConfigurationArns"))
 * .snsTopicArn("snsTopicArn")
 * .build()))
 * .crossAccountConfigurations(List.of(CrossAccountConfigurationProperty.builder()
 * .sourceRoleArn("sourceRoleArn")
 * .build()))
 * .encryptionConfig(EncryptionConfigMapProperty.builder()
 * .encryptionConfigurationType("encryptionConfigurationType")
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .investigationGroupPolicy("investigationGroupPolicy")
 * .isCloudTrailEventHistoryEnabled(false)
 * .retentionInDays(123)
 * .roleArn("roleArn")
 * .tagKeyBoundaries(List.of("tagKeyBoundaries"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html)
 */
public interface CfnInvestigationGroupProps {
  /**
   * Use this property to integrate CloudWatch investigations with chat applications.
   *
   * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
   * the array of strings, specify the ARNs of one or more chat applications configurations that you
   * want to associate with that topic. For more information about these configuration ARNs, see
   * [Getting started with Amazon Q in chat
   * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
   * [Resource type defined by AWS
   * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-chatbotnotificationchannels)
   */
  public fun chatbotNotificationChannels(): Any? = unwrap(this).getChatbotNotificationChannels()

  /**
   * List of `sourceRoleArn` values that have been configured for cross-account access.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
   */
  public fun crossAccountConfigurations(): Any? = unwrap(this).getCrossAccountConfigurations()

  /**
   * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
   * if there is one.
   *
   * If not, the investigation group uses an AWS key to encrypt the data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
   */
  public fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * Returns the JSON of the IAM resource policy associated with the specified investigation group
   * in a string.
   *
   * For example,
   * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-investigationgrouppolicy)
   */
  public fun investigationGroupPolicy(): String? = unwrap(this).getInvestigationGroupPolicy()

  /**
   * Specify `true` to enable CloudWatch investigations to have access to change events that are
   * recorded by CloudTrail.
   *
   * The default is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
   */
  public fun isCloudTrailEventHistoryEnabled(): Any? =
      unwrap(this).getIsCloudTrailEventHistoryEnabled()

  /**
   * Specify either the name or the ARN of the investigation group that you want to view.
   *
   * This is used to set the name of the investigation group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-name)
   */
  public fun name(): String

  /**
   * Specifies how long that investigation data is kept.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-retentionindays)
   */
  public fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  /**
   * The ARN of the IAM role that the investigation group uses for permissions to gather data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Displays the custom tag keys for custom applications in your system that you have specified in
   * the investigation group.
   *
   * Resource tags help CloudWatch investigations narrow the search space when it is unable to
   * discover definite relationships between resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
   */
  public fun tagKeyBoundaries(): List<String> = unwrap(this).getTagKeyBoundaries() ?: emptyList()

  /**
   * The list of key-value pairs to associate with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInvestigationGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    public fun chatbotNotificationChannels(chatbotNotificationChannels: IResolvable)

    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    public fun chatbotNotificationChannels(chatbotNotificationChannels: List<Any>)

    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    public fun chatbotNotificationChannels(vararg chatbotNotificationChannels: Any)

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    public fun crossAccountConfigurations(crossAccountConfigurations: IResolvable)

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    public fun crossAccountConfigurations(crossAccountConfigurations: List<Any>)

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    public fun crossAccountConfigurations(vararg crossAccountConfigurations: Any)

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    public fun encryptionConfig(encryptionConfig: IResolvable)

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    public fun encryptionConfig(encryptionConfig: CfnInvestigationGroup.EncryptionConfigMapProperty)

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e8f0d2378c88c482ac09a96b052a1203b16fcab119c4b6c8deb3e3f853f08b4")
    public
        fun encryptionConfig(encryptionConfig: CfnInvestigationGroup.EncryptionConfigMapProperty.Builder.() -> Unit)

    /**
     * @param investigationGroupPolicy Returns the JSON of the IAM resource policy associated with
     * the specified investigation group in a string.
     * For example,
     * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
     * .
     */
    public fun investigationGroupPolicy(investigationGroupPolicy: String)

    /**
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail.
     * The default is `true` .
     */
    public fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: Boolean)

    /**
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail.
     * The default is `true` .
     */
    public fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: IResolvable)

    /**
     * @param name Specify either the name or the ARN of the investigation group that you want to
     * view. 
     * This is used to set the name of the investigation group.
     */
    public fun name(name: String)

    /**
     * @param retentionInDays Specifies how long that investigation data is kept.
     */
    public fun retentionInDays(retentionInDays: Number)

    /**
     * @param roleArn The ARN of the IAM role that the investigation group uses for permissions to
     * gather data.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group.
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     */
    public fun tagKeyBoundaries(tagKeyBoundaries: List<String>)

    /**
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group.
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     */
    public fun tagKeyBoundaries(vararg tagKeyBoundaries: String)

    /**
     * @param tags The list of key-value pairs to associate with the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of key-value pairs to associate with the resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps.Builder
        = software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps.builder()

    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    override fun chatbotNotificationChannels(chatbotNotificationChannels: IResolvable) {
      cdkBuilder.chatbotNotificationChannels(chatbotNotificationChannels.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    override fun chatbotNotificationChannels(chatbotNotificationChannels: List<Any>) {
      cdkBuilder.chatbotNotificationChannels(chatbotNotificationChannels.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications.
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     */
    override fun chatbotNotificationChannels(vararg chatbotNotificationChannels: Any): Unit =
        chatbotNotificationChannels(chatbotNotificationChannels.toList())

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    override fun crossAccountConfigurations(crossAccountConfigurations: IResolvable) {
      cdkBuilder.crossAccountConfigurations(crossAccountConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    override fun crossAccountConfigurations(crossAccountConfigurations: List<Any>) {
      cdkBuilder.crossAccountConfigurations(crossAccountConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access.
     */
    override fun crossAccountConfigurations(vararg crossAccountConfigurations: Any): Unit =
        crossAccountConfigurations(crossAccountConfigurations.toList())

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    override
        fun encryptionConfig(encryptionConfig: CfnInvestigationGroup.EncryptionConfigMapProperty) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(CfnInvestigationGroup.EncryptionConfigMapProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one.
     * If not, the investigation group uses an AWS key to encrypt the data.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e8f0d2378c88c482ac09a96b052a1203b16fcab119c4b6c8deb3e3f853f08b4")
    override
        fun encryptionConfig(encryptionConfig: CfnInvestigationGroup.EncryptionConfigMapProperty.Builder.() -> Unit):
        Unit = encryptionConfig(CfnInvestigationGroup.EncryptionConfigMapProperty(encryptionConfig))

    /**
     * @param investigationGroupPolicy Returns the JSON of the IAM resource policy associated with
     * the specified investigation group in a string.
     * For example,
     * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
     * .
     */
    override fun investigationGroupPolicy(investigationGroupPolicy: String) {
      cdkBuilder.investigationGroupPolicy(investigationGroupPolicy)
    }

    /**
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail.
     * The default is `true` .
     */
    override fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: Boolean) {
      cdkBuilder.isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled)
    }

    /**
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail.
     * The default is `true` .
     */
    override fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: IResolvable) {
      cdkBuilder.isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name Specify either the name or the ARN of the investigation group that you want to
     * view. 
     * This is used to set the name of the investigation group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param retentionInDays Specifies how long that investigation data is kept.
     */
    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    /**
     * @param roleArn The ARN of the IAM role that the investigation group uses for permissions to
     * gather data.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group.
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     */
    override fun tagKeyBoundaries(tagKeyBoundaries: List<String>) {
      cdkBuilder.tagKeyBoundaries(tagKeyBoundaries)
    }

    /**
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group.
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     */
    override fun tagKeyBoundaries(vararg tagKeyBoundaries: String): Unit =
        tagKeyBoundaries(tagKeyBoundaries.toList())

    /**
     * @param tags The list of key-value pairs to associate with the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The list of key-value pairs to associate with the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps,
  ) : CdkObject(cdkObject),
      CfnInvestigationGroupProps {
    /**
     * Use this property to integrate CloudWatch investigations with chat applications.
     *
     * This property is an array. For the first string, specify the ARN of an Amazon SNS topic. For
     * the array of strings, specify the ARNs of one or more chat applications configurations that you
     * want to associate with that topic. For more information about these configuration ARNs, see
     * [Getting started with Amazon Q in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
     * [Resource type defined by AWS
     * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-chatbotnotificationchannels)
     */
    override fun chatbotNotificationChannels(): Any? = unwrap(this).getChatbotNotificationChannels()

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     */
    override fun crossAccountConfigurations(): Any? = unwrap(this).getCrossAccountConfigurations()

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     */
    override fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

    /**
     * Returns the JSON of the IAM resource policy associated with the specified investigation group
     * in a string.
     *
     * For example,
     * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-investigationgrouppolicy)
     */
    override fun investigationGroupPolicy(): String? = unwrap(this).getInvestigationGroupPolicy()

    /**
     * Specify `true` to enable CloudWatch investigations to have access to change events that are
     * recorded by CloudTrail.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
     */
    override fun isCloudTrailEventHistoryEnabled(): Any? =
        unwrap(this).getIsCloudTrailEventHistoryEnabled()

    /**
     * Specify either the name or the ARN of the investigation group that you want to view.
     *
     * This is used to set the name of the investigation group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Specifies how long that investigation data is kept.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-retentionindays)
     */
    override fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

    /**
     * The ARN of the IAM role that the investigation group uses for permissions to gather data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Displays the custom tag keys for custom applications in your system that you have specified
     * in the investigation group.
     *
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
     */
    override fun tagKeyBoundaries(): List<String> = unwrap(this).getTagKeyBoundaries() ?:
        emptyList()

    /**
     * The list of key-value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInvestigationGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps):
        CfnInvestigationGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInvestigationGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInvestigationGroupProps):
        software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.aiops.CfnInvestigationGroupProps
  }
}
