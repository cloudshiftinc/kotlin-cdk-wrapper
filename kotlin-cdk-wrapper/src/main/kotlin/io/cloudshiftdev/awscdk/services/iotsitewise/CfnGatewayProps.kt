@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnGatewayProps {
  public fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

  public fun gatewayName(): String

  public fun gatewayPlatform(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable)

    public fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>)

    public fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any)

    public fun gatewayName(gatewayName: String)

    public fun gatewayPlatform(gatewayPlatform: IResolvable)

    public fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daef7b497712a2c38abe2d8815aa9b78513e87f677531eb68e104625fd5cfd0a")
    public
        fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnGatewayProps.builder()

    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: IResolvable) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries.let(IResolvable::unwrap))
    }

    override fun gatewayCapabilitySummaries(gatewayCapabilitySummaries: List<Any>) {
      cdkBuilder.gatewayCapabilitySummaries(gatewayCapabilitySummaries)
    }

    override fun gatewayCapabilitySummaries(vararg gatewayCapabilitySummaries: Any): Unit =
        gatewayCapabilitySummaries(gatewayCapabilitySummaries.toList())

    override fun gatewayName(gatewayName: String) {
      cdkBuilder.gatewayName(gatewayName)
    }

    override fun gatewayPlatform(gatewayPlatform: IResolvable) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(IResolvable::unwrap))
    }

    override fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty) {
      cdkBuilder.gatewayPlatform(gatewayPlatform.let(CfnGateway.GatewayPlatformProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daef7b497712a2c38abe2d8815aa9b78513e87f677531eb68e104625fd5cfd0a")
    override
        fun gatewayPlatform(gatewayPlatform: CfnGateway.GatewayPlatformProperty.Builder.() -> Unit):
        Unit = gatewayPlatform(CfnGateway.GatewayPlatformProperty(gatewayPlatform))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps,
  ) : CdkObject(cdkObject), CfnGatewayProps {
    override fun gatewayCapabilitySummaries(): Any? = unwrap(this).getGatewayCapabilitySummaries()

    override fun gatewayName(): String = unwrap(this).getGatewayName()

    override fun gatewayPlatform(): Any = unwrap(this).getGatewayPlatform()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnGatewayProps):
        CfnGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayProps):
        software.amazon.awscdk.services.iotsitewise.CfnGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
  }
}
