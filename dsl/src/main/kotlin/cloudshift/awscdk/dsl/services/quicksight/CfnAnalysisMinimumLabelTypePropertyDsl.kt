@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The minimum label of a data path label.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * MinimumLabelTypeProperty minimumLabelTypeProperty = MinimumLabelTypeProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-minimumlabeltype.html)
 */
@CdkDslMarker
public class CfnAnalysisMinimumLabelTypePropertyDsl {
  private val cdkBuilder: CfnAnalysis.MinimumLabelTypeProperty.Builder =
      CfnAnalysis.MinimumLabelTypeProperty.builder()

  /**
   * @param visibility The visibility of the minimum label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.MinimumLabelTypeProperty = cdkBuilder.build()
}
