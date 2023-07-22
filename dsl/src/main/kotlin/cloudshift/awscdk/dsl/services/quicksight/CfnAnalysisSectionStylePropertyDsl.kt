@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The options that style a section.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionStyleProperty sectionStyleProperty = SectionStyleProperty.builder()
 * .height("height")
 * .padding(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-sectionstyle.html)
 */
@CdkDslMarker
public class CfnAnalysisSectionStylePropertyDsl {
  private val cdkBuilder: CfnAnalysis.SectionStyleProperty.Builder =
      CfnAnalysis.SectionStyleProperty.builder()

  /**
   * @param height The height of a section.
   * Heights can only be defined for header and footer sections. The default height margin is 0.5
   * inches.
   */
  public fun height(height: String) {
    cdkBuilder.height(height)
  }

  /**
   * @param padding The spacing between section content and its top, bottom, left, and right edges.
   * There is no padding by default.
   */
  public fun padding(padding: IResolvable) {
    cdkBuilder.padding(padding)
  }

  /**
   * @param padding The spacing between section content and its top, bottom, left, and right edges.
   * There is no padding by default.
   */
  public fun padding(padding: CfnAnalysis.SpacingProperty) {
    cdkBuilder.padding(padding)
  }

  public fun build(): CfnAnalysis.SectionStyleProperty = cdkBuilder.build()
}
