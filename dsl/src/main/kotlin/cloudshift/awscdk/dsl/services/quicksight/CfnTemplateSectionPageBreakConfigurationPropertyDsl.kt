@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of a page break for a section.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionPageBreakConfigurationProperty sectionPageBreakConfigurationProperty =
 * SectionPageBreakConfigurationProperty.builder()
 * .after(SectionAfterPageBreakProperty.builder()
 * .status("status")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sectionpagebreakconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateSectionPageBreakConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.SectionPageBreakConfigurationProperty.Builder =
      CfnTemplate.SectionPageBreakConfigurationProperty.builder()

  /**
   * @param after The configuration of a page break after a section.
   */
  public fun after(after: IResolvable) {
    cdkBuilder.after(after)
  }

  /**
   * @param after The configuration of a page break after a section.
   */
  public fun after(after: CfnTemplate.SectionAfterPageBreakProperty) {
    cdkBuilder.after(after)
  }

  public fun build(): CfnTemplate.SectionPageBreakConfigurationProperty = cdkBuilder.build()
}
