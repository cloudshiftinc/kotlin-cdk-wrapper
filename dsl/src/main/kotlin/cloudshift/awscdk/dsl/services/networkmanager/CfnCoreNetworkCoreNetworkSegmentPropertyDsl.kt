@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkmanager.CfnCoreNetwork

/**
 * Describes a core network segment, which are dedicated routes.
 *
 * Only attachments within this segment can communicate with each other.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CoreNetworkSegmentProperty coreNetworkSegmentProperty = CoreNetworkSegmentProperty.builder()
 * .edgeLocations(List.of("edgeLocations"))
 * .name("name")
 * .sharedSegments(List.of("sharedSegments"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-corenetwork-corenetworksegment.html)
 */
@CdkDslMarker
public class CfnCoreNetworkCoreNetworkSegmentPropertyDsl {
  private val cdkBuilder: CfnCoreNetwork.CoreNetworkSegmentProperty.Builder =
      CfnCoreNetwork.CoreNetworkSegmentProperty.builder()

  private val _edgeLocations: MutableList<String> = mutableListOf()

  private val _sharedSegments: MutableList<String> = mutableListOf()

  /**
   * @param edgeLocations The Regions where the edges are located.
   */
  public fun edgeLocations(vararg edgeLocations: String) {
    _edgeLocations.addAll(listOf(*edgeLocations))
  }

  /**
   * @param edgeLocations The Regions where the edges are located.
   */
  public fun edgeLocations(edgeLocations: Collection<String>) {
    _edgeLocations.addAll(edgeLocations)
  }

  /**
   * @param name The name of a core network segment.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param sharedSegments The shared segments of a core network.
   */
  public fun sharedSegments(vararg sharedSegments: String) {
    _sharedSegments.addAll(listOf(*sharedSegments))
  }

  /**
   * @param sharedSegments The shared segments of a core network.
   */
  public fun sharedSegments(sharedSegments: Collection<String>) {
    _sharedSegments.addAll(sharedSegments)
  }

  public fun build(): CfnCoreNetwork.CoreNetworkSegmentProperty {
    if(_edgeLocations.isNotEmpty()) cdkBuilder.edgeLocations(_edgeLocations)
    if(_sharedSegments.isNotEmpty()) cdkBuilder.sharedSegments(_sharedSegments)
    return cdkBuilder.build()
  }
}
