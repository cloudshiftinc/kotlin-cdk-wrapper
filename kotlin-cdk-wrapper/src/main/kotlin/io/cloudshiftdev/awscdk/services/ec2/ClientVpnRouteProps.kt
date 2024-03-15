@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ClientVpnRouteProps : ClientVpnRouteOptions {
  public fun clientVpnEndpoint(): IClientVpnEndpoint? =
      unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cidr(cidr: String)

    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint)

    public fun description(description: String)

    public fun target(target: ClientVpnRouteTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRouteProps.builder()

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
      cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun target(target: ClientVpnRouteTarget) {
      cdkBuilder.target(target.let(ClientVpnRouteTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteProps,
  ) : CdkObject(cdkObject), ClientVpnRouteProps {
    override fun cidr(): String = unwrap(this).getCidr()

    override fun clientVpnEndpoint(): IClientVpnEndpoint? =
        unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun target(): ClientVpnRouteTarget =
        unwrap(this).getTarget().let(ClientVpnRouteTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteProps):
        ClientVpnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteProps):
        software.amazon.awscdk.services.ec2.ClientVpnRouteProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ClientVpnRouteProps
  }
}
