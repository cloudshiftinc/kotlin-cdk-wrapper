@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisReferenceLineValueLabelConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ReferenceLineValueLabelConfigurationProperty.Builder =
      CfnAnalysis.ReferenceLineValueLabelConfigurationProperty.builder()

  public fun formatConfiguration(formatConfiguration: IResolvable) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public
      fun formatConfiguration(formatConfiguration: CfnAnalysis.NumericFormatConfigurationProperty) {
    cdkBuilder.formatConfiguration(formatConfiguration)
  }

  public fun relativePosition(relativePosition: String) {
    cdkBuilder.relativePosition(relativePosition)
  }

  public fun build(): CfnAnalysis.ReferenceLineValueLabelConfigurationProperty = cdkBuilder.build()
}
