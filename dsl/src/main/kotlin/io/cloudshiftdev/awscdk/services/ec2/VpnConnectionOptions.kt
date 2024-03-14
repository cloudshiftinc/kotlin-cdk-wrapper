package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpnConnectionOptions {
  public fun asn(): Number? = unwrap(this).getAsn()

  public fun ip(): String

  public fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

  public fun tunnelOptions(): List<VpnTunnelOption> =
      unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()

  public interface Builder {
    public fun asn(asn: Number)

    public fun ip(ip: String)

    public fun staticRoutes(staticRoutes: List<String>)

    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionOptions.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionOptions.builder()

    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions,
  ) : VpnConnectionOptions {
    override fun asn(): Number? = unwrap(this).getAsn()

    override fun ip(): String = unwrap(this).getIp()

    override fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

    override fun tunnelOptions(): List<VpnTunnelOption> =
        unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions):
        VpnConnectionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionOptions):
        software.amazon.awscdk.services.ec2.VpnConnectionOptions = (wrapped as Wrapper).cdkObject
  }
}
