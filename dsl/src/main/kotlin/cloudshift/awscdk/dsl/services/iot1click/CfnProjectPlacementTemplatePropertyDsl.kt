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

  /**
   * @param defaultAttributes The default attributes (key-value pairs) to be applied to all
   * placements using this template.
   */
  public fun defaultAttributes(defaultAttributes: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(defaultAttributes)
    cdkBuilder.defaultAttributes(builder.map)
  }

  /**
   * @param defaultAttributes The default attributes (key-value pairs) to be applied to all
   * placements using this template.
   */
  public fun defaultAttributes(defaultAttributes: Any) {
    cdkBuilder.defaultAttributes(defaultAttributes)
  }

  /**
   * @param deviceTemplates An object specifying the
   * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
   * for all placements using this (
   * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
   * ) template.
   */
  public fun deviceTemplates(deviceTemplates: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(deviceTemplates)
    cdkBuilder.deviceTemplates(builder.map)
  }

  /**
   * @param deviceTemplates An object specifying the
   * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
   * for all placements using this (
   * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
   * ) template.
   */
  public fun deviceTemplates(deviceTemplates: Map<String, Any>) {
    cdkBuilder.deviceTemplates(deviceTemplates)
  }

  /**
   * @param deviceTemplates An object specifying the
   * [DeviceTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_DeviceTemplate.html)
   * for all placements using this (
   * [PlacementTemplate](https://docs.aws.amazon.com/iot-1-click/latest/projects-apireference/API_PlacementTemplate.html)
   * ) template.
   */
  public fun deviceTemplates(deviceTemplates: IResolvable) {
    cdkBuilder.deviceTemplates(deviceTemplates)
  }

  public fun build(): CfnProject.PlacementTemplateProperty = cdkBuilder.build()
}
