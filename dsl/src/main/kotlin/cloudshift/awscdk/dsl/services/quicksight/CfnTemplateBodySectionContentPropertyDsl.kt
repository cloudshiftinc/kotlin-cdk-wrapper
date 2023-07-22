@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBodySectionContentPropertyDsl {
  private val cdkBuilder: CfnTemplate.BodySectionContentProperty.Builder =
      CfnTemplate.BodySectionContentProperty.builder()

  /**
   * @param layout The layout configuration of a body section.
   */
  public fun layout(layout: IResolvable) {
    cdkBuilder.layout(layout)
  }

  /**
   * @param layout The layout configuration of a body section.
   */
  public fun layout(layout: CfnTemplate.SectionLayoutConfigurationProperty) {
    cdkBuilder.layout(layout)
  }

  public fun build(): CfnTemplate.BodySectionContentProperty = cdkBuilder.build()
}
