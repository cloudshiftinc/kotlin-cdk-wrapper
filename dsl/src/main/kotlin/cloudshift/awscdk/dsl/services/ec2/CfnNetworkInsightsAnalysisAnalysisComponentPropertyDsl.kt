@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

@CdkDslMarker
public class CfnNetworkInsightsAnalysisAnalysisComponentPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAnalysis.AnalysisComponentProperty.Builder =
      CfnNetworkInsightsAnalysis.AnalysisComponentProperty.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the component.
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param id The ID of the component.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnNetworkInsightsAnalysis.AnalysisComponentProperty = cdkBuilder.build()
}
