@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSectionPageBreakConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SectionPageBreakConfigurationProperty.Builder =
      CfnAnalysis.SectionPageBreakConfigurationProperty.builder()

  public fun after(after: IResolvable) {
    cdkBuilder.after(after)
  }

  public fun after(after: CfnAnalysis.SectionAfterPageBreakProperty) {
    cdkBuilder.after(after)
  }

  public fun build(): CfnAnalysis.SectionPageBreakConfigurationProperty = cdkBuilder.build()
}
