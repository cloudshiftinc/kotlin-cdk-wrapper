@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFecOutputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.FecOutputSettingsProperty.Builder =
      CfnChannel.FecOutputSettingsProperty.builder()

  public fun columnDepth(columnDepth: Number) {
    cdkBuilder.columnDepth(columnDepth)
  }

  public fun includeFec(includeFec: String) {
    cdkBuilder.includeFec(includeFec)
  }

  public fun rowLength(rowLength: Number) {
    cdkBuilder.rowLength(rowLength)
  }

  public fun build(): CfnChannel.FecOutputSettingsProperty = cdkBuilder.build()
}
