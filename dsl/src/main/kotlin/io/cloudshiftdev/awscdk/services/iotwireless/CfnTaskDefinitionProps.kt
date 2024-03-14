package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTaskDefinitionProps {
  /**
   * Whether to automatically create tasks using this task definition for all gateways with the
   * specified current version.
   *
   * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
   */
  public fun autoCreateTasks(): Any

  /**
   * LoRaWANUpdateGatewayTaskEntry object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
   */
  public fun loRaWanUpdateGatewayTaskEntry(): Any? = unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

  /**
   * The name of the new resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags are an array of key-value pairs to attach to the specified resource.
   *
   * Tags can have a minimum of 0 and a maximum of 50 items.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A filter to list only the wireless gateway task definitions that use this task definition type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
   */
  public fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

  /**
   * Information about the gateways to update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
   */
  public fun update(): Any? = unwrap(this).getUpdate()

  /**
   * A builder for [CfnTaskDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    public fun autoCreateTasks(autoCreateTasks: Boolean)

    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    public fun autoCreateTasks(autoCreateTasks: IResolvable)

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable)

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty)

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d2428e9af25c96b37dc1a277ad2a3966974a0f54cbf270ef74e6f7c936c49")
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit)

    /**
     * @param name The name of the new resource.
     */
    public fun name(name: String)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that
     * use this task definition type.
     */
    public fun taskDefinitionType(taskDefinitionType: String)

    /**
     * @param update Information about the gateways to update.
     */
    public fun update(update: IResolvable)

    /**
     * @param update Information about the gateways to update.
     */
    public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty)

    /**
     * @param update Information about the gateways to update.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17dd972b1bdb65de89f9479e243ceb44aca06c56d3fe6d59f50e224e1650a651")
    public
        fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps.builder()

    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    override fun autoCreateTasks(autoCreateTasks: Boolean) {
      cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    /**
     * @param autoCreateTasks Whether to automatically create tasks using this task definition for
     * all gateways with the specified current version. 
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     */
    override fun autoCreateTasks(autoCreateTasks: IResolvable) {
      cdkBuilder.autoCreateTasks(autoCreateTasks.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    override fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(IResolvable::unwrap))
    }

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
    }

    /**
     * @param loRaWanUpdateGatewayTaskEntry LoRaWANUpdateGatewayTaskEntry object.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d2428e9af25c96b37dc1a277ad2a3966974a0f54cbf270ef74e6f7c936c49")
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
        Unit =
        loRaWanUpdateGatewayTaskEntry(CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty(loRaWanUpdateGatewayTaskEntry))

    /**
     * @param name The name of the new resource.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     * Tags can have a minimum of 0 and a maximum of 50 items.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param taskDefinitionType A filter to list only the wireless gateway task definitions that
     * use this task definition type.
     */
    override fun taskDefinitionType(taskDefinitionType: String) {
      cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    /**
     * @param update Information about the gateways to update.
     */
    override fun update(update: IResolvable) {
      cdkBuilder.update(update.let(IResolvable::unwrap))
    }

    /**
     * @param update Information about the gateways to update.
     */
    override fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
      cdkBuilder.update(update.let(CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty::unwrap))
    }

    /**
     * @param update Information about the gateways to update.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17dd972b1bdb65de89f9479e243ceb44aca06c56d3fe6d59f50e224e1650a651")
    override
        fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit):
        Unit = update(CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty(update))

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps,
  ) : CdkObject(cdkObject), CfnTaskDefinitionProps {
    /**
     * Whether to automatically create tasks using this task definition for all gateways with the
     * specified current version.
     *
     * If `false` , the task must be created by calling `CreateWirelessGatewayTask` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-autocreatetasks)
     */
    override fun autoCreateTasks(): Any = unwrap(this).getAutoCreateTasks()

    /**
     * LoRaWANUpdateGatewayTaskEntry object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-lorawanupdategatewaytaskentry)
     */
    override fun loRaWanUpdateGatewayTaskEntry(): Any? =
        unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

    /**
     * The name of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A filter to list only the wireless gateway task definitions that use this task definition
     * type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-taskdefinitiontype)
     */
    override fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

    /**
     * Information about the gateways to update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-taskdefinition.html#cfn-iotwireless-taskdefinition-update)
     */
    override fun update(): Any? = unwrap(this).getUpdate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTaskDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps):
        CfnTaskDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTaskDefinitionProps):
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps
  }
}
