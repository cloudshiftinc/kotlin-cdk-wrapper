@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateAnalysisDefaultsPropertyDsl {
  private val cdkBuilder: CfnTemplate.AnalysisDefaultsProperty.Builder =
      CfnTemplate.AnalysisDefaultsProperty.builder()

  public fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: IResolvable) {
    cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
  }

  public
      fun defaultNewSheetConfiguration(defaultNewSheetConfiguration: CfnTemplate.DefaultNewSheetConfigurationProperty) {
    cdkBuilder.defaultNewSheetConfiguration(defaultNewSheetConfiguration)
  }

  public fun build(): CfnTemplate.AnalysisDefaultsProperty = cdkBuilder.build()
}
