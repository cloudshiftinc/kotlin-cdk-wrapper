@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLineStaticDataConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineStaticDataConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineStaticDataConfigurationProperty.builder()

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAnalysis.ReferenceLineStaticDataConfigurationProperty = cdkBuilder.build()
}
