@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline

/**
 * Contains information about a parameter object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * ParameterObjectProperty parameterObjectProperty = ParameterObjectProperty.builder()
 * .attributes(List.of(ParameterAttributeProperty.builder()
 * .key("key")
 * .stringValue("stringValue")
 * .build()))
 * .id("id")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parameterobject.html)
 */
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
