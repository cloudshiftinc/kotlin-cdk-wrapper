@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataPathColorPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataPathColorProperty.Builder =
      CfnAnalysis.DataPathColorProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun element(element: IResolvable) {
    cdkBuilder.element(element)
  }

  public fun element(element: CfnAnalysis.DataPathValueProperty) {
    cdkBuilder.element(element)
  }

  public fun timeGranularity(timeGranularity: String) {
    cdkBuilder.timeGranularity(timeGranularity)
  }

  public fun build(): CfnAnalysis.DataPathColorProperty = cdkBuilder.build()
}
