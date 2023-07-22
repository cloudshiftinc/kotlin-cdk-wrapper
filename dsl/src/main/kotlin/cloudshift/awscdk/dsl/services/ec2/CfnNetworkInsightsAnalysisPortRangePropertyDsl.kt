@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisPortRangePropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.PortRangeProperty.Builder =
      CfnNetworkInsightsAnalysis.PortRangeProperty.builder()

  /**
   * @param from The first port in the range.
   */
  public fun from(from: Number) {
    cdkBuilder.from(from)
  }

  /**
   * @param to The last port in the range.
   */
  public fun to(to: Number) {
    cdkBuilder.to(to)
  }

  public fun build(): CfnNetworkInsightsAnalysis.PortRangeProperty = cdkBuilder.build()
}
