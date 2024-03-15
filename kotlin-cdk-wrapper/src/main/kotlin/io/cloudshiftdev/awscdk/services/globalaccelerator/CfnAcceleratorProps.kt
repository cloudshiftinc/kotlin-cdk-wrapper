@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAcceleratorProps {
  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun ipAddressType(ipAddressType: String)

    public fun ipAddresses(ipAddresses: List<String>)

    public fun ipAddresses(vararg ipAddresses: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps.builder()

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps,
  ) : CdkObject(cdkObject), CfnAcceleratorProps {
    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAcceleratorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps):
        CfnAcceleratorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAcceleratorProps):
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnAcceleratorProps
  }
}
