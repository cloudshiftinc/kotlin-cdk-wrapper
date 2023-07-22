@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork

@CdkDslMarker
public class CfnCoreNetworkCoreNetworkEdgePropertyDsl {
  private val cdkBuilder: CfnCoreNetwork.CoreNetworkEdgeProperty.Builder =
      CfnCoreNetwork.CoreNetworkEdgeProperty.builder()

  private val _insideCidrBlocks: MutableList<String> = mutableListOf()

  /**
   * @param asn The ASN of a core network edge.
   */
  public fun asn(asn: Number) {
    cdkBuilder.asn(asn)
  }

  /**
   * @param edgeLocation The Region where a core network edge is located.
   */
  public fun edgeLocation(edgeLocation: String) {
    cdkBuilder.edgeLocation(edgeLocation)
  }

  /**
   * @param insideCidrBlocks The inside IP addresses used for core network edges.
   */
  public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
    _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
  }

  /**
   * @param insideCidrBlocks The inside IP addresses used for core network edges.
   */
  public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
    _insideCidrBlocks.addAll(insideCidrBlocks)
  }

  public fun build(): CfnCoreNetwork.CoreNetworkEdgeProperty {
    if(_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
    return cdkBuilder.build()
  }
}
