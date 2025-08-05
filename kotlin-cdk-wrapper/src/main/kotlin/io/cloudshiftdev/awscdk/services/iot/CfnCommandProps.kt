@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCommand`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnCommandProps cfnCommandProps = CfnCommandProps.builder()
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
public interface CfnCommandProps {
  /**
   * The unique identifier of the command.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-commandid)
   */
  public fun commandId(): String

  /**
   * The timestamp, when the command was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-createdat)
   */
  public fun createdAt(): String? = unwrap(this).getCreatedAt()

  /**
   * Indicates whether the command has been deprecated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
   */
  public fun deprecated(): Any? = unwrap(this).getDeprecated()

  /**
   * The description of the command parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The display name of the command.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-displayname)
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * The timestamp, when the command was last updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-lastupdatedat)
   */
  public fun lastUpdatedAt(): String? = unwrap(this).getLastUpdatedAt()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
   */
  public fun mandatoryParameters(): Any? = unwrap(this).getMandatoryParameters()

  /**
   * The namespace to which the command belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-namespace)
   */
  public fun namespace(): String? = unwrap(this).getNamespace()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
   */
  public fun payload(): Any? = unwrap(this).getPayload()

  /**
   * Indicates whether the command is pending deletion.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
   */
  public fun pendingDeletion(): Any? = unwrap(this).getPendingDeletion()

  /**
   * The customer role associated with the command.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The tags to be associated with the command.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCommandProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param commandId The unique identifier of the command. 
     */
    public fun commandId(commandId: String)

    /**
     * @param createdAt The timestamp, when the command was created.
     */
    public fun createdAt(createdAt: String)

    /**
     * @param deprecated Indicates whether the command has been deprecated.
     */
    public fun deprecated(deprecated: Boolean)

    /**
     * @param deprecated Indicates whether the command has been deprecated.
     */
    public fun deprecated(deprecated: IResolvable)

    /**
     * @param description The description of the command parameter.
     */
    public fun description(description: String)

    /**
     * @param displayName The display name of the command.
     */
    public fun displayName(displayName: String)

    /**
     * @param lastUpdatedAt The timestamp, when the command was last updated.
     */
    public fun lastUpdatedAt(lastUpdatedAt: String)

    /**
     * @param mandatoryParameters the value to be set.
     */
    public fun mandatoryParameters(mandatoryParameters: IResolvable)

    /**
     * @param mandatoryParameters the value to be set.
     */
    public fun mandatoryParameters(mandatoryParameters: List<Any>)

    /**
     * @param mandatoryParameters the value to be set.
     */
    public fun mandatoryParameters(vararg mandatoryParameters: Any)

    /**
     * @param namespace The namespace to which the command belongs.
     */
    public fun namespace(namespace: String)

    /**
     * @param payload the value to be set.
     */
    public fun payload(payload: IResolvable)

    /**
     * @param payload the value to be set.
     */
    public fun payload(payload: CfnCommand.CommandPayloadProperty)

    /**
     * @param payload the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36471fd2ed9bfd850f24349b0627971a99567b5401bf2c5e519047df93f13306")
    public fun payload(payload: CfnCommand.CommandPayloadProperty.Builder.() -> Unit)

    /**
     * @param pendingDeletion Indicates whether the command is pending deletion.
     */
    public fun pendingDeletion(pendingDeletion: Boolean)

    /**
     * @param pendingDeletion Indicates whether the command is pending deletion.
     */
    public fun pendingDeletion(pendingDeletion: IResolvable)

    /**
     * @param roleArn The customer role associated with the command.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags to be associated with the command.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to be associated with the command.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCommandProps.Builder =
        software.amazon.awscdk.services.iot.CfnCommandProps.builder()

    /**
     * @param commandId The unique identifier of the command. 
     */
    override fun commandId(commandId: String) {
      cdkBuilder.commandId(commandId)
    }

    /**
     * @param createdAt The timestamp, when the command was created.
     */
    override fun createdAt(createdAt: String) {
      cdkBuilder.createdAt(createdAt)
    }

    /**
     * @param deprecated Indicates whether the command has been deprecated.
     */
    override fun deprecated(deprecated: Boolean) {
      cdkBuilder.deprecated(deprecated)
    }

    /**
     * @param deprecated Indicates whether the command has been deprecated.
     */
    override fun deprecated(deprecated: IResolvable) {
      cdkBuilder.deprecated(deprecated.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param description The description of the command parameter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The display name of the command.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param lastUpdatedAt The timestamp, when the command was last updated.
     */
    override fun lastUpdatedAt(lastUpdatedAt: String) {
      cdkBuilder.lastUpdatedAt(lastUpdatedAt)
    }

    /**
     * @param mandatoryParameters the value to be set.
     */
    override fun mandatoryParameters(mandatoryParameters: IResolvable) {
      cdkBuilder.mandatoryParameters(mandatoryParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param mandatoryParameters the value to be set.
     */
    override fun mandatoryParameters(mandatoryParameters: List<Any>) {
      cdkBuilder.mandatoryParameters(mandatoryParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param mandatoryParameters the value to be set.
     */
    override fun mandatoryParameters(vararg mandatoryParameters: Any): Unit =
        mandatoryParameters(mandatoryParameters.toList())

    /**
     * @param namespace The namespace to which the command belongs.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param payload the value to be set.
     */
    override fun payload(payload: IResolvable) {
      cdkBuilder.payload(payload.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param payload the value to be set.
     */
    override fun payload(payload: CfnCommand.CommandPayloadProperty) {
      cdkBuilder.payload(payload.let(CfnCommand.CommandPayloadProperty.Companion::unwrap))
    }

    /**
     * @param payload the value to be set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36471fd2ed9bfd850f24349b0627971a99567b5401bf2c5e519047df93f13306")
    override fun payload(payload: CfnCommand.CommandPayloadProperty.Builder.() -> Unit): Unit =
        payload(CfnCommand.CommandPayloadProperty(payload))

    /**
     * @param pendingDeletion Indicates whether the command is pending deletion.
     */
    override fun pendingDeletion(pendingDeletion: Boolean) {
      cdkBuilder.pendingDeletion(pendingDeletion)
    }

    /**
     * @param pendingDeletion Indicates whether the command is pending deletion.
     */
    override fun pendingDeletion(pendingDeletion: IResolvable) {
      cdkBuilder.pendingDeletion(pendingDeletion.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param roleArn The customer role associated with the command.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags to be associated with the command.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to be associated with the command.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnCommandProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iot.CfnCommandProps,
  ) : CdkObject(cdkObject),
      CfnCommandProps {
    /**
     * The unique identifier of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-commandid)
     */
    override fun commandId(): String = unwrap(this).getCommandId()

    /**
     * The timestamp, when the command was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-createdat)
     */
    override fun createdAt(): String? = unwrap(this).getCreatedAt()

    /**
     * Indicates whether the command has been deprecated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-deprecated)
     */
    override fun deprecated(): Any? = unwrap(this).getDeprecated()

    /**
     * The description of the command parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The display name of the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-displayname)
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * The timestamp, when the command was last updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-lastupdatedat)
     */
    override fun lastUpdatedAt(): String? = unwrap(this).getLastUpdatedAt()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-mandatoryparameters)
     */
    override fun mandatoryParameters(): Any? = unwrap(this).getMandatoryParameters()

    /**
     * The namespace to which the command belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-namespace)
     */
    override fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-payload)
     */
    override fun payload(): Any? = unwrap(this).getPayload()

    /**
     * Indicates whether the command is pending deletion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-pendingdeletion)
     */
    override fun pendingDeletion(): Any? = unwrap(this).getPendingDeletion()

    /**
     * The customer role associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The tags to be associated with the command.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-command.html#cfn-iot-command-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCommandProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCommandProps):
        CfnCommandProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCommandProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCommandProps):
        software.amazon.awscdk.services.iot.CfnCommandProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.iot.CfnCommandProps
  }
}
