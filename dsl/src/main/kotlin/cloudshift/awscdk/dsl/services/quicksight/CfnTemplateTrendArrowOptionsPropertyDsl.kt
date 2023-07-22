@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options that determine the presentation of trend arrows in a KPI visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TrendArrowOptionsProperty trendArrowOptionsProperty = TrendArrowOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-trendarrowoptions.html)
 */
@CdkDslMarker
public class CfnTemplateTrendArrowOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TrendArrowOptionsProperty.Builder =
      CfnTemplate.TrendArrowOptionsProperty.builder()

  /**
   * @param visibility The visibility of the trend arrows.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.TrendArrowOptionsProperty = cdkBuilder.build()
}
