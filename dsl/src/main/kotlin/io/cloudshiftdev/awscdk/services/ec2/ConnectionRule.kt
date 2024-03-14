package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ConnectionRule {
  /**
   * Description of this connection.
   *
   * It is applied to both the ingress rule
   * and the egress rule.
   *
   * Default: No description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Start of port range for the TCP and UDP protocols, or an ICMP type number.
   *
   * If you specify icmp for the IpProtocol property, you can specify
   * -1 as a wildcard (i.e., any ICMP type number).
   */
  public fun fromPort(): Number

  /**
   * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers).
   *
   * Use -1 to specify all protocols. If you specify -1, or a protocol number
   * other than tcp, udp, icmp, or 58 (ICMPv6), traffic on all ports is
   * allowed, regardless of any ports you specify. For tcp, udp, and icmp, you
   * must specify a port range. For protocol 58 (ICMPv6), you can optionally
   * specify a port range; if you don't, traffic for all types and codes is
   * allowed.
   *
   * Default: tcp
   */
  public fun protocol(): String? = unwrap(this).getProtocol()

  /**
   * End of port range for the TCP and UDP protocols, or an ICMP code.
   *
   * If you specify icmp for the IpProtocol property, you can specify -1 as a
   * wildcard (i.e., any ICMP code).
   *
   * Default: If toPort is not specified, it will be the same as fromPort.
   */
  public fun toPort(): Number? = unwrap(this).getToPort()

  /**
   * A builder for [ConnectionRule]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description of this connection.
     * It is applied to both the ingress rule
     * and the egress rule.
     */
    public fun description(description: String)

    /**
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type number. 
     * If you specify icmp for the IpProtocol property, you can specify
     * -1 as a wildcard (i.e., any ICMP type number).
     */
    public fun fromPort(fromPort: Number)

    /**
     * @param protocol The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers).
     * Use -1 to specify all protocols. If you specify -1, or a protocol number
     * other than tcp, udp, icmp, or 58 (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For tcp, udp, and icmp, you
     * must specify a port range. For protocol 58 (ICMPv6), you can optionally
     * specify a port range; if you don't, traffic for all types and codes is
     * allowed.
     */
    public fun protocol(protocol: String)

    /**
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code.
     * If you specify icmp for the IpProtocol property, you can specify -1 as a
     * wildcard (i.e., any ICMP code).
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ConnectionRule.Builder =
        software.amazon.awscdk.services.ec2.ConnectionRule.builder()

    /**
     * @param description Description of this connection.
     * It is applied to both the ingress rule
     * and the egress rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param fromPort Start of port range for the TCP and UDP protocols, or an ICMP type number. 
     * If you specify icmp for the IpProtocol property, you can specify
     * -1 as a wildcard (i.e., any ICMP type number).
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * @param protocol The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers).
     * Use -1 to specify all protocols. If you specify -1, or a protocol number
     * other than tcp, udp, icmp, or 58 (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For tcp, udp, and icmp, you
     * must specify a port range. For protocol 58 (ICMPv6), you can optionally
     * specify a port range; if you don't, traffic for all types and codes is
     * allowed.
     */
    override fun protocol(protocol: String) {
      cdkBuilder.protocol(protocol)
    }

    /**
     * @param toPort End of port range for the TCP and UDP protocols, or an ICMP code.
     * If you specify icmp for the IpProtocol property, you can specify -1 as a
     * wildcard (i.e., any ICMP code).
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.ConnectionRule = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ConnectionRule,
  ) : CdkObject(cdkObject), ConnectionRule {
    /**
     * Description of this connection.
     *
     * It is applied to both the ingress rule
     * and the egress rule.
     *
     * Default: No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Start of port range for the TCP and UDP protocols, or an ICMP type number.
     *
     * If you specify icmp for the IpProtocol property, you can specify
     * -1 as a wildcard (i.e., any ICMP type number).
     */
    override fun fromPort(): Number = unwrap(this).getFromPort()

    /**
     * The IP protocol name (tcp, udp, icmp) or number (see Protocol Numbers).
     *
     * Use -1 to specify all protocols. If you specify -1, or a protocol number
     * other than tcp, udp, icmp, or 58 (ICMPv6), traffic on all ports is
     * allowed, regardless of any ports you specify. For tcp, udp, and icmp, you
     * must specify a port range. For protocol 58 (ICMPv6), you can optionally
     * specify a port range; if you don't, traffic for all types and codes is
     * allowed.
     *
     * Default: tcp
     */
    override fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * End of port range for the TCP and UDP protocols, or an ICMP code.
     *
     * If you specify icmp for the IpProtocol property, you can specify -1 as a
     * wildcard (i.e., any ICMP code).
     *
     * Default: If toPort is not specified, it will be the same as fromPort.
     */
    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionRule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ConnectionRule): ConnectionRule
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConnectionRule): software.amazon.awscdk.services.ec2.ConnectionRule
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ConnectionRule
  }
}
