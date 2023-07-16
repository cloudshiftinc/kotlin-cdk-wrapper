@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisBodySectionContentPropertyDsl {
  private val cdkBuilder: CfnAnalysis.BodySectionContentProperty.Builder =
      CfnAnalysis.BodySectionContentProperty.builder()

  public fun layout(layout: IResolvable) {
    cdkBuilder.layout(layout)
  }

  public fun layout(layout: CfnAnalysis.SectionLayoutConfigurationProperty) {
    cdkBuilder.layout(layout)
  }

  public fun build(): CfnAnalysis.BodySectionContentProperty = cdkBuilder.build()
}
