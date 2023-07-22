@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisPacketHeaderPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty.builder()

  private val _destinationAddresses: MutableList<String> = mutableListOf()

  private val _destinationPortRanges: MutableList<Any> = mutableListOf()

  private val _sourceAddresses: MutableList<String> = mutableListOf()

  private val _sourcePortRanges: MutableList<Any> = mutableListOf()

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
   * @param destinationPortRanges The destination port ranges.
   */
  public fun destinationPortRanges(vararg destinationPortRanges: Any) {
    _destinationPortRanges.addAll(listOf(*destinationPortRanges))
  }

  /**
   * @param destinationPortRanges The destination port ranges.
   */
  public fun destinationPortRanges(destinationPortRanges: Collection<Any>) {
    _destinationPortRanges.addAll(destinationPortRanges)
  }

  /**
   * @param destinationPortRanges The destination port ranges.
   */
  public fun destinationPortRanges(destinationPortRanges: IResolvable) {
    cdkBuilder.destinationPortRanges(destinationPortRanges)
  }

  /**
   * @param protocol The protocol.
   */
  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
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
   * @param sourcePortRanges The source port ranges.
   */
  public fun sourcePortRanges(vararg sourcePortRanges: Any) {
    _sourcePortRanges.addAll(listOf(*sourcePortRanges))
  }

  /**
   * @param sourcePortRanges The source port ranges.
   */
  public fun sourcePortRanges(sourcePortRanges: Collection<Any>) {
    _sourcePortRanges.addAll(sourcePortRanges)
  }

  /**
   * @param sourcePortRanges The source port ranges.
   */
  public fun sourcePortRanges(sourcePortRanges: IResolvable) {
    cdkBuilder.sourcePortRanges(sourcePortRanges)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisPacketHeaderProperty {
    if(_destinationAddresses.isNotEmpty()) cdkBuilder.destinationAddresses(_destinationAddresses)
    if(_destinationPortRanges.isNotEmpty()) cdkBuilder.destinationPortRanges(_destinationPortRanges)
    if(_sourceAddresses.isNotEmpty()) cdkBuilder.sourceAddresses(_sourceAddresses)
    if(_sourcePortRanges.isNotEmpty()) cdkBuilder.sourcePortRanges(_sourcePortRanges)
    return cdkBuilder.build()
  }
}
