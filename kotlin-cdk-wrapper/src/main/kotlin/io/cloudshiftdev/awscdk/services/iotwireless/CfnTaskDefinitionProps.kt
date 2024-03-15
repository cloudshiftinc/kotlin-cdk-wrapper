@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTaskDefinitionProps {
  public fun autoCreateTasks(): Any

  public fun loRaWanUpdateGatewayTaskEntry(): Any? = unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

  public fun update(): Any? = unwrap(this).getUpdate()

  @CdkDslMarker
  public interface Builder {
    public fun autoCreateTasks(autoCreateTasks: Boolean)

    public fun autoCreateTasks(autoCreateTasks: IResolvable)

    public fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable)

    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d2428e9af25c96b37dc1a277ad2a3966974a0f54cbf270ef74e6f7c936c49")
    public
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun taskDefinitionType(taskDefinitionType: String)

    public fun update(update: IResolvable)

    public fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17dd972b1bdb65de89f9479e243ceb44aca06c56d3fe6d59f50e224e1650a651")
    public
        fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnTaskDefinitionProps.builder()

    override fun autoCreateTasks(autoCreateTasks: Boolean) {
      cdkBuilder.autoCreateTasks(autoCreateTasks)
    }

    override fun autoCreateTasks(autoCreateTasks: IResolvable) {
      cdkBuilder.autoCreateTasks(autoCreateTasks.let(IResolvable::unwrap))
    }

    override fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: IResolvable) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(IResolvable::unwrap))
    }

    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty) {
      cdkBuilder.loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry.let(CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7d2428e9af25c96b37dc1a277ad2a3966974a0f54cbf270ef74e6f7c936c49")
    override
        fun loRaWanUpdateGatewayTaskEntry(loRaWanUpdateGatewayTaskEntry: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder.() -> Unit):
        Unit =
        loRaWanUpdateGatewayTaskEntry(CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty(loRaWanUpdateGatewayTaskEntry))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun taskDefinitionType(taskDefinitionType: String) {
      cdkBuilder.taskDefinitionType(taskDefinitionType)
    }

    override fun update(update: IResolvable) {
      cdkBuilder.update(update.let(IResolvable::unwrap))
    }

    override fun update(update: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty) {
      cdkBuilder.update(update.let(CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
    override fun autoCreateTasks(): Any = unwrap(this).getAutoCreateTasks()

    override fun loRaWanUpdateGatewayTaskEntry(): Any? =
        unwrap(this).getLoRaWanUpdateGatewayTaskEntry()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun taskDefinitionType(): String? = unwrap(this).getTaskDefinitionType()

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
