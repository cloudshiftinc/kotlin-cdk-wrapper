@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
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
 * The `AWS::Greengrass::SubscriptionDefinition` resource represents a subscription definition for
 * AWS IoT Greengrass .
 *
 * Subscription definitions are used to organize your subscription definition versions.
 *
 * Subscription definitions can reference multiple subscription definition versions. All
 * subscription definition versions must be associated with a subscription definition. Each
 * subscription definition version can contain one or more subscriptions.
 *
 *
 * When you create a subscription definition, you can optionally include an initial subscription
 * definition version. To associate a subscription definition version later, create an
 * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
 * resource and specify the ID of this subscription definition.
 *
 * After you create the subscription definition version that contains the subscriptions you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnSubscriptionDefinition cfnSubscriptionDefinition =
 * CfnSubscriptionDefinition.Builder.create(this, "MyCfnSubscriptionDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(SubscriptionDefinitionVersionProperty.builder()
 * .subscriptions(List.of(SubscriptionProperty.builder()
 * .id("id")
 * .source("source")
 * .subject("subject")
 * .target("target")
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
 */
public open class CfnSubscriptionDefinition internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSubscriptionDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSubscriptionDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSubscriptionDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `SubscriptionDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/subscriptions/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `SubscriptionDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `SubscriptionDefinitionVersion` that was added to the
   * `SubscriptionDefinition` , such as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/subscriptions/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `SubscriptionDefinition` , such as `MySubscriptionDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The subscription definition version to include when the subscription definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The subscription definition version to include when the subscription definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The subscription definition version to include when the subscription definition is created.
   */
  public open fun initialVersion(`value`: SubscriptionDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(SubscriptionDefinitionVersionProperty::unwrap))
  }

  /**
   * The subscription definition version to include when the subscription definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7fc1d2b042e2eb456ab2333dc31bd7af1e7bef77929f9cf18d6afdb607704c0")
  public open fun initialVersion(`value`: SubscriptionDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(SubscriptionDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the subscription definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the subscription definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the subscription definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the subscription definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnSubscriptionDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    public fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty)

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("021af35f0f0d44f88db7cae98553a0b2efb9d2f31c4c512a04f55a0db15e3104")
    public
        fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-name)
     * @param name The name of the subscription definition. 
     */
    public fun name(name: String)

    /**
     * Application-specific metadata to attach to the subscription definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
     * @param tags Application-specific metadata to attach to the subscription definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.Builder =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.Builder.create(scope,
        id)

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    override fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(SubscriptionDefinitionVersionProperty::unwrap))
    }

    /**
     * The subscription definition version to include when the subscription definition is created.
     *
     * A subscription definition version contains a list of
     * [`subscription`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
     * property types.
     *
     *
     * To associate a subscription definition version after the subscription definition is created,
     * create an
     * [`AWS::Greengrass::SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinitionversion.html)
     * resource and specify the ID of this subscription definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-initialversion)
     * @param initialVersion The subscription definition version to include when the subscription
     * definition is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("021af35f0f0d44f88db7cae98553a0b2efb9d2f31c4c512a04f55a0db15e3104")
    override
        fun initialVersion(initialVersion: SubscriptionDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(SubscriptionDefinitionVersionProperty(initialVersion))

    /**
     * The name of the subscription definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-name)
     * @param name The name of the subscription definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the subscription definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html#cfn-greengrass-subscriptiondefinition-tags)
     * @param tags Application-specific metadata to attach to the subscription definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSubscriptionDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSubscriptionDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition):
        CfnSubscriptionDefinition = CfnSubscriptionDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriptionDefinition):
        software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition = wrapped.cdkObject
  }

  /**
   * A subscription definition version contains a list of
   * [subscriptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
   * .
   *
   *
   * After you create a subscription definition version that contains the subscriptions you want to
   * deploy, you must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `SubscriptionDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::SubscriptionDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-subscriptiondefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * SubscriptionDefinitionVersionProperty subscriptionDefinitionVersionProperty =
   * SubscriptionDefinitionVersionProperty.builder()
   * .subscriptions(List.of(SubscriptionProperty.builder()
   * .id("id")
   * .source("source")
   * .subject("subject")
   * .target("target")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
   */
  public interface SubscriptionDefinitionVersionProperty {
    /**
     * The subscriptions in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions)
     */
    public fun subscriptions(): Any

    /**
     * A builder for [SubscriptionDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subscriptions The subscriptions in this version. 
       */
      public fun subscriptions(subscriptions: IResolvable)

      /**
       * @param subscriptions The subscriptions in this version. 
       */
      public fun subscriptions(subscriptions: List<Any>)

      /**
       * @param subscriptions The subscriptions in this version. 
       */
      public fun subscriptions(vararg subscriptions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty.builder()

      /**
       * @param subscriptions The subscriptions in this version. 
       */
      override fun subscriptions(subscriptions: IResolvable) {
        cdkBuilder.subscriptions(subscriptions.let(IResolvable::unwrap))
      }

      /**
       * @param subscriptions The subscriptions in this version. 
       */
      override fun subscriptions(subscriptions: List<Any>) {
        cdkBuilder.subscriptions(subscriptions)
      }

      /**
       * @param subscriptions The subscriptions in this version. 
       */
      override fun subscriptions(vararg subscriptions: Any): Unit =
          subscriptions(subscriptions.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty,
    ) : CdkObject(cdkObject), SubscriptionDefinitionVersionProperty {
      /**
       * The subscriptions in this version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html#cfn-greengrass-subscriptiondefinition-subscriptiondefinitionversion-subscriptions)
       */
      override fun subscriptions(): Any = unwrap(this).getSubscriptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SubscriptionDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty):
          SubscriptionDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SubscriptionDefinitionVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionDefinitionVersionProperty
    }
  }

  /**
   * Subscriptions define how MQTT messages can be exchanged between devices, functions, and
   * connectors in the group, and with AWS IoT or the local shadow service.
   *
   * A subscription defines a message source, message target, and a topic (or subject) that's used
   * to route messages from the source to the target. A subscription defines the message flow in one
   * direction, from the source to the target. For two-way communication, you must set up two
   * subscriptions, one for each direction.
   *
   * In an AWS CloudFormation template, the `Subscriptions` property of the
   * [`SubscriptionDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscriptiondefinitionversion.html)
   * property type contains a list of `Subscription` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * SubscriptionProperty subscriptionProperty = SubscriptionProperty.builder()
   * .id("id")
   * .source("source")
   * .subject("subject")
   * .target("target")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html)
   */
  public interface SubscriptionProperty {
    /**
     * A descriptive or arbitrary ID for the subscription.
     *
     * This value must be unique within the subscription definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-id)
     */
    public fun id(): String

    /**
     * The originator of the message.
     *
     * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
     * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-source)
     */
    public fun source(): String

    /**
     * The MQTT topic used to route the message.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-subject)
     */
    public fun subject(): String

    /**
     * The destination of the message.
     *
     * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version, a
     * connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-target)
     */
    public fun target(): String

    /**
     * A builder for [SubscriptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id A descriptive or arbitrary ID for the subscription. 
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param source The originator of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      public fun source(source: String)

      /**
       * @param subject The MQTT topic used to route the message. 
       */
      public fun subject(subject: String)

      /**
       * @param target The destination of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty.builder()

      /**
       * @param id A descriptive or arbitrary ID for the subscription. 
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param source The originator of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      override fun source(source: String) {
        cdkBuilder.source(source)
      }

      /**
       * @param subject The MQTT topic used to route the message. 
       */
      override fun subject(subject: String) {
        cdkBuilder.subject(subject)
      }

      /**
       * @param target The destination of the message. 
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty,
    ) : CdkObject(cdkObject), SubscriptionProperty {
      /**
       * A descriptive or arbitrary ID for the subscription.
       *
       * This value must be unique within the subscription definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The originator of the message.
       *
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-source)
       */
      override fun source(): String = unwrap(this).getSource()

      /**
       * The MQTT topic used to route the message.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-subject)
       */
      override fun subject(): String = unwrap(this).getSubject()

      /**
       * The destination of the message.
       *
       * The value can be a thing ARN, the ARN of a Lambda function alias (recommended) or version,
       * a connector ARN, `cloud` (which represents the AWS IoT cloud), or `GGShadowService` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-subscriptiondefinition-subscription.html#cfn-greengrass-subscriptiondefinition-subscription-target)
       */
      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty):
          SubscriptionProperty = CdkObjectWrappers.wrap(cdkObject) as? SubscriptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SubscriptionProperty):
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnSubscriptionDefinition.SubscriptionProperty
    }
  }
}
