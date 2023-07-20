@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAnalysisDefaultsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AnalysisDefaultsProperty.Builder =
      CfnAnalysis.AnalysisDefaultsProperty.builder()

  public fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: IResolvable) {
    cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
  }

  public
      fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: CfnAnalysis.DefaultNewSheetConfigurationProperty) {
    cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
  }

  public fun build(): CfnAnalysis.AnalysisDefaultsProperty = cdkBuilder.build()
}
