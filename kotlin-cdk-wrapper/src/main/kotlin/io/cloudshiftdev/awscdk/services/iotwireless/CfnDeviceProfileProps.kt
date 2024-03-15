@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotwireless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDeviceProfileProps {
  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("595a3727c23a1184daf9a6f8e8410ca34edc0463ca895c71e469ac8c6c41b991")
    public fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps.builder()

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnDeviceProfile.LoRaWANDeviceProfileProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("595a3727c23a1184daf9a6f8e8410ca34edc0463ca895c71e469ac8c6c41b991")
    override fun loRaWan(loRaWan: CfnDeviceProfile.LoRaWANDeviceProfileProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnDeviceProfile.LoRaWANDeviceProfileProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps,
  ) : CdkObject(cdkObject), CfnDeviceProfileProps {
    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps):
        CfnDeviceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProfileProps):
        software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnDeviceProfileProps
  }
}
