@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineParameterObjectPropertyDsl {
  private val cdkBuilder: CfnPipeline.ParameterObjectProperty.Builder =
      CfnPipeline.ParameterObjectProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  /**
   * @param attributes The attributes of the parameter object. 
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes The attributes of the parameter object. 
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes The attributes of the parameter object. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param id The ID of the parameter object. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun build(): CfnPipeline.ParameterObjectProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
