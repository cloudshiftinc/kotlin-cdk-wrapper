@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAsset

@CdkDslMarker
public class CfnAssetAssetPropertyPropertyDsl {
  private val cdkBuilder: CfnAsset.AssetPropertyProperty.Builder =
      CfnAsset.AssetPropertyProperty.builder()

  public fun alias(alias: String) {
    cdkBuilder.alias(alias)
  }

  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  public fun notificationState(notificationState: String) {
    cdkBuilder.notificationState(notificationState)
  }

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnAsset.AssetPropertyProperty = cdkBuilder.build()
}
