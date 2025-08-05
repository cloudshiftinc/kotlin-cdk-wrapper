@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

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
 * Represents the resource definition of AWS IoT Command.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCommand cfnCommand = CfnCommand.Builder.create(this, "MyCfnCommand")
 * .commandId("commandId")
 * // the properties below are optional
 * .createdAt("createdAt")
 * .deprecated(false)
 * .description("description")
 * .displayName("displayName")
 * .lastUpdatedAt("lastUpdatedAt")
 * .mandatoryParameters(List.of(CommandParameterProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultValue(CommandParameterValueProperty.builder()
 * .b(false)
 * .bin("bin")
 * .d(123)
 * .i(123)
 * .l("l")
 * .s("s")
 * .ul("ul")
 * .build())
 * .description("description")
 * .value(CommandParameterValueProperty.builder()
 * .b(false)
 * .bin("bin")
 * .d(123)
 * .i(123)
 * .l("l")
 * .s("s")
 * .ul("ul")
 * .build())
 * .build()))
 * .namespace("namespace")
 * .payload(CommandPayloadProperty.builder()
 * .content("content")
 * .contentType("contentType")
 * .build())
 * .pendingDeletion(false)
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html)
 */
public open class CfnCommand(
  cdkObject: software.amazon.awscdk.services.iot.CfnCommand,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCommandProps,
  ) :
      this(software.amazon.awscdk.services.iot.CfnCommand(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCommandProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCommandProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCommandProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the command.
   */
  public open fun attrCommandArn(): String = unwrap(this).getAttrCommandArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The unique identifier of the command.
   */
  public open fun commandId(): String = unwrap(this).getCommandId()

  /**
   * The unique identifier of the command.
   */
  public open fun commandId(`value`: String) {
    unwrap(this).setCommandId(`value`)
  }

  /**
   * The timestamp, when the command was created.
   */
  public open fun createdAt(): String? = unwrap(this).getCreatedAt()

  /**
   * The timestamp, when the command was created.
   */
  public open fun createdAt(`value`: String) {
    unwrap(this).setCreatedAt(`value`)
  }

  /**
   * Indicates whether the command has been deprecated.
   */
  public open fun deprecated(): Any? = unwrap(this).getDeprecated()

  /**
   * Indicates whether the command has been deprecated.
   */
  public open fun deprecated(`value`: Boolean) {
    unwrap(this).setDeprecated(`value`)
  }

  /**
   * Indicates whether the command has been deprecated.
   */
  public open fun deprecated(`value`: IResolvable) {
    unwrap(this).setDeprecated(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The description of the command parameter.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the command parameter.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The display name of the command.
   */
  public open fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The display name of the command.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
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
   * The timestamp, when the command was last updated.
   */
  public open fun lastUpdatedAt(): String? = unwrap(this).getLastUpdatedAt()

  /**
   * The timestamp, when the command was last updated.
   */
  public open fun lastUpdatedAt(`value`: String) {
    unwrap(this).setLastUpdatedAt(`value`)
  }

  /**
   *
   */
  public open fun mandatoryParameters(): Any? = unwrap(this).getMandatoryParameters()

  /**
   *
   */
  public open fun mandatoryParameters(`value`: IResolvable) {
    unwrap(this).setMandatoryParameters(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun mandatoryParameters(`value`: List<Any>) {
    unwrap(this).setMandatoryParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   *
   */
  public open fun mandatoryParameters(vararg `value`: Any): Unit =
      mandatoryParameters(`value`.toList())

  /**
   * The namespace to which the command belongs.
   */
  public open fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * The namespace to which the command belongs.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   *
   */
  public open fun payload(): Any? = unwrap(this).getPayload()

  /**
   *
   */
  public open fun payload(`value`: IResolvable) {
    unwrap(this).setPayload(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun payload(`value`: CommandPayloadProperty) {
    unwrap(this).setPayload(`value`.let(CommandPayloadProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("239326e275fe86c61353bcdcbc96e144fa6d7a62ea18627d6147b9e430c88aaf")
  public open fun payload(`value`: CommandPayloadProperty.Builder.() -> Unit): Unit =
      payload(CommandPayloadProperty(`value`))

  /**
   * Indicates whether the command is pending deletion.
   */
  public open fun pendingDeletion(): Any? = unwrap(this).getPendingDeletion()

  /**
   * Indicates whether the command is pending deletion.
   */
  public open fun pendingDeletion(`value`: Boolean) {
    unwrap(this).setPendingDeletion(`value`)
  }

  /**
   * Indicates whether the command is pending deletion.
   */
  public open fun pendingDeletion(`value`: IResolvable) {
    unwrap(this).setPendingDeletion(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The customer role associated with the command.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The customer role associated with the command.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The tags to be associated with the command.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to be associated with the command.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to be associated with the command.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iot.CfnCommand].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-commandid)
     * @param commandId The unique identifier of the command. 
     */
    public fun commandId(commandId: String)

    /**
     * The timestamp, when the command was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-createdat)
     * @param createdAt The timestamp, when the command was created. 
     */
    public fun createdAt(createdAt: String)

    /**
     * Indicates whether the command has been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
     * @param deprecated Indicates whether the command has been deprecated. 
     */
    public fun deprecated(deprecated: Boolean)

    /**
     * Indicates whether the command has been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
     * @param deprecated Indicates whether the command has been deprecated. 
     */
    public fun deprecated(deprecated: IResolvable)

    /**
     * The description of the command parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-description)
     * @param description The description of the command parameter. 
     */
    public fun description(description: String)

    /**
     * The display name of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-displayname)
     * @param displayName The display name of the command. 
     */
    public fun displayName(displayName: String)

    /**
     * The timestamp, when the command was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-lastupdatedat)
     * @param lastUpdatedAt The timestamp, when the command was last updated. 
     */
    public fun lastUpdatedAt(lastUpdatedAt: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    public fun mandatoryParameters(mandatoryParameters: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    public fun mandatoryParameters(mandatoryParameters: List<Any>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    public fun mandatoryParameters(vararg mandatoryParameters: Any)

    /**
     * The namespace to which the command belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-namespace)
     * @param namespace The namespace to which the command belongs. 
     */
    public fun namespace(namespace: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    public fun payload(payload: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    public fun payload(payload: CommandPayloadProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d1157fac9231a6f8568b61f7340a1ece0d5d1ffb0c77331e592acedc87956cd")
    public fun payload(payload: CommandPayloadProperty.Builder.() -> Unit)

    /**
     * Indicates whether the command is pending deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
     * @param pendingDeletion Indicates whether the command is pending deletion. 
     */
    public fun pendingDeletion(pendingDeletion: Boolean)

    /**
     * Indicates whether the command is pending deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
     * @param pendingDeletion Indicates whether the command is pending deletion. 
     */
    public fun pendingDeletion(pendingDeletion: IResolvable)

    /**
     * The customer role associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-rolearn)
     * @param roleArn The customer role associated with the command. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tags to be associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
     * @param tags The tags to be associated with the command. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to be associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
     * @param tags The tags to be associated with the command. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCommand.Builder =
        software.amazon.awscdk.services.iot.CfnCommand.Builder.create(scope, id)

    /**
     * The unique identifier of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-commandid)
     * @param commandId The unique identifier of the command. 
     */
    override fun commandId(commandId: String) {
      cdkBuilder.commandId(commandId)
    }

    /**
     * The timestamp, when the command was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-createdat)
     * @param createdAt The timestamp, when the command was created. 
     */
    override fun createdAt(createdAt: String) {
      cdkBuilder.createdAt(createdAt)
    }

    /**
     * Indicates whether the command has been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
     * @param deprecated Indicates whether the command has been deprecated. 
     */
    override fun deprecated(deprecated: Boolean) {
      cdkBuilder.deprecated(deprecated)
    }

    /**
     * Indicates whether the command has been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
     * @param deprecated Indicates whether the command has been deprecated. 
     */
    override fun deprecated(deprecated: IResolvable) {
      cdkBuilder.deprecated(deprecated.let(IResolvable.Companion::unwrap))
    }

    /**
     * The description of the command parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-description)
     * @param description The description of the command parameter. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The display name of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-displayname)
     * @param displayName The display name of the command. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The timestamp, when the command was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-lastupdatedat)
     * @param lastUpdatedAt The timestamp, when the command was last updated. 
     */
    override fun lastUpdatedAt(lastUpdatedAt: String) {
      cdkBuilder.lastUpdatedAt(lastUpdatedAt)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    override fun mandatoryParameters(mandatoryParameters: IResolvable) {
      cdkBuilder.mandatoryParameters(mandatoryParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    override fun mandatoryParameters(mandatoryParameters: List<Any>) {
      cdkBuilder.mandatoryParameters(mandatoryParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     * @param mandatoryParameters 
     */
    override fun mandatoryParameters(vararg mandatoryParameters: Any): Unit =
        mandatoryParameters(mandatoryParameters.toList())

    /**
     * The namespace to which the command belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-namespace)
     * @param namespace The namespace to which the command belongs. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    override fun payload(payload: IResolvable) {
      cdkBuilder.payload(payload.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    override fun payload(payload: CommandPayloadProperty) {
      cdkBuilder.payload(payload.let(CommandPayloadProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     * @param payload 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d1157fac9231a6f8568b61f7340a1ece0d5d1ffb0c77331e592acedc87956cd")
    override fun payload(payload: CommandPayloadProperty.Builder.() -> Unit): Unit =
        payload(CommandPayloadProperty(payload))

    /**
     * Indicates whether the command is pending deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
     * @param pendingDeletion Indicates whether the command is pending deletion. 
     */
    override fun pendingDeletion(pendingDeletion: Boolean) {
      cdkBuilder.pendingDeletion(pendingDeletion)
    }

    /**
     * Indicates whether the command is pending deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
     * @param pendingDeletion Indicates whether the command is pending deletion. 
     */
    override fun pendingDeletion(pendingDeletion: IResolvable) {
      cdkBuilder.pendingDeletion(pendingDeletion.let(IResolvable.Companion::unwrap))
    }

    /**
     * The customer role associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-rolearn)
     * @param roleArn The customer role associated with the command. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags to be associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
     * @param tags The tags to be associated with the command. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to be associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
     * @param tags The tags to be associated with the command. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCommand = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iot.CfnCommand.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCommand {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCommand(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCommand): CfnCommand =
        CfnCommand(cdkObject)

    internal fun unwrap(wrapped: CfnCommand): software.amazon.awscdk.services.iot.CfnCommand =
        wrapped.cdkObject as software.amazon.awscdk.services.iot.CfnCommand
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CommandParameterProperty commandParameterProperty = CommandParameterProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .defaultValue(CommandParameterValueProperty.builder()
   * .b(false)
   * .bin("bin")
   * .d(123)
   * .i(123)
   * .l("l")
   * .s("s")
   * .ul("ul")
   * .build())
   * .description("description")
   * .value(CommandParameterValueProperty.builder()
   * .b(false)
   * .bin("bin")
   * .d(123)
   * .i(123)
   * .l("l")
   * .s("s")
   * .ul("ul")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html)
   */
  public interface CommandParameterProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-defaultvalue)
     */
    public fun defaultValue(): Any? = unwrap(this).getDefaultValue()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-name)
     */
    public fun name(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [CommandParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultValue the value to be set.
       */
      public fun defaultValue(defaultValue: IResolvable)

      /**
       * @param defaultValue the value to be set.
       */
      public fun defaultValue(defaultValue: CommandParameterValueProperty)

      /**
       * @param defaultValue the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a9dec9e91c08b4861d6b6ea92261662337535d93af47245a3d9057bdee17e5")
      public fun defaultValue(defaultValue: CommandParameterValueProperty.Builder.() -> Unit)

      /**
       * @param description the value to be set.
       */
      public fun description(description: String)

      /**
       * @param name the value to be set. 
       */
      public fun name(name: String)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value the value to be set.
       */
      public fun `value`(`value`: CommandParameterValueProperty)

      /**
       * @param value the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2587934b93be2e4fa0f668d15d4481493a85cb725df3f5244bb04237fa952e46")
      public fun `value`(`value`: CommandParameterValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty.builder()

      /**
       * @param defaultValue the value to be set.
       */
      override fun defaultValue(defaultValue: IResolvable) {
        cdkBuilder.defaultValue(defaultValue.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultValue the value to be set.
       */
      override fun defaultValue(defaultValue: CommandParameterValueProperty) {
        cdkBuilder.defaultValue(defaultValue.let(CommandParameterValueProperty.Companion::unwrap))
      }

      /**
       * @param defaultValue the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a9dec9e91c08b4861d6b6ea92261662337535d93af47245a3d9057bdee17e5")
      override fun defaultValue(defaultValue: CommandParameterValueProperty.Builder.() -> Unit):
          Unit = defaultValue(CommandParameterValueProperty(defaultValue))

      /**
       * @param description the value to be set.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name the value to be set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value the value to be set.
       */
      override fun `value`(`value`: CommandParameterValueProperty) {
        cdkBuilder.`value`(`value`.let(CommandParameterValueProperty.Companion::unwrap))
      }

      /**
       * @param value the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2587934b93be2e4fa0f668d15d4481493a85cb725df3f5244bb04237fa952e46")
      override fun `value`(`value`: CommandParameterValueProperty.Builder.() -> Unit): Unit =
          `value`(CommandParameterValueProperty(`value`))

      public fun build(): software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty,
    ) : CdkObject(cdkObject),
        CommandParameterProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-defaultvalue)
       */
      override fun defaultValue(): Any? = unwrap(this).getDefaultValue()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparameter.html#cfn-iot-command-commandparameter-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommandParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty):
          CommandParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? CommandParameterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommandParameterProperty):
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CommandParameterValueProperty commandParameterValueProperty =
   * CommandParameterValueProperty.builder()
   * .b(false)
   * .bin("bin")
   * .d(123)
   * .i(123)
   * .l("l")
   * .s("s")
   * .ul("ul")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html)
   */
  public interface CommandParameterValueProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-b)
     */
    public fun b(): Any? = unwrap(this).getB()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-bin)
     */
    public fun bin(): String? = unwrap(this).getBin()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-d)
     */
    public fun d(): Number? = unwrap(this).getD()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-i)
     */
    public fun i(): Number? = unwrap(this).getI()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-l)
     */
    public fun l(): String? = unwrap(this).getL()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-s)
     */
    public fun s(): String? = unwrap(this).getS()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-ul)
     */
    public fun ul(): String? = unwrap(this).getUl()

    /**
     * A builder for [CommandParameterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param b the value to be set.
       */
      public fun b(b: Boolean)

      /**
       * @param b the value to be set.
       */
      public fun b(b: IResolvable)

      /**
       * @param bin the value to be set.
       */
      public fun bin(bin: String)

      /**
       * @param d the value to be set.
       */
      public fun d(d: Number)

      /**
       * @param i the value to be set.
       */
      public fun i(i: Number)

      /**
       * @param l the value to be set.
       */
      public fun l(l: String)

      /**
       * @param s the value to be set.
       */
      public fun s(s: String)

      /**
       * @param ul the value to be set.
       */
      public fun ul(ul: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty.builder()

      /**
       * @param b the value to be set.
       */
      override fun b(b: Boolean) {
        cdkBuilder.b(b)
      }

      /**
       * @param b the value to be set.
       */
      override fun b(b: IResolvable) {
        cdkBuilder.b(b.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param bin the value to be set.
       */
      override fun bin(bin: String) {
        cdkBuilder.bin(bin)
      }

      /**
       * @param d the value to be set.
       */
      override fun d(d: Number) {
        cdkBuilder.d(d)
      }

      /**
       * @param i the value to be set.
       */
      override fun i(i: Number) {
        cdkBuilder.i(i)
      }

      /**
       * @param l the value to be set.
       */
      override fun l(l: String) {
        cdkBuilder.l(l)
      }

      /**
       * @param s the value to be set.
       */
      override fun s(s: String) {
        cdkBuilder.s(s)
      }

      /**
       * @param ul the value to be set.
       */
      override fun ul(ul: String) {
        cdkBuilder.ul(ul)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty,
    ) : CdkObject(cdkObject),
        CommandParameterValueProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-b)
       */
      override fun b(): Any? = unwrap(this).getB()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-bin)
       */
      override fun bin(): String? = unwrap(this).getBin()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-d)
       */
      override fun d(): Number? = unwrap(this).getD()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-i)
       */
      override fun i(): Number? = unwrap(this).getI()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-l)
       */
      override fun l(): String? = unwrap(this).getL()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-s)
       */
      override fun s(): String? = unwrap(this).getS()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandparametervalue.html#cfn-iot-command-commandparametervalue-ul)
       */
      override fun ul(): String? = unwrap(this).getUl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommandParameterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty):
          CommandParameterValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CommandParameterValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommandParameterValueProperty):
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnCommand.CommandParameterValueProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iot.*;
   * CommandPayloadProperty commandPayloadProperty = CommandPayloadProperty.builder()
   * .content("content")
   * .contentType("contentType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandpayload.html)
   */
  public interface CommandPayloadProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandpayload.html#cfn-iot-command-commandpayload-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandpayload.html#cfn-iot-command-commandpayload-contenttype)
     */
    public fun contentType(): String? = unwrap(this).getContentType()

    /**
     * A builder for [CommandPayloadProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content the value to be set.
       */
      public fun content(content: String)

      /**
       * @param contentType the value to be set.
       */
      public fun contentType(contentType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty.Builder =
          software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty.builder()

      /**
       * @param content the value to be set.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param contentType the value to be set.
       */
      override fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty,
    ) : CdkObject(cdkObject),
        CommandPayloadProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandpayload.html#cfn-iot-command-commandpayload-content)
       */
      override fun content(): String? = unwrap(this).getContent()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-command-commandpayload.html#cfn-iot-command-commandpayload-contenttype)
       */
      override fun contentType(): String? = unwrap(this).getContentType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CommandPayloadProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty):
          CommandPayloadProperty = CdkObjectWrappers.wrap(cdkObject) as? CommandPayloadProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CommandPayloadProperty):
          software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iot.CfnCommand.CommandPayloadProperty
    }
  }
}
