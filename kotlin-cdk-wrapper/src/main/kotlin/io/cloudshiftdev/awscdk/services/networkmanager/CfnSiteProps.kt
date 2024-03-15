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

public interface CfnSiteProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun globalNetworkId(): String

  public fun location(): Any? = unwrap(this).getLocation()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun globalNetworkId(globalNetworkId: String)

    public fun location(location: IResolvable)

    public fun location(location: CfnSite.LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2ccfb2f60e9706745dd85be53d5fcb60851d0cddce22db7fe1554718af547be")
    public fun location(location: CfnSite.LocationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.networkmanager.CfnSiteProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnSiteProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalNetworkId(globalNetworkId: String) {
      cdkBuilder.globalNetworkId(globalNetworkId)
    }

    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    override fun location(location: CfnSite.LocationProperty) {
      cdkBuilder.location(location.let(CfnSite.LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2ccfb2f60e9706745dd85be53d5fcb60851d0cddce22db7fe1554718af547be")
    override fun location(location: CfnSite.LocationProperty.Builder.() -> Unit): Unit =
        location(CfnSite.LocationProperty(location))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnSiteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteProps,
  ) : CdkObject(cdkObject), CfnSiteProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun globalNetworkId(): String = unwrap(this).getGlobalNetworkId()

    override fun location(): Any? = unwrap(this).getLocation()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSiteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnSiteProps):
        CfnSiteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSiteProps):
        software.amazon.awscdk.services.networkmanager.CfnSiteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnSiteProps
  }
}
