@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysis

/**
 * Describes a path component.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * AnalysisComponentProperty analysisComponentProperty = AnalysisComponentProperty.builder()
 * .arn("arn")
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinsightsanalysis-analysiscomponent.html)
 */
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
