@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAlternatePathHintPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AlternatePathHintProperty.Builder =
      CfnNetworkInsightsAnalysis.AlternatePathHintProperty.builder()

  public fun componentArn(componentArn: String) {
    cdkBuilder.componentArn(componentArn)
  }

  public fun componentId(componentId: String) {
    cdkBuilder.componentId(componentId)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AlternatePathHintProperty = cdkBuilder.build()
}
