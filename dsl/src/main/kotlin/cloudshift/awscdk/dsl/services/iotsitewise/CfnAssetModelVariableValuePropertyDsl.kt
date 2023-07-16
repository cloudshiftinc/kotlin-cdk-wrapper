@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelVariableValuePropertyDsl {
  private val cdkBuilder: CfnAssetModel.VariableValueProperty.Builder =
      CfnAssetModel.VariableValueProperty.builder()

  public fun hierarchyLogicalId(hierarchyLogicalId: String) {
    cdkBuilder.hierarchyLogicalId(hierarchyLogicalId)
  }

  public fun propertyLogicalId(propertyLogicalId: String) {
    cdkBuilder.propertyLogicalId(propertyLogicalId)
  }

  public fun build(): CfnAssetModel.VariableValueProperty = cdkBuilder.build()
}
