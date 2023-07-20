@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardBinCountOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.BinCountOptionsProperty.Builder =
      CfnDashboard.BinCountOptionsProperty.builder()

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDashboard.BinCountOptionsProperty = cdkBuilder.build()
}
