@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAssetModelHierarchyPropertyDsl {
  private val cdkBuilder: CfnAssetModel.AssetModelHierarchyProperty.Builder =
      CfnAssetModel.AssetModelHierarchyProperty.builder()

  public fun childAssetModelId(childAssetModelId: String) {
    cdkBuilder.childAssetModelId(childAssetModelId)
  }

  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAssetModel.AssetModelHierarchyProperty = cdkBuilder.build()
}
