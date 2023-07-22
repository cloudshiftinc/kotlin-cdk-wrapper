@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition

@CdkDslMarker
public class CfnCalculatedAttributeDefinitionAttributeDetailsPropertyDsl {
  private val cdkBuilder: CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder =
      CfnCalculatedAttributeDefinition.AttributeDetailsProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  /**
   * @param attributes Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes Mathematical expression and a list of attribute items specified in that
   * expression. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param expression Mathematical expression that is performed on attribute items provided in the
   * attribute list. 
   * Each element in the expression should follow the structure of "{ObjectTypeName.AttributeName}".
   */
  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnCalculatedAttributeDefinition.AttributeDetailsProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
