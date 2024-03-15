@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface IpInstanceBaseProps : BaseInstanceProps {
  public fun ipv4(): String? = unwrap(this).getIpv4()

  public fun ipv6(): String? = unwrap(this).getIpv6()

  public fun port(): Number? = unwrap(this).getPort()

  @CdkDslMarker
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)

    public fun ipv4(ipv4: String)

    public fun ipv6(ipv6: String)

    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps.Builder =
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps.builder()

    override fun customAttributes(customAttributes: Map<String, String>) {
      cdkBuilder.customAttributes(customAttributes)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun ipv4(ipv4: String) {
      cdkBuilder.ipv4(ipv4)
    }

    override fun ipv6(ipv6: String) {
      cdkBuilder.ipv6(ipv6)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps,
  ) : CdkObject(cdkObject), IpInstanceBaseProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun ipv4(): String? = unwrap(this).getIpv4()

    override fun ipv6(): String? = unwrap(this).getIpv6()

    override fun port(): Number? = unwrap(this).getPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IpInstanceBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps):
        IpInstanceBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IpInstanceBaseProps):
        software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IpInstanceBaseProps
  }
}
