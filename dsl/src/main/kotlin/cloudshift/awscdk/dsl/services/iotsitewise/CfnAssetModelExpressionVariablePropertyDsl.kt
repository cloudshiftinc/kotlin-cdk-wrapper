@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelExpressionVariablePropertyDsl {
  private val cdkBuilder: CfnAssetModel.ExpressionVariableProperty.Builder =
      CfnAssetModel.ExpressionVariableProperty.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnAssetModel.VariableValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAssetModel.ExpressionVariableProperty = cdkBuilder.build()
}
