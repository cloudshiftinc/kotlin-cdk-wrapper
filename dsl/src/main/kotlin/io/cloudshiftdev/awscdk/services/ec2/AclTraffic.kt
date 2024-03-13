package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class AclTraffic internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.AclTraffic,
) {
  public open fun toTrafficConfig(): AclTrafficConfig =
      unwrap(this).toTrafficConfig().let(AclTrafficConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclTraffic,
  ) : AclTraffic(cdkObject)

  public companion object {
    public open fun allTraffic(): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.allTraffic().let(AclTraffic::wrap)

    public open fun icmp(props: AclIcmp): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.icmp(props.let(AclIcmp::unwrap)).let(AclTraffic::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("205d17d3279aff58f9420f658e741702b5c6008f9a12938baf2f131fd8a12052")
    public open fun icmp(props: AclIcmp.Builder.() -> Unit): AclTraffic = icmp(AclIcmp(props))

    public open fun icmpv6(props: AclIcmp): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.icmpv6(props.let(AclIcmp::unwrap)).let(AclTraffic::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7cdb51d199e6b85f447b0b3c330361a7291cb89e09085bda4a3dae11209945")
    public open fun icmpv6(props: AclIcmp.Builder.() -> Unit): AclTraffic = icmpv6(AclIcmp(props))

    public open fun tcpPort(port: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.tcpPort(port).let(AclTraffic::wrap)

    public open fun tcpPortRange(startPort: Number, endPort: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.tcpPortRange(startPort,
        endPort).let(AclTraffic::wrap)

    public open fun udpPort(port: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.udpPort(port).let(AclTraffic::wrap)

    public open fun udpPortRange(startPort: Number, endPort: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.udpPortRange(startPort,
        endPort).let(AclTraffic::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclTraffic): AclTraffic =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclTraffic): software.amazon.awscdk.services.ec2.AclTraffic =
        (wrapped as Wrapper).cdkObject
  }
}
