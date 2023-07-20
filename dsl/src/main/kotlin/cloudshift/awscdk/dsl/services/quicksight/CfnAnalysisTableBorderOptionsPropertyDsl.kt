@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisTableBorderOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.TableBorderOptionsProperty.Builder =
      CfnAnalysis.TableBorderOptionsProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun style(style: String) {
    cdkBuilder.style(style)
  }

  public fun thickness(thickness: Number) {
    cdkBuilder.thickness(thickness)
  }

  public fun build(): CfnAnalysis.TableBorderOptionsProperty = cdkBuilder.build()
}
