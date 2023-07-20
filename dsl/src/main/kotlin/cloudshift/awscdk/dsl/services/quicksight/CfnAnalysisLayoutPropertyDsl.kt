@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLayoutPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LayoutProperty.Builder = CfnAnalysis.LayoutProperty.builder()

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: CfnAnalysis.LayoutConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): CfnAnalysis.LayoutProperty = cdkBuilder.build()
}
