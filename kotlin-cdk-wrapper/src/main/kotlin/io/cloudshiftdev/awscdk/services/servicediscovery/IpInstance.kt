@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicediscovery

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class IpInstance internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstance,
) : InstanceBase(cdkObject) {
  public override fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun ipv4(): String = unwrap(this).getIpv4()

  public open fun ipv6(): String = unwrap(this).getIpv6()

  public open fun port(): Number = unwrap(this).getPort()

  public override fun service(): IService = unwrap(this).getService().let(IService::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun customAttributes(customAttributes: Map<String, String>)

    public fun instanceId(instanceId: String)

    public fun ipv4(ipv4: String)

    public fun ipv6(ipv6: String)

    public fun port(port: Number)

    public fun service(service: IService)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicediscovery.IpInstance.Builder =
        software.amazon.awscdk.services.servicediscovery.IpInstance.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.servicediscovery.IpInstance =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): IpInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return IpInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicediscovery.IpInstance):
        IpInstance = IpInstance(cdkObject)

    internal fun unwrap(wrapped: IpInstance):
        software.amazon.awscdk.services.servicediscovery.IpInstance = wrapped.cdkObject
  }
}
