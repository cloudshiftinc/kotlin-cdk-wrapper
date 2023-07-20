@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAsset

@CdkDslMarker
public class CfnAssetAssetHierarchyPropertyDsl {
  private val cdkBuilder: CfnAsset.AssetHierarchyProperty.Builder =
      CfnAsset.AssetHierarchyProperty.builder()

  public fun childAssetId(childAssetId: String) {
    cdkBuilder.childAssetId(childAssetId)
  }

  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  public fun build(): CfnAsset.AssetHierarchyProperty = cdkBuilder.build()
}
