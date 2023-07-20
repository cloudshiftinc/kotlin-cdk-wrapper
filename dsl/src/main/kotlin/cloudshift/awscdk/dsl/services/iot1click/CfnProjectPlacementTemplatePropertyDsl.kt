@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot1click

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot1click.CfnProject

@CdkDslMarker
public class CfnProjectPlacementTemplatePropertyDsl {
  private val cdkBuilder: CfnProject.PlacementTemplateProperty.Builder =
      CfnProject.PlacementTemplateProperty.builder()

  public fun defaultAttributes(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.defaultAttributes(builder.map)
  }

  public fun defaultAttributes(defaultAttributes: Any) {
    cdkBuilder.defaultAttributes(defaultAttributes)
  }

  public fun deviceTemplates(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.deviceTemplates(builder.map)
  }

  public fun deviceTemplates(deviceTemplates: Map<String, Any>) {
    cdkBuilder.deviceTemplates(deviceTemplates)
  }

  public fun deviceTemplates(deviceTemplates: IResolvable) {
    cdkBuilder.deviceTemplates(deviceTemplates)
  }

  public fun build(): CfnProject.PlacementTemplateProperty = cdkBuilder.build()
}
