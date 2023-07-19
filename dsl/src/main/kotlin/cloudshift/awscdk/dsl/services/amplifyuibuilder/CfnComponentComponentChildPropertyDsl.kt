@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amplifyuibuilder

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnComponent

@CdkDslMarker
public class CfnComponentComponentChildPropertyDsl {
  private val cdkBuilder: CfnComponent.ComponentChildProperty.Builder =
      CfnComponent.ComponentChildProperty.builder()

  private val _children: MutableList<Any> = mutableListOf()

  public fun children(vararg children: Any) {
    _children.addAll(listOf(*children))
  }

  public fun children(children: Collection<Any>) {
    _children.addAll(children)
  }

  public fun children(children: IResolvable) {
    cdkBuilder.children(children)
  }

  public fun componentType(componentType: String) {
    cdkBuilder.componentType(componentType)
  }

  public fun events(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.events(builder.map)
  }

  public fun events(events: Map<String, Any>) {
    cdkBuilder.events(events)
  }

  public fun events(events: IResolvable) {
    cdkBuilder.events(events)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
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

  public fun build(): CfnComponent.ComponentChildProperty {
    if(_children.isNotEmpty()) cdkBuilder.children(_children)
    return cdkBuilder.build()
  }
}
