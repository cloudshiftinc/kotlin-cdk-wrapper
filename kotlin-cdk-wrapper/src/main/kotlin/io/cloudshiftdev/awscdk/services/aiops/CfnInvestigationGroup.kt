@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aiops

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an *investigation group* in your account.
 *
 * Creating an investigation group is a one-time setup task for each Region in your account. It is a
 * necessary task to be able to perform investigations.
 *
 * Settings in the investigation group help you centrally manage the common properties of your
 * investigations, such as the following:
 *
 * * Who can access the investigations
 * * Whether investigation data is encrypted with a customer managed AWS Key Management Service key.
 * * How long investigations and their data are retained by default.
 *
 * Currently, you can have one investigation group in each Region in your account. Each
 * investigation in a Region is a part of the investigation group in that Region
 *
 * To create an investigation group and set up CloudWatch investigations, you must be signed in to
 * an IAM principal that has either the `AIOpsConsoleAdminPolicy` or the `AdministratorAccess` IAM
 * policy attached, or to an account that has similar permissions.
 *
 *
 * You can configure CloudWatch alarms to start investigations and add events to investigations. If
 * you create your investigation group with `CreateInvestigationGroup` and you want to enable alarms to
 * do this, you must use `PutInvestigationGroupPolicy` to create a resource policy that grants this
 * permission to CloudWatch alarms.
 *
 * For more information about configuring CloudWatch alarms, see [Using Amazon CloudWatch
 * alarms](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/AlarmThatSendsEmail.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aiops.*;
 * CfnInvestigationGroup cfnInvestigationGroup = CfnInvestigationGroup.Builder.create(this,
 * "MyCfnInvestigationGroup")
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
public open class CfnInvestigationGroup(
  cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInvestigationGroupProps,
  ) :
      this(software.amazon.awscdk.services.aiops.CfnInvestigationGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInvestigationGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInvestigationGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInvestigationGroupProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the investigation group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the investigation group was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The name of the user who created the investigation group.
   */
  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  /**
   * The date and time that the investigation group was most recently modified.
   */
  public open fun attrLastModifiedAt(): String = unwrap(this).getAttrLastModifiedAt()

  /**
   * The name of the user who created the investigation group.
   */
  public open fun attrLastModifiedBy(): String = unwrap(this).getAttrLastModifiedBy()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Use this property to integrate CloudWatch investigations with chat applications.
   */
  public open fun chatbotNotificationChannels(): Any? =
      unwrap(this).getChatbotNotificationChannels()

  /**
   * Use this property to integrate CloudWatch investigations with chat applications.
   */
  public open fun chatbotNotificationChannels(`value`: IResolvable) {
    unwrap(this).setChatbotNotificationChannels(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Use this property to integrate CloudWatch investigations with chat applications.
   */
  public open fun chatbotNotificationChannels(`value`: List<Any>) {
    unwrap(this).setChatbotNotificationChannels(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Use this property to integrate CloudWatch investigations with chat applications.
   */
  public open fun chatbotNotificationChannels(vararg `value`: Any): Unit =
      chatbotNotificationChannels(`value`.toList())

  /**
   * List of `sourceRoleArn` values that have been configured for cross-account access.
   */
  public open fun crossAccountConfigurations(): Any? = unwrap(this).getCrossAccountConfigurations()

  /**
   * List of `sourceRoleArn` values that have been configured for cross-account access.
   */
  public open fun crossAccountConfigurations(`value`: IResolvable) {
    unwrap(this).setCrossAccountConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * List of `sourceRoleArn` values that have been configured for cross-account access.
   */
  public open fun crossAccountConfigurations(`value`: List<Any>) {
    unwrap(this).setCrossAccountConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * List of `sourceRoleArn` values that have been configured for cross-account access.
   */
  public open fun crossAccountConfigurations(vararg `value`: Any): Unit =
      crossAccountConfigurations(`value`.toList())

  /**
   * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
   * if there is one.
   */
  public open fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
   * if there is one.
   */
  public open fun encryptionConfig(`value`: IResolvable) {
    unwrap(this).setEncryptionConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
   * if there is one.
   */
  public open fun encryptionConfig(`value`: EncryptionConfigMapProperty) {
    unwrap(this).setEncryptionConfig(`value`.let(EncryptionConfigMapProperty.Companion::unwrap))
  }

  /**
   * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
   * if there is one.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca670ce1e4c6f258bab4972651fe0d7065a574f74b0dfb8eee61861f13b7e6c1")
  public open fun encryptionConfig(`value`: EncryptionConfigMapProperty.Builder.() -> Unit): Unit =
      encryptionConfig(EncryptionConfigMapProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Returns the JSON of the IAM resource policy associated with the specified investigation group
   * in a string.
   */
  public open fun investigationGroupPolicy(): String? = unwrap(this).getInvestigationGroupPolicy()

  /**
   * Returns the JSON of the IAM resource policy associated with the specified investigation group
   * in a string.
   */
  public open fun investigationGroupPolicy(`value`: String) {
    unwrap(this).setInvestigationGroupPolicy(`value`)
  }

  /**
   * Specify `true` to enable CloudWatch investigations to have access to change events that are
   * recorded by CloudTrail.
   */
  public open fun isCloudTrailEventHistoryEnabled(): Any? =
      unwrap(this).getIsCloudTrailEventHistoryEnabled()

  /**
   * Specify `true` to enable CloudWatch investigations to have access to change events that are
   * recorded by CloudTrail.
   */
  public open fun isCloudTrailEventHistoryEnabled(`value`: Boolean) {
    unwrap(this).setIsCloudTrailEventHistoryEnabled(`value`)
  }

  /**
   * Specify `true` to enable CloudWatch investigations to have access to change events that are
   * recorded by CloudTrail.
   */
  public open fun isCloudTrailEventHistoryEnabled(`value`: IResolvable) {
    unwrap(this).setIsCloudTrailEventHistoryEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specify either the name or the ARN of the investigation group that you want to view.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Specify either the name or the ARN of the investigation group that you want to view.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies how long that investigation data is kept.
   */
  public open fun retentionInDays(): Number? = unwrap(this).getRetentionInDays()

  /**
   * Specifies how long that investigation data is kept.
   */
  public open fun retentionInDays(`value`: Number) {
    unwrap(this).setRetentionInDays(`value`)
  }

  /**
   * The ARN of the IAM role that the investigation group uses for permissions to gather data.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role that the investigation group uses for permissions to gather data.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Displays the custom tag keys for custom applications in your system that you have specified in
   * the investigation group.
   */
  public open fun tagKeyBoundaries(): List<String> = unwrap(this).getTagKeyBoundaries() ?:
      emptyList()

  /**
   * Displays the custom tag keys for custom applications in your system that you have specified in
   * the investigation group.
   */
  public open fun tagKeyBoundaries(`value`: List<String>) {
    unwrap(this).setTagKeyBoundaries(`value`)
  }

  /**
   * Displays the custom tag keys for custom applications in your system that you have specified in
   * the investigation group.
   */
  public open fun tagKeyBoundaries(vararg `value`: String): Unit =
      tagKeyBoundaries(`value`.toList())

  /**
   * The list of key-value pairs to associate with the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The list of key-value pairs to associate with the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The list of key-value pairs to associate with the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.aiops.CfnInvestigationGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    public fun chatbotNotificationChannels(chatbotNotificationChannels: IResolvable)

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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    public fun chatbotNotificationChannels(chatbotNotificationChannels: List<Any>)

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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    public fun chatbotNotificationChannels(vararg chatbotNotificationChannels: Any)

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    public fun crossAccountConfigurations(crossAccountConfigurations: IResolvable)

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    public fun crossAccountConfigurations(crossAccountConfigurations: List<Any>)

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    public fun crossAccountConfigurations(vararg crossAccountConfigurations: Any)

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    public fun encryptionConfig(encryptionConfig: IResolvable)

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    public fun encryptionConfig(encryptionConfig: EncryptionConfigMapProperty)

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5af0475f497e8e27d6605bee5d5643ff0fbaac93a1dd6cf04e9d972f7d97f36a")
    public fun encryptionConfig(encryptionConfig: EncryptionConfigMapProperty.Builder.() -> Unit)

    /**
     * Returns the JSON of the IAM resource policy associated with the specified investigation group
     * in a string.
     *
     * For example,
     * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-investigationgrouppolicy)
     * @param investigationGroupPolicy Returns the JSON of the IAM resource policy associated with
     * the specified investigation group in a string. 
     */
    public fun investigationGroupPolicy(investigationGroupPolicy: String)

    /**
     * Specify `true` to enable CloudWatch investigations to have access to change events that are
     * recorded by CloudTrail.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail. 
     */
    public fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: Boolean)

    /**
     * Specify `true` to enable CloudWatch investigations to have access to change events that are
     * recorded by CloudTrail.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail. 
     */
    public fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: IResolvable)

    /**
     * Specify either the name or the ARN of the investigation group that you want to view.
     *
     * This is used to set the name of the investigation group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-name)
     * @param name Specify either the name or the ARN of the investigation group that you want to
     * view. 
     */
    public fun name(name: String)

    /**
     * Specifies how long that investigation data is kept.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-retentionindays)
     * @param retentionInDays Specifies how long that investigation data is kept. 
     */
    public fun retentionInDays(retentionInDays: Number)

    /**
     * The ARN of the IAM role that the investigation group uses for permissions to gather data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-rolearn)
     * @param roleArn The ARN of the IAM role that the investigation group uses for permissions to
     * gather data. 
     */
    public fun roleArn(roleArn: String)

    /**
     * Displays the custom tag keys for custom applications in your system that you have specified
     * in the investigation group.
     *
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group. 
     */
    public fun tagKeyBoundaries(tagKeyBoundaries: List<String>)

    /**
     * Displays the custom tag keys for custom applications in your system that you have specified
     * in the investigation group.
     *
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group. 
     */
    public fun tagKeyBoundaries(vararg tagKeyBoundaries: String)

    /**
     * The list of key-value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
     * @param tags The list of key-value pairs to associate with the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of key-value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
     * @param tags The list of key-value pairs to associate with the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.Builder =
        software.amazon.awscdk.services.aiops.CfnInvestigationGroup.Builder.create(scope, id)

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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    override fun chatbotNotificationChannels(chatbotNotificationChannels: IResolvable) {
      cdkBuilder.chatbotNotificationChannels(chatbotNotificationChannels.let(IResolvable.Companion::unwrap))
    }

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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    override fun chatbotNotificationChannels(chatbotNotificationChannels: List<Any>) {
      cdkBuilder.chatbotNotificationChannels(chatbotNotificationChannels.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param chatbotNotificationChannels Use this property to integrate CloudWatch investigations
     * with chat applications. 
     */
    override fun chatbotNotificationChannels(vararg chatbotNotificationChannels: Any): Unit =
        chatbotNotificationChannels(chatbotNotificationChannels.toList())

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    override fun crossAccountConfigurations(crossAccountConfigurations: IResolvable) {
      cdkBuilder.crossAccountConfigurations(crossAccountConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    override fun crossAccountConfigurations(crossAccountConfigurations: List<Any>) {
      cdkBuilder.crossAccountConfigurations(crossAccountConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * List of `sourceRoleArn` values that have been configured for cross-account access.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-crossaccountconfigurations)
     * @param crossAccountConfigurations List of `sourceRoleArn` values that have been configured
     * for cross-account access. 
     */
    override fun crossAccountConfigurations(vararg crossAccountConfigurations: Any): Unit =
        crossAccountConfigurations(crossAccountConfigurations.toList())

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    override fun encryptionConfig(encryptionConfig: IResolvable) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    override fun encryptionConfig(encryptionConfig: EncryptionConfigMapProperty) {
      cdkBuilder.encryptionConfig(encryptionConfig.let(EncryptionConfigMapProperty.Companion::unwrap))
    }

    /**
     * Specifies the customer managed AWS KMS key that the investigation group uses to encrypt data,
     * if there is one.
     *
     * If not, the investigation group uses an AWS key to encrypt the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-encryptionconfig)
     * @param encryptionConfig Specifies the customer managed AWS KMS key that the investigation
     * group uses to encrypt data, if there is one. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5af0475f497e8e27d6605bee5d5643ff0fbaac93a1dd6cf04e9d972f7d97f36a")
    override fun encryptionConfig(encryptionConfig: EncryptionConfigMapProperty.Builder.() -> Unit):
        Unit = encryptionConfig(EncryptionConfigMapProperty(encryptionConfig))

    /**
     * Returns the JSON of the IAM resource policy associated with the specified investigation group
     * in a string.
     *
     * For example,
     * `{\"Version\":\"2012-10-17\",\"Statement\":[{\"Effect\":\"Allow\",\"Principal\":{\"Service\":\"aiops.alarms.cloudwatch.amazonaws.com\"},\"Action\":[\"aiops:CreateInvestigation\",\"aiops:CreateInvestigationEvent\"],\"Resource\":\"*\",\"Condition\":{\"StringEquals\":{\"aws:SourceAccount\":\"111122223333\"},\"ArnLike\":{\"aws:SourceArn\":\"arn:aws:cloudwatch:us-east-1:111122223333:alarm:*\"}}}]}`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-investigationgrouppolicy)
     * @param investigationGroupPolicy Returns the JSON of the IAM resource policy associated with
     * the specified investigation group in a string. 
     */
    override fun investigationGroupPolicy(investigationGroupPolicy: String) {
      cdkBuilder.investigationGroupPolicy(investigationGroupPolicy)
    }

    /**
     * Specify `true` to enable CloudWatch investigations to have access to change events that are
     * recorded by CloudTrail.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail. 
     */
    override fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: Boolean) {
      cdkBuilder.isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled)
    }

    /**
     * Specify `true` to enable CloudWatch investigations to have access to change events that are
     * recorded by CloudTrail.
     *
     * The default is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-iscloudtraileventhistoryenabled)
     * @param isCloudTrailEventHistoryEnabled Specify `true` to enable CloudWatch investigations to
     * have access to change events that are recorded by CloudTrail. 
     */
    override fun isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled: IResolvable) {
      cdkBuilder.isCloudTrailEventHistoryEnabled(isCloudTrailEventHistoryEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specify either the name or the ARN of the investigation group that you want to view.
     *
     * This is used to set the name of the investigation group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-name)
     * @param name Specify either the name or the ARN of the investigation group that you want to
     * view. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies how long that investigation data is kept.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-retentionindays)
     * @param retentionInDays Specifies how long that investigation data is kept. 
     */
    override fun retentionInDays(retentionInDays: Number) {
      cdkBuilder.retentionInDays(retentionInDays)
    }

    /**
     * The ARN of the IAM role that the investigation group uses for permissions to gather data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-rolearn)
     * @param roleArn The ARN of the IAM role that the investigation group uses for permissions to
     * gather data. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * Displays the custom tag keys for custom applications in your system that you have specified
     * in the investigation group.
     *
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group. 
     */
    override fun tagKeyBoundaries(tagKeyBoundaries: List<String>) {
      cdkBuilder.tagKeyBoundaries(tagKeyBoundaries)
    }

    /**
     * Displays the custom tag keys for custom applications in your system that you have specified
     * in the investigation group.
     *
     * Resource tags help CloudWatch investigations narrow the search space when it is unable to
     * discover definite relationships between resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tagkeyboundaries)
     * @param tagKeyBoundaries Displays the custom tag keys for custom applications in your system
     * that you have specified in the investigation group. 
     */
    override fun tagKeyBoundaries(vararg tagKeyBoundaries: String): Unit =
        tagKeyBoundaries(tagKeyBoundaries.toList())

    /**
     * The list of key-value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
     * @param tags The list of key-value pairs to associate with the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The list of key-value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aiops-investigationgroup.html#cfn-aiops-investigationgroup-tags)
     * @param tags The list of key-value pairs to associate with the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aiops.CfnInvestigationGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInvestigationGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInvestigationGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup):
        CfnInvestigationGroup = CfnInvestigationGroup(cdkObject)

    internal fun unwrap(wrapped: CfnInvestigationGroup):
        software.amazon.awscdk.services.aiops.CfnInvestigationGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.aiops.CfnInvestigationGroup
  }

  /**
   * Use this structure to integrate CloudWatch investigations with chat applications.
   *
   * This structure is a string array. For the first string, specify the ARN of an Amazon SNS topic.
   * For the array of strings, specify the ARNs of one or more chat applications configurations that
   * you want to associate with that topic. For more information about these configuration ARNs, see
   * [Getting started with Amazon Q in chat
   * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/getting-started.html) and
   * [Resource type defined by AWS
   * Chatbot](https://docs.aws.amazon.com/service-authorization/latest/reference/list_awschatbot.html#awschatbot-resources-for-iam-policies)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aiops.*;
   * ChatbotNotificationChannelProperty chatbotNotificationChannelProperty =
   * ChatbotNotificationChannelProperty.builder()
   * .chatConfigurationArns(List.of("chatConfigurationArns"))
   * .snsTopicArn("snsTopicArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-chatbotnotificationchannel.html)
   */
  public interface ChatbotNotificationChannelProperty {
    /**
     * Returns the Amazon Resource Name (ARN) of any third-party chat integrations configured for
     * the account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-chatbotnotificationchannel.html#cfn-aiops-investigationgroup-chatbotnotificationchannel-chatconfigurationarns)
     */
    public fun chatConfigurationArns(): List<String> = unwrap(this).getChatConfigurationArns() ?:
        emptyList()

    /**
     * Returns the ARN of an Amazon SNS topic used for third-party chat integrations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-chatbotnotificationchannel.html#cfn-aiops-investigationgroup-chatbotnotificationchannel-snstopicarn)
     */
    public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * A builder for [ChatbotNotificationChannelProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param chatConfigurationArns Returns the Amazon Resource Name (ARN) of any third-party chat
       * integrations configured for the account.
       */
      public fun chatConfigurationArns(chatConfigurationArns: List<String>)

      /**
       * @param chatConfigurationArns Returns the Amazon Resource Name (ARN) of any third-party chat
       * integrations configured for the account.
       */
      public fun chatConfigurationArns(vararg chatConfigurationArns: String)

      /**
       * @param snsTopicArn Returns the ARN of an Amazon SNS topic used for third-party chat
       * integrations.
       */
      public fun snsTopicArn(snsTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty.Builder
          =
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty.builder()

      /**
       * @param chatConfigurationArns Returns the Amazon Resource Name (ARN) of any third-party chat
       * integrations configured for the account.
       */
      override fun chatConfigurationArns(chatConfigurationArns: List<String>) {
        cdkBuilder.chatConfigurationArns(chatConfigurationArns)
      }

      /**
       * @param chatConfigurationArns Returns the Amazon Resource Name (ARN) of any third-party chat
       * integrations configured for the account.
       */
      override fun chatConfigurationArns(vararg chatConfigurationArns: String): Unit =
          chatConfigurationArns(chatConfigurationArns.toList())

      /**
       * @param snsTopicArn Returns the ARN of an Amazon SNS topic used for third-party chat
       * integrations.
       */
      override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty,
    ) : CdkObject(cdkObject),
        ChatbotNotificationChannelProperty {
      /**
       * Returns the Amazon Resource Name (ARN) of any third-party chat integrations configured for
       * the account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-chatbotnotificationchannel.html#cfn-aiops-investigationgroup-chatbotnotificationchannel-chatconfigurationarns)
       */
      override fun chatConfigurationArns(): List<String> = unwrap(this).getChatConfigurationArns()
          ?: emptyList()

      /**
       * Returns the ARN of an Amazon SNS topic used for third-party chat integrations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-chatbotnotificationchannel.html#cfn-aiops-investigationgroup-chatbotnotificationchannel-snstopicarn)
       */
      override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ChatbotNotificationChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty):
          ChatbotNotificationChannelProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ChatbotNotificationChannelProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChatbotNotificationChannelProperty):
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.ChatbotNotificationChannelProperty
    }
  }

  /**
   * This structure contains information about the cross-account configuration in the account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aiops.*;
   * CrossAccountConfigurationProperty crossAccountConfigurationProperty =
   * CrossAccountConfigurationProperty.builder()
   * .sourceRoleArn("sourceRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-crossaccountconfiguration.html)
   */
  public interface CrossAccountConfigurationProperty {
    /**
     * The ARN of an existing role which will be used to do investigations on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-crossaccountconfiguration.html#cfn-aiops-investigationgroup-crossaccountconfiguration-sourcerolearn)
     */
    public fun sourceRoleArn(): String? = unwrap(this).getSourceRoleArn()

    /**
     * A builder for [CrossAccountConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceRoleArn The ARN of an existing role which will be used to do investigations on
       * your behalf.
       */
      public fun sourceRoleArn(sourceRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty.builder()

      /**
       * @param sourceRoleArn The ARN of an existing role which will be used to do investigations on
       * your behalf.
       */
      override fun sourceRoleArn(sourceRoleArn: String) {
        cdkBuilder.sourceRoleArn(sourceRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty,
    ) : CdkObject(cdkObject),
        CrossAccountConfigurationProperty {
      /**
       * The ARN of an existing role which will be used to do investigations on your behalf.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-crossaccountconfiguration.html#cfn-aiops-investigationgroup-crossaccountconfiguration-sourcerolearn)
       */
      override fun sourceRoleArn(): String? = unwrap(this).getSourceRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrossAccountConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty):
          CrossAccountConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CrossAccountConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossAccountConfigurationProperty):
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.CrossAccountConfigurationProperty
    }
  }

  /**
   * Use this structure if you want to use a customer managed AWS KMS key to encrypt your
   * investigation data.
   *
   * If you omit this parameter, CloudWatch investigations will use an AWS key to encrypt the data.
   * For more information, see [Encryption of investigation
   * data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Investigations-Security.html#Investigations-KMS)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aiops.*;
   * EncryptionConfigMapProperty encryptionConfigMapProperty = EncryptionConfigMapProperty.builder()
   * .encryptionConfigurationType("encryptionConfigurationType")
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-encryptionconfigmap.html)
   */
  public interface EncryptionConfigMapProperty {
    /**
     * Displays whether investigation data is encrypted by a customer managed key or an AWS owned
     * key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-encryptionconfigmap.html#cfn-aiops-investigationgroup-encryptionconfigmap-encryptionconfigurationtype)
     */
    public fun encryptionConfigurationType(): String? =
        unwrap(this).getEncryptionConfigurationType()

    /**
     * If the investigation group uses a customer managed key for encryption, this field displays
     * the ID of that key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-encryptionconfigmap.html#cfn-aiops-investigationgroup-encryptionconfigmap-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [EncryptionConfigMapProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionConfigurationType Displays whether investigation data is encrypted by a
       * customer managed key or an AWS owned key.
       */
      public fun encryptionConfigurationType(encryptionConfigurationType: String)

      /**
       * @param kmsKeyId If the investigation group uses a customer managed key for encryption, this
       * field displays the ID of that key.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty.Builder
          =
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty.builder()

      /**
       * @param encryptionConfigurationType Displays whether investigation data is encrypted by a
       * customer managed key or an AWS owned key.
       */
      override fun encryptionConfigurationType(encryptionConfigurationType: String) {
        cdkBuilder.encryptionConfigurationType(encryptionConfigurationType)
      }

      /**
       * @param kmsKeyId If the investigation group uses a customer managed key for encryption, this
       * field displays the ID of that key.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty,
    ) : CdkObject(cdkObject),
        EncryptionConfigMapProperty {
      /**
       * Displays whether investigation data is encrypted by a customer managed key or an AWS owned
       * key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-encryptionconfigmap.html#cfn-aiops-investigationgroup-encryptionconfigmap-encryptionconfigurationtype)
       */
      override fun encryptionConfigurationType(): String? =
          unwrap(this).getEncryptionConfigurationType()

      /**
       * If the investigation group uses a customer managed key for encryption, this field displays
       * the ID of that key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aiops-investigationgroup-encryptionconfigmap.html#cfn-aiops-investigationgroup-encryptionconfigmap-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigMapProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty):
          EncryptionConfigMapProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionConfigMapProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigMapProperty):
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.aiops.CfnInvestigationGroup.EncryptionConfigMapProperty
    }
  }
}
