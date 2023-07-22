@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAssetModel

@CdkDslMarker
public class CfnAssetModelAssetModelCompositeModelPropertyDsl {
  private val cdkBuilder: CfnAssetModel.AssetModelCompositeModelProperty.Builder =
      CfnAssetModel.AssetModelCompositeModelProperty.builder()

  private val _compositeModelProperties: MutableList<Any> = mutableListOf()

  /**
   * @param compositeModelProperties The asset property definitions for this composite model.
   */
  public fun compositeModelProperties(vararg compositeModelProperties: Any) {
    _compositeModelProperties.addAll(listOf(*compositeModelProperties))
  }

  /**
   * @param compositeModelProperties The asset property definitions for this composite model.
   */
  public fun compositeModelProperties(compositeModelProperties: Collection<Any>) {
    _compositeModelProperties.addAll(compositeModelProperties)
  }

  /**
   * @param compositeModelProperties The asset property definitions for this composite model.
   */
  public fun compositeModelProperties(compositeModelProperties: IResolvable) {
    cdkBuilder.compositeModelProperties(compositeModelProperties)
  }

  /**
   * @param description The description of the composite model.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the composite model. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param type The type of the composite model. 
   * For alarm composite models, this type is `AWS/ALARM` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAssetModel.AssetModelCompositeModelProperty {
    if(_compositeModelProperties.isNotEmpty())
        cdkBuilder.compositeModelProperties(_compositeModelProperties)
    return cdkBuilder.build()
  }
}
