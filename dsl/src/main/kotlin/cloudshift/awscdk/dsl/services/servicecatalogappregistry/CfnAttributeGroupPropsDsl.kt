@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalogappregistry

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps

@CdkDslMarker
public class CfnAttributeGroupPropsDsl {
  private val cdkBuilder: CfnAttributeGroupProps.Builder = CfnAttributeGroupProps.builder()

  public fun attributes(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.attributes(builder.map)
  }

  public fun attributes(attributes: Any) {
    cdkBuilder.attributes(attributes)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnAttributeGroupProps = cdkBuilder.build()
}
