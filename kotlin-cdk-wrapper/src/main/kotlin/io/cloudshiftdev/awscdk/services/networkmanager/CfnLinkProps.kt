@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLinkProps {
  public fun bandwidth(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun globalNetworkId(): String

  public fun provider(): String? = unwrap(this).getProvider()

  public fun siteId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun bandwidth(bandwidth: IResolvable)

    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742650b47859758aabdb6cf12e9ce92e9a6384de17aaaac816e7df04a32f34ca")
    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun provider(provider: String)

    public fun siteId(siteId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnLinkProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnLinkProps.builder()

    override fun bandwidth(bandwidth: IResolvable) {
      cdkBuilder.bandwidth(bandwidth.let(IResolvable::unwrap))
    }

    override fun bandwidth(bandwidth: CfnLink.BandwidthProperty) {
      cdkBuilder.bandwidth(bandwidth.let(CfnLink.BandwidthProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742650b47859758aabdb6cf12e9ce92e9a6384de17aaaac816e7df04a32f34ca")
    override fun bandwidth(bandwidth: CfnLink.BandwidthProperty.Builder.() -> Unit): Unit =
        bandwidth(CfnLink.BandwidthProperty(bandwidth))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun provider(provider: String) {
      cdkBuilder.provider(provider)
    }

    override fun siteId(siteId: String) {
      cdkBuilder.siteId(siteId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkProps,
  ) : CdkObject(cdkObject), CfnLinkProps {
    override fun bandwidth(): Any = unwrap(this).getBandwidth()

    override fun description(): String? = unwrap(this).getDescription()

    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun provider(): String? = unwrap(this).getProvider()

    override fun siteId(): String = unwrap(this).getSiteId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnLinkProps):
        CfnLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLinkProps):
        software.amazon.awscdk.services.networkmanager.CfnLinkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnLinkProps
  }
}
