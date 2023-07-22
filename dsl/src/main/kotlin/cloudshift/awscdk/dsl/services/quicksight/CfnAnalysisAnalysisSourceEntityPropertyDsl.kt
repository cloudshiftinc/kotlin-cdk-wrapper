@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAnalysisSourceEntityPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AnalysisSourceEntityProperty.Builder =
      CfnAnalysis.AnalysisSourceEntityProperty.builder()

  /**
   * @param sourceTemplate The source template for the source entity of the analysis.
   */
  public fun sourceTemplate(sourceTemplate: IResolvable) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  /**
   * @param sourceTemplate The source template for the source entity of the analysis.
   */
  public fun sourceTemplate(sourceTemplate: CfnAnalysis.AnalysisSourceTemplateProperty) {
    cdkBuilder.sourceTemplate(sourceTemplate)
  }

  public fun build(): CfnAnalysis.AnalysisSourceEntityProperty = cdkBuilder.build()
}
