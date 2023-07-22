@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

/**
 * Describes a packet header statement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PacketHeaderStatementRequestProperty packetHeaderStatementRequestProperty =
 * PacketHeaderStatementRequestProperty.builder()
 * .destinationAddresses(List.of("destinationAddresses"))
 * .destinationPorts(List.of("destinationPorts"))
 * .destinationPrefixLists(List.of("destinationPrefixLists"))
 * .protocols(List.of("protocols"))
 * .sourceAddresses(List.of("sourceAddresses"))
 * .sourcePorts(List.of("sourcePorts"))
 * .sourcePrefixLists(List.of("sourcePrefixLists"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsaccessscope-packetheaderstatementrequest.html)
 */
@CdkDslMarker
public class CfnNetworkInsightsAccessScopePacketHeaderStatementRequestPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.Builder
      = CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty.builder()

  private val _destinationAddresses: MutableList<String> = mutableListOf()

  private val _destinationPorts: MutableList<String> = mutableListOf()

  private val _destinationPrefixLists: MutableList<String> = mutableListOf()

  private val _protocols: MutableList<String> = mutableListOf()

  private val _sourceAddresses: MutableList<String> = mutableListOf()

  private val _sourcePorts: MutableList<String> = mutableListOf()

  private val _sourcePrefixLists: MutableList<String> = mutableListOf()

  /**
   * @param destinationAddresses The destination addresses.
   */
  public fun destinationAddresses(vararg destinationAddresses: String) {
    _destinationAddresses.addAll(listOf(*destinationAddresses))
  }

  /**
   * @param destinationAddresses The destination addresses.
   */
  public fun destinationAddresses(destinationAddresses: Collection<String>) {
    _destinationAddresses.addAll(destinationAddresses)
  }

  /**
   * @param destinationPorts The destination ports.
   */
  public fun destinationPorts(vararg destinationPorts: String) {
    _destinationPorts.addAll(listOf(*destinationPorts))
  }

  /**
   * @param destinationPorts The destination ports.
   */
  public fun destinationPorts(destinationPorts: Collection<String>) {
    _destinationPorts.addAll(destinationPorts)
  }

  /**
   * @param destinationPrefixLists The destination prefix lists.
   */
  public fun destinationPrefixLists(vararg destinationPrefixLists: String) {
    _destinationPrefixLists.addAll(listOf(*destinationPrefixLists))
  }

  /**
   * @param destinationPrefixLists The destination prefix lists.
   */
  public fun destinationPrefixLists(destinationPrefixLists: Collection<String>) {
    _destinationPrefixLists.addAll(destinationPrefixLists)
  }

  /**
   * @param protocols The protocols.
   */
  public fun protocols(vararg protocols: String) {
    _protocols.addAll(listOf(*protocols))
  }

  /**
   * @param protocols The protocols.
   */
  public fun protocols(protocols: Collection<String>) {
    _protocols.addAll(protocols)
  }

  /**
   * @param sourceAddresses The source addresses.
   */
  public fun sourceAddresses(vararg sourceAddresses: String) {
    _sourceAddresses.addAll(listOf(*sourceAddresses))
  }

  /**
   * @param sourceAddresses The source addresses.
   */
  public fun sourceAddresses(sourceAddresses: Collection<String>) {
    _sourceAddresses.addAll(sourceAddresses)
  }

  /**
   * @param sourcePorts The source ports.
   */
  public fun sourcePorts(vararg sourcePorts: String) {
    _sourcePorts.addAll(listOf(*sourcePorts))
  }

  /**
   * @param sourcePorts The source ports.
   */
  public fun sourcePorts(sourcePorts: Collection<String>) {
    _sourcePorts.addAll(sourcePorts)
  }

  /**
   * @param sourcePrefixLists The source prefix lists.
   */
  public fun sourcePrefixLists(vararg sourcePrefixLists: String) {
    _sourcePrefixLists.addAll(listOf(*sourcePrefixLists))
  }

  /**
   * @param sourcePrefixLists The source prefix lists.
   */
  public fun sourcePrefixLists(sourcePrefixLists: Collection<String>) {
    _sourcePrefixLists.addAll(sourcePrefixLists)
  }

  public fun build(): CfnNetworkInsightsAccessScope.PacketHeaderStatementRequestProperty {
    if(_destinationAddresses.isNotEmpty()) cdkBuilder.destinationAddresses(_destinationAddresses)
    if(_destinationPorts.isNotEmpty()) cdkBuilder.destinationPorts(_destinationPorts)
    if(_destinationPrefixLists.isNotEmpty())
        cdkBuilder.destinationPrefixLists(_destinationPrefixLists)
    if(_protocols.isNotEmpty()) cdkBuilder.protocols(_protocols)
    if(_sourceAddresses.isNotEmpty()) cdkBuilder.sourceAddresses(_sourceAddresses)
    if(_sourcePorts.isNotEmpty()) cdkBuilder.sourcePorts(_sourcePorts)
    if(_sourcePrefixLists.isNotEmpty()) cdkBuilder.sourcePrefixLists(_sourcePrefixLists)
    return cdkBuilder.build()
  }
}
