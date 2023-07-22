@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupHeaderPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.HeaderProperty.Builder =
      CfnRuleGroup.HeaderProperty.builder()

  /**
   * @param destination The destination IP address or address range to inspect for, in CIDR
   * notation. 
   * To match with any address, specify `ANY` .
   *
   * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
   * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
   *
   * Examples:
   *
   * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
   * `192.0.2.44/32` .
   * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
   * specify `192.0.2.0/24` .
   * * To configure Network Firewall to inspect for the IP address
   * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * To configure Network Firewall to inspect for IP addresses from
   * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
   * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
   *
   * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param destinationPort The destination port to inspect for. 
   * You can specify an individual port, for example `1994` and you can specify a port range, for
   * example `1990:1994` . To match with any port, specify `ANY` .
   */
  public fun destinationPort(destinationPort: String) {
    cdkBuilder.destinationPort(destinationPort)
  }

  /**
   * @param direction The direction of traffic flow to inspect. 
   * If set to `ANY` , the inspection matches bidirectional traffic, both from the source to the
   * destination and from the destination to the source. If set to `FORWARD` , the inspection only
   * matches traffic going from the source to the destination.
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param protocol The protocol to inspect for. 
   * To specify all, you can use `IP` , because all traffic on AWS and on the internet is IP.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  /**
   * @param source The source IP address or address range to inspect for, in CIDR notation. 
   * To match with any address, specify `ANY` .
   *
   * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
   * notation. Network Firewall supports all address ranges for IPv4 and IPv6.
   *
   * Examples:
   *
   * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
   * `192.0.2.44/32` .
   * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
   * specify `192.0.2.0/24` .
   * * To configure Network Firewall to inspect for the IP address
   * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
   * * To configure Network Firewall to inspect for IP addresses from
   * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
   * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
   *
   * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
   * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * .
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param sourcePort The source port to inspect for. 
   * You can specify an individual port, for example `1994` and you can specify a port range, for
   * example `1990:1994` . To match with any port, specify `ANY` .
   */
  public fun sourcePort(sourcePort: String) {
    cdkBuilder.sourcePort(sourcePort)
  }

  public fun build(): CfnRuleGroup.HeaderProperty = cdkBuilder.build()
}
