@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@CdkDslMarker
public class CfnImageRecipeComponentParameterPropertyDsl {
  private val cdkBuilder: CfnImageRecipe.ComponentParameterProperty.Builder =
      CfnImageRecipe.ComponentParameterProperty.builder()

  private val _value: MutableList<String> = mutableListOf()

  /**
   * @param name The name of the component parameter to set. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value Sets the value for the named component parameter. 
   */
  public fun `value`(vararg `value`: String) {
    _value.addAll(listOf(*`value`))
  }

  /**
   * @param value Sets the value for the named component parameter. 
   */
  public fun `value`(`value`: Collection<String>) {
    _value.addAll(`value`)
  }

  public fun build(): CfnImageRecipe.ComponentParameterProperty {
    if(_value.isNotEmpty()) cdkBuilder.`value`(_value)
    return cdkBuilder.build()
  }
}
