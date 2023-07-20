@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisConditionalFormattingSolidColorPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ConditionalFormattingSolidColorProperty.Builder =
      CfnAnalysis.ConditionalFormattingSolidColorProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnAnalysis.ConditionalFormattingSolidColorProperty = cdkBuilder.build()
}
