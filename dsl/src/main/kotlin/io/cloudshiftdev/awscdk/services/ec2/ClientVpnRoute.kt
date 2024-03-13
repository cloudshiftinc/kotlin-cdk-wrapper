package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ClientVpnRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRoute,
) : Resource(cdkObject) {
  public interface Builder {
    public fun cidr(cidr: String) {
    }

    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
    }

    public fun description(description: String) {
    }

    public fun target(target: ClientVpnRouteTarget) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRoute.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRoute.Builder.create(scope, id)

    public override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    public override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
      cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun target(target: ClientVpnRouteTarget) {
      cdkBuilder.target(target.let(ClientVpnRouteTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRoute = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ClientVpnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ClientVpnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRoute): ClientVpnRoute
        = ClientVpnRoute(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRoute): software.amazon.awscdk.services.ec2.ClientVpnRoute
        = wrapped.cdkObject
  }
}
