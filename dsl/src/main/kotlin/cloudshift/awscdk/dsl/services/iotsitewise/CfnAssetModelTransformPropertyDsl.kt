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
public class CfnAssetModelTransformPropertyDsl {
  private val cdkBuilder: CfnAssetModel.TransformProperty.Builder =
      CfnAssetModel.TransformProperty.builder()

  private val _variables: MutableList<Any> = mutableListOf()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun variables(vararg variables: Any) {
    _variables.addAll(listOf(*variables))
  }

  public fun variables(variables: Collection<Any>) {
    _variables.addAll(variables)
  }

  public fun variables(variables: IResolvable) {
    cdkBuilder.variables(variables)
  }

  public fun build(): CfnAssetModel.TransformProperty {
    if(_variables.isNotEmpty()) cdkBuilder.variables(_variables)
    return cdkBuilder.build()
  }
}
