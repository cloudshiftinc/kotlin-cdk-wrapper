@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisConditionalFormattingColorPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ConditionalFormattingColorProperty.Builder =
      CfnAnalysis.ConditionalFormattingColorProperty.builder()

  public fun gradient(gradient: IResolvable) {
    cdkBuilder.gradient(gradient)
  }

  public fun gradient(gradient: CfnAnalysis.ConditionalFormattingGradientColorProperty) {
    cdkBuilder.gradient(gradient)
  }

  public fun solid(solid: IResolvable) {
    cdkBuilder.solid(solid)
  }

  public fun solid(solid: CfnAnalysis.ConditionalFormattingSolidColorProperty) {
    cdkBuilder.solid(solid)
  }

  public fun build(): CfnAnalysis.ConditionalFormattingColorProperty = cdkBuilder.build()
}
