@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The simple cluster marker of the cluster marker.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SimpleClusterMarkerProperty simpleClusterMarkerProperty = SimpleClusterMarkerProperty.builder()
 * .color("color")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-simpleclustermarker.html)
 */
@CdkDslMarker
public class CfnAnalysisSimpleClusterMarkerPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SimpleClusterMarkerProperty.Builder =
      CfnAnalysis.SimpleClusterMarkerProperty.builder()

  /**
   * @param color The color of the simple cluster marker.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun build(): CfnAnalysis.SimpleClusterMarkerProperty = cdkBuilder.build()
}
