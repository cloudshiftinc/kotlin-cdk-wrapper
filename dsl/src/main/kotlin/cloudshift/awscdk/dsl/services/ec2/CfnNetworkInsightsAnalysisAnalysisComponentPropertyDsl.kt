@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisComponentProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisComponentProperty.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisComponentProperty = cdkBuilder.build()
}
