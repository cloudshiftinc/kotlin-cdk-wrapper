@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAsset

@CdkDslMarker
public class CfnAssetAssetHierarchyPropertyDsl {
  private val cdkBuilder: CfnAsset.AssetHierarchyProperty.Builder =
      CfnAsset.AssetHierarchyProperty.builder()

  /**
   * @param childAssetId The Id of the child asset. 
   */
  public fun childAssetId(childAssetId: String) {
    cdkBuilder.childAssetId(childAssetId)
  }

  /**
   * @param logicalId The `LogicalID` of the hierarchy. This ID is a `hierarchyLogicalId` . 
   * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+` .
   */
  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  public fun build(): CfnAsset.AssetHierarchyProperty = cdkBuilder.build()
}
