@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a page break after a section.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionAfterPageBreakProperty sectionAfterPageBreakProperty =
 * SectionAfterPageBreakProperty.builder()
 * .status("status")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sectionafterpagebreak.html)
 */
@CdkDslMarker
public class CfnTemplateSectionAfterPageBreakPropertyDsl {
  private val cdkBuilder: CfnTemplate.SectionAfterPageBreakProperty.Builder =
      CfnTemplate.SectionAfterPageBreakProperty.builder()

  /**
   * @param status The option that enables or disables a page break at the end of a section.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnTemplate.SectionAfterPageBreakProperty = cdkBuilder.build()
}
