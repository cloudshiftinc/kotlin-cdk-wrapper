@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentVariantPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentVariantProperty.Builder =
      CfnComponent.ComponentVariantProperty.builder()

  public fun overrides(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.overrides(builder.map)
  }

  public fun overrides(overrides: Any) {
    cdkBuilder.overrides(overrides)
  }

  public fun variantValues(variantValues: Map<String, String>) {
    cdkBuilder.variantValues(variantValues)
  }

  public fun variantValues(variantValues: IResolvable) {
    cdkBuilder.variantValues(variantValues)
  }

  public fun build(): CfnComponent.ComponentVariantProperty = cdkBuilder.build()
}
