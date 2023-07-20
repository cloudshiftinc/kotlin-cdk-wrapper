@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLineStyleConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineStyleConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineStyleConfigurationProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun pattern(pattern: String) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnAnalysis.ReferenceLineStyleConfigurationProperty = cdkBuilder.build()
}
