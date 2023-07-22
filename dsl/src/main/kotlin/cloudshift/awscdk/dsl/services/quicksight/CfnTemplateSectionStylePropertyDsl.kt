@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSectionStylePropertyDsl {
  private val cdkBuilder: CfnTemplate.SectionStyleProperty.Builder =
      CfnTemplate.SectionStyleProperty.builder()

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
  public fun padding(padding: CfnTemplate.SpacingProperty) {
    cdkBuilder.padding(padding)
  }

  public fun build(): CfnTemplate.SectionStyleProperty = cdkBuilder.build()
}
