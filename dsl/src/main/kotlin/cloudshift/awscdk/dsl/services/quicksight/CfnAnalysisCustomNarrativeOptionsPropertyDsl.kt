@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The custom narrative options.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomNarrativeOptionsProperty customNarrativeOptionsProperty =
 * CustomNarrativeOptionsProperty.builder()
 * .narrative("narrative")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-customnarrativeoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisCustomNarrativeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CustomNarrativeOptionsProperty.Builder =
      CfnAnalysis.CustomNarrativeOptionsProperty.builder()

  /**
   * @param narrative The string input of custom narrative. 
   */
  public fun narrative(narrative: String) {
    cdkBuilder.narrative(narrative)
  }

  public fun build(): CfnAnalysis.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
