@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTemplateSourceEntityPropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateSourceEntityProperty.Builder =
      CfnTemplate.TemplateSourceEntityProperty.builder()

  /**
   * @param sourceAnalysis The source analysis, if it is based on an analysis.
   */
  public fun sourceAnalysis(sourceAnalysis: IResolvable) {
    cdkBuilder.sourceAnalysis(sourceAnalysis)
  }

  /**
   * @param sourceAnalysis The source analysis, if it is based on an analysis.
   */
  public fun sourceAnalysis(sourceAnalysis: CfnTemplate.TemplateSourceAnalysisProperty) {
    cdkBuilder.sourceAnalysis(sourceAnalysis)
  }

  /**
   * @param sourceTemplate The source template, if it is based on an template.
   */
  public fun sourceTemplate(sourceTemplate: IResolvable) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  /**
   * @param sourceTemplate The source template, if it is based on an template.
   */
  public fun sourceTemplate(sourceTemplate: CfnTemplate.TemplateSourceTemplateProperty) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun build(): CfnTemplate.TemplateSourceEntityProperty = cdkBuilder.build()
}
