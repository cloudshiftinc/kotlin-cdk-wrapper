@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFontConfigurationPropertyDsl {
  private val cdkBuilder: CfnDashboard.FontConfigurationProperty.Builder =
      CfnDashboard.FontConfigurationProperty.builder()

  public fun fontColor(fontColor: String) {
    cdkBuilder.fontColor(fontColor)
  }

  public fun fontDecoration(fontDecoration: String) {
    cdkBuilder.fontDecoration(fontDecoration)
  }

  public fun fontSize(fontSize: IResolvable) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontSize(fontSize: CfnDashboard.FontSizeProperty) {
    cdkBuilder.fontSize(fontSize)
  }

  public fun fontStyle(fontStyle: String) {
    cdkBuilder.fontStyle(fontStyle)
  }

  public fun fontWeight(fontWeight: IResolvable) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun fontWeight(fontWeight: CfnDashboard.FontWeightProperty) {
    cdkBuilder.fontWeight(fontWeight)
  }

  public fun build(): CfnDashboard.FontConfigurationProperty = cdkBuilder.build()
}
