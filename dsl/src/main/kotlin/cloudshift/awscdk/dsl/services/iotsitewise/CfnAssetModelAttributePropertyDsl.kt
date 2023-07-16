@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAttributePropertyDsl {
  private val cdkBuilder: CfnAssetModel.AttributeProperty.Builder =
      CfnAssetModel.AttributeProperty.builder()

  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun build(): CfnAssetModel.AttributeProperty = cdkBuilder.build()
}
