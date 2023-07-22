@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisHeaderFooterSectionConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.HeaderFooterSectionConfigurationProperty.Builder =
      CfnAnalysis.HeaderFooterSectionConfigurationProperty.builder()

  /**
   * @param layout The layout configuration of the header or footer section. 
   */
  public fun layout(layout: IResolvable) {
    cdkBuilder.layout(layout)
  }

  /**
   * @param layout The layout configuration of the header or footer section. 
   */
  public fun layout(layout: CfnAnalysis.SectionLayoutConfigurationProperty) {
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
  public fun style(style: CfnAnalysis.SectionStyleProperty) {
    cdkBuilder.style(style)
  }

  public fun build(): CfnAnalysis.HeaderFooterSectionConfigurationProperty = cdkBuilder.build()
}
