@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

@CdkDslMarker
public class CfnContainerRecipeInstanceConfigurationPropertyDsl {
  private val cdkBuilder: CfnContainerRecipe.InstanceConfigurationProperty.Builder =
      CfnContainerRecipe.InstanceConfigurationProperty.builder()

  private val _blockDeviceMappings: MutableList<Any> = mutableListOf()

  public fun blockDeviceMappings(vararg blockDeviceMappings: Any) {
    _blockDeviceMappings.addAll(listOf(*blockDeviceMappings))
  }

  public fun blockDeviceMappings(blockDeviceMappings: Collection<Any>) {
    _blockDeviceMappings.addAll(blockDeviceMappings)
  }

  public fun blockDeviceMappings(blockDeviceMappings: IResolvable) {
    cdkBuilder.blockDeviceMappings(blockDeviceMappings)
  }

  public fun image(image: String) {
    cdkBuilder.image(image)
  }

  public fun build(): CfnContainerRecipe.InstanceConfigurationProperty {
    if(_blockDeviceMappings.isNotEmpty()) cdkBuilder.blockDeviceMappings(_blockDeviceMappings)
    return cdkBuilder.build()
  }
}
