@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTemplateSourceEntityPropertyDsl {
  private val cdkBuilder: CfnTemplate.TemplateSourceEntityProperty.Builder =
      CfnTemplate.TemplateSourceEntityProperty.builder()

  public fun sourceAnalysis(sourceAnalysis: IResolvable) {
    cdkBuilder.sourceAnalysis(sourceAnalysis)
  }

  public fun sourceAnalysis(sourceAnalysis: CfnTemplate.TemplateSourceAnalysisProperty) {
    cdkBuilder.sourceAnalysis(sourceAnalysis)
  }

  public fun sourceTemplate(sourceTemplate: IResolvable) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun sourceTemplate(sourceTemplate: CfnTemplate.TemplateSourceTemplateProperty) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun build(): CfnTemplate.TemplateSourceEntityProperty = cdkBuilder.build()
}
