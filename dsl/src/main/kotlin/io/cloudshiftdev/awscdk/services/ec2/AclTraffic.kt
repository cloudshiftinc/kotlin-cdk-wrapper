package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class AclTraffic internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AclTraffic,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun toTrafficConfig(): AclTrafficConfig =
      unwrap(this).toTrafficConfig().let(AclTrafficConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclTraffic,
  ) : AclTraffic(cdkObject)

  public companion object {
    public fun allTraffic(): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.allTraffic().let(AclTraffic::wrap)

    public fun icmp(props: AclIcmp): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.icmp(props.let(AclIcmp::unwrap)).let(AclTraffic::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("205d17d3279aff58f9420f658e741702b5c6008f9a12938baf2f131fd8a12052")
    public fun icmp(props: AclIcmp.Builder.() -> Unit): AclTraffic = icmp(AclIcmp(props))

    public fun icmpv6(props: AclIcmp): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.icmpv6(props.let(AclIcmp::unwrap)).let(AclTraffic::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a7cdb51d199e6b85f447b0b3c330361a7291cb89e09085bda4a3dae11209945")
    public fun icmpv6(props: AclIcmp.Builder.() -> Unit): AclTraffic = icmpv6(AclIcmp(props))

    public fun tcpPort(port: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.tcpPort(port).let(AclTraffic::wrap)

    public fun tcpPortRange(startPort: Number, endPort: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.tcpPortRange(startPort,
        endPort).let(AclTraffic::wrap)

    public fun udpPort(port: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.udpPort(port).let(AclTraffic::wrap)

    public fun udpPortRange(startPort: Number, endPort: Number): AclTraffic =
        software.amazon.awscdk.services.ec2.AclTraffic.udpPortRange(startPort,
        endPort).let(AclTraffic::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclTraffic): AclTraffic =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclTraffic): software.amazon.awscdk.services.ec2.AclTraffic =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclTraffic
  }
}
