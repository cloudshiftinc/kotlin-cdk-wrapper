@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateHeaderFooterSectionConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.HeaderFooterSectionConfigurationProperty.Builder =
      CfnTemplate.HeaderFooterSectionConfigurationProperty.builder()

  /**
   * @param layout The layout configuration of the header or footer section. 
   */
  public fun layout(layout: IResolvable) {
    cdkBuilder.layout(layout)
  }

  /**
   * @param layout The layout configuration of the header or footer section. 
   */
  public fun layout(layout: CfnTemplate.SectionLayoutConfigurationProperty) {
    cdkBuilder.layout(layout)
  }

  /**
   * @param sectionId The unique identifier of the header or footer section. 
   */
  public fun sectionId(sectionId: String) {
    cdkBuilder.sectionId(sectionId)
  }

  /**
   * @param style The style options of a header or footer section.
   */
  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  /**
   * @param style The style options of a header or footer section.
   */
  public fun style(style: CfnTemplate.SectionStyleProperty) {
    cdkBuilder.style(style)
  }

  public fun build(): CfnTemplate.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
