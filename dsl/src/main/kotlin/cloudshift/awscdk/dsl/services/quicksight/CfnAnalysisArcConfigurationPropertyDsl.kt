@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The arc configuration of a `GaugeChartVisual` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ArcConfigurationProperty arcConfigurationProperty = ArcConfigurationProperty.builder()
 * .arcAngle(123)
 * .arcThickness("arcThickness")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-arcconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisArcConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ArcConfigurationProperty.Builder =
      CfnAnalysis.ArcConfigurationProperty.builder()

  /**
   * @param arcAngle The option that determines the arc angle of a `GaugeChartVisual` .
   */
  public fun arcAngle(arcAngle: Number) {
    cdkBuilder.arcAngle(arcAngle)
  }

  /**
   * @param arcThickness The options that determine the arc thickness of a `GaugeChartVisual` .
   */
  public fun arcThickness(arcThickness: String) {
    cdkBuilder.arcThickness(arcThickness)
  }

  public fun build(): CfnAnalysis.ArcConfigurationProperty = cdkBuilder.build()
}
