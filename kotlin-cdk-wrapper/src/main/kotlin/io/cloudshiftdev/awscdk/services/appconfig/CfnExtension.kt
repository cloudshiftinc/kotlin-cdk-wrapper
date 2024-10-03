@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an AWS AppConfig extension.
 *
 * An extension augments your ability to inject logic or behavior at different points during the AWS
 * AppConfig workflow of creating or deploying a configuration.
 *
 * You can create your own extensions or use the AWS authored extensions provided by AWS AppConfig .
 * For an AWS AppConfig extension that uses AWS Lambda , you must create a Lambda function to perform
 * any computation and processing defined in the extension. If you plan to create custom versions of
 * the AWS authored notification extensions, you only need to specify an Amazon Resource Name (ARN) in
 * the `Uri` field for the new extension version.
 *
 * * For a custom EventBridge notification extension, enter the ARN of the EventBridge default
 * events in the `Uri` field.
 * * For a custom Amazon SNS notification extension, enter the ARN of an Amazon SNS topic in the
 * `Uri` field.
 * * For a custom Amazon SQS notification extension, enter the ARN of an Amazon SQS message queue in
 * the `Uri` field.
 *
 * For more information about extensions, see [Extending
 * workflows](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
 * in the *AWS AppConfig User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * Object actions;
 * CfnExtension cfnExtension = CfnExtension.Builder.create(this, "MyCfnExtension")
 * .actions(actions)
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .latestVersionNumber(123)
 * .parameters(Map.of(
 * "parametersKey", ParameterProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .dynamic(false)
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html)
 */
public open class CfnExtension(
  cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnExtensionProps,
  ) :
      this(software.amazon.awscdk.services.appconfig.CfnExtension(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnExtensionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnExtensionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnExtensionProps(props)
  )

  /**
   * The actions defined in the extension.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * The actions defined in the extension.
   */
  public open fun actions(`value`: Any) {
    unwrap(this).setActions(`value`)
  }

  /**
   * The system-generated Amazon Resource Name (ARN) for the extension.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The system-generated ID of the extension.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The extension version number.
   */
  public open fun attrVersionNumber(): Number = unwrap(this).getAttrVersionNumber()

  /**
   * Information about the extension.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the extension.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * You can omit this field when you create an extension.
   */
  public open fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  /**
   * You can omit this field when you create an extension.
   */
  public open fun latestVersionNumber(`value`: Number) {
    unwrap(this).setLatestVersionNumber(`value`)
  }

  /**
   * A name for the extension.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A name for the extension.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The parameters accepted by the extension.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The parameters accepted by the extension.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The parameters accepted by the extension.
   */
  public open fun parameters(`value`: Map<String, Any>) {
    unwrap(this).setParameters(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Adds one or more tags for the specified extension.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Adds one or more tags for the specified extension.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Adds one or more tags for the specified extension.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appconfig.CfnExtension].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
     * @param actions The actions defined in the extension. 
     */
    public fun actions(actions: Any)

    /**
     * Information about the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-description)
     * @param description Information about the extension. 
     */
    public fun description(description: String)

    /**
     * You can omit this field when you create an extension.
     *
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-latestversionnumber)
     * @param latestVersionNumber You can omit this field when you create an extension. 
     */
    public fun latestVersionNumber(latestVersionNumber: Number)

    /**
     * A name for the extension.
     *
     * Each extension name in your account must be unique. Extension versions use the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-name)
     * @param name A name for the extension. 
     */
    public fun name(name: String)

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     * @param parameters The parameters accepted by the extension. 
     */
    public fun parameters(parameters: IResolvable)

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     * @param parameters The parameters accepted by the extension. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     * @param tags Adds one or more tags for the specified extension. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     * @param tags Adds one or more tags for the specified extension. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.CfnExtension.Builder =
        software.amazon.awscdk.services.appconfig.CfnExtension.Builder.create(scope, id)

    /**
     * The actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-actions)
     * @param actions The actions defined in the extension. 
     */
    override fun actions(actions: Any) {
      cdkBuilder.actions(actions)
    }

    /**
     * Information about the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-description)
     * @param description Information about the extension. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * You can omit this field when you create an extension.
     *
     * When you create a new version, specify the most recent current version number. For example,
     * you create version 3, enter 2 for this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-latestversionnumber)
     * @param latestVersionNumber You can omit this field when you create an extension. 
     */
    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    /**
     * A name for the extension.
     *
     * Each extension name in your account must be unique. Extension versions use the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-name)
     * @param name A name for the extension. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     * @param parameters The parameters accepted by the extension. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * The parameters accepted by the extension.
     *
     * You specify parameter values when you associate the extension to an AWS AppConfig resource by
     * using the `CreateExtensionAssociation` API action. For AWS Lambda extension actions, these
     * parameters are included in the Lambda request object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-parameters)
     * @param parameters The parameters accepted by the extension. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     * @param tags Adds one or more tags for the specified extension. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Adds one or more tags for the specified extension.
     *
     * Tags are metadata that help you categorize resources in different ways, for example, by
     * purpose, owner, or environment. Each tag consists of a key and an optional value, both of which
     * you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-extension.html#cfn-appconfig-extension-tags)
     * @param tags Adds one or more tags for the specified extension. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appconfig.CfnExtension.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExtension {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExtension(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension):
        CfnExtension = CfnExtension(cdkObject)

    internal fun unwrap(wrapped: CfnExtension):
        software.amazon.awscdk.services.appconfig.CfnExtension = wrapped.cdkObject as
        software.amazon.awscdk.services.appconfig.CfnExtension
  }

  /**
   * The actions defined in the extension.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appconfig.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .name("name")
   * .uri("uri")
   * // the properties below are optional
   * .description("description")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html)
   */
  public interface ActionProperty {
    /**
     * Information about actions defined in the extension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The action name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-name)
     */
    public fun name(): String

    /**
     * An Amazon Resource Name (ARN) for an AWS Identity and Access Management assume role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The extension URI associated to the action point in the extension definition.
     *
     * The URI can be an Amazon Resource Name (ARN) for one of the following: an AWS Lambda
     * function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic, or
     * the Amazon EventBridge default event bus.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-uri)
     */
    public fun uri(): String

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description Information about actions defined in the extension.
       */
      public fun description(description: String)

      /**
       * @param name The action name. 
       */
      public fun name(name: String)

      /**
       * @param roleArn An Amazon Resource Name (ARN) for an AWS Identity and Access Management
       * assume role.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param uri The extension URI associated to the action point in the extension definition. 
       * The URI can be an Amazon Resource Name (ARN) for one of the following: an AWS Lambda
       * function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic,
       * or the Amazon EventBridge default event bus.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty.builder()

      /**
       * @param description Information about actions defined in the extension.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The action name. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param roleArn An Amazon Resource Name (ARN) for an AWS Identity and Access Management
       * assume role.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param uri The extension URI associated to the action point in the extension definition. 
       * The URI can be an Amazon Resource Name (ARN) for one of the following: an AWS Lambda
       * function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic,
       * or the Amazon EventBridge default event bus.
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty,
    ) : CdkObject(cdkObject),
        ActionProperty {
      /**
       * Information about actions defined in the extension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The action name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * An Amazon Resource Name (ARN) for an AWS Identity and Access Management assume role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The extension URI associated to the action point in the extension definition.
       *
       * The URI can be an Amazon Resource Name (ARN) for one of the following: an AWS Lambda
       * function, an Amazon Simple Queue Service queue, an Amazon Simple Notification Service topic,
       * or the Amazon EventBridge default event bus.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-action.html#cfn-appconfig-extension-action-uri)
       */
      override fun uri(): String = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnExtension.ActionProperty
    }
  }

  /**
   * A value such as an Amazon Resource Name (ARN) or an Amazon Simple Notification Service topic
   * entered in an extension when invoked.
   *
   * Parameter values are specified in an extension association. For more information about
   * extensions, see [Extending
   * workflows](https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html)
   * in the *AWS AppConfig User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.appconfig.*;
   * ParameterProperty parameterProperty = ParameterProperty.builder()
   * .required(false)
   * // the properties below are optional
   * .description("description")
   * .dynamic(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html)
   */
  public interface ParameterProperty {
    /**
     * Information about the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Indicates whether this parameter's value can be supplied at the extension's action point
     * instead of during extension association.
     *
     * Dynamic parameters can't be marked `Required` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-dynamic)
     */
    public fun `dynamic`(): Any? = unwrap(this).getDynamic()

    /**
     * A parameter value must be specified in the extension association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-required)
     */
    public fun required(): Any

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description Information about the parameter.
       */
      public fun description(description: String)

      /**
       * @param dynamic Indicates whether this parameter's value can be supplied at the extension's
       * action point instead of during extension association.
       * Dynamic parameters can't be marked `Required` .
       */
      public fun `dynamic`(`dynamic`: Boolean)

      /**
       * @param dynamic Indicates whether this parameter's value can be supplied at the extension's
       * action point instead of during extension association.
       * Dynamic parameters can't be marked `Required` .
       */
      public fun `dynamic`(`dynamic`: IResolvable)

      /**
       * @param required A parameter value must be specified in the extension association. 
       */
      public fun required(required: Boolean)

      /**
       * @param required A parameter value must be specified in the extension association. 
       */
      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty.Builder =
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty.builder()

      /**
       * @param description Information about the parameter.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param dynamic Indicates whether this parameter's value can be supplied at the extension's
       * action point instead of during extension association.
       * Dynamic parameters can't be marked `Required` .
       */
      override fun `dynamic`(`dynamic`: Boolean) {
        cdkBuilder.`dynamic`(`dynamic`)
      }

      /**
       * @param dynamic Indicates whether this parameter's value can be supplied at the extension's
       * action point instead of during extension association.
       * Dynamic parameters can't be marked `Required` .
       */
      override fun `dynamic`(`dynamic`: IResolvable) {
        cdkBuilder.`dynamic`(`dynamic`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param required A parameter value must be specified in the extension association. 
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required A parameter value must be specified in the extension association. 
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty,
    ) : CdkObject(cdkObject),
        ParameterProperty {
      /**
       * Information about the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Indicates whether this parameter's value can be supplied at the extension's action point
       * instead of during extension association.
       *
       * Dynamic parameters can't be marked `Required` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-dynamic)
       */
      override fun `dynamic`(): Any? = unwrap(this).getDynamic()

      /**
       * A parameter value must be specified in the extension association.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-extension-parameter.html#cfn-appconfig-extension-parameter-required)
       */
      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty):
          ParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? ParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.appconfig.CfnExtension.ParameterProperty
    }
  }
}
