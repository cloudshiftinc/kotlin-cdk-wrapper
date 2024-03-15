@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface AcceleratorProps {
  public fun acceleratorName(): String? = unwrap(this).getAcceleratorName()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceleratorName(acceleratorName: String)

    public fun enabled(enabled: Boolean)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun ipAddresses(ipAddresses: List<String>)

    public fun ipAddresses(vararg ipAddresses: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps.builder()

    override fun acceleratorName(acceleratorName: String) {
      cdkBuilder.acceleratorName(acceleratorName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.AcceleratorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorProps,
  ) : CdkObject(cdkObject), AcceleratorProps {
    override fun acceleratorName(): String? = unwrap(this).getAcceleratorName()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    override fun ipAddresses(): List<String> = unwrap(this).getIpAddresses() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AcceleratorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.AcceleratorProps):
        AcceleratorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AcceleratorProps):
        software.amazon.awscdk.services.globalaccelerator.AcceleratorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
  }
}
