@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnInput

@CdkDslMarker
public class CfnInputInputDefinitionPropertyDsl {
  private val cdkBuilder: CfnInput.InputDefinitionProperty.Builder =
      CfnInput.InputDefinitionProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun build(): CfnInput.InputDefinitionProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    return cdkBuilder.build()
  }
}
