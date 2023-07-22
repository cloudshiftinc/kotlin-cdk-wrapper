@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAssetModelPropertyPropertyDsl {
  private val cdkBuilder: CfnAssetModel.AssetModelPropertyProperty.Builder =
      CfnAssetModel.AssetModelPropertyProperty.builder()

  /**
   * @param dataType The data type of the asset model property. 
   * The value can be `STRING` , `INTEGER` , `DOUBLE` , `BOOLEAN` , or `STRUCT` .
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param dataTypeSpec The data type of the structure for this property.
   * This parameter exists on properties that have the `STRUCT` data type.
   */
  public fun dataTypeSpec(dataTypeSpec: String) {
    cdkBuilder.dataTypeSpec(dataTypeSpec)
  }

  /**
   * @param logicalId The `LogicalID` of the asset model property. 
   * The maximum length is 256 characters, with the pattern `[^\\u0000-\\u001F\\u007F]+` .
   */
  public fun logicalId(logicalId: String) {
    cdkBuilder.logicalId(logicalId)
  }

  /**
   * @param name The name of the asset model property. 
   * The maximum length is 256 characters with the pattern `[^\u0000-\u001F\u007F]+` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type Contains a property type, which can be one of `Attribute` , `Measurement` ,
   * `Metric` , or `Transform` . 
   */
  public fun type(type: IResolvable) {
    cdkBuilder.type(type)
  }

  /**
   * @param type Contains a property type, which can be one of `Attribute` , `Measurement` ,
   * `Metric` , or `Transform` . 
   */
  public fun type(type: CfnAssetModel.PropertyTypeProperty) {
    cdkBuilder.type(type)
  }

  /**
   * @param unit The unit of the asset model property, such as `Newtons` or `RPM` .
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnAssetModel.AssetModelPropertyProperty = cdkBuilder.build()
}
