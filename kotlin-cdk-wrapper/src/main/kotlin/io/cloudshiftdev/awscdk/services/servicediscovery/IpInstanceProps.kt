@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface IpInstanceProps : IpInstanceBaseProps {
  public fun service(): IService

  @CdkDslMarker
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)

    public fun ipv4(ipv4: String)

    public fun ipv6(ipv6: String)

    public fun port(port: Number)

    public fun service(service: IService)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.IpInstanceProps.Builder
        = software.amazon.awscdk.services.servicediscovery.IpInstanceProps.builder()

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

    override fun service(service: IService) {
      cdkBuilder.service(service.let(IService::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.servicediscovery.IpInstanceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceProps,
  ) : CdkObject(cdkObject), IpInstanceProps {
    override fun customAttributes(): Map<String, String> = unwrap(this).getCustomAttributes() ?:
        emptyMap()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun ipv4(): String? = unwrap(this).getIpv4()

    override fun ipv6(): String? = unwrap(this).getIpv6()

    override fun port(): Number? = unwrap(this).getPort()

    override fun service(): IService = unwrap(this).getService().let(IService::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IpInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstanceProps):
        IpInstanceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IpInstanceProps):
        software.amazon.awscdk.services.servicediscovery.IpInstanceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicediscovery.IpInstanceProps
  }
}
