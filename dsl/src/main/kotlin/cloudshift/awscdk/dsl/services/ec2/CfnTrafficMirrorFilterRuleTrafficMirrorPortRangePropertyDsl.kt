@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule

@CdkDslMarker
public class CfnTrafficMirrorFilterRuleTrafficMirrorPortRangePropertyDsl {
  private val cdkBuilder: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.Builder =
      CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty.builder()

  /**
   * @param fromPort The start of the Traffic Mirror port range. 
   * This applies to the TCP and UDP protocols.
   */
  public fun fromPort(fromPort: Number) {
    cdkBuilder.fromPort(fromPort)
  }

  /**
   * @param toPort The end of the Traffic Mirror port range. 
   * This applies to the TCP and UDP protocols.
   */
  public fun toPort(toPort: Number) {
    cdkBuilder.toPort(toPort)
  }

  public fun build(): CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty = cdkBuilder.build()
}
