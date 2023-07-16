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

  public fun asn(asn: Number) {
    cdkBuilder.asn(asn)
  }

  public fun edgeLocation(edgeLocation: String) {
    cdkBuilder.edgeLocation(edgeLocation)
  }

  public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
    _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
  }

  public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
    _insideCidrBlocks.addAll(insideCidrBlocks)
  }

  public fun build(): CfnCoreNetwork.CoreNetworkEdgeProperty {
    if(_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
    return cdkBuilder.build()
  }
}
