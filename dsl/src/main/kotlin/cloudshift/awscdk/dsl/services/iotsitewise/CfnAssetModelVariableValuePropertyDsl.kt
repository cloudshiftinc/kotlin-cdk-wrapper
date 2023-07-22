@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelVariableValuePropertyDsl {
  private val cdkBuilder: CfnAssetModel.VariableValueProperty.Builder =
      CfnAssetModel.VariableValueProperty.builder()

  /**
   * @param hierarchyLogicalId The `LogicalID` of the hierarchy to query for the `PropertyLogicalID`
   * .
   * You use a `hierarchyLogicalID` instead of a model ID because you can have several hierarchies
   * using the same model and therefore the same property. For example, you might have separately
   * grouped assets that come from the same asset model. For more information, see [Defining
   * relationships between
   * assets](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-hierarchies.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun hierarchyLogicalId(hierarchyLogicalId: String) {
    cdkBuilder.hierarchyLogicalId(hierarchyLogicalId)
  }

  /**
   * @param propertyLogicalId The `LogicalID` of the property to use as the variable. 
   */
  public fun propertyLogicalId(propertyLogicalId: String) {
    cdkBuilder.propertyLogicalId(propertyLogicalId)
  }

  public fun build(): CfnAssetModel.VariableValueProperty = cdkBuilder.build()
}
