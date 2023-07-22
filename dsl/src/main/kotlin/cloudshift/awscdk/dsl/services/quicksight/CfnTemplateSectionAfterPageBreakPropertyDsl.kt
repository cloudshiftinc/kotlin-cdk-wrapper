@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

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
