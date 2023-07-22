@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisBodySectionConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.BodySectionConfigurationProperty.Builder =
      CfnAnalysis.BodySectionConfigurationProperty.builder()

  /**
   * @param content The configuration of content in a body section. 
   */
  public fun content(content: IResolvable) {
    cdkBuilder.content(content)
  }

  /**
   * @param content The configuration of content in a body section. 
   */
  public fun content(content: CfnAnalysis.BodySectionContentProperty) {
    cdkBuilder.content(content)
  }

  /**
   * @param pageBreakConfiguration The configuration of a page break for a section.
   */
  public fun pageBreakConfiguration(pageBreakConfiguration: IResolvable) {
    cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
  }

  /**
   * @param pageBreakConfiguration The configuration of a page break for a section.
   */
  public
      fun pageBreakConfiguration(pageBreakConfiguration: CfnAnalysis.SectionPageBreakConfigurationProperty) {
    cdkBuilder.pageBreakConfiguration(pageBreakConfiguration)
  }

  /**
   * @param sectionId The unique identifier of a body section. 
   */
  public fun sectionId(sectionId: String) {
    cdkBuilder.sectionId(sectionId)
  }

  /**
   * @param style The style options of a body section.
   */
  public fun style(style: IResolvable) {
    cdkBuilder.style(style)
  }

  /**
   * @param style The style options of a body section.
   */
  public fun style(style: CfnAnalysis.SectionStyleProperty) {
    cdkBuilder.style(style)
  }

  public fun build(): CfnAnalysis.BodySectionConfigurationProperty = cdkBuilder.build()
}
