@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisAxisLabelOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.AxisLabelOptionsProperty.Builder =
      CfnAnalysis.AxisLabelOptionsProperty.builder()

  public fun applyTo(applyTo: IResolvable) {
    cdkBuilder.applyTo(applyTo)
  }

  public fun applyTo(applyTo: CfnAnalysis.AxisLabelReferenceOptionsProperty) {
    cdkBuilder.applyTo(applyTo)
  }

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun build(): CfnAnalysis.AxisLabelOptionsProperty = cdkBuilder.build()
}
