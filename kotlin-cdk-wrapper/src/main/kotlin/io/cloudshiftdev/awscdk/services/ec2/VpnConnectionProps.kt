@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpnConnectionProps : VpnConnectionOptions {
  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun asn(asn: Number)

    public fun ip(ip: String)

    public fun staticRoutes(staticRoutes: List<String>)

    public fun staticRoutes(vararg staticRoutes: String)

    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)

    public fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionProps.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionProps.builder()

    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    override fun staticRoutes(vararg staticRoutes: String): Unit =
        staticRoutes(staticRoutes.toList())

    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionProps,
  ) : CdkObject(cdkObject), VpnConnectionProps {
    override fun asn(): Number? = unwrap(this).getAsn()

    override fun ip(): String = unwrap(this).getIp()

    override fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

    override fun tunnelOptions(): List<VpnTunnelOption> =
        unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionProps):
        VpnConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionProps):
        software.amazon.awscdk.services.ec2.VpnConnectionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.VpnConnectionProps
  }
}
