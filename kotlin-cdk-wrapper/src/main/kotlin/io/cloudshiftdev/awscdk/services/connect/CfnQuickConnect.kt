@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a quick connect for an Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnQuickConnect cfnQuickConnect = CfnQuickConnect.Builder.create(this, "MyCfnQuickConnect")
 * .instanceArn("instanceArn")
 * .name("name")
 * .quickConnectConfig(QuickConnectConfigProperty.builder()
 * .quickConnectType("quickConnectType")
 * // the properties below are optional
 * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
 * .phoneNumber("phoneNumber")
 * .build())
 * .queueConfig(QueueQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .queueArn("queueArn")
 * .build())
 * .userConfig(UserQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .userArn("userArn")
 * .build())
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html)
 */
public open class CfnQuickConnect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) for the quick connect.
   */
  public open fun attrQuickConnectArn(): String = unwrap(this).getAttrQuickConnectArn()

  /**
   * The type of quick connect.
   *
   * In the Amazon Connect admin website, when you create a quick connect, you are prompted to
   * assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
   */
  public open fun attrQuickConnectType(): String = unwrap(this).getAttrQuickConnectType()

  /**
   * The description of the quick connect.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the quick connect.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the quick connect.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the quick connect.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Contains information about the quick connect.
   */
  public open fun quickConnectConfig(): Any = unwrap(this).getQuickConnectConfig()

  /**
   * Contains information about the quick connect.
   */
  public open fun quickConnectConfig(`value`: IResolvable) {
    unwrap(this).setQuickConnectConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains information about the quick connect.
   */
  public open fun quickConnectConfig(`value`: QuickConnectConfigProperty) {
    unwrap(this).setQuickConnectConfig(`value`.let(QuickConnectConfigProperty::unwrap))
  }

  /**
   * Contains information about the quick connect.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c0360f57021ec0b5a9864268641e31c827c2add76c550e97e9bf263ff3a3c7d2")
  public open fun quickConnectConfig(`value`: QuickConnectConfigProperty.Builder.() -> Unit): Unit =
      quickConnectConfig(QuickConnectConfigProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnQuickConnect].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-description)
     * @param description The description of the quick connect. 
     */
    public fun description(description: String)

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-name)
     * @param name The name of the quick connect. 
     */
    public fun name(name: String)

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    public fun quickConnectConfig(quickConnectConfig: IResolvable)

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    public fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty)

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66facc532a2e04b3aeb9c446901372563a69d59c013e8aab2c125b1fdcf2ec41")
    public fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty.Builder.() -> Unit)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnQuickConnect.Builder =
        software.amazon.awscdk.services.connect.CfnQuickConnect.Builder.create(scope, id)

    /**
     * The description of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-description)
     * @param description The description of the quick connect. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-instancearn)
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-name)
     * @param name The name of the quick connect. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    override fun quickConnectConfig(quickConnectConfig: IResolvable) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(IResolvable::unwrap))
    }

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    override fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty) {
      cdkBuilder.quickConnectConfig(quickConnectConfig.let(QuickConnectConfigProperty::unwrap))
    }

    /**
     * Contains information about the quick connect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-quickconnectconfig)
     * @param quickConnectConfig Contains information about the quick connect. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66facc532a2e04b3aeb9c446901372563a69d59c013e8aab2c125b1fdcf2ec41")
    override
        fun quickConnectConfig(quickConnectConfig: QuickConnectConfigProperty.Builder.() -> Unit):
        Unit = quickConnectConfig(QuickConnectConfigProperty(quickConnectConfig))

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "Tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-quickconnect.html#cfn-connect-quickconnect-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnQuickConnect = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnQuickConnect.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQuickConnect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQuickConnect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect):
        CfnQuickConnect = CfnQuickConnect(cdkObject)

    internal fun unwrap(wrapped: CfnQuickConnect):
        software.amazon.awscdk.services.connect.CfnQuickConnect = wrapped.cdkObject
  }

  /**
   * Contains information about a phone number for a quick connect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * PhoneNumberQuickConnectConfigProperty phoneNumberQuickConnectConfigProperty =
   * PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-phonenumberquickconnectconfig.html)
   */
  public interface PhoneNumberQuickConnectConfigProperty {
    /**
     * The phone number in E.164 format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-phonenumberquickconnectconfig.html#cfn-connect-quickconnect-phonenumberquickconnectconfig-phonenumber)
     */
    public fun phoneNumber(): String

    /**
     * A builder for [PhoneNumberQuickConnectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param phoneNumber The phone number in E.164 format. 
       */
      public fun phoneNumber(phoneNumber: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty.builder()

      /**
       * @param phoneNumber The phone number in E.164 format. 
       */
      override fun phoneNumber(phoneNumber: String) {
        cdkBuilder.phoneNumber(phoneNumber)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty,
    ) : CdkObject(cdkObject), PhoneNumberQuickConnectConfigProperty {
      /**
       * The phone number in E.164 format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-phonenumberquickconnectconfig.html#cfn-connect-quickconnect-phonenumberquickconnectconfig-phonenumber)
       */
      override fun phoneNumber(): String = unwrap(this).getPhoneNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhoneNumberQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty):
          PhoneNumberQuickConnectConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PhoneNumberQuickConnectConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PhoneNumberQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnQuickConnect.PhoneNumberQuickConnectConfigProperty
    }
  }

  /**
   * Contains configuration settings for a quick connect.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * QuickConnectConfigProperty quickConnectConfigProperty = QuickConnectConfigProperty.builder()
   * .quickConnectType("quickConnectType")
   * // the properties below are optional
   * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
   * .phoneNumber("phoneNumber")
   * .build())
   * .queueConfig(QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build())
   * .userConfig(UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html)
   */
  public interface QuickConnectConfigProperty {
    /**
     * The phone configuration.
     *
     * This is required only if QuickConnectType is PHONE_NUMBER.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-phoneconfig)
     */
    public fun phoneConfig(): Any? = unwrap(this).getPhoneConfig()

    /**
     * The queue configuration.
     *
     * This is required only if QuickConnectType is QUEUE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-queueconfig)
     */
    public fun queueConfig(): Any? = unwrap(this).getQueueConfig()

    /**
     * The type of quick connect.
     *
     * In the Amazon Connect console, when you create a quick connect, you are prompted to assign
     * one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-quickconnecttype)
     */
    public fun quickConnectType(): String

    /**
     * The user configuration.
     *
     * This is required only if QuickConnectType is USER.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-userconfig)
     */
    public fun userConfig(): Any? = unwrap(this).getUserConfig()

    /**
     * A builder for [QuickConnectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      public fun phoneConfig(phoneConfig: IResolvable)

      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      public fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty)

      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd908e480eaaa1a415c0cfc241b89017d858ffe71e52b69ee36a7549850ea97")
      public fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty.Builder.() -> Unit)

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      public fun queueConfig(queueConfig: IResolvable)

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      public fun queueConfig(queueConfig: QueueQuickConnectConfigProperty)

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b017bd39c984da0288194f7ee2258d3baea9f333ac105fbfca15bd258043ebac")
      public fun queueConfig(queueConfig: QueueQuickConnectConfigProperty.Builder.() -> Unit)

      /**
       * @param quickConnectType The type of quick connect. 
       * In the Amazon Connect console, when you create a quick connect, you are prompted to assign
       * one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
       */
      public fun quickConnectType(quickConnectType: String)

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      public fun userConfig(userConfig: IResolvable)

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      public fun userConfig(userConfig: UserQuickConnectConfigProperty)

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("841daf7430e31b2285dd0f375fab0519cc1a3755c3297f1c297f9761ce90cf40")
      public fun userConfig(userConfig: UserQuickConnectConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty.builder()

      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      override fun phoneConfig(phoneConfig: IResolvable) {
        cdkBuilder.phoneConfig(phoneConfig.let(IResolvable::unwrap))
      }

      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      override fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty) {
        cdkBuilder.phoneConfig(phoneConfig.let(PhoneNumberQuickConnectConfigProperty::unwrap))
      }

      /**
       * @param phoneConfig The phone configuration.
       * This is required only if QuickConnectType is PHONE_NUMBER.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5cd908e480eaaa1a415c0cfc241b89017d858ffe71e52b69ee36a7549850ea97")
      override
          fun phoneConfig(phoneConfig: PhoneNumberQuickConnectConfigProperty.Builder.() -> Unit):
          Unit = phoneConfig(PhoneNumberQuickConnectConfigProperty(phoneConfig))

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      override fun queueConfig(queueConfig: IResolvable) {
        cdkBuilder.queueConfig(queueConfig.let(IResolvable::unwrap))
      }

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      override fun queueConfig(queueConfig: QueueQuickConnectConfigProperty) {
        cdkBuilder.queueConfig(queueConfig.let(QueueQuickConnectConfigProperty::unwrap))
      }

      /**
       * @param queueConfig The queue configuration.
       * This is required only if QuickConnectType is QUEUE.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b017bd39c984da0288194f7ee2258d3baea9f333ac105fbfca15bd258043ebac")
      override fun queueConfig(queueConfig: QueueQuickConnectConfigProperty.Builder.() -> Unit):
          Unit = queueConfig(QueueQuickConnectConfigProperty(queueConfig))

      /**
       * @param quickConnectType The type of quick connect. 
       * In the Amazon Connect console, when you create a quick connect, you are prompted to assign
       * one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
       */
      override fun quickConnectType(quickConnectType: String) {
        cdkBuilder.quickConnectType(quickConnectType)
      }

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      override fun userConfig(userConfig: IResolvable) {
        cdkBuilder.userConfig(userConfig.let(IResolvable::unwrap))
      }

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      override fun userConfig(userConfig: UserQuickConnectConfigProperty) {
        cdkBuilder.userConfig(userConfig.let(UserQuickConnectConfigProperty::unwrap))
      }

      /**
       * @param userConfig The user configuration.
       * This is required only if QuickConnectType is USER.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("841daf7430e31b2285dd0f375fab0519cc1a3755c3297f1c297f9761ce90cf40")
      override fun userConfig(userConfig: UserQuickConnectConfigProperty.Builder.() -> Unit): Unit =
          userConfig(UserQuickConnectConfigProperty(userConfig))

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty,
    ) : CdkObject(cdkObject), QuickConnectConfigProperty {
      /**
       * The phone configuration.
       *
       * This is required only if QuickConnectType is PHONE_NUMBER.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-phoneconfig)
       */
      override fun phoneConfig(): Any? = unwrap(this).getPhoneConfig()

      /**
       * The queue configuration.
       *
       * This is required only if QuickConnectType is QUEUE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-queueconfig)
       */
      override fun queueConfig(): Any? = unwrap(this).getQueueConfig()

      /**
       * The type of quick connect.
       *
       * In the Amazon Connect console, when you create a quick connect, you are prompted to assign
       * one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-quickconnecttype)
       */
      override fun quickConnectType(): String = unwrap(this).getQuickConnectType()

      /**
       * The user configuration.
       *
       * This is required only if QuickConnectType is USER.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html#cfn-connect-quickconnect-quickconnectconfig-userconfig)
       */
      override fun userConfig(): Any? = unwrap(this).getUserConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty):
          QuickConnectConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QuickConnectConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnQuickConnect.QuickConnectConfigProperty
    }
  }

  /**
   * Contains information about the quick connect configuration settings for a user.
   *
   * The contact flow must be of type Transfer to Agent.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * UserQuickConnectConfigProperty userQuickConnectConfigProperty =
   * UserQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .userArn("userArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html)
   */
  public interface UserQuickConnectConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html#cfn-connect-quickconnect-userquickconnectconfig-contactflowarn)
     */
    public fun contactFlowArn(): String

    /**
     * The Amazon Resource Name (ARN) of the user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html#cfn-connect-quickconnect-userquickconnectconfig-userarn)
     */
    public fun userArn(): String

    /**
     * A builder for [UserQuickConnectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      public fun contactFlowArn(contactFlowArn: String)

      /**
       * @param userArn The Amazon Resource Name (ARN) of the user. 
       */
      public fun userArn(userArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty.builder()

      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      /**
       * @param userArn The Amazon Resource Name (ARN) of the user. 
       */
      override fun userArn(userArn: String) {
        cdkBuilder.userArn(userArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty,
    ) : CdkObject(cdkObject), UserQuickConnectConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html#cfn-connect-quickconnect-userquickconnectconfig-contactflowarn)
       */
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      /**
       * The Amazon Resource Name (ARN) of the user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-userquickconnectconfig.html#cfn-connect-quickconnect-userquickconnectconfig-userarn)
       */
      override fun userArn(): String = unwrap(this).getUserArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UserQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty):
          UserQuickConnectConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          UserQuickConnectConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: UserQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnQuickConnect.UserQuickConnectConfigProperty
    }
  }

  /**
   * Contains information about a queue for a quick connect.
   *
   * The flow must be of type Transfer to Queue.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.connect.*;
   * QueueQuickConnectConfigProperty queueQuickConnectConfigProperty =
   * QueueQuickConnectConfigProperty.builder()
   * .contactFlowArn("contactFlowArn")
   * .queueArn("queueArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html)
   */
  public interface QueueQuickConnectConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html#cfn-connect-quickconnect-queuequickconnectconfig-contactflowarn)
     */
    public fun contactFlowArn(): String

    /**
     * The Amazon Resource Name (ARN) of the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html#cfn-connect-quickconnect-queuequickconnectconfig-queuearn)
     */
    public fun queueArn(): String

    /**
     * A builder for [QueueQuickConnectConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      public fun contactFlowArn(contactFlowArn: String)

      /**
       * @param queueArn The Amazon Resource Name (ARN) of the queue. 
       */
      public fun queueArn(queueArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty.builder()

      /**
       * @param contactFlowArn The Amazon Resource Name (ARN) of the flow. 
       */
      override fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
      }

      /**
       * @param queueArn The Amazon Resource Name (ARN) of the queue. 
       */
      override fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty,
    ) : CdkObject(cdkObject), QueueQuickConnectConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the flow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html#cfn-connect-quickconnect-queuequickconnectconfig-contactflowarn)
       */
      override fun contactFlowArn(): String = unwrap(this).getContactFlowArn()

      /**
       * The Amazon Resource Name (ARN) of the queue.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-queuequickconnectconfig.html#cfn-connect-quickconnect-queuequickconnectconfig-queuearn)
       */
      override fun queueArn(): String = unwrap(this).getQueueArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueueQuickConnectConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty):
          QueueQuickConnectConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          QueueQuickConnectConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueueQuickConnectConfigProperty):
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnQuickConnect.QueueQuickConnectConfigProperty
    }
  }
}
