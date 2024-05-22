@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Interface for classes that provide the connection-specification parts of a security group rule.
 *
 * Example:
 *
 * ```
 * InstanceType instanceType;
 * NatInstanceProviderV2 provider = NatProvider.instanceV2(NatInstanceProps.builder()
 * .instanceType(instanceType)
 * .defaultAllowedTraffic(NatTrafficDirection.OUTBOUND_ONLY)
 * .build());
 * Vpc.Builder.create(this, "TheVPC")
 * .natGatewayProvider(provider)
 * .build();
 * provider.connections.allowFrom(Peer.ipv4("1.2.3.4/8"), Port.HTTP);
 * ```
 */
public open class Port(
  cdkObject: software.amazon.awscdk.services.ec2.Port,
) : CdkObject(cdkObject) {
  public constructor(props: PortProps) :
      this(software.amazon.awscdk.services.ec2.Port(props.let(PortProps.Companion::unwrap))
  )

  public constructor(props: PortProps.Builder.() -> Unit) : this(PortProps(props)
  )

  /**
   * Whether the rule containing this port range can be inlined into a securitygroup or not.
   */
  public open fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  /**
   * Produce the ingress/egress rule JSON for the given connection.
   */
  public open fun toRuleJson(): Any = unwrap(this).toRuleJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.Port].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The starting port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param fromPort The starting port for the range. 
     */
    public fun fromPort(fromPort: Number)

    /**
     * The protocol for the range.
     *
     * @param protocol The protocol for the range. 
     */
    public fun protocol(protocol: Protocol)

    /**
     * String representation for this object.
     *
     * @param stringRepresentation String representation for this object. 
     */
    public fun stringRepresentation(stringRepresentation: String)

    /**
     * The ending port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param toPort The ending port for the range. 
     */
    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.Port.Builder =
        software.amazon.awscdk.services.ec2.Port.Builder.create()

    /**
     * The starting port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param fromPort The starting port for the range. 
     */
    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    /**
     * The protocol for the range.
     *
     * @param protocol The protocol for the range. 
     */
    override fun protocol(protocol: Protocol) {
      cdkBuilder.protocol(protocol.let(Protocol.Companion::unwrap))
    }

    /**
     * String representation for this object.
     *
     * @param stringRepresentation String representation for this object. 
     */
    override fun stringRepresentation(stringRepresentation: String) {
      cdkBuilder.stringRepresentation(stringRepresentation)
    }

    /**
     * The ending port for the range.
     *
     * Default: - Not included in the rule
     *
     * @param toPort The ending port for the range. 
     */
    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.Port = cdkBuilder.build()
  }

  public companion object {
    public val DNS_TCP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.DNS_TCP)

    public val DNS_UDP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.DNS_UDP)

    public val HTTP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.HTTP)

    public val HTTPS: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.HTTPS)

    public val IMAP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.IMAP)

    public val IMAPS: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.IMAPS)

    public val LDAP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.LDAP)

    public val MSSQL: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.MSSQL)

    public val MYSQL_AURORA: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.MYSQL_AURORA)

    public val NFS: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.NFS)

    public val POP3: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.POP3)

    public val POP3_S: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.POP3_S)

    public val POSTGRES: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.POSTGRES)

    public val RDP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.RDP)

    public val SMB: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.SMB)

    public val SMTP: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.SMTP)

    public val SSH: Port = Port.wrap(software.amazon.awscdk.services.ec2.Port.SSH)

    public fun ah(): Port = software.amazon.awscdk.services.ec2.Port.ah().let(Port::wrap)

    public fun allIcmp(): Port = software.amazon.awscdk.services.ec2.Port.allIcmp().let(Port::wrap)

    public fun allIcmpV6(): Port =
        software.amazon.awscdk.services.ec2.Port.allIcmpV6().let(Port::wrap)

    public fun allTcp(): Port = software.amazon.awscdk.services.ec2.Port.allTcp().let(Port::wrap)

    public fun allTraffic(): Port =
        software.amazon.awscdk.services.ec2.Port.allTraffic().let(Port::wrap)

    public fun allUdp(): Port = software.amazon.awscdk.services.ec2.Port.allUdp().let(Port::wrap)

    public fun esp(): Port = software.amazon.awscdk.services.ec2.Port.esp().let(Port::wrap)

    public fun icmpPing(): Port =
        software.amazon.awscdk.services.ec2.Port.icmpPing().let(Port::wrap)

    public fun icmpType(type: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpType(type).let(Port::wrap)

    public fun icmpTypeAndCode(type: Number, code: Number): Port =
        software.amazon.awscdk.services.ec2.Port.icmpTypeAndCode(type, code).let(Port::wrap)

    public fun tcp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcp(port).let(Port::wrap)

    public fun tcpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.tcpRange(startPort, endPort).let(Port::wrap)

    public fun udp(port: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udp(port).let(Port::wrap)

    public fun udpRange(startPort: Number, endPort: Number): Port =
        software.amazon.awscdk.services.ec2.Port.udpRange(startPort, endPort).let(Port::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): Port {
      val builderImpl = BuilderImpl()
      return Port(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Port): Port = Port(cdkObject)

    internal fun unwrap(wrapped: Port): software.amazon.awscdk.services.ec2.Port = wrapped.cdkObject
        as software.amazon.awscdk.services.ec2.Port
  }
}
