@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@CdkDslMarker
public class CfnImageRecipeComponentConfigurationPropertyDsl {
  private val cdkBuilder: CfnImageRecipe.ComponentConfigurationProperty.Builder =
      CfnImageRecipe.ComponentConfigurationProperty.builder()

  private val _parameters: MutableList<Any> = mutableListOf()

  /**
   * @param componentArn The Amazon Resource Name (ARN) of the component.
   */
  public fun componentArn(componentArn: String) {
    cdkBuilder.componentArn(componentArn)
  }

  /**
   * @param parameters A group of parameter settings that Image Builder uses to configure the
   * component for a specific recipe.
   */
  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
  }

  /**
   * @param parameters A group of parameter settings that Image Builder uses to configure the
   * component for a specific recipe.
   */
  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
  }

  /**
   * @param parameters A group of parameter settings that Image Builder uses to configure the
   * component for a specific recipe.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnImageRecipe.ComponentConfigurationProperty {
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    return cdkBuilder.build()
  }
}
