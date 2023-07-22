@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupMatchAttributesPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.MatchAttributesProperty.Builder =
      CfnRuleGroup.MatchAttributesProperty.builder()

  private val _destinationPorts: MutableList<Any> = mutableListOf()

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _protocols: MutableList<Number> = mutableListOf()

  private val _sourcePorts: MutableList<Any> = mutableListOf()

  private val _sources: MutableList<Any> = mutableListOf()

  private val _tcpFlags: MutableList<Any> = mutableListOf()

  /**
   * @param destinationPorts The destination ports to inspect for.
   * If not specified, this matches with any destination port. This setting is only used for
   * protocols 6 (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun destinationPorts(vararg destinationPorts: Any) {
    _destinationPorts.addAll(listOf(*destinationPorts))
  }

  /**
   * @param destinationPorts The destination ports to inspect for.
   * If not specified, this matches with any destination port. This setting is only used for
   * protocols 6 (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun destinationPorts(destinationPorts: Collection<Any>) {
    _destinationPorts.addAll(destinationPorts)
  }

  /**
   * @param destinationPorts The destination ports to inspect for.
   * If not specified, this matches with any destination port. This setting is only used for
   * protocols 6 (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun destinationPorts(destinationPorts: IResolvable) {
    cdkBuilder.destinationPorts(destinationPorts)
  }

  /**
   * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
   * notation.
   * If not specified, this matches with any destination address.
   */
  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  /**
   * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
   * notation.
   * If not specified, this matches with any destination address.
   */
  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  /**
   * @param destinations The destination IP addresses and address ranges to inspect for, in CIDR
   * notation.
   * If not specified, this matches with any destination address.
   */
  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  /**
   * @param protocols The protocols to inspect for, specified using each protocol's assigned
   * internet protocol number (IANA).
   * If not specified, this matches with any protocol.
   */
  public fun protocols(vararg protocols: Number) {
    _protocols.addAll(listOf(*protocols))
  }

  /**
   * @param protocols The protocols to inspect for, specified using each protocol's assigned
   * internet protocol number (IANA).
   * If not specified, this matches with any protocol.
   */
  public fun protocols(protocols: Collection<Number>) {
    _protocols.addAll(protocols)
  }

  /**
   * @param protocols The protocols to inspect for, specified using each protocol's assigned
   * internet protocol number (IANA).
   * If not specified, this matches with any protocol.
   */
  public fun protocols(protocols: IResolvable) {
    cdkBuilder.protocols(protocols)
  }

  /**
   * @param sourcePorts The source ports to inspect for.
   * If not specified, this matches with any source port. This setting is only used for protocols 6
   * (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun sourcePorts(vararg sourcePorts: Any) {
    _sourcePorts.addAll(listOf(*sourcePorts))
  }

  /**
   * @param sourcePorts The source ports to inspect for.
   * If not specified, this matches with any source port. This setting is only used for protocols 6
   * (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun sourcePorts(sourcePorts: Collection<Any>) {
    _sourcePorts.addAll(sourcePorts)
  }

  /**
   * @param sourcePorts The source ports to inspect for.
   * If not specified, this matches with any source port. This setting is only used for protocols 6
   * (TCP) and 17 (UDP).
   *
   * You can specify individual ports, for example `1994` and you can specify port ranges, for
   * example `1990:1994` .
   */
  public fun sourcePorts(sourcePorts: IResolvable) {
    cdkBuilder.sourcePorts(sourcePorts)
  }

  /**
   * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
   * If not specified, this matches with any source address.
   */
  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  /**
   * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
   * If not specified, this matches with any source address.
   */
  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  /**
   * @param sources The source IP addresses and address ranges to inspect for, in CIDR notation.
   * If not specified, this matches with any source address.
   */
  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  /**
   * @param tcpFlags The TCP flags and masks to inspect for.
   * If not specified, this matches with any settings. This setting is only used for protocol 6
   * (TCP).
   */
  public fun tcpFlags(vararg tcpFlags: Any) {
    _tcpFlags.addAll(listOf(*tcpFlags))
  }

  /**
   * @param tcpFlags The TCP flags and masks to inspect for.
   * If not specified, this matches with any settings. This setting is only used for protocol 6
   * (TCP).
   */
  public fun tcpFlags(tcpFlags: Collection<Any>) {
    _tcpFlags.addAll(tcpFlags)
  }

  /**
   * @param tcpFlags The TCP flags and masks to inspect for.
   * If not specified, this matches with any settings. This setting is only used for protocol 6
   * (TCP).
   */
  public fun tcpFlags(tcpFlags: IResolvable) {
    cdkBuilder.tcpFlags(tcpFlags)
  }

  public fun build(): CfnRuleGroup.MatchAttributesProperty {
    if(_destinationPorts.isNotEmpty()) cdkBuilder.destinationPorts(_destinationPorts)
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
    if(_sourcePorts.isNotEmpty()) cdkBuilder.sourcePorts(_sourcePorts)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    if(_tcpFlags.isNotEmpty()) cdkBuilder.tcpFlags(_tcpFlags)
    return cdkBuilder.build()
  }
}
