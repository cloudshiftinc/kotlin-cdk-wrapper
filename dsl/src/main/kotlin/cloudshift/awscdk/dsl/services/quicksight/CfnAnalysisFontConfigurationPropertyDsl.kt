@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFontConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FontConfigurationProperty.Builder =
      CfnAnalysis.FontConfigurationProperty.builder()

  public fun fontColor(fontColor: String) {
    cdkBuilder.fontColor(fontColor)
  }

  public fun fontDecoration(fontDecoration: String) {
    cdkBuilder.fontDecoration(fontDecoration)
  }

  public fun fontSize(fontSize: IResolvable) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontSize(fontSize: CfnAnalysis.FontSizeProperty) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontStyle(fontStyle: String) {
    cdkBuilder.fontStyle(fontStyle)
  }

  public fun fontWeight(fontWeight: IResolvable) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun fontWeight(fontWeight: CfnAnalysis.FontWeightProperty) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun build(): CfnAnalysis.FontConfigurationProperty = cdkBuilder.build()
}
