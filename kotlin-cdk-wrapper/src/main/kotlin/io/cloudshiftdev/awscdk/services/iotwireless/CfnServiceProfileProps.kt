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

public interface CfnServiceProfileProps {
  public fun loRaWan(): Any? = unwrap(this).getLoRaWan()

  public fun name(): String? = unwrap(this).getName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun loRaWan(loRaWan: IResolvable)

    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c47de0670d7063e8b0de3843c952b2697d1a15f5a3ed4e9f96781c7531fbed3")
    public fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps.Builder =
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps.builder()

    override fun loRaWan(loRaWan: IResolvable) {
      cdkBuilder.loRaWan(loRaWan.let(IResolvable::unwrap))
    }

    override fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty) {
      cdkBuilder.loRaWan(loRaWan.let(CfnServiceProfile.LoRaWANServiceProfileProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c47de0670d7063e8b0de3843c952b2697d1a15f5a3ed4e9f96781c7531fbed3")
    override
        fun loRaWan(loRaWan: CfnServiceProfile.LoRaWANServiceProfileProperty.Builder.() -> Unit):
        Unit = loRaWan(CfnServiceProfile.LoRaWANServiceProfileProperty(loRaWan))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps,
  ) : CdkObject(cdkObject), CfnServiceProfileProps {
    override fun loRaWan(): Any? = unwrap(this).getLoRaWan()

    override fun name(): String? = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnServiceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps):
        CfnServiceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceProfileProps):
        software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
  }
}
