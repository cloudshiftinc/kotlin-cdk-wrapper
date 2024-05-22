@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Acl Configuration for traffic.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AclTrafficConfig aclTrafficConfig = AclTrafficConfig.builder()
 * .protocol(123)
 * // the properties below are optional
 * .icmp(AclIcmp.builder()
 * .code(123)
 * .type(123)
 * .build())
 * .portRange(AclPortRange.builder()
 * .from(123)
 * .to(123)
 * .build())
 * .build();
 * ```
 */
public interface AclTrafficConfig {
  /**
   * The Internet Control Message Protocol (ICMP) code and type.
   *
   * Default: - Required if specifying 1 (ICMP) for the protocol parameter.
   */
  public fun icmp(): AclIcmp? = unwrap(this).getIcmp()?.let(AclIcmp::wrap)

  /**
   * The range of port numbers for the UDP/TCP protocol.
   *
   * Default: - Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter
   */
  public fun portRange(): AclPortRange? = unwrap(this).getPortRange()?.let(AclPortRange::wrap)

  /**
   * The protocol number.
   *
   * A value of "-1" means all protocols.
   *
   * If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP),
   * or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
   * ICMP types or codes that you specify.
   *
   * If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
   * block, traffic for all ICMP types and codes allowed, regardless of any that
   * you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR
   * block, you must specify an ICMP type and code.
   *
   * Default: 17
   */
  public fun protocol(): Number

  /**
   * A builder for [AclTrafficConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     */
    public fun icmp(icmp: AclIcmp)

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e56a33d7d345c850354b91021963b4324f6c22151277902bbec3809c06a1abc8")
    public fun icmp(icmp: AclIcmp.Builder.() -> Unit)

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     */
    public fun portRange(portRange: AclPortRange)

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceec31fc9e4e317544e8873943176564916bdb0423ed5677ecab1a5e4f23f2b3")
    public fun portRange(portRange: AclPortRange.Builder.() -> Unit)

    /**
     * @param protocol The protocol number. 
     * A value of "-1" means all protocols.
     *
     * If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP),
     * or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     * ICMP types or codes that you specify.
     *
     * If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     * block, traffic for all ICMP types and codes allowed, regardless of any that
     * you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR
     * block, you must specify an ICMP type and code.
     */
    public fun protocol(protocol: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclTrafficConfig.Builder =
        software.amazon.awscdk.services.ec2.AclTrafficConfig.builder()

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     */
    override fun icmp(icmp: AclIcmp) {
      cdkBuilder.icmp(icmp.let(AclIcmp.Companion::unwrap))
    }

    /**
     * @param icmp The Internet Control Message Protocol (ICMP) code and type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e56a33d7d345c850354b91021963b4324f6c22151277902bbec3809c06a1abc8")
    override fun icmp(icmp: AclIcmp.Builder.() -> Unit): Unit = icmp(AclIcmp(icmp))

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     */
    override fun portRange(portRange: AclPortRange) {
      cdkBuilder.portRange(portRange.let(AclPortRange.Companion::unwrap))
    }

    /**
     * @param portRange The range of port numbers for the UDP/TCP protocol.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ceec31fc9e4e317544e8873943176564916bdb0423ed5677ecab1a5e4f23f2b3")
    override fun portRange(portRange: AclPortRange.Builder.() -> Unit): Unit =
        portRange(AclPortRange(portRange))

    /**
     * @param protocol The protocol number. 
     * A value of "-1" means all protocols.
     *
     * If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP),
     * or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     * ICMP types or codes that you specify.
     *
     * If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     * block, traffic for all ICMP types and codes allowed, regardless of any that
     * you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR
     * block, you must specify an ICMP type and code.
     */
    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclTrafficConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.AclTrafficConfig,
  ) : CdkObject(cdkObject), AclTrafficConfig {
    /**
     * The Internet Control Message Protocol (ICMP) code and type.
     *
     * Default: - Required if specifying 1 (ICMP) for the protocol parameter.
     */
    override fun icmp(): AclIcmp? = unwrap(this).getIcmp()?.let(AclIcmp::wrap)

    /**
     * The range of port numbers for the UDP/TCP protocol.
     *
     * Default: - Required if specifying 6 (TCP) or 17 (UDP) for the protocol parameter
     */
    override fun portRange(): AclPortRange? = unwrap(this).getPortRange()?.let(AclPortRange::wrap)

    /**
     * The protocol number.
     *
     * A value of "-1" means all protocols.
     *
     * If you specify "-1" or a protocol number other than "6" (TCP), "17" (UDP),
     * or "1" (ICMP), traffic on all ports is allowed, regardless of any ports or
     * ICMP types or codes that you specify.
     *
     * If you specify protocol "58" (ICMPv6) and specify an IPv4 CIDR
     * block, traffic for all ICMP types and codes allowed, regardless of any that
     * you specify. If you specify protocol "58" (ICMPv6) and specify an IPv6 CIDR
     * block, you must specify an ICMP type and code.
     *
     * Default: 17
     */
    override fun protocol(): Number = unwrap(this).getProtocol()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclTrafficConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclTrafficConfig):
        AclTrafficConfig = CdkObjectWrappers.wrap(cdkObject) as? AclTrafficConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclTrafficConfig):
        software.amazon.awscdk.services.ec2.AclTrafficConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AclTrafficConfig
  }
}
