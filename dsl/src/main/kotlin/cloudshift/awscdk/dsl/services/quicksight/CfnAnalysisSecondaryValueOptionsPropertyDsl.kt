@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that determine the presentation of the secondary value of a KPI visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SecondaryValueOptionsProperty secondaryValueOptionsProperty =
 * SecondaryValueOptionsProperty.builder()
 * .visibility("visibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-secondaryvalueoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisSecondaryValueOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SecondaryValueOptionsProperty.Builder =
      CfnAnalysis.SecondaryValueOptionsProperty.builder()

  /**
   * @param visibility Determines the visibility of the secondary value.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.SecondaryValueOptionsProperty = cdkBuilder.build()
}
