@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `Port` is a property of the
 * [Networking](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
 * property. It describes information about ports for an instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * PortProperty portProperty = PortProperty.builder()
 * .accessDirection("accessDirection")
 * .accessFrom("accessFrom")
 * .accessType("accessType")
 * .cidrListAliases(List.of("cidrListAliases"))
 * .cidrs(List.of("cidrs"))
 * .commonName("commonName")
 * .fromPort(123)
 * .ipv6Cidrs(List.of("ipv6Cidrs"))
 * .protocol("protocol")
 * .toPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-port.html)
 */
@CdkDslMarker
public class CfnInstancePortPropertyDsl {
  private val cdkBuilder: CfnInstance.PortProperty.Builder = CfnInstance.PortProperty.builder()

  private val _cidrListAliases: MutableList<String> = mutableListOf()

  private val _cidrs: MutableList<String> = mutableListOf()

  private val _ipv6Cidrs: MutableList<String> = mutableListOf()

  /**
   * @param accessDirection The access direction ( `inbound` or `outbound` ).
   *
   * Lightsail currently supports only `inbound` access direction.
   */
  public fun accessDirection(accessDirection: String) {
    cdkBuilder.accessDirection(accessDirection)
  }

  /**
   * @param accessFrom The location from which access is allowed.
   * For example, `Anywhere (0.0.0.0/0)` , or `Custom` if a specific IP address or range of IP
   * addresses is allowed.
   */
  public fun accessFrom(accessFrom: String) {
    cdkBuilder.accessFrom(accessFrom)
  }

  /**
   * @param accessType The type of access ( `Public` or `Private` ).
   */
  public fun accessType(accessType: String) {
    cdkBuilder.accessType(accessType)
  }

  /**
   * @param cidrListAliases An alias that defines access for a preconfigured range of IP addresses.
   * The only alias currently supported is `lightsail-connect` , which allows IP addresses of the
   * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
   */
  public fun cidrListAliases(vararg cidrListAliases: String) {
    _cidrListAliases.addAll(listOf(*cidrListAliases))
  }

  /**
   * @param cidrListAliases An alias that defines access for a preconfigured range of IP addresses.
   * The only alias currently supported is `lightsail-connect` , which allows IP addresses of the
   * browser-based RDP/SSH client in the Lightsail console to connect to your instance.
   */
  public fun cidrListAliases(cidrListAliases: Collection<String>) {
    _cidrListAliases.addAll(cidrListAliases)
  }

  /**
   * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed
   * to connect to an instance through the ports, and the protocol.
   *
   * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an instance.
   *
   *
   * Examples:
   *
   * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
   * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
   */
  public fun cidrs(vararg cidrs: String) {
    _cidrs.addAll(listOf(*cidrs))
  }

  /**
   * @param cidrs The IPv4 address, or range of IPv4 addresses (in CIDR notation) that are allowed
   * to connect to an instance through the ports, and the protocol.
   *
   * The `ipv6Cidrs` parameter lists the IPv6 addresses that are allowed to connect to an instance.
   *
   *
   * Examples:
   *
   * * To allow the IP address `192.0.2.44` , specify `192.0.2.44` or `192.0.2.44/32` .
   * * To allow the IP addresses `192.0.2.0` to `192.0.2.255` , specify `192.0.2.0/24` .
   */
  public fun cidrs(cidrs: Collection<String>) {
    _cidrs.addAll(cidrs)
  }

  /**
   * @param commonName The common name of the port information.
   */
  public fun commonName(commonName: String) {
    cdkBuilder.commonName(commonName)
  }

  /**
   * @param fromPort The first port in a range of open ports on an instance.
   * Allowed ports:
   *
   * * TCP and UDP - `0` to `65535`
   * * ICMP - The ICMP type for IPv4 addresses. For example, specify `8` as the `fromPort` (ICMP
   * type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
   * * ICMPv6 - The ICMP type for IPv6 addresses. For example, specify `128` as the `fromPort`
   * (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are
   * allowed to connect to an instance through the ports, and the protocol.
   * Only devices with an IPv6 address can connect to an instance through IPv6; otherwise, IPv4
   * should be used.
   *
   *
   * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an instance.
   */
  public fun ipv6Cidrs(vararg ipv6Cidrs: String) {
    _ipv6Cidrs.addAll(listOf(*ipv6Cidrs))
  }

  /**
   * @param ipv6Cidrs The IPv6 address, or range of IPv6 addresses (in CIDR notation) that are
   * allowed to connect to an instance through the ports, and the protocol.
   * Only devices with an IPv6 address can connect to an instance through IPv6; otherwise, IPv4
   * should be used.
   *
   *
   * The `cidrs` parameter lists the IPv4 addresses that are allowed to connect to an instance.
   */
  public fun ipv6Cidrs(ipv6Cidrs: Collection<String>) {
    _ipv6Cidrs.addAll(ipv6Cidrs)
  }

  /**
   * @param protocol The IP protocol name.
   * The name can be one of the following:
   *
   * * `tcp` - Transmission Control Protocol (TCP) provides reliable, ordered, and error-checked
   * delivery of streamed data between applications running on hosts communicating by an IP network. If
   * you have an application that doesn't require reliable data stream service, use UDP instead.
   * * `all` - All transport layer protocol types.
   * * `udp` - With User Datagram Protocol (UDP), computer applications can send messages (or
   * datagrams) to other hosts on an Internet Protocol (IP) network. Prior communications are not
   * required to set up transmission channels or data paths. Applications that don't require reliable
   * data stream service can use UDP, which provides a connectionless datagram service that emphasizes
   * reduced latency over reliability. If you do require reliable data stream service, use TCP instead.
   * * `icmp` - Internet Control Message Protocol (ICMP) is used to send error messages and
   * operational information indicating success or failure when communicating with an instance. For
   * example, an error is indicated when an instance could not be reached. When you specify `icmp` as
   * the `protocol` , you must specify the ICMP type using the `fromPort` parameter, and ICMP code
   * using the `toPort` parameter.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param toPort The last port in a range of open ports on an instance.
   * Allowed ports:
   *
   * * TCP and UDP - `0` to `65535`
   * * ICMP - The ICMP code for IPv4 addresses. For example, specify `8` as the `fromPort` (ICMP
   * type), and `-1` as the `toPort` (ICMP code), to enable ICMP Ping.
   * * ICMPv6 - The ICMP code for IPv6 addresses. For example, specify `128` as the `fromPort`
   * (ICMPv6 type), and `0` as `toPort` (ICMPv6 code).
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnInstance.PortProperty {
    if(_cidrListAliases.isNotEmpty()) cdkBuilder.cidrListAliases(_cidrListAliases)
    if(_cidrs.isNotEmpty()) cdkBuilder.cidrs(_cidrs)
    if(_ipv6Cidrs.isNotEmpty()) cdkBuilder.ipv6Cidrs(_ipv6Cidrs)
    return cdkBuilder.build()
  }
}
