@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAttributePropertyDsl {
  private val cdkBuilder: CfnAssetModel.AttributeProperty.Builder =
      CfnAssetModel.AttributeProperty.builder()

  /**
   * @param defaultValue The default value of the asset model property attribute.
   * All assets that you create from the asset model contain this attribute value. You can update an
   * attribute's value after you create an asset. For more information, see [Updating attribute
   * values](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/update-attribute-values.html) in
   * the *AWS IoT SiteWise User Guide* .
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun build(): CfnAssetModel.AttributeProperty = cdkBuilder.build()
}
