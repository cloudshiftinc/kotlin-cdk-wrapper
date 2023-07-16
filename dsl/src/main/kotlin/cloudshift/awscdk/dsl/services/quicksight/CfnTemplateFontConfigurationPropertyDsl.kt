@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateFontConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.FontConfigurationProperty.Builder =
      CfnTemplate.FontConfigurationProperty.builder()

  public fun fontColor(fontColor: String) {
    cdkBuilder.fontColor(fontColor)
  }

  public fun fontDecoration(fontDecoration: String) {
    cdkBuilder.fontDecoration(fontDecoration)
  }

  public fun fontSize(fontSize: IResolvable) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontSize(fontSize: CfnTemplate.FontSizeProperty) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontStyle(fontStyle: String) {
    cdkBuilder.fontStyle(fontStyle)
  }

  public fun fontWeight(fontWeight: IResolvable) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun fontWeight(fontWeight: CfnTemplate.FontWeightProperty) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun build(): CfnTemplate.FontConfigurationProperty = cdkBuilder.build()
}
