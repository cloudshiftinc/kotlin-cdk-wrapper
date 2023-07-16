@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityPropertyPropertyDsl {
  private val cdkBuilder: CfnEntity.PropertyProperty.Builder = CfnEntity.PropertyProperty.builder()

  public fun definition(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.definition(builder.map)
  }

  public fun definition(definition: Any) {
    cdkBuilder.definition(definition)
  }

  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  public fun `value`(`value`: CfnEntity.DataValueProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnEntity.PropertyProperty = cdkBuilder.build()
}
