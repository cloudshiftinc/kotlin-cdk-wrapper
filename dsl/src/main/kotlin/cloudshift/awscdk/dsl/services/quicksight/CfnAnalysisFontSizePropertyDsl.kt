@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFontSizePropertyDsl {
  private val cdkBuilder: CfnAnalysis.FontSizeProperty.Builder =
      CfnAnalysis.FontSizeProperty.builder()

  public fun relative(relative: String) {
    cdkBuilder.relative(relative)
  }

  public fun build(): CfnAnalysis.FontSizeProperty = cdkBuilder.build()
}
