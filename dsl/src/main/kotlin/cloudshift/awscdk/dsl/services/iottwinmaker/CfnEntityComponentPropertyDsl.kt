@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityComponentPropertyDsl {
  private val cdkBuilder: CfnEntity.ComponentProperty.Builder =
      CfnEntity.ComponentProperty.builder()

  public fun componentName(componentName: String) {
    cdkBuilder.componentName(componentName)
  }

  public fun componentTypeId(componentTypeId: String) {
    cdkBuilder.componentTypeId(componentTypeId)
  }

  public fun definedIn(definedIn: String) {
    cdkBuilder.definedIn(definedIn)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun properties(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.properties(builder.map)
  }

  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  public fun propertyGroups(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.propertyGroups(builder.map)
  }

  public fun propertyGroups(propertyGroups: Map<String, Any>) {
    cdkBuilder.propertyGroups(propertyGroups)
  }

  public fun propertyGroups(propertyGroups: IResolvable) {
    cdkBuilder.propertyGroups(propertyGroups)
  }

  public fun status(status: IResolvable) {
    cdkBuilder.status(status)
  }

  public fun status(status: CfnEntity.StatusProperty) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnEntity.ComponentProperty = cdkBuilder.build()
}
