@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.groundstation.CfnMissionProfile

@CdkDslMarker
public class CfnMissionProfileDataflowEdgePropertyDsl {
  private val cdkBuilder: CfnMissionProfile.DataflowEdgeProperty.Builder =
      CfnMissionProfile.DataflowEdgeProperty.builder()

  /**
   * @param destination The ARN of the destination for this dataflow edge.
   * For example, specify the ARN of a dataflow endpoint config for a downlink edge or an antenna
   * uplink config for an uplink edge.
   */
  public fun destination(destination: String) {
    cdkBuilder.destination(destination)
  }

  /**
   * @param source The ARN of the source for this dataflow edge.
   * For example, specify the ARN of an antenna downlink config for a downlink edge or a dataflow
   * endpoint config for an uplink edge.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnMissionProfile.DataflowEdgeProperty = cdkBuilder.build()
}
