@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeFunctionPropertyDsl {
  private val cdkBuilder: CfnComponentType.FunctionProperty.Builder =
      CfnComponentType.FunctionProperty.builder()

  private val _requiredProperties: MutableList<String> = mutableListOf()

  /**
   * @param implementedBy The data connector.
   */
  public fun implementedBy(implementedBy: IResolvable) {
    cdkBuilder.implementedBy(implementedBy)
  }

  /**
   * @param implementedBy The data connector.
   */
  public fun implementedBy(implementedBy: CfnComponentType.DataConnectorProperty) {
    cdkBuilder.implementedBy(implementedBy)
  }

  /**
   * @param requiredProperties The required properties of the function.
   */
  public fun requiredProperties(vararg requiredProperties: String) {
    _requiredProperties.addAll(listOf(*requiredProperties))
  }

  /**
   * @param requiredProperties The required properties of the function.
   */
  public fun requiredProperties(requiredProperties: Collection<String>) {
    _requiredProperties.addAll(requiredProperties)
  }

  /**
   * @param scope The scope of the function.
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun build(): CfnComponentType.FunctionProperty {
    if(_requiredProperties.isNotEmpty()) cdkBuilder.requiredProperties(_requiredProperties)
    return cdkBuilder.build()
  }
}
