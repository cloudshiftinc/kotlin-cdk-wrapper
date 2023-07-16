@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDefaultPaginatedLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DefaultPaginatedLayoutConfigurationProperty.Builder =
      CfnAnalysis.DefaultPaginatedLayoutConfigurationProperty.builder()

  public fun sectionBased(sectionBased: IResolvable) {
    cdkBuilder.sectionBased(sectionBased)
  }

  public
      fun sectionBased(sectionBased: CfnAnalysis.DefaultSectionBasedLayoutConfigurationProperty) {
    cdkBuilder.sectionBased(sectionBased)
  }

  public fun build(): CfnAnalysis.DefaultPaginatedLayoutConfigurationProperty = cdkBuilder.build()
}
