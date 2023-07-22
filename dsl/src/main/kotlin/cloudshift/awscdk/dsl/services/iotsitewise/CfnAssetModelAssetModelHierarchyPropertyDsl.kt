@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAssetModelHierarchyPropertyDsl {
  private val cdkBuilder: CfnAssetModel.AssetModelHierarchyProperty.Builder =
      CfnAssetModel.AssetModelHierarchyProperty.builder()

  /**
   * @param childAssetModelId The Id of the asset model. 
   */
  public fun childAssetModelId(childAssetModelId: String) {
    cdkBuilder.childAssetModelId(childAssetModelId)
  }

  /**
   * @param logicalId The `LogicalID` of the asset model hierarchy. This ID is a
   * `hierarchyLogicalId` . 
   * The maximum length is 256 characters, with the pattern `[^\u0000-\u001F\u007F]+`
   */
  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  /**
   * @param name The name of the asset model hierarchy. 
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAssetModel.AssetModelHierarchyProperty = cdkBuilder.build()
}
